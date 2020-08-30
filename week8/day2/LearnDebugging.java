package week8.day2;

public class LearnDebugging {
	
	public int calcFactorial(int x) {
		int fact =1;
		for (int i = 1; i <=x; i++) {
			fact = fact*i;
			
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		LearnDebugging ld = new LearnDebugging();
				int fact = ld.calcFactorial(5);
				
				System.out.println(fact);
		
	}
	

}
