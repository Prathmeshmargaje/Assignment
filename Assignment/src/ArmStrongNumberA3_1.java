import java.util.Scanner;

public class ArmStrongNumberA3_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number : " );
		int number=sc.nextInt();
		int rem=0,sum=0;
		int temp=number;
		while(temp!=0) {
			for(int i=0;i<=temp;i++) {
				rem=temp%10;
				temp=temp/10;
				sum=sum+rem*rem*rem;
			}
		}
		if(number==sum)
			System.out.println("your number is armstrong");
		else
			System.out.println("your number is not armstrong");
	}
}