import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadArray2
{
	

	public static void main(String[] args) throws IOException 
	{
		File file = new File("E:\\Core java\\sample1.txt");
		try {
			FileReader fr =new FileReader(file);
			int count = 0;
			int d;
			StringBuffer sb = new StringBuffer();
			while ((d=fr.read())!=-1)
			{
				sb.append((char)d);
			}
			System.out.println(sb);
			String fileData = new String(sb);
			String words []= fileData.split(" ");
			
			for (int i = 0; i<words.length;i++)
			{
				System.out.println(words [i]);
				count++;
			}
			System.out.println(fileData.contains("Prathmesh"));
			System.out.println("No of Statement :"+count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
