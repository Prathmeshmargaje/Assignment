import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
	List<String> list= new LinkedList<String>();
	list.add("Pune");
	list.add("Mumbai");
	list.add("Goa");
	System.out.println(list);
	list.add(3, "Kolhapur");
	System.out.println(list);
	list.add(1, "Bhor");
	System.out.println(list);

	}

}
