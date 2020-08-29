package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		//Its a one time initial setup for the report
		
		//to create the physical file in the specified location
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		//to maintain the history in the report
		reporter.setAppendExisting(true);
		
		//Actual report
		ExtentReports extent = new ExtentReports();
		
		//to attach the actual report into the black report
		extent.attachReporter(reporter);
		
		
		//Below steps are defining the test cases details
		
		ExtentTest test = extent.createTest("LoginAndLogout", "Login and Logout funcy=tion in LeafTaps application");
		test.assignAuthor("Hari");
		test.assignCategory("Smoke");
		
		
		//Step level status
		test.pass("Username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././data/leafground.png").build());
		test.pass("Password entered successfully");
		test.fail("login button not clicked successfully");
		
		
		//At the end the report
		extent.flush();
		
		
		
		
		

	}

}
