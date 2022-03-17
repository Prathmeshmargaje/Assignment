
public class ArgsDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]); //take input from string and convert into int by using wrapper class
		int b=Integer.parseInt(args[1]);
		System.out.println("add:"+(a+b));
		
		//other method
		for (String s : args)
		{
		System.out.println(s);	
		}
		

	}

}
