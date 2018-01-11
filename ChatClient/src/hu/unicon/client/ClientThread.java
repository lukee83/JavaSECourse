package hu.unicon.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;

public class ClientThread extends Thread
{
	private Socket      sock;
	private ClientFrame ui;
	
	public ClientThread(ClientFrame clientFrame) 
	{
		this.ui = clientFrame;
		
		try 
		{
			sock = new Socket("127.0.0.1", 1235);
			//sock = new Socket("192.168.5.176", 1235);
		} 
		catch (Exception e) 
		{
			System.out.println("Error during connection!");
			
			e.printStackTrace();
		}
		
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
				
				if(message == null) {throw new Exception("leszakadtunk???");}
				
				System.out.println(" | New message: " + message);
				ui.textArea.append(message + "\n");
			} 
			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void writeMessage(String msg)
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
