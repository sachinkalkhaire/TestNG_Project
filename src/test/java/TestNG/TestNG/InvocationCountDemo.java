package TestNG.TestNG;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class InvocationCountDemo {

	@Test(invocationCount=5)
	public void Method1(ITestContext context)
	{
		int currentInvocationCount=context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("current invocation count"+currentInvocationCount);
		System.out.println("this is method1");
	}
	@Test(invocationCount=3)
	public void Method2()
	{
		System.out.println("this is method2");
	}
}
