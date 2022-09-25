package stepDefinitions;





import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;


public class BaseClass {

	public static WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public LogoutPage lop;
	
	
	
	//public RegistrationPage rp;
	
	//for creating random string for unique email ids for testing
	// public static String randomstring() {
		// String generatedString1= RandomStringUtils.randomAlphabetic(5);
		// return (generatedString1);
		 
	 }

