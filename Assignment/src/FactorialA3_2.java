
import java.util.Scanner;
 class FactorialA3_2
 {
	public static void main(String[] args) 
	{
		int fact = 1,number;
		Scanner in=new Scanner(System.in);
        System.out.println("Enter the number you want to factorial : ");
        number=in.nextInt();
        for(int i=1;i<=number;i++) {
        	 fact=fact*i;
        }
        System.out.println("Factorial of " + number + " is " + fact );
	}
}