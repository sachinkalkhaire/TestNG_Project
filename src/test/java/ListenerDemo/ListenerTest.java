package ListenerDemo;

import org.testng.SkipException;
import org.testng.annotations.*;

import junit.framework.Assert;

@Listeners(ListenerDemo.ListenerClass.class)
public class ListenerTest {
	@Test
	public void verifyTile()
	{
		System.out.println("test pass");
		Assert.assertTrue(true);
	}
	@Test
	public void verifyLogo()
	{
		System.out.println("test fail");
		Assert.assertTrue(false);
	}
	@Test
	public void verifyTest()
	{
		System.out.println("test skip");
		throw new SkipException("skip exception...");
		
	}

}
