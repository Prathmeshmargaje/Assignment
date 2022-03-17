import java.io.*;

public class SerializableDemo 
{

	public static void main(String[] args) 
	{
	try
	{
		File file = new File ("E:/Person.txt");
		FileOutputStream fis = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		Person p = new Person ();
		p.setName("Prathmesh");
		p.setAge(22);
		p.setAddress("Pune");
		p.setSalary(200000);
		oos.writeObject(p);
		System.out.println("Success");
		oos.close();
	}catch (Exception e)
	{
		e.printStackTrace();
	}
//	System.out.println("Hello this is timepass");
// this above block consider as finally block 	

	}

}
