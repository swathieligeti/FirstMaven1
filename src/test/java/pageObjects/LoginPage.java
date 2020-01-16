package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver d)
	{
		driver =d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement buttonlogin;
	

	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement logoutlink;
	
	
	
	public void setusername(String uname)
	{
		username.sendKeys("test");
		username.clear();		
		username.sendKeys(uname);
	}


	public void setpassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}
	
	public void clicksubmit()
	{
		buttonlogin.click();
	}
	
	public void clicklogout()
	{
		logoutlink.click();
	}
}










