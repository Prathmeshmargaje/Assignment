import java.util.Scanner;

public class SwapNumberWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,temp;
System.out.println("enter x & y");
Scanner in = new Scanner (System.in);
x = in.nextInt();
y=in.nextInt();
System.out.println("before Swap:"+x+"\t"+y);
temp = x;
x=y;
y=temp;
System.out.println("After swap:"+x+"\t"+y);
	}

}