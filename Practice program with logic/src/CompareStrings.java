import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1,s2;
		Scanner in = new Scanner(System.in);
				System.out.println("Enter the first String");
		s1=in.nextLine();
		System.out.println("Enter the second String");
		s2=in.nextLine();
		if (s1.compareTo(s2)>0)
		System.out.println("First string is greater than second");
		else if(s1.compareTo(s2)<0)
			System.out.println("First string smaller than second");
		else
			System.out.println("Both string are equal");
			
	}

}
