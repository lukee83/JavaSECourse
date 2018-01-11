package hu.unicon.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;

public class ServerThread extends Thread
{
	private Socket sock;
	private Vector<ServerThread> vs;

	public ServerThread(Socket sock, Vector<ServerThread> vs) 
	{
		// super();
		this.sock = sock;
		this.vs   = vs;
		
		this.start();
	}

	@Override
	public void run() 
	{
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			
			while (true) 
			{
				String message = br.readLine();
				
				if(message == null) {throw new Exception("leszakadt user...");}
				
				System.out.println(this.currentThread().getId() + " | New message: " + message);
				
				for (Iterator iterator = vs.iterator(); iterator.hasNext();) 
				{
					ServerThread serverThread = (ServerThread) iterator.next();
					serverThread.writeMessage(message);
				}
				hu.unicon.server.Logger log = new Logger(message);
			} 
			
		} 
		catch (Exception e) 
		{
			System.out.println("Remove myself!");
			vs.remove(this);
		}
		
	}
	
	public synchronized void writeMessage(String msg)
	{
		try 
		{
			PrintWriter bw = new PrintWriter(sock.getOutputStream());
			bw.write(msg + "\r\n");
			bw.flush();
			System.out.println("Following message is written: [" + msg + "]");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
