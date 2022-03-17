import java.util.Scanner;

public class TwoDimentionalArray 
{

	public static void main(String[] args) 
	{
	int arr [][]=new int [2][2];
	Scanner sn = new Scanner(System.in);
	for (int i =0;i<2;i++)
	{
		for (int j =0; j<2;j++)
		{
			System.out.println("Enter number :");
			arr[i][j]=sn.nextInt();
			
		}
		
	}

	for (int i =0;i<2;i++)
	{
		for (int j =0; j<2;j++)
		{
			
		System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	
	
	}

}
