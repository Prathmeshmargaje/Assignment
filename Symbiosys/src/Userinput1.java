import java.util.Scanner;

public class Userinput1 {

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner (System.in);
		String userName;
		System.out.println("enter userName");
		userName = myObj.nextLine();
		System.out.println("Username is :"+ userName);
		
	}

}
