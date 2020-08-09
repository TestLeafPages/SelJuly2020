package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	public ChromeDriver driver;
	
	public String excelName;
	
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void login(String uName, String pWord) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pWord);
		driver.findElementByClassName("decorativeSubmit").click();

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
	
	

	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		//String[][] excelData = ReadExcel.excelData();
		
		/*
		 * String[][] data = new String[2][3];
		 * 
		 * data[0][0] = "Testleaf"; data[0][1] = "Gopi"; data[0][2] = "J";
		 * 
		 * data[1][0] = "TL"; data[1][1] = "Hari"; data[1][2] = "R";
		 */
		
		return ReadExcel.excelData(excelName);

	}
	
	
	
	
	
	
	
	
	
	
	

}
