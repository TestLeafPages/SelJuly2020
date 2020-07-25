package week3.day1;

public class Employee {

	int empId;
	String empName;
	double empSalary;
	boolean empStatus;

	Employee() {
		
		this(100,"Hari",4234.34,true);
		//second print
		System.out.println("default Constructor");

	}

	Employee(int empId, String empName, double empSalary, boolean empStatus) {
		
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empStatus = empStatus;
		
		//first print
		System.out.println("Parameterised constructor");
		
	}
	
	

	/*
	 * public void setValue() { empId = 100; empName = "Hari"; salary = 25000;
	 * status = true; }
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee();

		//third print
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.empSalary);
		System.out.println(emp1.empStatus);

		//emp1.setValue();
		
		

	

	}

}
