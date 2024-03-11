package RetryFailedTestCase;

import org.testng.annotations.*;

import junit.framework.Assert;

public class TestCaseExample {

	@Test
	public void TestCase01()
	{
		Assert.assertTrue(false);
	}

	@Test
	public void TestCase02()
	{
		Assert.assertTrue(false);
	}

	@Test
	public void TestCase03()
	{
		Assert.assertTrue(true);
	}




}
