import java.util.Scanner;
class ToFindSquareAndCube
{
	void toFindSquareAndCube(int choice,int number)
	{
		switch(choice)
		{
		case 1 : 
			int square=number*number;
			System.out.println("square root is : " + square );
			break;
		case 2 :
			int cube=number*number*number;
			System.out.println("cube root is : " + cube);
            break;
            default:
            	System.out.println("enter valid choice either 1 or 2");
		}
	}
}
public class FindSquareAndCube4_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int getChoice=sc.nextInt();
		System.out.println("Enter your number : ");
		int getNumber=sc.nextInt();
		ToFindSquareAndCube sn=new ToFindSquareAndCube();
		sn.toFindSquareAndCube(getChoice, getNumber);
	}

}