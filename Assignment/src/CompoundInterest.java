import java.util.Scanner;
class CompoundInterest 
{
	public static void main(String[] args) 
	{
		double principle,rate,time;
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter principle value : ");
	    principle=sn.nextDouble();
		System.out.println("Enter your rate : ");
        rate=sn.nextDouble();
        System.out.println("Enter your time : ");
        time=sn.nextDouble();
		double result = principle*(Math.pow((1+rate/100),time));
		System.out.println("your compound Interest of given principle,rate and time is  : " + result);
	}

}