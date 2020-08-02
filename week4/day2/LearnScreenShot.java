package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
					
		driver.get("http://leafground.com/pages/Window.html");
		
		WebElement clickText = driver.findElementByXPath("//label[@for='home']");
		
		File source = clickText.getScreenshotAs(OutputType.FILE);
		
		//File source = driver.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./data/ClickText.png");
		
		FileUtils.copyFile(source, target);
		
	
		
	}

}
