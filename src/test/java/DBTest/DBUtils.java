package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DBUtils {
	
	private static WebDriver driver;
	private static Connection conn;

	public static void main(String[] args) throws SQLException {
			   
			      // Setting up WebDriver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\S141\\capstone\\CapstoneProject\\chromedriver.exe");
					
				driver = new ChromeDriver(); 

			    // Navigate to the web page and interact with the UI
				driver.get("http://localhost:8090/medicare/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				WebElement email = driver.findElement(By.id("username"));
				email.sendKeys("sharmi27@gmail.com");
				WebElement loginpassword = driver.findElement(By.id("password"));
				loginpassword.sendKeys("Sharmila@12345");
				WebElement login = driver.findElement(By.xpath("//div/input[@type='submit']"));
				login.click();
				WebElement product = driver.findElement(By.xpath("//div/a[@id='a_Antibiotics']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", product);
				
				//WebElement search1 = driver.findElement(By.xpath("//div/div/label/input[@type='search']"));
				//search1.sendKeys("Amoxicillin");
				//WebElement cart1 = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
				//cart1.click();
				
				WebElement search2 = driver.findElement(By.xpath("//div/div/label/input[@type='search']"));
				search2.sendKeys("Ciprofloxacin");
				WebElement cart2 = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
				cart2.click();
				
				
			     // WebElement cart = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-shopping-cart']"));
			      //cart.click();
				
				
				//WebElement itemadd = driver.findElement(By.xpath("//td/input[@value='2']"));
				
				WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", checkout);
				
				WebElement billing = driver.findElement(By.xpath("//div/a[@class='btn btn-primary']"));
				JavascriptExecutor executor2 = (JavascriptExecutor)driver;
				executor2.executeScript("arguments[0].click();", billing);
				
				WebElement cardnum = driver.findElement(By.id("cardNumber"));
				cardnum.sendKeys("1111111111");
				
				WebElement expmon = driver.findElement(By.id("expityMonth"));
				expmon.sendKeys("09");
				
				WebElement expyr = driver.findElement(By.id("expityYear"));
				expyr.sendKeys("23");
				
				WebElement cv = driver.findElement(By.id("cvCode"));
				cv.sendKeys("105");
				
				WebElement pay = driver.findElement(By.xpath("//a[@role='button']"));
				JavascriptExecutor executor3 = (JavascriptExecutor)driver;
				executor3.executeScript("arguments[0].click();", pay);
				
				
				
			      
			   // Establishing a connection to the database
			      String url = "jdbc:mysql://localhost:3306/medicare";
			      String username = "root";
			      String password = "root";
			      conn = DriverManager.getConnection(url, username, password);
			      // Navigating to the web application
			     // driver.get("http://localhost:8090/medicare/");

			      // Retrieving product details from the database
			      Statement stmt = conn.createStatement();
			      String query = "SELECT * FROM order_detail ";
			      ResultSet rs = stmt.executeQuery(query);

			      // Displaying product details on the console
			     while (rs.next()) {
			    	 int id = rs.getInt("id");
			         
			        // double unit_price = rs.getDouble("unit_price");
			         int billing_id = rs.getInt("billing_id");
			         int shipping_id = rs.getInt("shipping_id");
			         System.out.println("order details are :");
			         System.out.println("Id is: " + id + ", billing_id is : " + billing_id + ", shipping_id is: " + shipping_id);
			      } 
			     
			     String query2 = "SELECT * FROM product ";
			      ResultSet rs2 = stmt.executeQuery(query);

			      // Displaying product details on the console
			     while (rs2.next()) {
			    	 int id2 = rs2.getInt("id");
			         
			        // double unit_price = rs.getDouble("unit_price");
			         int quantity = rs2.getInt("quantity");
			         String description = rs2.getString("description");
			         System.out.println("Product details are: ");
			         System.out.println("Id is: " + id2 + ", quantity is : " + quantity + ", description is: " + description);
			      } 
			     
			     String query3 = "SELECT * FROM user_detail ";
			      ResultSet rs3 = stmt.executeQuery(query);

			      // Displaying product details on the console
			     while (rs3.next()) {
			    	 int id3 = rs3.getInt("id");
			         
			        // double unit_price = rs.getDouble("unit_price");
			         
			         String first_name = rs3.getString("first_name");
			         String last_name = rs3.getString("last_name");
			         int contact_number = rs3.getInt("contact_number");
			         System.out.println("User details are: ");
			         System.out.println("Id is: " + id3 + ", first_name is : " + first_name + ", last_name is: " + last_name + " ,contact_number is :" + contact_number);
			      } 
			   }

		
			   public void tearDown() {
			      // Closing the connection and quitting the WebDriver
			      try {
			         conn.close();
			      } catch (SQLException e) {
			         e.printStackTrace();
			      }
			      driver.quit();
			   } 
			}
