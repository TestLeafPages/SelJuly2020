package testng.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void runCreateLead() {
		System.out.println("create");
		throw new NoSuchElementException();

	}

	
	@Test(dependsOnMethods="testng.day2.TestCase1.runCreateLead", alwaysRun=true)
	public void editLead() {
		System.out.println("edit");

	}
	
	
}
