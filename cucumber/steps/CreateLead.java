package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass{

	@Given("enter companyname as TestLeaf")
	public void enterompanyName() {
		//driver.findElementByLinkText("CRM/SFA").click();
		
		//driver.findElementById("company").sendKeys("company name");
		System.out.println("company name");
	}
	
	@When("Click Submit button")
	public void clickSubmit() {
		System.out.println("submit");

	}
	
	@Then("Lead should be created")
	public void verifyLead() {
		System.out.println("lead created");

	}
}
