package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver rdriver;
	LoginPage(WebDriver ldriver)
	{
		rdriver=ldriver;
		
		PageFactory.initElements(ldriver, this);
	 }

	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id=("password"))
	WebElement paaword;
	
	@FindBy(id=("login-button"))
	WebElement loginButton;
	
	public void enterUname(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void enterPassword(String pwrd)
	{
		paaword.sendKeys(pwrd);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
}
