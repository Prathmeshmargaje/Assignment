
public class TypeCastingDemo {

	public static void main(String[] args)
	{
		System.out.println("PDT to PDT type casting"
				+ "");
		// p.d.t to p.d.t ....... primitive data types to primitive data types 
		int a=10;
		long l =(long)a;
		System.out.println(l);
		float f = 30.30f;
		int i = (int )f;
		System.out.println(i);
		char ch='A';
		byte b=(byte)ch;
		System.out.println(b);
		char c =(char)b;
		System.out.println(c);
		System.out.println("PDT to Ref object type casting");
		
//----------p.d.t to ref. object--------------------
		Integer in = new Integer (a);
		System.out.println(in);
		Integer obj = new Integer (b);
		System.out.println(obj);
		Float fobj =f; // auto boxing
		System.out.println(fobj);
		System.out.println("Ref to PDT casting");
//-------------	Ref to p.d.t------------------------
		int x = in.intValue(); // unboxing
		System.out.println(x);
		float y = fobj.floatValue();
		System.out.println(y);
		double d = in; // auto unboxing
		System.out.println(d);
		
		
		
		
	}

}
