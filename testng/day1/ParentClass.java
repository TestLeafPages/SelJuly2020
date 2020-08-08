package testng.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class ParentClass {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass parent");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod parent");

	}

}
