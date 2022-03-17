import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
float b;
String s;
Scanner in = new Scanner(System.in);
System.out.println("Enter the String :");
s = in.nextLine();
System.out.println("Your entered string is :"+s);
System.out.println("Enter the integer");
a=in.nextInt();
System.out.println("Your entered integer is :"+a);
System.out.println("Enter the float");
b= in.nextFloat();
System.out.println("Your entered float is:"+b);

	}

}
