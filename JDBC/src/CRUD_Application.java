import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD_Application {
	
	final static String URL = "jdbc:mysql://localhost:3306/student";
	final static String USER_NAME = "root";
	final static String PASSWORD = "";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	// load Class
		//Class.forName("com.mysql.jdbc.Driver"); // loaded successfully
		// create connection
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		// create statement object 
		Statement stmt = con.createStatement();
		//write query
		//String sql = "create table my_info(id int, name varchar(20), address varchar (20))";
		// execute query 
	//	String sql = "insert into my_info(id, name, address) value (110, 'Sham', 'Maval')";
	//	String sql = "update my_info set name= 'priya' where id =105";
	    String sql = "delete from my_info where id = 103";
		
		int row = stmt.executeUpdate(sql);
		System.out.println(row +" success");
		
		ResultSet rs = stmt.executeQuery("select * from my_info");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
	
	System.out.println(row+ " row affected");	
        
	}

}
