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

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("http://leafground.com/pages/frame.html");
		
		//to get inside the second frame in the window
		driver.switchTo().frame(1);
		
		//getting inside the inner frame
		driver.switchTo().frame(0);
		
		
		driver.findElementById("Click1").click();
		
		driver.switchTo().parentFrame();
		
		// to get into the main dom
		/*
		 * driver.switchTo().defaultContent();
		 * 
		 * String text = driver.findElementByTagName("h1").getText();
		 * 
		 * System.out.println(text);
		 */
		

	//	driver.get("https://dev68594.service-now.com/navpage.do");
		
		//switchTo frame using frame id / name
	//	driver.switchTo().frame("gsft_main");
		
		//switchTo frame using index
	//	driver.switchTo().frame(0);
		
	//	WebElement frame = driver.findElementById("gsft_main");
		
		//switchTo the frame using webelement
	//	driver.switchTo().frame(frame);
		
		
		//this element is inside the frame
	//	driver.findElementById("user_name").sendKeys("admin");
		
	}

}
