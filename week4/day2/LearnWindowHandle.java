package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
				
		driver.get("http://leafground.com/pages/Window.html");
		
		/*
		 * String firstWin = driver.getWindowHandle();
		 * 
		 * System.out.println(firstWin);
		 * 
		 * System.out.println("*******************************************");
		 */
				
		
		
		  String title = driver.getTitle(); 
		  System.out.println(title);
		  
		  //to click on Open HomePage button
		  driver.findElementById("home").click();
		  
		  
		  Set<String> windowHandles = driver.getWindowHandles();
		  
		/*
		 * for (String eachRef : windowHandles) {
		 * 
		 * System.out.println(eachRef);
		 * 
		 * }
		 */
		  
		  //to copy the set values into list
		  List<String> listHandles = new ArrayList<String>(windowHandles);
		  
		  String secondWin = listHandles.get(1);
		  
		  //conrol will be moved to the second
		  driver.switchTo().window(secondWin);
		  
		/*
		 * String title2 = driver.getTitle(); System.out.println(title2);
		 */
		  	
	 
		  //button in the new window
		  driver.findElementByXPath("//img[@alt='Buttons']").click();
		  
		 // driver.switchTo().window(listHandles.get(0));
		  
		  driver.close();
		  
		  String title2 = driver.getTitle();
		  
		  driver.switchTo().window(listHandles.get(0));
		  
		  System.out.println(title2);
		  
		 // driver.quit();
		  
		  
		 
	
		
	}

}
