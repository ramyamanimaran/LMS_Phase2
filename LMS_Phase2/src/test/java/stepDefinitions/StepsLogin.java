package stepDefinitions;




import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.LoginPage;

public class StepsLogin extends BaseClass

{
	
	@Given("User launch Chrome Browser")
	public void user_launch_Chrome_Browser() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		
		lp= new LoginPage(driver);
		
		
	}
	

@When("User opens URL {string}")
public void user_opens_url(String url) 
    
	{
		driver.get(url);
	}
	
	
	
	@And ("User enters username as {string} and password as {string}")
	public void User_enters_username_as_and_password_as(String userrname,String password)
	{
		lp.setUserName( userrname);
		lp.setPassword(password);
	}
		   
	@When("click on login")
	public void click_on_login() 
	    
	{
		lp.clickLogin();
		
	}
	

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException{
		if (driver.getPageSource().contains("Invalid username and password Please try again"))
		{
			//driver.close();
			Assert.assertTrue(true);
			}
		else {
			Assert.assertEquals(title,driver.getTitle());
		}
	    Thread.sleep(2000);
	}
	

		
	@Then ("close Browser")
	public void close_Browser()
	{
		System.out.println("Closing driver");
		driver.close();
	}
	
	
}





