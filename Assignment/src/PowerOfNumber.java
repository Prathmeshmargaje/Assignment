
import java.util.Scanner;
 class PowerOfNumber 
 {
	public static void main(String[] args) 
	{
		int result = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number : ");
		int number=sc.nextInt();
		System.out.println("Enter your power : ");
		int power =sc.nextInt();
	    result=(int)Math.pow(number,power);	
	    System.out.println("power of your number : " + result);
		}		
	}
