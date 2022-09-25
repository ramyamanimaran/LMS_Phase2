package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import pageObjects.LogoutPage;

public class StepsLogout extends BaseClass{
	
	

@Then("click on logout")
public void click_on_log()
{
	
    lop = new LogoutPage(driver);
    
    lop.clickLogout();
}

@Then("User should be able to see the loginpage url")
public void user_should_be_able_to_see_the_loginpage_url() {
    
	if (driver.getCurrentUrl().contains("https://lms-frontend-phase2.herokuapp.com/login"))
	{ 
		System.out.println("This is Login Page");
	}
}

}

