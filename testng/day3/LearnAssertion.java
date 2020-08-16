package testng.day3;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertion {
	
	@Test
	public void createLead() {
		String expectedTitle = "LeafTaps";
		
		String actualTitle = "leaftaps" ;
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		
	//	Assert.assertEquals(actualTitle, expectedTitle);
		
	//	Assert.assertTrue(true);
		
		
		/*
		 * if(actualTitle.equals(expectedTitle)) { System.out.println("matching"); }
		 * else { System.out.println("not matching"); }
		 * 
		 *  */
		
		System.out.println("code after assertion");
		
		softAssert.assertAll();

	}

}
