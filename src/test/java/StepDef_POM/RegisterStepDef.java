package StepDef_POM;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import pages.registerPage;


public class RegisterStepDef {
	

	WebDriver driver = null;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S141\\capstone\\CapstoneProject\\chromedriver.exe");
		
		 driver = new ChromeDriver(); 																											// if u give WebDriver driver here..it will cause nullpointer exception...declaration should be given one time which is already declared at line 11
		
		driver.get("http://localhost:8090/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
	}

	@When("I click on the SignUp button")
	public void i_click_on_the_SignUp_button() {
		registerPage register = new registerPage(driver);
	    register.register_signup();
	}

	@When("I enter the User Details")
	public void i_enter_the_User_Details() {
		registerPage register = new registerPage(driver);
		register.register_name_details("Sharmila","Ganesan", "SharmiShekar5@gmail.com", "1234567890");
		
	}
	
	@When("I enter the Password details")
	public void i_enter_the_Password_details() {
		registerPage register = new registerPage(driver);
		register.register_password_details("Sharmila@12345", "Sharmila@12345");
	}
	
	@When("I enter the Address details")
	public void i_enter_the_Address_details() {
		registerPage register = new registerPage(driver);
		register.register_address_details("2/14Westst", "Tcr", "Tuty", "628888", "TamilNadu", "India");
	}

	@When("I click on confirm button")
	public void i_click_on_confirm_button() {
		registerPage register = new registerPage(driver);
		register.confirm_registration();
	}

	@Then("I should be registered as a medicare user")
	public void i_should_be_registered_as_a_medicare_user() {
		registerPage register = new registerPage(driver);
		register.successful_registration();
	}
	
	

}
