import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n,num=1,c,d;
		Scanner in= new Scanner (System.in);
		System.out.println("Enter the Number of rows of floyd triangle you want");
		n= in.nextInt();
		System.out.println("Floyd Triangle");
		for(c=1;c<=n;c++)
		{
			for (d=1;d<=c;d++)
			{
				System.out.print
				(num++);
				num++;
			}
			System.out.println();
		}
	}

}
