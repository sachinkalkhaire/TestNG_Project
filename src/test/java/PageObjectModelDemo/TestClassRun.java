package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassRun {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginPage loginPage;
	    loginPage=new LoginPage(driver);
	    
	    driver.get("https://www.saucedemo.com/v1/");
	    loginPage.enterUname("standard_user");
	    loginPage.enterPassword("secret_sauce");
	    loginPage.clickOnLoginButton();
	    
	}

}
