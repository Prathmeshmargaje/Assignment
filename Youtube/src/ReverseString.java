
public class ReverseString {

	public static void main(String[] args)
	{
	// using+ (string concatenation) operator ------SDET Youtube	
		String str = "ABCD"; // string variable declaration
		String rev = "";     // temporary variable
		
		int len=str.length();   // to measure length lenght() method is used
		for (int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);  //DCBA to extract value from string charAt() method is used 
		}
		
		System.out.println("reverse string is:"+rev);
		
	}

}
