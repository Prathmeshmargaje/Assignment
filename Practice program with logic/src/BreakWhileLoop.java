import java.util.Scanner;

public class BreakWhileLoop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;
		Scanner in= new Scanner(System.in);
		while (true)
		{
			System.out.println("Input an Integer");
			n =in.nextInt();
			if (n==0)
			{
				break;
			}
			System.out.println("you entered "+n);
		}
	}

}
