
public class Swapnumber2 {

	public static void main(String[] args) {
	int a = 20, b=50;
	System.out.println("before swapping");
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("after swapping");
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.println("a="+a);
	System.out.println("b="+b);


	}

}
