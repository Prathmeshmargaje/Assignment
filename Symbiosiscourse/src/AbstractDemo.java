abstract class Atm 
{
    void miniStatement ()
	{
		System.out.println("Last 5 Trans ....");

	}
	abstract void cashWithdraw();

}

class Sbi extends Atm
{

	@Override
	void cashWithdraw() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hey happy to inform you This service is available");
	}
	
}

class ICICI
{
	
}
class BankOfBaroda
{
	
}

public class AbstractDemo {

	public static void main(String[] args) {
    Atm atm = new Sbi();
    atm.cashWithdraw();
    atm.miniStatement();
    
    
		
	}

}
