import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class EngineersTea {

	public static void main(String[] args) throws Exception
	{
	Scanner sn = new Scanner (System.in);
	String cont="";
	
	ShamLal sham = new ShamLal();
	do
	{
		System.out.println("------Welcome to Engineers Tea");
		System.out.println("1. Diploma Tea");
		System.out.println("2.Mechanical Tea");
		System.out.println("3.BCA Tea");
		System.out.println("4.Computerwali Tea");
		System.out.println("--------------------------------");
		System.out.println("Please place your order");
		int choice = sn.nextInt();
		switch (choice)
		{
		case 1:
			sham.getorder("DiplomaTea");
		break;
		case 2:
			sham.getorder("MechanicalTea");
		break;
		case 3:
			sham.getorder("BCATea");
		break;
		case 4:
			sham.getorder("ComputerWaliTea");
		break;
		default:
			System.out.println("Sorry Sir, Your order is not Available");
		}
		System.out.println("Do you want to continue...(T/t)");
		cont = sn.next();
	
	}
	while(cont.equalsIgnoreCase("t"));
	System.out.println("Thank You visit again");
		
		
	}

}
