package hu.unicon.io;

import java.io.*;

/*
 * FileWriter class for IO solutions
 */
public class MyFileWriter 
{

	public static void main(String[] args) 
	{
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			
			/*
			fw.write("1. sor\r\n");
			fw.write("2. sor\r\n");
			fw.write("3. sor\r\n");
			fw.close();
			*/
			
			PrintWriter pw = new PrintWriter(fw);
			pw.println("0.sor");
			pw.println("1.sor");
			pw.println("2.sor");
			pw.println("3.sor");
			pw.println("4.sor");
			
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
