
public class JavaMethod
{
////// Create a Non static Method with returning value (return) ////////
	public int add()
	{
	int a =10, b=20;
	int res=a+b;
	return res;
	}
//------Create a Non static Method with returns nothing (void)-----//
	public void add2()
	{
	int a =12, b=22;
	System.out.println(a+b);
	}	
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
	System.out.println(x-y);
	}	
	
	public static void main(String[] args)
	{
//--------Create Object (instance of class) ----------//
	JavaMethod abc = new JavaMethod();  // for non static method //
	
//--------Calling Non Static Methods using objects-------//	
	int result = abc.add();
	System.out.println(result); // 30 
	// OR //
	System.out.println(abc.add());
	
//-----Calling Non Static Method (void )-------//	
	abc.add2();  // 34

//------Calling Static Method----------//
	int a =JavaMethod.sub();
	System.out.println(a); //50
	
	JavaMethod.sub2();    //-21
	
		
		
		
	}

}
