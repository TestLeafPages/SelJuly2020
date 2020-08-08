package testng.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 extends ParentClass{
	
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod in child");

	}
	
	@Test
	public void test1() {
		System.out.println("test1");

	}

}
