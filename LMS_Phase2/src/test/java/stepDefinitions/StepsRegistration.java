/*package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegistrationPage;

public class StepsRegistration extends BaseClass{
	

	
	

 // space for verifying the title
	//@Then ("Validating the heading of Registration form")
	//public void validating_the_heading_of_Registration_form()
	//{
	//Assert.assertEquals("Registration/LMS",rp.getTitle());
	//}
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
				driver= new ChromeDriver();
				
				rp= new RegistrationPage(driver);
				
	}
	

	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	    
		{
			driver.get(url);
			driver.manage().window().maximize();
		}
	
	//validating the title of the registration page
	@Then ("User should see the Registration page")
	public void User_should_see_the_Registration_page() {
		
		Assert.assertEquals("Registration Form", rp.getPageTitle());
		
	}

	@When("User enter valid customer information")
	public void user_enter_valid_customer_information() {
		rp.setFirstname("ramya");
		rp.setNumAddressHouseNo("10");
		rp.setCity("tampa");
		rp.setZip("33234");
		rp.setUsername("ramya");
		
	    String email = randomstring()+ "@gmail.com";
	    rp.setEmail(email);
	    
	    rp.setLastname("mani");
	    rp.setStreetname("grand");
	    
	    rp.selectFromStateDropDown("Florida");
	    rp.setDob("07/07/2000");//format: MM/DD/YYYY
	    
	    rp.setPhoneno(4354543453);
	    
	    rp.setPassword("Ramya123");
	    
	}

	@When("User click Signup")
	public void user_click_signup() {
	    rp.clickSignUp();
	}

	@Then("User should be able to see confirmation message {string}")
	public void user_should_be_able_to_see_confirmation_message(String msg) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("Registration Succesful"));
		  
	}

	@Then("Closer Browser")
	public void closer_browser() {
	    
	driver.close();
	}
	

	
	
	
	
	
	
}
*/