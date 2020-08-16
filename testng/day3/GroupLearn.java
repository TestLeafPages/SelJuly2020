package testng.day3;

import org.testng.annotations.Test;

public class GroupLearn {

	@Test(groups= {"functional","regression"},dependsOnGroups = "smoke")
	public void test7() {
		System.out.println("test7");
	}
	
	@Test(groups="smoke")
	public void test8() {
		System.out.println("test8");

	}
	@Test(groups="regression",dependsOnGroups = "smoke")
	public void test9() {
		System.out.println("test9");

	}
	
}
