 import java.util.Scanner;
 
public class Userinput2 {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter name, age and salary :");
		
		// String input
		String n = obj.nextLine();
		
		// Numerical input 
		int a = obj.nextInt();
		double s = obj.nextDouble();
		
		// output input by user 
		System.out.println("Name:"+n);
		System.out.println("Age:"+a);
		System.out.println("Salary:"+s);
		
		
	}

}
