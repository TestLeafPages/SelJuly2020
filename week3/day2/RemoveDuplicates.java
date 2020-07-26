package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		char[] input = {'P','a','y','P','a','l','I','n','d','i','a'};
		
		Set<Character> values = new LinkedHashSet<Character>();
		
		
		for (Character eachChar : input) {
			
			System.out.println(values.add(eachChar));
			
		}
		
		System.out.println(values);
	
		
		
		
		
	}

}
