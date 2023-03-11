package bankmangementsystem;
import java.sql.*;
public class jdbms {
	Connection c;
	Statement s;
	public jdbms()
	{
		try {
	        c=DriverManager.getConnection("jdbc:mysql:///SBIbank","root","Ihsak@123");
			s= c.createStatement();
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
