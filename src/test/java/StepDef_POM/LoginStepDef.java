package StepDef_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginStepDef {
	
	WebDriver driver=null;

	@When("I click on Login button")
	public void i_click_on_Login_button() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S141\\capstone\\CapstoneProject\\chromedriver.exe");
		
		 driver = new ChromeDriver(); 																										// if u give WebDriver driver here..it will cause nullpointer exception...declaration should be given one time which is already declared at line 11
		
		driver.get("http://localhost:8090/medicare/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@And("I enter the valid Login credentials")
	public void i_enter_the_Login_credentials() {
	    loginPage login = new loginPage(driver);
	    login.login_application("SharmiShekar4@gmail.com", "Sharmila@12345");
	}

	@Then("I should be successfully logged in")
	public void i_should_be_successfully_logged_in() {
		loginPage login = new loginPage(driver);
		login.successful_login();
	}

}
