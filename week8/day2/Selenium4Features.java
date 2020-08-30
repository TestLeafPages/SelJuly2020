package week8.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Selenium4Features {

	public static void main(String[] args) throws InterruptedException {
		//Relative Locators
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	//	WebElement labelUsername = driver.findElementByXPath("//label[text()='Username']");
		
		//driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.xpath("//label[text()='Username']"))).sendKeys("Demosalesmanager");
		
		
		//toRightOf
		//toLeftOf
		//above
		//below
		//near
		
		//to minimize the window
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		// method to make the window fullscreen
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().newWindow(WindowType.TAB).get("http://leafground.com/");
		
		
		
		
		
		
		
		
		
		
		

	}

}

