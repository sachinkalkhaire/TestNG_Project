package TestNG.TestNG;
import org.testng.annotations.*;

public class TestNGparameter {
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}

	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	@Test
	@Parameters({"i","j"})
	public void mull(int a, int b)
	{
		System.out.println(a*b);
	}
	
}
