package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnMultipleElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		/*
		 * driver.get("http://leafground.com/pages/Link.html");
		 * 
		 * List<WebElement> allLinks = driver.findElementsByXPath("//a");
		 * 
		 * System.out.println(allLinks.size());
		 */
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		List<WebElement> textFields = driver.findElementsByClassName("inputLogin");
		
		for (WebElement eachEle : textFields) {
			
			String name = eachEle.getAttribute("name");
			
			System.out.println(name);
			
		}
		
		
		
		
		
		
	}

}
