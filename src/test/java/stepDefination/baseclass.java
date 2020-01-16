package stepDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.Addcustomerpage;

import pageObjects.LoginPage;

public class baseclass  {
	
	public WebDriver driver;
	public LoginPage lp;
	public Addcustomerpage addcust;
	
	
	public static String randomstring() {
		String generatedString1= RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}
	

}
