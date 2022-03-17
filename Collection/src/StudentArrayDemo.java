import java.util.Scanner;

public class StudentArrayDemo {

	public static void main(String[] args)
	{
	Scanner	sn = new Scanner(System.in);
	String arr[] = new String[4];
	Integer brr[]=new Integer[4];
	for(int i =0; i<4;i++)
	{
		System.out.println("Enter "+(i+1)+" Student name");
		arr[i]=sn.next();
		System.out.println("Enter "+(i+1)+" Student roll no:");
		brr[i]=sn.nextInt();
	}
	for (int i=0;i<4;i++)
	{
		System.out.println((i+1)+". Name of the student is "+arr[i]+" and roll No: "+brr[i]);
		
	}
		

	}

}
