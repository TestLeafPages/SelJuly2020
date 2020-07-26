package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		
		List<String> values = new ArrayList<String>();
		
		for (String eachInput : input) {
			
			values.add(eachInput);
			
		}
		
		Collections.sort(values);
		
		Collections.reverse(values);
		
		System.out.println(values);
		
		/*
		 * for (String eachVal : values) {
		 * 
		 * System.out.println(eachVal);
		 * 
		 * }
		 */
		 
		
		
		
		
		
	}

}
