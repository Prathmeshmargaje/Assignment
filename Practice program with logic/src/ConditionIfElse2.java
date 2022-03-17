import java.util.Scanner;

public class ConditionIfElse2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int marksObtained, passingMarks;
		passingMarks=40;
		Scanner in = new Scanner (System.in);
		System.out.println("input marks scored by you");
		marksObtained = in.nextInt();
		if (marksObtained >= passingMarks)
		{
			System.out.println("You passed the exam");
		
		}
		else
		{
			System.out.println("you failed the exam");
		}
		
	}

}
