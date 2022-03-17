import java.util.ArrayDeque;

public class QueueDemo {

	public static void main(String[] args) 
	{
	ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
	arrayDeque.push("Raj");
	arrayDeque.push("Ramesh");
	arrayDeque.push("Pooja");
	arrayDeque.push("Sham");
	System.out.println(arrayDeque);
	arrayDeque.pop();
	System.out.println(arrayDeque);

	}

}
