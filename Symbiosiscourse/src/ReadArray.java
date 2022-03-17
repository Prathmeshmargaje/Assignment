import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadArray
{

	public static void main(String[] args) throws IOException 
	{
		File file = new File("E:\\sample.txt");
			FileReader fr;
			try {
				fr = new FileReader(file);
			
		int d;
		StringBuffer sb = new StringBuffer();
		while ((d=fr.read())!=-1)
		{
			sb.append((char)d);
		}
		System.out.println(sb);
		String fileData = new String(sb);
		String words [] = fileData.split(" ");
		for (int i = 0; i<words.length;i++)
		{
			System.out.println(words [i]);
		
		}
			}
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

		