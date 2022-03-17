import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n, sum = 0, temp, reminder, digit = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Input the number to check if it is armstrong or not");
		n=in.nextInt();
		temp = n;
		while (temp!=0)
		{
			digit++;
			temp=temp/10;
		}
		temp = n;
		while (temp!=0)
		{
			reminder = temp % 10;
			sum = sum + power(reminder,digit);
			temp = temp/10;
			
		}
		if (n==sum)
			System.out.println(n+"is an armstrong number");
		else
			System.out.println(n+"is not an armstrong number");
	}
	static int power(int n, int r)
	{
		int c,p=1;
		for (c=1; c<=r;c++)
			p=p*n;
		return p ;
		
	}

}
