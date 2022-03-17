import java.util.Scanner;

public class FibonacciNumber
{

	public static void main(String[] args) 
	{
		int fnumber=0, snumber=1, result=0, n;
		Scanner sn= new Scanner(System.in);
		System.out.println("Enter the number to check number fibonacci or not");
		n=sn.nextInt();
		for (int i=1; i<=n;i++)
		{
			result = fnumber+snumber;
			fnumber=snumber;
			snumber = result;
			System.out.print(fnumber+",");
			
		}
		if (result == snumber)
		{
			System.out.println("This series is belong to fibonacci");
		}
		else
		System.out.println("Number is not fibonacci");
	}

}
