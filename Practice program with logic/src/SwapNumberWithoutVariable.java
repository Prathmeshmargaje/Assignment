import java.util.Scanner;

public class SwapNumberWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x, y ;
System.out.println("Enter the value x & y");
Scanner in = new Scanner (System.in);
x=in.nextInt(); //x = 10
y=in.nextInt(); //y=30
System.out.println("Before swap"+x+"\t"+y);
x=x+y; //10+30=40 = x
y=x-y;  //40-30=10=y
x=x-y;  // 40-10=30=x
System.out.println("after swap:"+x+"\t"+y);


// other method 

  
	}

}
