import java.util.Scanner;

public class AddTwoArray
{

	public static void main(String[] args)
	{
		int arr1 [][]= new int [3][3];
		int arr2 [][]= new int [3][3];
		int res [][]= new int [3][3];
		Scanner sn = new Scanner(System.in);
		
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println("Enter number :");
				arr1 [i][j]=sn.nextInt();
			}
		}
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println(arr1 [i][j]+"\t");
				
			}
		}
		
		// second Loop
		
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println("Enter number :");
				arr2 [i][j]=sn.nextInt();
			}
		}
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println(arr2 [i][j]+"\t");
				
			}
		}
	//--------addition loop--------
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println("Enter number :");
				arr2 [i][j]=sn.nextInt();
			}
		}
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println(arr2 [i][j]+"\t");
				
			}
		}
	

	}

}
