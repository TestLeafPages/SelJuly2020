package week4.day2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Alert.html");
		
		//to get simple alert
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		//click Ok		
		alert.accept();
		
				
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		
		driver.switchTo().alert().dismiss();
		
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		Alert alert2 = driver.switchTo().alert();
		
		alert2.sendKeys("TL");
		Thread.sleep(5000);
		alert2.accept();
		
		
	}

}
