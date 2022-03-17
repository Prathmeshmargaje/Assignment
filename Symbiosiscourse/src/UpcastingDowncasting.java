class Student
{
	void info()
	{
		System.out.println("Student info display");
	}
}
class Exam extends Student
{
	void examInfo ()
	{
		System.out.println("Exam info display");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) 
	{
	
		Student st = new Student (); 
		Student obj = new Exam ();  // upcasting
		Exam ex = (Exam) obj;      // downcasting
		st.info();    // we create student object from student class and access info method
		obj.info();  
		/* created student ref object from exam class and store data of exam class into object
		and access info method through obj */
		ex.examInfo(); 
		/* in ex:-exam class and student object properties are present and
		 *  by accessing ex.examinfo we access examinfo method object 
		 */
		ex.info();
		/* in ex:-exam class and student object properties are present and
		 *  by accessing ex.info we access info method object 
		 */
		
	}

}
