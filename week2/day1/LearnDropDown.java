package week2.day1;

import java.util.List;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

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
		
		
		//identify the webelement for the select tag
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		//created a object for the select class with argument as select tag webelement
		Select dropDown = new Select(source);
		
		//pass the text in the selectByVisibleText method
		//dropDown.selectByVisibleText("Partner");
		
		//select using value
		//dropDown.selectByValue("LEAD_OTHER");
		
		//select using index
		//dropDown.selectByIndex(2);
		
		List<WebElement> options = dropDown.getOptions();
		
		//dropDown.getOptions().get(1).click();
		
		options.get(4).click();
		
		
		int size = options.size();
		System.out.println(size);
			
		
		for (int i = 0; i < size; i++) {
			options.get(i).click();
		}
		
		
		
		/*
		 * for (WebElement eachElement : options) {
		 * 
		 * eachElement.click(); }
		 */
		
	//	options.get(size-1).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//to close browser
		//driver.close();
		
	}

}
