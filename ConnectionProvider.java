package Project;
import java.sql.*;
public class ConnectionProvider {
public static Connection getCon()
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlMan","adithi","sonuchukki@21");
		return con;
	}
	catch(Exception e)
	{
		System.out.print(e);
		return null;
	}
}
}
