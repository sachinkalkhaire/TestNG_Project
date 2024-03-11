package TestNG.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ParameterExample {
	@Parameters({"googlesearch"})
	
	@Test
	public void searchData(String searchDa)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement el=driver.findElement(By.name("q"));
		el.sendKeys("searchDa");
		
	}

}
