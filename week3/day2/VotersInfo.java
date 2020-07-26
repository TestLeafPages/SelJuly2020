package week3.day2;

public class VotersInfo {
	
	final int voterId = 42342;
	String voterName ;
	int voterAge;
	static String voterState;
	
	public final void setVoterDetails(final String voterName, int voterAge,String voterState) {
		//name="prasad";
		this.voterName = voterName;
		this.voterAge = voterAge;
		this.voterState = voterState;
		

	}
	
	public void printVoterDetails() {
		System.out.println(voterName+" "+voterAge+" "+voterState+" "+voterId);

	}
	
	public static void main(String[] args) {
		
		VotersInfo vi1 = new VotersInfo();
		
		vi1.setVoterDetails("Hari", 41, "TamilNadu");
		
		vi1.printVoterDetails();
		
		VotersInfo vi2 = new VotersInfo();
		
		vi2.setVoterDetails("Prasad", 40, "TN");
		
	}

}
