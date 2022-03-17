import java.util.Scanner;

class PrimeNumberA3_5
{
	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number to check whether prime or not : ");
		int number=sc.nextInt();
		for(int i=2;i<number;i++) 
		{
			if(number%i==0) 
			{
				temp=temp+1;
			}
		}
     if(temp>0)
	     System.out.println("your number is not prime");
     else
	     System.out.println("your number is prime");
	}
}
