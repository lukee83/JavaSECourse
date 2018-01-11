package hu.unicon.server;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class ChatServer 
{

	private static void do_it()
	{
		Vector<ServerThread> vs = new Vector<ServerThread>();
		
		try
		{
			ServerSocket sSock = new ServerSocket(1235);
			
			while(true)
			{
				Socket sock = sSock.accept();
				
				System.out.println("New connection accepted");
				
				vs.addElement(new ServerThread(sock, vs));
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) 
	{
		do_it();
	}

}
