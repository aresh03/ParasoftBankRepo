package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginStep 
{
	WebDriver driver=null;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() 
	{
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    driver.manage().deleteAllCookies();
	}
	
	@When("User enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String uname, String pwd) 
	{
		driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	@When("User enters invalid username {string} and valid password {string}")
	public void user_enters_invalid_username_and_valid_password(String uname, String pwd) 
	{
		driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	@When("User enters valid username {string} and invalid password {string}")
	public void user_enters_valid_username_and_invalid_password(String uname, String pwd)
	{
		driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	@When("User enters valid username {string} and not enters password")
	public void user_enters_valid_username_and_not_enters_password(String uname)
	{
		driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys(uname);
	}
	
	@When("User not enters username and enters only valid password {string}")
	public void user_not_enters_username_and_enters_only_valid_password(String pwd)
	{
		driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	@When("User enters invalid username {string} and invalid password {string}")
	public void user_enters_invalid_username_and_invalid_password(String uname, String pwd)
	{
		driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}
	
	@And("User clicks on login button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	
	@Then("User navigates to Home Page")
	public void user_navigates_to_home_page() 
	{
		String actualText=driver.findElement(By.xpath("//p[@class='smallText']")).getText();
	    String expectedText="Welcome Sarah Williams";
	    Assert.assertEquals(expectedText, actualText);
	    driver.quit();
	}
	
	@Then("User should not be able to login to application with invalid username")
	public void user_should_not_be_able_to_login_to_application_with_invalid_username() 
	{
		String actualText=driver.findElement(By.xpath("//p[@class='error']")).getText();
	    String expectedText="The username and password could not be verified.";
	    try
	    {
	    	if(expectedText.equalsIgnoreCase(actualText))
	    	{
	    		driver.quit();
	    	}
	    	else
	    	{
	    		
	    		throw new RuntimeException("Test Method Failed as User should not login into application with invalid username.");
	    	}
	    }
	    catch(RuntimeException e)
	    {
	    	e.printStackTrace();
	    	driver.quit();
	    }
	}
	
	@Then("User should not be able to login to application with invalid password")
	public void user_should_not_be_able_to_login_to_application_with_invalid_password()
	{
		String actualText=driver.findElement(By.xpath("//p[@class='error']")).getText();
	    String expectedText="The username and password could not be verified.";
	    try
	    {
	    	if(expectedText.equalsIgnoreCase(actualText))
	    	{
	    		driver.quit();
	    	}
	    	else
	    	{
	    		
	    		throw new RuntimeException("Test Method Failed as User should not login into application with invalid password.");
	    	}
	    }
	    catch(RuntimeException e)
	    {
	    	e.printStackTrace();
	    	driver.quit();
	    }
	}
	
	@Then("User should not be able to login to application with only username")
	public void user_should_not_be_able_to_login_to_application_with_only_username()
	{
		String actualText=driver.findElement(By.xpath("//p[@class='error']")).getText();
	    String expectedText="Please enter a username and password.";
	    try
	    {
	    	if(expectedText.equalsIgnoreCase(actualText))
	    	{
	    		driver.quit();
	    	}
	    	else
	    	{
	    		
	    		throw new RuntimeException("Test Method Failed as User should not login into application with only valid username.");
	    	}
	    }
	    catch(RuntimeException e)
	    {
	    	e.printStackTrace();
	    	driver.quit();
	    }
	}
	
	@Then("User should not be able to login to application with only password")
	public void user_should_not_be_able_to_login_to_application_with_only_password()
	{
		String actualText=driver.findElement(By.xpath("//p[@class='error']")).getText();
	    String expectedText="Please enter a username and password.";
	    try
	    {
	    	if(expectedText.equalsIgnoreCase(actualText))
	    	{
	    		driver.quit();
	    	}
	    	else
	    	{
	    		
	    		throw new RuntimeException("Test Method Failed as User should not login into application with only valid password.");
	    	}
	    }
	    catch(RuntimeException e)
	    {
	    	e.printStackTrace();
	    	driver.quit();
	    }
	}
	
	@Then("User should not be able to login to application with invalid username and password")
	public void user_should_not_be_able_to_login_to_application_with_invalid_username_and_password()
	{
		String actualText=driver.findElement(By.xpath("//p[@class='error']")).getText();
	    String expectedText="The username and password could not be verified.";
	    try
	    {
	    	if(expectedText.equalsIgnoreCase(actualText))
	    	{
	    		driver.quit();
	    	}
	    	else
	    	{
	    		
	    		throw new RuntimeException("Test Method Failed as User should not login into application with invalid username and invalid password.");
	    	}
	    }
	    catch(RuntimeException e)
	    {
	    	e.printStackTrace();
	    	driver.quit();
	    }
	}
	
	@Then("User should not be able to login to application without entering username and password")
	public void user_should_not_be_able_to_login_to_application_without_entering_username_and_password()
	{
		String actualText=driver.findElement(By.xpath("//p[@class='error']")).getText();
		String expectedText="Please enter a username and password.";
		 try
		    {
		    	if(expectedText.equalsIgnoreCase(actualText))
		    	{
		    		driver.quit();
		    	}
		    	else
		    	{
		    		
		    		throw new RuntimeException("Test Method Failed as User should not login into application without entering username and password.");
		    	}
		    }
		    catch(RuntimeException e)
		    {
		    	e.printStackTrace();
		    	driver.quit();
		    }
	}
}