package week8.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnExceptionHandling {

	public int division(int x, int y) {
		int z;
		if (y > x) {
			throw new ArithmeticException("Wrong input - divisor is bigger");
		} else {
			z = x / y;
		}

		return z;

	}
	
	public void fileName() throws FileNotFoundException {
		
			FileInputStream fis = new FileInputStream("./data/CreateLead.xlsx");
		
	}

	public static void main(String[] args) throws FileNotFoundException   {
		
		LearnExceptionHandling leh = new LearnExceptionHandling();
		
		
			leh.fileName();
		
		/*
		 * try { FileInputStream fis = new FileInputStream("./data/test.xlsx"); } catch
		 * (FileNotFoundException e) { System.out.println(e); }
		 */
		
		
		
		/*
		 * LearnExceptionHandling leh = new LearnExceptionHandling();
		 * 
		 * try { int result = leh.division(5, 10); System.out.println(result); } catch
		 * (Exception e) { System.out.println(e); }
		 * 
		 * finally { System.out.println("this the last line in the program"); }
		 * 
		 * 
		 * System.out.println("this the last line in the program");
		 */
		
		System.out.println("this the last line in the program");

	}

}
