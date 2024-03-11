package ExtendReportAll;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class BasicExtentsReport {
	ExtentSparkReporter htmlReport;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	public void startReporter()
	{
		htmlReport=new ExtentSparkReporter("ExtentsReports1.html");
		reports =new ExtentReports();
		reports.attachReporter(htmlReport);

		//add environment details
		reports.setSystemInfo("machine", "testPC1");
		reports.setSystemInfo("OS", "Window10");
		reports.setSystemInfo("user", "Sachin");
		reports.setSystemInfo("Browser", "Chrome");

		//configuration to change look and feel
		htmlReport.config().setDocumentTitle("Extend report 1");
		htmlReport.config().setReportName("Test report 1");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("EEEE,MMMM dd,yyyy,hh:mm a'('zzz')'");


	}
	@Test
	public void verifyLaunchBrowser()
	{
		//create test
		test=reports.createTest("Launch browser and open url");
		Assert.assertTrue(true);  //TEST passed
	}

	@Test
	public void verifyTitle()
	{
		//create test
		test=reports.createTest("verify Title");
		Assert.assertTrue(false);  //TEST failed
	}
	@Test
	public void verifyLogo()
	{
		//create test
		test=reports.createTest("verify Logo");
		Assert.assertTrue(true);  //TEST passed
	}
	@Test
	public void verifyEmail()
	{
		//create test
		test=reports.createTest("verify Email");
		throw new SkipException("Skip This Test Case With Exceptions...");  //TEST skip
	}

	@Test
	public void verifyUserName()
	{
		//create test
		test=reports.createTest("verify User Name");
		Assert.assertTrue(true);  //TEST passed

	}

	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"FAIL", ExtentColor.RED));
			test.fail(result.getThrowable());
		}

		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"PASS", ExtentColor.GREEN));
		}

		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"SKIP", ExtentColor.YELLOW));
		}
	}
	@AfterTest
	public void tearDemo()
	{
		reports.flush();
	}
	


}
