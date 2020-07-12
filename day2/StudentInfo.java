package week1.day2;

public class StudentInfo {
	
	public void printStudentName() {
		String name = "hari";
		System.out.println(name);
		
		//return name;
	}
	
	
	public boolean getStudentName() {
		
		return true;
	}
	
	
	
	public String getAddress(int id,String name) {
		
		String add;
		
		//int id= 50;
		System.out.println(name);
		if(id>=100) {
			
			add ="Chennai";
		}
		else {
			add ="Madurai";
		}

		return add;

	}
	
	
	public static void main(String[] args) {
		
		StudentInfo si = new StudentInfo();
		
		si.printStudentName();
		
		boolean studentName = si.getStudentName();
		
		System.out.println(studentName);
		
		System.out.println(si.getAddress(50,"Hari"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
