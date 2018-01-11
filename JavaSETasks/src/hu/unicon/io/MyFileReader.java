package hu.unicon.io;

import java.io.*;

public class MyFileReader 
{

	public static void main(String[] args) 
	{
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("nincsilyen.txt"));
			//BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(br.ready()) System.out.println(br.readLine());
				
			br.close();
			
		} 
		catch (IOException e) 
		{
			System.out.println("File olvasasi hiba tortent!");
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("In finally block.");
		}
		System.out.println("End of program.");
	}

}
