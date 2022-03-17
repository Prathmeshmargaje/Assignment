import java.util.Scanner;

class ArithematicOperation{
	int number1,number2;
	ArithematicOperation(int number1,int number2){
		this.number1=number1;
		this.number2=number2;
		int sum=number1+number2;
		int sub=number1-number2;
		System.out.println("Addition is : " + sum);
		System.out.println("Substraction is : " + sub);
	}
}
public class Arthmetic5_2 {
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter your number1 : ");
		int getNumber1=sr.nextInt();
		System.out.println("Enter your number2 :  ");
		int getNumber2=sr.nextInt();
		ArithematicOperation ad=new ArithematicOperation(getNumber1,getNumber2);
	}

}