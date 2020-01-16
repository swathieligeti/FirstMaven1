package stepDefination;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Addcustomerpage;
import pageObjects.LoginPage;



//RunWith(cucumber.class)
public class Steps extends baseclass {
	public WebDriver driver;
	public LoginPage lp;
	
	

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\swathi\\nopcommerce_05cucumber\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		lp=new LoginPage(driver);
		
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) throws InterruptedException {
	   driver.get(url);
	   Thread.sleep(3000);
	}
	
	@When("User Enters Email as {string} and password {string}")
	public void user_Enters_Email_as_and_password(String uname, String pass) {
	    lp.setusername(uname);
	    lp.setpassword(pass);
	}

	@When("Click on Login")
	public void click_on_Login() {
	   lp.clicksubmit();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		if(driver.getPageSource().contains("login was unseccessfull")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title,driver.getTitle());
		}
		
	    
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
	    lp.clicklogout();
	    Thread.sleep(3000);
	}
	
	@Then("Page Title should be after logout {string}")
	public void page_Title_should_be_after_logout(String title1) {
		if(driver.getPageSource().contains("login was unseccessfull")) {
			
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title1,driver.getTitle());
		}
		
	    
	}

	

	@Then("^close Browser$")
    public void close_Browser() throws Throwable {
        driver.quit();
	}
	
	
	//customer details
	
	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() throws InterruptedException {
		
		addcust=new Addcustomerpage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getPageTitle());
		Thread.sleep(3000);
	   
	}

	@When("User click on customer menu")
	public void user_click_on_customer_menu() throws InterruptedException {
		
		addcust.cickoncustomermenu();
		Thread.sleep(3000);
	    
	}
	
	@When("click on customer menu items")
	public void click_on_customer_menu_items() throws InterruptedException {
		addcust.cickoncustomers();
		Thread.sleep(3000);
		
	}

	@When("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {
	   addcust.cickonaddnew();
	   Thread.sleep(3000);
	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getPageTitle());
	}

	@When("User enter Customer info")
	public void user_enter_Customer_info() throws InterruptedException {
	    String email=randomstring()+"@gmail.com";
	    addcust.setemailid(email);
	    addcust.setpassword("test123");
	    addcust.setfirstname("swathi");
	    addcust.setlastname("eli");
	    addcust.selectgender("female");
	    addcust.selectdob("7/05/89");
	    addcust.setcompanyname("xyz");
	    addcust.settaxexampt();
	    addcust.setnewsletter();
	    addcust.setcustomerroles("Administration");
	    addcust.selectvendor("vendor");
	    
	    addcust.textadmincomment("asddff");
	    Thread.sleep(3000);
	    
	    	
	    
	   
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
	   addcust.clickonsave();
	   Thread.sleep(3000);
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) throws InterruptedException {
	    
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	   System.out.println("The new customer has been added sucessfully");
	}
	
	@Then("click logout")
	public void click_logout() {
	    addcust.clickonlogout();
	}
	

	

	
	}


	






