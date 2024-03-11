package ListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {



	public void onStart(ITestContext Result) {					
		// TODO Auto-generated method stub
		System.out.println("ON start method invoked");
	}

	public void onFinish(ITestContext Result) {					
		// TODO Auto-generated method stub				
		System.out.println("ON finish method invoked"); 		
	}		


	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
		// TODO Auto-generated method stub				
		System.out.println("ON Failed method invoked" +Result.getName()); 		
	}		


	public void onTestFailure(ITestResult Result) {					
		// TODO Auto-generated method stub				
		System.out.println("ON Failuer method invoked" +Result.getName());	
	}		


	public void onTestSkipped(ITestResult Result) {					
		// TODO Auto-generated method stub				
		System.out.println("ON Skipped method invoked" +Result.getName());		
	}		


	public void onTestStart(ITestResult Result) {					
		// TODO Auto-generated method stub				
		System.out.println("ON test start method invoked" +Result.getName());			
	}		


	public void onTestSuccess(ITestResult Result) {					
		// TODO Auto-generated method stub				

	}		

}
