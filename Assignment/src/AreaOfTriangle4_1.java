import java.util.Scanner;
class GetArea{
	public void getArea(int height,int base) {
		double areaOfTringle=0.5*base*height;
		System.out.println("your area of triangle is : " + areaOfTringle);
	}
}
public class AreaOfTriangle4_1 {
	public static void main(String[] args) {
		Scanner ar=new Scanner(System.in);
		System.out.println("Enter your tringle base : ");
		int getBase=ar.nextInt();
		System.out.println("Enter your tringle height : ");
		int getHeight=ar.nextInt();
		GetArea sc=new GetArea();
		sc.getArea(getHeight, getBase);
	}
}
