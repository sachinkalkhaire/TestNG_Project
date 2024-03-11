package TestNG.TestNG;
import org.testng.annotations.*;

import junit.framework.Assert;

public class AnnotationAttributes {
	
	//@Test(description="this is test case1")
	//@Test(priority=3)
	@Test(dependsOnMethods={"testCase2"})
	public void testCase1()
	{
		System.out.println("Mobile login test case");
	}
	
	//@Test(description="this is test case2")
	//@Test(timeOut=200)
	//@Test(priority=1)
	@Test
	public void testCase2()
	{
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Web login test case");
		Assert.assertTrue(false);
	}
	
	//@Test(description="this is test case3")
	//@Test(priority=2)
	@Test
	public void testCase3()
	{
		System.out.println("API login test case");
	}

}
