class Employee{
	int id;
	String name,city,state,country;
	int salary;
	void setData() {
		id=13;
		name="Sachin";
		salary=25000;
		city="Mumbai";
		state="Maharatra";
		country="India";
	}
	void getData(){
		System.out.println("....Employee Information....");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Country : " + country);
	}
}
public class Employee_info5_4 {
	public static void main(String[] args) {
		Employee em=new Employee();
		em.setData();
    	em.getData();
	}
}
 