import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLCommandDemo 
{

	public static void main(String[] args) 
	{
	try 
	{
	Connection 	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student",
			"root","");
	Statement stmt = con.createStatement();
	stmt.execute("create table subject (id int, name varchar (20), medium varchar (20))");
	System.out.println("run successfully");
	
	} catch (Exception e) {
		e.printStackTrace();
	} 
	}

}
