import java.util.Scanner;

class GetSimpleInterest{
	int principle;
	int rate;
	int time;

	GetSimpleInterest(int principle,int rate,int time ){
		this.principle=principle;
		this.rate=rate;
		this.time=time;
		double simpleInterest=(principle*rate*time)/100;
		System.out.println("Simple interest : " + simpleInterest);
}
}
public class SimpleInterest5_5 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter your principle value : ");
		int getPrinciple=sn.nextInt();
		System.out.println("Enter your rate in % : ");
		int getRate=sn.nextInt();
		System.out.println("Enter your time in sec : ");
		int getTime=sn.nextInt();
		GetSimpleInterest sc=new GetSimpleInterest(getPrinciple,getRate,getTime);

	}

}
