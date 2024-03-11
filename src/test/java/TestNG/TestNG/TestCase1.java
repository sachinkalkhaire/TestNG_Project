package TestNG.TestNG;
import org.testng.annotations.*;

public class TestCase1 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is afterSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is beforeTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is afterTest");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is after class");
	}
	@Test
	public void test1()
	{
		System.out.println("This is test1");
	}
	@Test
	public void test2()
	{
		System.out.println("This is test2");
	}
}
