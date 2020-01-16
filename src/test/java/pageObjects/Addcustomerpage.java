package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Addcustomerpage {
	
WebDriver rdriver;
	
	public Addcustomerpage(WebDriver d)
	{
		rdriver =d;
		PageFactory.initElements(d, this);
		
	}

	
	By linkcustomer_menu=By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	By linkcustomer_menuid=By.xpath("/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span");
    By addcustomerlink=By.xpath("//a[@class='btn bg-blue']");
    By textemail=By.id("Email");
    By textpassword=By.id("Password");
    By textfirstname=By.id("FirstName");
    By textlastname=By.id("LastName");
    By genderfemale=By.id("Gender_Female");
    By gendermale=By.id("Gender_male");
    By DoB=By.id("DateOfBirth");
    By companyid=By.id("Company");
    By taxcheckbox=By.id("IsTaxExempt");
    By newsletter=By.name("SelectedNewsletterSubscriptionStoreIds");
    By txtcustomerroles=By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']//input[@class='k-input']");
    By listitemadministrator=By.xpath("//li[contains(text(),'Administrators')]");
    By listitemForummoderator=By.xpath("//li[@class='k-item k-state-hover']");
    
    By txtvendoreid=By.id("VendorId");
    By activecheckbox=By.id("Active");
    By admincomment=By.id("AdminComment");
    By clicksave=By.name("save");
    By clicklogout=By.xpath("//a[contains(text(),'Logout')]");
    
    
    //Actions method
    public String getPageTitle()
    {
    	return rdriver.getTitle();
    }
    
    public void cickoncustomermenu()
    {
    	
    	
    	rdriver.findElement(linkcustomer_menu).click();
    }
    
   
    
    public void cickoncustomers()
    {
    	rdriver.findElement(linkcustomer_menuid).click();
    }
    
    public void cickonaddnew()
    {
    	rdriver.findElement(addcustomerlink).click();
    }
    
    public void setemailid(String email)
    {
    	rdriver.findElement(textemail).sendKeys(email);
    }
    
    public void setpassword(String password)
    {
    	rdriver.findElement(textpassword).sendKeys(password);
    }
    
    public void setfirstname(String fname)
    {
    	rdriver.findElement(textfirstname).sendKeys(fname);
    }
    
    public void setlastname(String lname)
    {
    	rdriver.findElement(textlastname).sendKeys(lname);
    }
    
    public void selectgender(String gender)
    {
    	rdriver.findElement(genderfemale).sendKeys(gender);
    }
    public void selectdob(String dob)
    {
    	rdriver.findElement(DoB).sendKeys(dob);
    }
    
    public void setcompanyname(String comid)
    {
    	rdriver.findElement(companyid).sendKeys(comid);
    }
    
    public void settaxexampt()
    {
    	rdriver.findElement(taxcheckbox).click();
    }
    
    public void setnewsletter()
    {
    	rdriver.findElement(newsletter).click();
    }
    
    public void setcustomerroles(String role)
    {
    	rdriver.findElement(txtcustomerroles).click();
    	rdriver.findElement(listitemadministrator).click();
    	//rdriver.findElement(listitemForummoderator).click();
    }
    
    public void selectvendor(String vendor)
    {
    	rdriver.findElement(txtvendoreid).sendKeys(vendor);
    }
    
    public void setactivecheckbox()
    {
    	rdriver.findElement(activecheckbox).click();
    	
    }
    
    public void textadmincomment(String comment)
    {
    	rdriver.findElement(admincomment).sendKeys(comment);
    }
    
    public void clickonsave() {
    	rdriver.findElement(clicksave).click();
    }
    
    public void clickonlogout() {
    	rdriver.findElement(clicklogout).click();
    }
}
