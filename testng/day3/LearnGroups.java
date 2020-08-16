package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups= {"functional","regression"},dependsOnGroups = "smoke")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups="smoke")
	public void test2() {
		System.out.println("test2");

	}
	@Test(groups="regression",dependsOnGroups = "smoke")
	public void test3() {
		System.out.println("test3");

	}
	@Test(groups="functional")
	public void test4() {
		System.out.println("test4");

	}
	
	@Test(groups="smoke")
	public void test5() {
		System.out.println("test5");
		throw new NoSuchElementException();

	}
	@Test(groups="regression",dependsOnGroups = "smoke")
	public void test6() {
		System.out.println("test6");

	}
	

}
