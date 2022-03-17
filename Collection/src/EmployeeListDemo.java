import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class EmployeeListDemo {

	public static void main(String[] args)
	{
	List<Employee> employees = new ArrayList<Employee>();
	Employee Emp = new Employee(101, "Pooja", 8080.90f);
	employees.add(Emp);
	employees.add(new Employee(102,"Vaibhav",8090.60f));
	employees.add(new Employee(103,"Kunal",7090.60f));
	employees.add(new Employee(104,"Sham",6090.60f));
	employees.add(new Employee(105,"Raja",5090.60f));
	System.out.println(employees);
	Iterator it = employees.listIterator();
	while (it.hasNext())
	{
		Employee emp = (Employee)it.next();
		System.out.println(emp.getEmpid()+"\t"+emp.getEmpName()+"\t"+emp.getEmpSal());
	}
	ArrayList<String>al = new ArrayList<String>();
	for (int i =0; i<employees.size();i++)
	{
		Employee emp= employees.get(i);
		String name= emp.getEmpName();
		al.add(name);
	}
	Collections.sort(al);
	System.out.println(al);
	Collections.reverse(al);
	System.out.println(al);
	}

}

