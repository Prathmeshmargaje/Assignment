import java.io.*;
public class DeserializationDemo 
{

	public static void main(String[] args) 
	{
		try 
		{
		File file = new File ("E:\\Person.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream (fis);
		Object o = ois.readObject();
		Person p = (Person)o;
		System.out.println(p);
		
		} catch (IOException e)
		{
			
		}

	}

}
