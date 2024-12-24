package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationStep 
{
	WebDriver driver=null;
	
	@Given("User is on index page")
	public void user_is_on_index_page() 
	{
	    WebDriverManager.chromedriver().setup();
	    
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	
	@When("User clicks on register link")
	public void user_clicks_on_register_link() 
	{
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
	
	@Then("registration page will display")
	public void registration_page_will_display() 
	{
	    String expectedText="Signing up is easy!";
	    
	    String actualText=driver.findElement(By.xpath("//h1[text()='Signing up is easy!']")).getText();
	    
	    if(expectedText.equalsIgnoreCase(actualText))
	    {
	    	System.out.println("User is on Registration Page.");
	    }
	    else
	    {
	    	System.out.println("User is not on Registration Page.");
	    }
	}
	
	@And("User enters First Name {string}")
	public void user_enters_first_name(String fname) 
	{
	    driver.findElement(By.id("customer.firstName")).sendKeys(fname);
	}
	
	@And("User enters Last Name {string}")
	public void user_enters_last_name(String lname) 
	{
	    driver.findElement(By.id("customer.lastName")).sendKeys(lname);
	}
	
	@And("User enters Address {string}")
	public void user_enters_address(String addr) 
	{
	    driver.findElement(By.id("customer.address.street")).sendKeys(addr);
	}
	
	@And("User enters City {string}")
	public void user_enters_city(String city) 
	{
	    driver.findElement(By.id("customer.address.city")).sendKeys(city);
	}
	
	@And("User enters State {string}")
	public void user_enters_state(String state) 
	{
	    driver.findElement(By.id("customer.address.state")).sendKeys(state);
	}
	
	@And("User enters Zip Code {string}")
	public void user_enters_zip_code(String zcode) 
	{
	    driver.findElement(By.id("customer.address.zipCode")).sendKeys(zcode);
	}
	
	@And("User enters SSN {string}")
	public void user_enters_ssn(String ssn) 
	{
	    driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
	}
	
	@And("User enters Username {string}")
	public void user_enters_username(String uname) 
	{
	    driver.findElement(By.id("customer.username")).sendKeys(uname);
	}
	
	@And("User enters Password {string}")
	public void user_enters_password(String pwd) 
	{
	    driver.findElement(By.id("customer.password")).sendKeys(pwd);
	}
	
	@And("User enters Password {string} again for confirmation")
	public void user_enters_password_again_for_confirmation(String cpwd) throws InterruptedException 
	{
	   driver.findElement(By.id("repeatedPassword")).sendKeys(cpwd);
	   
	   Thread.sleep(Duration.ofSeconds(20));
	}
	
	@Then("User clicks on Register button")
	public void user_clicks_on_register_button() 
	{
	    driver.findElement(By.xpath("//input[@value='Register']")).click();
	    
	    driver.quit();
	}
}
