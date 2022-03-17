import java.util.Scanner;

public class SwapNumberWithoutVariableA3_7
{
	
		public static void main(String[] args) {
			int number1,number2;
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter your number1 : ");
			number1=sn.nextInt();
			System.out.println("Enter your number2 : ");
			number2=sn.nextInt();
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


