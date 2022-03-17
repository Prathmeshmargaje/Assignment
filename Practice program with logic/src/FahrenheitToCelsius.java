import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float temperature;
Scanner in = new Scanner (System.in); // create object of scanner class 
System.out.println("Enter temperature in Fahrenheit :");
temperature = in.nextInt(); // take input in integer  
temperature = ((temperature-32)*5)/9;

System.out.println("Temp in Celsius="+temperature);
	}

}
