package pages;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;

	
	By UserName = By.name("username");
	By password2 = By.name("password");
	By login = By.xpath("//div/input[@value='Login']") ;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test
	public void login_application(String username, String password)
	
	{
		//driver.findElement(loginlink).click();
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(password2).sendKeys(password);
		driver.findElement(login).click();
	}

public void successful_login ()
	{
		String title = driver.getTitle();
		System.out.println(title);
		String expectedtitle ="Medicare - Home";
		Assert.assertEquals(title, expectedtitle);
	}
}
