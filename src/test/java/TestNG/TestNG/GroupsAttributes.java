package TestNG.TestNG;
import org.testng.annotations.*;

public class GroupsAttributes {
	@Test(groups="software company")
	public void infosys()
	{
		System.out.println("infosys");
	}
	
	@Test(groups="software company")
	public void wipro()
	{
		System.out.println("wipro");
	}
	
	@Test(groups="Automobile company")
	public void maruti()
	{
		System.out.println("maruti");
	}
	
	@Test(groups="Automobiles company")
	public void tata()
	{
		System.out.println("tata");
	}

}
