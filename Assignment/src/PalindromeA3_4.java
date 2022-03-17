import java.util.Scanner;

class PalindromeA3_4 {
	public static void main(String[] args) {
		Scanner ln=new Scanner(System.in);
		System.out.println("Enter your number to check if palindrome or not : ");
		int number=ln.nextInt();
		int temp=number;
		int rem=0,rev=0;
		while(temp!=0) {
			for(int i=1;i<=temp;i++) {
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;	
			}
		}
		    System.out.println(rev);
			if(rev==number)
				System.out.println("your number is palindrom");
			else
				System.out.println("your number is not palindrom");
	}
}