import java.util.Scanner;

class fibo
{
 public void m1()
 	{
	 int a=0,b=1, res=0,n;
	 System.out.println("-------First Code--------");
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number for fibonacci series");
		n= sn.nextInt();
		for (int i = 1;i<=n;i++)
		{
			res=a+b;
			a=b;
			b=res;
			System.out.print(a+",");
		}
	
	}
}

class Second 
{
	public void m4()
	{
		System.out.println("------------Second code--------");
		int a=1,b=2,temp=5;
		for (int i = 1; i<=temp;i++)
		{
			a = a+3;
			b= b+4;
			System.out.print(a+","+b+",");
		}
	}
}

class AddThird
{
	public void m2()
	{
		System.out.println("---------Third code-----------------");
		int a=1, b=5 , c=8,d;
		System.out.println(a+","+b+","+c);
		for (int i = 0; i<=100;i++)
		{
			d=a+b+c;
			a=b;
			b=c;
			c=d;
			System.out.println(a+","+b+","+c+",");
			
		}
	}
}




public class PseudoCode 
{

	public static void main(String[] args) 
	{
	fibo a=new fibo();
	a.m1();
	System.out.println("..N");
	
	AddThird add= new AddThird();
	add.m2();
	Second sd= new Second ();
	sd.m4();
	
	
	
	}

}
