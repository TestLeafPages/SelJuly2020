package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnWebtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/table.html");
		
		
		//driver.findElementById("username").sendKeys(Keys.TAB);
		
		List<WebElement> allRows = driver.findElementsByXPath("//table//tr");
		
		int size = allRows.size();
		
		
		for (int i = 2; i <= size; i++) {
			
			driver.findElementByXPath("//table//tr["+i+"]/td[3]/input").click();
			
		}
		
		
		/*
		 * for (int i = 2; i <= size; i++) {
		 * 
		 * List<WebElement> cells = driver.findElementsByXPath("//table//tr["+i+"]/td");
		 * 
		 * int cellCount = cells.size();
		 * 
		 * for (int j = 1; j <= cellCount; j++) {
		 * 
		 * String text =
		 * driver.findElementByXPath("//table//tr["+i+"]/td["+j+"]").getText();
		 * 
		 * System.out.print(text+" "); }
		 * 
		 * System.out.println();
		 * 
		 * }
		 */
		
		
		
		
		
		
		
	}

}
