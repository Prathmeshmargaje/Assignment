package Pack1;
import java.util.*;
public class FarenheitCelcius {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		float temp;
		System.out.println("Enter the temperature");
		temp= sn.nextFloat();
		temp = ((temp - 32)*5)/9;
		System.out.println("Temp in celsious: "+ temp);
		
		
	}

}
