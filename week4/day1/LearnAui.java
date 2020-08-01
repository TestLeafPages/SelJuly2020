package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnAui {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/selectable/");
		
		// to get into frame
		driver.switchTo().frame(0);
		
		 WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		  WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		  WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		  WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
		  
		  Actions builder = new Actions(driver);
		  
		  builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform();
		
		/*
		 * WebElement disabled = driver.findElementByXPath("//input[@disabled='true']");
		 * 
		 * //driver.findElementByXPath("//input[@disabled='true']").sendKeys("abc");
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.sendKeys(disabled, "abc").perform();
		 */
		/*
		 * WebElement accounts =
		 * driver.findElementByXPath("//span[text()='Account & Lists']");
		 * 
		 * 
		 * WebElement source = driver.findElementById("draggable");
		 * 
		 * WebElement target = driver.findElementById("droppable");
		 * 
		 * 
		 * 
		 * WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		 * WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		 * WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		 * WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
		 * 
		 * WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		 * 
		 * Point location =
		 * driver.findElementByXPath("//li[text()='Item 4']").getLocation();
		 * 
		 * int x = location.getX();
		 * 
		 * int y = location.getY();
		 * 
		 * 
		 * 
		 * //create object for the actions class Actions builder = new Actions(driver);
		 * 
		 * //builder.dragAndDrop(source, target).perform();
		 * 
		 * builder.dragAndDropBy(item1, x, y).perform();
		 * 
		 * builder.click(item1).clickAndHold().moveToElement(item4).release().perform();
		 * 
		 * // builder.moveToElement(accounts).click().contextClick().perform();
		 * 
		 * //builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(
		 * item7).keyUp(Keys.CONTROL).perform();
		 * 
		 * 
		 * 
		 */

	}

}
