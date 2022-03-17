import java.io.Serializable;

public class Person implements Serializable
{
	private String name;
	private int age;
	private float salary;
	private String address;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}
	
}
