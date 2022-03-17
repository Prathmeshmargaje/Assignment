
import java.util.Scanner;
public class SwapTwoNumber 
{
	public static void main(String[] args) 
	{
		int number1,number2;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter your number1 : ");
		number1=num.nextInt();
		System.out.println("Enter your number2 : ");
		number2=num.nextInt();
		System.out.println("Before swap");
		System.out.println("number1 : " +number1);
		System.out.println("number2 : " + number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("---------------");
		System.out.println("After Swap");
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
    
	}

}
