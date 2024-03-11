package TestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

//import junit.framework.Assert;

public class AssertionDemo {
	//Hard Assert and Soft Assert

	@Test
	public void testmethod()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		SoftAssert asser=new SoftAssert();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		String actualtitle=driver.getTitle();
		String expectedTitle="Automation Testing Practice1"; //title wrong enter.and fail test
		asser.assertEquals(expectedTitle,actualtitle);
	
		System.out.println("Verify presence of wikipedia icon");
	    WebElement icon=driver.findElement(By.className("wikipedia-icon"));
	    asser.assertTrue(icon.isDisplayed());
	   

		System.out.println("Verify presence of wikipedia search-button");
		WebElement searchButton=driver.findElement(By.className("wikipedia-search-button"));
		asser.assertTrue(searchButton.isDisplayed());
		
		driver.close();
		
		//verify all fail assert
		asser.assertAll();
	
	}
}
