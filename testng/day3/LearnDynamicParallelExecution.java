package testng.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDynamicParallelExecution {
	
	@Test(dataProvider = "fetchData")
	public void createLead(String comp, String fName, String lName) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(comp);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();

	}
	
	@DataProvider(name="fetchData", parallel=true)
	public String[][] sendData() {
		String[][] data = new String[2][3];
		
		data[0][0] = "TestLeaf";
		data[0][1] = "Hari";
		data[0][2] = "R";
		
		data[1][0] = "TL";
		data[1][1] = "Naveen";
		data[1][2] = "E";
		
		return data;

	}
	
	
	
	

}
