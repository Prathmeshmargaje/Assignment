import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int marksObtained, passingMarks;
		char grade='m';
		passingMarks=40;
		Scanner in= new Scanner (System.in);
		System.out.println("Input marks scored by you");
		marksObtained = in.nextInt();
		if (marksObtained>=passingMarks)
		{
			if (marksObtained>90)
				grade = 'A';
			if (marksObtained>75)
				grade = 'B';
			if (marksObtained>60)
				grade = 'C';
			if (marksObtained>40)
				grade = 'D';
			System.out.println("You passed the exam and grade is "+grade);
				
		}
		else
		{
			grade='F';
					System.out.println("you failed the exam and grade is"+grade);
		}
	}

}
