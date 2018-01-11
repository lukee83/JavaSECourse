package hu.unicon.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class Logger 
{

	public Logger(String descr) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unijava?useSSL=false&useUnicode=true&characterEncoding=UTF-8", "ilukacs", "Csata24b");
		
			PreparedStatement ps = con.prepareStatement("INSERT INTO chatlog (time, description) VALUES (?,?)");
			
			ps.setString(1, Calendar.getInstance().getTime().toString());
			ps.setString(2, descr);
			
			int affectedRows =  ps.executeUpdate();
			
			System.out.println("Insert: affectedRows: " + affectedRows);
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	
}
