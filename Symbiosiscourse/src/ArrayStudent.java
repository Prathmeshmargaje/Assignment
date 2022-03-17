import java.util.Scanner;

public class ArrayStudent
{

	public static void main(String[] args) 
	{
	Scanner sn = new Scanner (System.in);
	String arr[]=new String[10];
	for(int i =0; i<10;i++)
	{
		System.out.println("Enter "+(i+1)+" Student name");
		arr[i]=sn.next();
	}
	for (int i=0;i<10;i++)
	{
		System.out.println((i+1)+". Name of the student is "+arr[i]);
	}

	}

}
