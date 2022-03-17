import java.util.Scanner;
class CircleArea{
	int redius;
	CircleArea(int redius){
		this.redius=redius;
		double areaOfCircle= 3.14*redius*redius;
		System.out.println("Area of circle : " + areaOfCircle);
	}
}
class RectangleArea{
	int width,height;
	RectangleArea(int width,int height){
		this.width=width;
		this.height=height;
		int rectangleArea=width*height;
		System.out.println( "rectangle area is : " + rectangleArea);
	}
}
public class Area5_1 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the redius: ");
		int getRedius=sn.nextInt();
		CircleArea ar=new CircleArea(getRedius);
		System.out.println("--------------------------------------");
		System.out.println("Enter your rectangle Width : ");
		int getWidth=sn.nextInt();
        System.out.println("Enter your rectangle Height: ");
        int getHeight=sn.nextInt();
        RectangleArea rn=new RectangleArea(getWidth,getHeight);
	}

}
