package week3.day2;

public class Iob implements Rbi{

	public void minimumBalance() {
		
		System.out.println(5000);
		
	}

	public void maximumLoanAmount() {
		System.out.println(100000);
		
	}
	
	public void loanforITProf() {
		System.out.println("special loan");
	}
	
	
	
	public static void main(String[] args) {
		
		/*
		 * Iob iob = new Iob();
		 * 
		 * iob.minimumBalance(); iob.maximumLoanAmount(); iob.loanforITProf();
		 * 
		 */
		
		//Scope restriction
		
		Rbi iob = new Iob();
		iob.maximumLoanAmount();
		iob.minimumBalance();
		
		
		System.out.println(Rbi.id);
		
		
		
		
		
		
		
	}

	
}
