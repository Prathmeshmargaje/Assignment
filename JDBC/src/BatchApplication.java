import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchApplication
{

	public static void main(String[] args) 
	{
	try 
	{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","");
	Statement stmt= con.createStatement();
	stmt.addBatch("insert into data values (1, 'kirti','kolhapur',20)");
	stmt.addBatch("update subject set price = 1000 where name = 'PHP'");
	stmt.addBatch("delete from registeruser where name= 'Sam'");
	int i [] = stmt.executeBatch();
	for (int k = 0; k<i.length; k++)
	{
		System.out.println(k);
	}
	System.out.println("success");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}	
		

	}

}
