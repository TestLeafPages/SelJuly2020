package week4.day1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/TextChange.html");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Explicit wait
		//Thread.sleep(5000);
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  
		  wait.until(ExpectedConditions.textToBe(By.xpath("//button[@id='btn']"),
		  "Click ME!"));
		 
		
		driver.findElementByXPath("//button[@id='btn']").click();
		
		
		/*
		 * wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath(
		 * "//b[contains(text(),'Voila')]")));
		 * 
		 * String text =
		 * driver.findElementByXPath("//b[contains(text(),'Voila')]").getText();
		 * 
		 * System.out.println(text);
		 */
		
		
		/*
		 * //Thread.sleep(2000);
		 * driver.findElementById("username").sendKeys("Demosalesmanager");
		 * 
		 * driver.findElementById("password123").sendKeys("crmsfa");
		 */
		
	}

}
