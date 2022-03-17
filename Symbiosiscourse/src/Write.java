import java.io.FileWriter;

import java.io.IOException;

public class Write {

	public static void main(String[] args)
	{
		String str = "Prathmesh Margaje";
		try {
			FileWriter fw = new FileWriter ("E:\\FileDemo.txt");
			for (int i=0; i<str.length();i++)
				fw.write(str.charAt(i));
			    System.out.println("Successfully Writen");
			    fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
