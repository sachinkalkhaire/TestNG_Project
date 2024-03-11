package RetryFailedTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
	//counter to keep track of retry attempt
	
	int counterForRetryAttempts =0;
	
	//set max limit for retry
    int setMaxLimitForRetry=3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(!result.isSuccess())
		{
			if(counterForRetryAttempts<setMaxLimitForRetry)
			{
				
				counterForRetryAttempts++;
				return true;
			}
			}
		
		return false;
	}



	
    
    
}
