package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class registerPage {

	
WebDriver driver;
	
	//By SignUp = By.xpath("//li[@id='signup']");
	By SignUp = By.xpath("//li/a[@href='/medicare/membership']");
	By firstname = By.id("firstName");
	By lastname = By.id("lastName");
	By mail = By.id("email");
	By mobilenum = By.id("contactNumber");
	By regPassword = By.id("password");
	By ConfirmPassword = By.id("confirmPassword");
	By role = By.id("role1");
	By submit1 = By.name("_eventId_billing");
	By Address1 = By.id("addressLineOne");
	By Address2 = By.id("addressLineTwo");
	By City= By.id("city");
	By Pincode=By.id("postalCode");
	By State=By.id("state");
	By Country=By.id("country");
	By sumbit2=By.name("_eventId_confirm");
	
	By UserName = By.name("username");
	By loginpassword = By.name("password");
	By login = By.xpath("//div/input[@type='submit']") ;
public registerPage(WebDriver driver)
{
	this.driver=driver;
}

@Test
public void register_signup()
		{
			driver.findElement(SignUp).click();
		}


public void register_name_details(String fname, String lname, String Mailid, String phonenum)
		{
			
			driver.findElement(firstname).sendKeys(fname);
			driver.findElement(lastname).sendKeys(lname);
			driver.findElement(mail).sendKeys(Mailid);
			driver.findElement(mobilenum).sendKeys(phonenum);
		}

public void register_password_details(String pass1, String confirmpass1)
{
	driver.findElement(regPassword).sendKeys(pass1);
	driver.findElement(ConfirmPassword).sendKeys(confirmpass1);
	driver.findElement(role).click();
	driver.findElement(submit1).click();
}
		
public void register_address_details(String addr1, String addr2, String cityname, String pin, String statename, String countryname)	
		{
			driver.findElement(Address1).sendKeys(addr1);
			driver.findElement(Address2).sendKeys(addr2);
			driver.findElement(City).sendKeys(cityname);
			driver.findElement(Pincode).sendKeys(pin);
			driver.findElement(State).sendKeys(statename);
			driver.findElement(Country).sendKeys(countryname);
			driver.findElement(sumbit2).click();
			
		}

public void confirm_registration()
		{
	WebElement confirm= driver.findElement(By.xpath("//div/div/div/a[@class='btn btn-lg btn-primary']"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", confirm);
		}

public void successful_registration()
		{
			String title = driver.getTitle();
			System.out.println(title);
			String expectedtitle ="Medicare - Membership";
		    Assert.assertEquals(title, expectedtitle);
		    
		}
			//JavascriptExecutor executor = (JavascriptExecutor)driver;
			//executor.executeScript("arguments[0].click();", confirm);
			//confirm.click();
}

