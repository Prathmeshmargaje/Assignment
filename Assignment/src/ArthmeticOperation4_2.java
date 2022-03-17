
import java.util.Scanner;
class Addition{
	int getAddition(int number1,int number2) {
		int sum=number1+number2;
		System.out.println("Addition is : " + sum);
		return sum;	
	}
}
class Substraction{
	int getSubstraction(int number1,int number2) {
		int subtraction=number1-number2;
		System.out.println("Substraction is : " + subtraction);
		return subtraction;	
	}
}
class Division{
	void getDivision(double number1,double number2) {
		double division=number1/number2;
		System.out.println("Division is : " + division);	
	}
}
class Multiplication{
	int getmultiplication(int number1,int number2) {
		int multiplication=number1*number2;
		System.out.println("Multiplication is  : " + multiplication);
		return multiplication;	
	}
}

public class ArthmeticOperation4_2 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter your number1 : " );
		int getNumber1=sn.nextInt();
		System.out.println("Enter your number2 : ");
		int getNumber2=sn.nextInt();
        Addition sc=new Addition();
        sc.getAddition(getNumber1, getNumber2);
        Substraction sr=new Substraction();
        sr.getSubstraction(getNumber1, getNumber2);
        Division sl=new Division();
        sl.getDivision(getNumber1, getNumber2);
        Multiplication sk=new Multiplication();
        sk.getmultiplication(getNumber1, getNumber2);
	}

}
