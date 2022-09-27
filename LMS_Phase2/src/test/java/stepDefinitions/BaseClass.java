package stepDefinitions;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.MultipleDele;
import pageObjects.Sprogram;
import pageObjects.UserPage;

import org.openqa.selenium.WebDriver;

import pageObjects.AddNewPrgm;
import pageObjects.AssignmentPage;
import pageObjects.BatchPage;
import pageObjects.DelProgram;
import pageObjects.Delete;
import pageObjects.Edit;
import pageObjects.Footer;
import pageObjects.Header;

public class BaseClass {

	public static WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public LogoutPage lop;
	public BatchPage bp;
	public UserPage up;

	// program pom
	public Header header;
	public Footer fp;
	public Delete dp;
	public Sprogram Sp;
	public Edit ep;
	public DelProgram dp1;
	public AddNewPrgm AnP;
	public MultipleDele MpD;
	
	
	//assignment page 
	public AssignmentPage ap;
	
	public BaseClass() {
		header = new Header(driver);
		fp = new Footer(driver);
		dp= new  Delete(driver);
		Sp=new Sprogram(driver);
		ep= new Edit(driver);
		dp1=new DelProgram(driver);
		AnP=new AddNewPrgm(driver);
		MpD= new MultipleDele(driver);
		up = new UserPage(driver);
	}

	// public RegistrationPage rp;

	// for creating random string for unique email ids for testing
	// public static String randomstring() {
	// String generatedString1= RandomStringUtils.randomAlphabetic(5);
	// return (generatedString1);

}
