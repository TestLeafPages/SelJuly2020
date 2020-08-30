package week8.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnSwitchCase {

	RemoteWebDriver driver;

	public void launchBrowser(String browser, String url) {

		switch (browser) {
		case "chrome":
			System.out.println("Chrome Browser");
			break;
			/*
			 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 * driver = new ChromeDriver();
			 */
		case "firefox":
			System.out.println("firefox Browser");
			break;
			/*
			 * System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 * driver = new FirefoxDriver();
			 */
		case "ie":
			System.out.println("IE Browser");
			break;
			/*
			 * System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			 * driver = new InternetExplorerDriver();
			 */
			default:
				System.out.println("not matching with any browser");
				break;
		}

		/*
		 * if(browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 * driver = new ChromeDriver(); } else if(browser.equalsIgnoreCase("firefox")) {
		 * System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 * driver = new FirefoxDriver(); } else if(browser.equalsIgnoreCase("ie")) {
		 * System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		 * driver = new InternetExplorerDriver(); }
		 */
		//driver.navigate().to(url);

	}

	public static void main(String[] args) {

		LearnSwitchCase lsc = new LearnSwitchCase();

		lsc.launchBrowser("safari", "http://leaftaps.com/opentaps/control/main");

	}

}
