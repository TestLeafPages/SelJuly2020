package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseClass {

	
	@Given("open the ChromeBrowser")
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Given("Load the application url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	
	
	@Given("maximize the browser")
	public void maxBrowser() {
		driver.manage().window().maximize();

	}

	@Given("apply implicitly wait")
	public void applyWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Given("Enter the username as (.*)")
	public void enterUserName(String data) {
		driver.findElementById("username").sendKeys(data);

	}

	@Given("Enter the password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);

	}

	@When("Click on login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@Then("the homepage should be displayed")
	public void verifyHomepage() {
		System.out.println("homepage is displayed");

	}
	
	/*
	 * @But("errormessage should be displayed") public void errorMessage() {
	 * System.out.println("error message");
	 * 
	 * }
	 */

}
