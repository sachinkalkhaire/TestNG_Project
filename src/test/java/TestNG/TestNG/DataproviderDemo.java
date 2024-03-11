package TestNG.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataproviderDemo {
	@DataProvider(name="searchContains")
	public Object[][] searchData()
	{
		Object a[][]=new Object[3][2];
		a[0][0]="India";
		a[0][1]="Qutub Minar";
		a[1][0]="Agra";
		a[1][1]="Taj mahal";
		a[2][0]="Hyderabad";
		a[2][1]="Charminar";
		return a;
	}
	
	
	@Test(dataProvider="searchContains")
	public void TestCaseGoogleSearch(String country,String manument)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
	WebElement el=	driver.findElement(By.name("q"));
	el.sendKeys(country+""+manument);
	
	driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).submit();

	
	}
	

}
