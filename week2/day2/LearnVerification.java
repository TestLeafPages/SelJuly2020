package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnVerification {

	public static void main(String[] args) throws InterruptedException {
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
				
				//String text = driver.findElementByTagName("h2").getText();
				
				String text = driver.findElementByXPath("//h2").getText();
				
				Thread.sleep(2000);
				
				System.out.println(text);
				
		/*
		 * String title = driver.getTitle();
		 * 
		 * System.out.println(title);
		 * 
		 * String attribute = driver.findElementById("username").getAttribute("class");
		 * 
		 * System.out.println(attribute);
		 */
				
				
		/*
		 * String text = driver.findElementByLinkText("Mobiles").getText();
		 * 
		 * System.out.println(text);
		 */
				
				
				//WebElement login = driver.findElementByClassName("decorativeSubmit");
				
			//	boolean enabled = login.isEnabled();
				
			//	System.out.println(enabled);
				

	}

}
