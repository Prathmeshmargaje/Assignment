import java.util.Scanner;

public class BreakContinueWhileLoop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("input an integer");
			n= in.nextInt();
			if (n!=0)
			{
				System.out.println("You entered"+n);
				continue;
			}
			else
			{
				break;
			}
		}
	}

}
