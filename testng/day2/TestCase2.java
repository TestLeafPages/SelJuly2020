package testng.day2;

import org.testng.annotations.Test;

public class TestCase2 {
	
	
	
	
	//packagename.classname.method

	@Test(dependsOnMethods = "testng.day2.TestCase1.runCreateLead")
	public void deleteLead() {
		System.out.println("delete");

	}

}
