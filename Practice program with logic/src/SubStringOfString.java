import java.util.Scanner;

public class SubStringOfString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String string, sub;
		int i, c, length;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to print its all substring");
		string = in.nextLine();
		length = string.length();
		System.out.println("Substring of "+string+"\"are :");
			for (c=0;c<length;c++)
			{
			for (i=1;i<=length-c;i++)
			{
				sub=string.substring(c,c+i);
				System.out.println(sub);
			}
			}
	}

}
