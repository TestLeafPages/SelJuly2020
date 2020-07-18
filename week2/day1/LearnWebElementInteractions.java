package week2.day1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebElementInteractions {

	public static void main(String[] args) {
		//setting the path for the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//create object for ChromeDriver class -- to open chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//locate using id locator
		WebElement eleUserName = driver.findElementById("username");
		
		eleUserName.sendKeys("demosalesmanager");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByPartialLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//to close browser
		//driver.close();
		
	}

}
