
public class ArgsDemo {

	public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	System.out.println("Add:"+(a+b));
	
	//other method to run command line program
	for (String s : args)
	{
		System.out.println(s);
	}

	}

}
