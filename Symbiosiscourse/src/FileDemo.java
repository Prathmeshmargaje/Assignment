import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws Exception
	{
		FileReader f1 = new FileReader ("E:\\FileDemo.txt");
		int i;
		while ((i=f1.read())!=-1)
		{
			System.out.println((char)i);
			f1.close();
		}
	}

}
