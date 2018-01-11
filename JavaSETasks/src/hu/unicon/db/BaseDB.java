package hu.unicon.db;

import java.security.MessageDigest; // for MD5
import java.sql.*;

public class BaseDB 
{

	public static void do_insert(Connection con) throws Exception
	{
		// Insert
		// SQL Injection safe
		PreparedStatement ps = con.prepareStatement("INSERT INTO user (email, password) VALUES (?,?)");
		
		ps.setString(1, "valaki@valahol.hu");
		ps.setString(2, "valaki_password");
		
		int affectedRows =  ps.executeUpdate();
		
		System.out.println("affectedRows: " + affectedRows);
		// EE: JPA Java Persistent Api -- tomeges upload
		// Spring automatikus entitas epites
		// EE: Hybernate
		// JDBC
		
		// java.security - Encoding - Decoding
		// java.security.MessageDigest -- MD5
	}
	
	public static void do_select(Connection con) throws Exception
	{
		PreparedStatement ps = con.prepareStatement("select * from user");
		
		ResultSet rs = ps.executeQuery();
		
		//rs.getMetaData().getColumnCount()
		//rs.getMetaData().getColumnName()
		
		while(rs.next())
		{
			System.out.println(rs.getInt("id") + " | " + rs.getString("email") + " | " + rs.getString("password"));
		}
	}
	
	
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unijava?useSSL=false&useUnicode=true&characterEncoding=UTF-8", "ilukacs", "Csata24b");
			// PreparedStatement ps = con.prepareStatement("select * from user");
			
			// Insert
			// do_insert(con);
			
			do_select(con);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("End of program run!");
	}

}
