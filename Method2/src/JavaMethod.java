

public class JavaMethod
{
////// Create a Non static Method with returning value (return) ////////
	public int add()
	{
	int a =10, b=20;
	int x=sub();
	int res=a+b+x;
	return res;
	}
//------Create a Non static Method with returns nothing (void)-----//
	public void add2()
	{
	int a =12, b=22;
	System.out.println(a+b);
	}	
//-----------------------------------------------------------------------------------//	
	// calling static method into another static method //
//------- Create a Static Method with return a value-----------------//	
	public static int sub()
	{
	int x=100, y=50;
	int z = x-y;
	return z;
	}
//----- Create a Static Method with return nothing (void)---------//	
	public static void sub2()
	{
	int x=13, y=34;
	int p=sub();
	System.out.println(x-y-p);
	}	
	
	public static void main(String[] args)
	{
//--------Create Object (instance of class) ----------//
	JavaMethod abc = new JavaMethod();  
	
//--------Call a Static Method within another Static Method------------//	
	sub2(); // -71
	
	int res=abc.add(); // 80`
	System.out.println(res);	
		
		
	}

}
