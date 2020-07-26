package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LearnList {

	public static void main(String[] args) {

		List<String> values = new ArrayList<String>();

		// add method is sed to add a value to the list
		values.add("Babu"); //index starts from 0
		values.add("Naveen"); //1
		values.add("Hari");
		values.add("Sam");
		values.add("Dhivya");
		values.add("Balaji"); //size-1
		values.add("Hari"); 
		
		
		// to find the size of the list

		System.out.println(values.size());
		
		// method to retrieve one item from the list
		//System.out.println(values.get(2));
		
		
		//method to remove an item from the list
		//values.remove(3);
	//	values.remove("Naveen");
		
		
		
		//method to copy data from one list  to another
		List<String> newValues = new ArrayList<String>(values);
		
	//	newValues.addAll(values);
		
		
		//method to sort the data in LIst
		Collections.sort(newValues);
		
		
				
		for (String eachVal : newValues) {
			
			System.out.println(eachVal);
			
		}
		
		
		
		/*
		 * for (int i = 0; i <= values.size()-1 ; i++) {
		 * System.out.println(values.get(i)); }
		 */
		

	}

}
