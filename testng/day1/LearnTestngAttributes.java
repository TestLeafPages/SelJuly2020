package testng.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestngAttributes {

	@Test(invocationCount=2,priority=1)
	public void testCase2() {
		System.out.println("testcase2");

	}

	@Test(priority = 2)
	public void testCase1() {
		System.out.println("testcase1");

	}

}
