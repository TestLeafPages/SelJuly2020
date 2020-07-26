package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> values = new LinkedHashSet<String>();

		// add method is sed to add a value to the list
		values.add("Babu"); //index starts from 0
		values.add("Naveen"); //1
		values.add("Hari");
		values.add("Sam");
		values.add("Dhivya");
		values.add("Balaji"); //size-1
		values.add("Hari"); 
		
		
		List<String> listValues = new ArrayList<String>(values);
		
		System.out.println(listValues.get(2));
		
		
		
		/*
		 * for (String eachVal : values) {
		 * 
		 * System.out.println(eachVal);
		 * 
		 * }
		 */
	
	}
}
