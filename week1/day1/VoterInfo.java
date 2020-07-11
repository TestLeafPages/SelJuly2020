package week1.day1;

public class VoterInfo {

	public static void main(String[] args) {
		int age = 15;
		
		if(age >= 18 && age < 60) {
			System.out.println("adult");
		}
		else if(age > 60 ) {
			System.out.println("senior citizen");
		}
		else {
			System.out.println("minor");
		}

	}

}
