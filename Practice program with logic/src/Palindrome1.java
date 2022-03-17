import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for ( int i = length - 1; i >= 0; i-- )
		reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
		System.out.println("Entered string is a palindrome.");
		else
		System.out.println("Entered string is not a palindrome.");

		// other method
	/*	String inputString;
		Scanner in1 = new Scanner(System.in);
		System.out.println("Input a string");
		inputString = in.nextLine();
		int length1 = inputString.length();
		int i, begin, end, middle;
		begin = 0;
		end = length - 1;
		middle = (begin + end)/2;
		for (i = begin; i <= middle; i++) {
		if (inputString.charAt(begin) == inputString.charAt(end)) {
		begin++;
		end--;
		}
		else {
		break;
		}
		}
		if (i == middle + 1) {
		System.out.println("Palindrome");
		}
		else {
		System.out.println("Not a palindrome");
		} */

	}

}
