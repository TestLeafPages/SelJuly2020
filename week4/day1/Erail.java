package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Thread.sleep(10000);
		//3rd sec - 7s waste of time
		
		
		
		driver.findElementById("txtStationFrom").clear();
		
		driver.findElementById("txtStationFrom").sendKeys("ms");
		
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
		
	driver.findElementById("txtStationTo").clear();
		
		driver.findElementById("txtStationTo").sendKeys("mdu");
		
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
		
	}

}
