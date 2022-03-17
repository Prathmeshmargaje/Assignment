import java.util.Scanner;

class IciciBank
// Fund Transfer using net banking
{
	public void fundTransfer(int senderAcc, int receiverAcc, double amount)
	{
	System.out.println("Welcome to net banking services.");
	System.out.println("Sender acc no:"+senderAcc);
	System.out.println("Receiver acc No:"+receiverAcc);
	System.out.println("Transfer amount"+amount);
	System.out.println("Fund transfer successfully....");
	}


// transfer using DD banking

	public void fundTransfer(int ddnum, double amount, int receiverAcc)
	{
	System.out.println("Welcome to DD banking services.");
	System.out.println("DD Number:"+ddnum);
	System.out.println("Receiver acc No:"+receiverAcc);
	System.out.println("Transfer amount"+amount);
	System.out.println("Fund transfer successfully using DD ....");
	}
	
// fund transfer using Cheque banking	
	public void fundTransfer(int chequeNum, double amount)
	{
	System.out.println("Welcome to cheque banking services.");
	System.out.println("Sender cheque no:"+chequeNum);
	System.out.println("Transfer amount"+amount);
	System.out.println("Fund transfer successfully using cheque ....");
	}


//transfer using mobile banking

	public void fundTransfer(long mobileNo, double amount)
	{
	System.out.println("Welcome to mobile banking services.");
	System.out.println("Mobile no:"+mobileNo);
	System.out.println("Transfer amount"+amount);
	System.out.println("Fund transfer successfully using mobile banking ....");
	}
}

public class StaticPolymorphism {
	
	private static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner (System.in);
		
		IciciBank icici = new IciciBank();
		do
		{
			System.out.println("---------Banking Services-----------");
			System.out.println("1. Net banking");
			System.out.println("2. DD Banking");
			System.out.println("3. Cheque Banking");
			System.out.println("4. UPI payment");
			System.out.println("-------------------------------------");
			System.out.println("Enter your service Name:");
			String choice = sn.next();
			String ch = choice.toLowerCase();
			switch (ch)
			{
			case "netbanking":
				icici.fundTransfer(191919, 202020, 650000.90);
			break;
			case "ddbanking":
				icici.fundTransfer(273490, 65000.90, 202020);
			break;
			case "chequebanking":
				icici.fundTransfer(191919, 65000.90);
			break;
			case "upibanking":
				icici.fundTransfer(985011111, 65000.90);
			break;
			default :
				System.out.println("Please enter valid service.");
			}
			System.out.println("Do you want to continue ....(1)");
			num = sn.nextInt();
			
		}
		while (num==1);
		System.out.println("Thank you....Visit again");
		}

}
