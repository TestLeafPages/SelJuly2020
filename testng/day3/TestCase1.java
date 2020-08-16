package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCase1 {

	@Test(timeOut = 500)
	public void test1() throws InterruptedException {

		long randNum = (long) Math.floor(Math.random() * 1000);
		System.out.println(randNum);
		Thread.sleep(randNum);

	}

}
