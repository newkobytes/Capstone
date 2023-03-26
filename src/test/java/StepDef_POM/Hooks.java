package StepDef_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\S141\\capstone\\CapstoneProject\\chromedriver.exe");
	
	 driver = new ChromeDriver(); 
	 
	}
	
	@After
	public void teardown()
	{
		driver.close();
	}
}
