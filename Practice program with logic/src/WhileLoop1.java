import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
		Scanner in= new Scanner(System.in);
			System.out.println("Input an integer");
		while ((n=in.nextInt()) != 0)
		{
			System.out.println("you enterd"+n);
			System.out.println("input an integer");
		}
		System.out.println("Out of loop");
	}

}
