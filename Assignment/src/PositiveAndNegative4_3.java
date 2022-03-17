import java.util.Scanner;
class NumberStatus{
	void checkNumber(int number) {
		if(number > 0) 
			System.out.println("your number is positive");
		else
			System.out.println("your number is negative");
	}
}
public class PositiveAndNegative4_3 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter your number ");
		int getNumber=sn.nextInt();
		NumberStatus sc=new NumberStatus();
		sc.checkNumber(getNumber);
	}
}