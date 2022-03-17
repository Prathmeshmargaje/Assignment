import java.util.Scanner;

public class ArrayDemo
{

	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		int arr[]=new int[10];
		for (int i = 0;i<10;i++)
		{
			System.out.println("Enter "+(i+1)+ " Value");
			arr[i]=sn.nextInt();
		}
		for (int i = 0; i<10;i++)
		{
			System.out.println((i+1)+" Number is "+ arr[i]);
		}
		
	}

}
