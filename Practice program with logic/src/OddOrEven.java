import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x;
		System.out.println("Enter an integer to check if it is even or odd");
		Scanner in= new Scanner(System.in);
		x = in.nextInt();
		if (x%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}

}
