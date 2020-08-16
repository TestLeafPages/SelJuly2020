package testng.day3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer{
	
	int count = 0;
	int maxRetry = 3;

	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && count < maxRetry) {
			count++;
		return true;
		}
				
		return false;
	}

}
