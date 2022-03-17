
public class Employee
{
	private int empid;
	private String empName;
	private float empSal;
	
	public int getEmpid() {
		return empid;
	}
	public String getEmpName() {
		return empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public Employee(int empid, String empName, float empSal) {
		super();
		this.empid=empid;
		this.empName= empName;
		this.empSal= empSal;
	
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
