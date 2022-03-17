import java.util.Scanner;

class Sbi1
{
	void ministatement(int accno)
	{
		System.out.println("For your account number:"+accno);
		System.out.println("last 5"
				+ "v Trans Display...");
	}
}
class Sbi2 extends Sbi1
{
	void ministatement(int accno)
	{
		System.out.println("For your account number:"+accno);
		System.out.println("last 10 Trans Display...");
	}
}
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "";
Scanner sn = new Scanner(System.in);
	do
	{
		System.out.println("--------Menu----------");
		System.out.println("1.For last 5 Trans");
		System.out.println("2.For last 10 Trans");
		
		System.out.println("Enter your Choice");
		int choice=sn.nextInt();
		switch (choice)
		{
		case 1:
			new Sbi1().ministatement(1919);
		break;
		case 2:
			new Sbi2().ministatement(1919);
		break;
		default:
			System.out.println("Enter invaild input");
			
		}
		System.out.println("Do you want to continue ...(Y/y)");
		str = sn.next();
		
	}
	while (str.equalsIgnoreCase("y"));
	
	}

}
