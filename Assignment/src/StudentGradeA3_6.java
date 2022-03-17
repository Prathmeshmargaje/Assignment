import java.util.Scanner;
class StudentGradeA3_6
{
	public static void main(String[] args)
	{
		char grade;
		int passingMark=40;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your marks scored by you : ");
		int markObtained=in.nextInt();
		if(markObtained>=passingMark) 
		{
		if(markObtained >90)
			grade='A';
		else if(markObtained > 75)
			grade='B';
		else if(markObtained>60)
			grade='C';
		else
			grade='D';
		System.out.println("you passed the exam and your grade is " + grade);
	}
		else 
		{
			grade='F';
			System.out.println("you fail and your grade is " + grade);
		}

	}
}