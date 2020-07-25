package week3.day1;

public class StudentInfo {
	

	public void getStudentDetails(int id) {

		System.out.println("student details for id");

	}
	
	public void getStudentDetails(String name) {

		System.out.println("student details for name");

	}

	public void getStudentDetails(int id, int phNo) {

		System.out.println("student details for id & PhNo");

	}

	public void getStudentDetails(String name, int phNo) {

		System.out.println("student details for name & PhNO");
	}

	
	public void getStudentDetails(int id, String email) {

		System.out.println("student details for id & email");
	}

	
	
	
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo();

		si.getStudentDetails("Hari", 53453435);
		
		
		
		System.out.println("42342");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
