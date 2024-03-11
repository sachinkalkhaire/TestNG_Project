package PropertesFileDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {

	public static void main(String[] args) {
		
		
		RedConfig redConfig;
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		redConfig=new RedConfig();
		
		driver.get(redConfig.getURL());
	   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(redConfig.getUname());
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(redConfig.getPwrd());
	   driver.findElement(By.xpath("//input[@id='login-button']")).submit();

	}

}
