
public class LargestOfThreeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	int x=40, y=60, z=10;
	if (x>y&&x>z)
		System.out.println("first number is largest");
	else if (y>x&&y>z)
		System.out.println("Second number is largest");
	else if (z>x&&z>y)
		System.out.println("Third number is largest:");
	else
		System.out.println("entered number is not distinct");
	}

}
