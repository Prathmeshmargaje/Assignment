import javax.management.RuntimeErrorException;

interface Calculator 
{
	// void switchOn(); // No paramenter i/p -----1
	
//--------end ----------
	// void sum(int input); // p.d.t paramenter i/p no o/p----2

//---------end ----------
	int substract (int i1, int i2); // p.d.t. parameter i/p p.d.t o/p---3
}

public class CalculatorImpl 
{

	public static void main(String[] args) 
	{
	//	Calculator calculator = ()-> System.out.println("Switch on"); --------1
	//	calculator.switchOn();
		
//-------------end ---------		
	//	Calculator calculator =(int input)-> System.out.println("sum :"+ input);
	//	calculator.sum(394);
		
//-----------end -----------
	//	Calculator calculator = (i1,i2)-> i2-i1; 
		// for single line command no need to add body but for business logic need to add body 
	/*	Calculator calculator = (i1,i2)->{
			if (i2<i1) {
				throw new RuntimeException("message");
			} else {
				return i2-i1;
			}
		}; // lamda expression syntax so ; added 
		System.out.println(calculator.substract(8, 20));
	*/	
	}

}
