package week2.day1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchApplication {

	public static void main(String[] args) {
		//setting the path for the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//create object for ChromeDriver class -- to open chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window
		/*
		 * Options manage = driver.manage(); Window window = manage.window();
		 * window.maximize();
		 */
		driver.manage().window().maximize();
		
		
		//to close browser
		driver.close();
		
	}

}
