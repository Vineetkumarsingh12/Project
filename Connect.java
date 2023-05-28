package travelingManagmentSystem;
import java.sql.*;

// Jdbc connectivity has five step

public class Connect {
	Connection c;
	Statement s;
	Connect()
	{//1. Register the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql:///travelManagementSystem", "root", "Vinit@mysql12");
		s = c.createStatement();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public static void main (String args[])
	{
	new Connect();
	}
	
}

