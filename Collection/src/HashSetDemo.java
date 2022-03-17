import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		Set<Integer>hs= new HashSet<Integer>();
		hs.add(101);
		hs.add(102);
		hs.add(103);
		hs.add(104);
		System.out.println(hs.add(101));
		System.out.println(hs);
	}

}
