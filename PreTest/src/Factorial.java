import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) 
	{
		int a, n, fact=1;
		Scanner sn = new Scanner(System.in);
		System.out.println("Write a number to calculate a factorial");
		n= sn.nextInt();
		
		for	(a=1;a<=n;a++)
		{
			fact = fact *a;
		
		}
	
		System.out.println("The factorial of "+n+" is "+fact);
	}
}
