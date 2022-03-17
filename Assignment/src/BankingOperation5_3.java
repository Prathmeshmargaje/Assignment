import java.util.Scanner;

class SbiBank{
	void netBanking(long senderAccount,int amount, long receiverAccount) {	
		System.out.println(" your account number : " + senderAccount);
		System.out.println(" your amount : " + amount);
		System.out.println(" your receiver account number : " + receiverAccount);
		System.out.println("Trans. successfully");
	}
	void upiBanking(long senderMobileNo,int amount,long receiverAccount) {
		System.out.println("your mobile number : " +senderMobileNo);
		System.out.println("your amount : " + amount );
		System.out.println("your receiver account number : " + receiverAccount);
		System.out.println("Trans. successfully");
	}
	void chequeMethod(int senderChequeNo,int amount,long receiverAccount) {
		System.out.println(" your cheque number : " + senderChequeNo);
		System.out.println("your amount : " + amount);
		System.out.println("your receiver account number : " + receiverAccount);
		System.out.println("Trans. successfully");
	}
	void demandDraft(int senderDDNo,int amount,long receiverAccount) {
		System.out.println("your demand draft number : " + senderDDNo);
		System.out.println("your amount : " + amount);
		System.out.println("your receiver account number : " + receiverAccount);
		System.out.println("Trans. successfully");
	}
}

public class BankingOperation5_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=" ";
		do {
			System.out.println("Welcome to the banking application...");
			System.out.println("1. net banking");
			System.out.println("2. Upi banking");
			System.out.println("3. cheque method");
			System.out.println("4. Demand draft method");
			System.out.println("Enter your choice");
			int choice =sc.nextInt();
			switch(choice) {
			case 1 :
				SbiBank sn=new SbiBank();
				//int getSenderAccountNumber=sc.nextInt();
				//int getAmount=sc.nextInt();
				//int getreceiverAccount=sc.nextInt();
				sn.netBanking(88888888,5000,32456789);
				break;
			case 2:
				SbiBank sr=new SbiBank();
				//int getSenderMobileNumber=sc.nextInt();
				//int getAmount1=sc.nextInt();
				//int getreceiverAccount1=sc.nextInt();
				sr.upiBanking(88888888, 5000, 324589586);
				break;
			case 3:
				SbiBank sk=new SbiBank();
				//int getSenderMobileNumber=sc.nextInt();
				//int getAmount1=sc.nextInt();
				//int getreceiverAccount1=sc.nextInt();
				sk.chequeMethod(325685, 5000, 32548785);
				break;
			case 4:
				SbiBank sj=new SbiBank();
				//int getSenderMobileNumber=sc.nextInt();
				//int getAmount1=sc.nextInt();
				//int getreceiverAccount1=sc.nextInt();
				sj.demandDraft(325485, 5000, 325485585);
				break;
			default:
				System.out.println("please enter valid option");
			}
			System.out.println("you want to continue (y/Y)");
			str=sc.next();
		}while(str.equalsIgnoreCase("y")); 
		System.out.println("Thank you for using banking services...");
	}

}