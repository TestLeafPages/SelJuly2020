package week3.day1;

public class EmployeeInfo {
	
	int empId;
	String empName;
	static String company;
	
	
	
	
	static {
		
		System.out.println("static block");
	}
	
	
	
	EmployeeInfo(int empId, String empName, String company){
		
		this.empId=empId;
		this.empName = empName;
		this.company = company;
		
	}
	
	
	
	
	public static void empDetails() {
		System.out.println("static method");
	}
	
	
	
	
	
	
	
	
	  public static void main(String[] args) {
	  
	  System.out.println("code at line 1");
	  
	  EmployeeInfo emp1 = new EmployeeInfo(100,"Hari","TestLeaf");
	  
	  System.out.println(emp1.empId+" "+emp1.empName+" "+company);
	  
	  
	  
	  
	  EmployeeInfo emp2 = new EmployeeInfo(200,"Prasad","TL");
	  
	  System.out.println(emp2.empId+" "+emp2.empName+" "+company);
	  
	  
	  empDetails();
	  
	  
	  
	  
	  
	  
	  }
	 
	
	

}
