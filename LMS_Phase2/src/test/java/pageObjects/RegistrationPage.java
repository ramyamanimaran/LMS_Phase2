/*package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage
{

	public WebDriver ldriver;
	 
	 public RegistrationPage (WebDriver rdriver) {
		 ldriver= rdriver;
		 PageFactory.initElements( rdriver, this);
	 }
	 
	 By txtFirstname = By.xpath("//input[@id ='firstname']");
	 
	 By numAddressHouseNo = By.xpath("//input[@id='houseno']");
	 
	 By txtCity = By.xpath("//input[@id='city']");
	 
	 By numZip = By.xpath("//input[@id='zip']");
	 
	 By txtUsername = By.xpath("//input[@id='username']");
	 
	 By txtEmail = By.xpath("//input[@id='email']");
	 
	 By txtLastname = By.xpath("//input[@id='lastname']");
	 
	 By  txtStreetname= By.xpath("//input[@id='streetname']");
	 
	 By  stateDropDown= By.xpath("//input[@id='state']");
	 
	 By  txtDob= By.xpath("//input[@id='DateofBirth']");
	 
	 By  numPhoneno= By.xpath("//input[@id='phoneno']");
	 
	 By  txtPassword= By.xpath("//input[@id='password']");
	 
	 By  btnSignup = By.xpath("//input[@id='signup']");
	 
	 
	 
	 
	 
	 //action methods
	 
	 // for validating tile method
	 public String getPageTitle()
	 {
	return ldriver.getTitle();
		 
	 }
	 
	 //space for validating the message
	// public String getPageMessage()
	// {
	// return ldriver.get();
	// }
	 public void setFirstname(String firstname)
	 {
	
		 ldriver.findElement(txtFirstname).sendKeys(firstname);
	 }
	 
	 public void setNumAddressHouseNo(String houseno)
	 {
		
		ldriver.findElement(numAddressHouseNo).sendKeys(houseno);
	 }
	 public void setCity(String city)
	 {
	
		 ldriver.findElement(txtCity).sendKeys(city);
	 }
	 
	 public void setZip (String zip)
	 {
	
		 ldriver.findElement(numZip).sendKeys(zip);
	 }
	 
	 
	 public void setUsername (String username)
	 {
	
		ldriver.findElement(txtUsername).sendKeys(username);
	 }
	 
	 public void setEmail (String email)
	 {
	
		 ldriver.findElement(txtEmail).sendKeys(email);
	 }
	 
	 
	 public void setLastname (String lastname)
	 {
	
		 ldriver.findElement(txtLastname).sendKeys(lastname);
	 }
	 
	 public void setStreetname (String streetname)
	 {
	
		 ldriver.findElement(txtStreetname).sendKeys(streetname);
	 }
	 
	 public void selectFromStateDropDown (String value) {
		    Select state = new Select(ldriver.findElement(stateDropDown));
		    state.selectByVisibleText(value);
	 }
	 // space for birthdate
	 public void setDob (String dob)
	 {
		 ldriver.findElement(txtDob).sendKeys(dob);
	 }
	 
	 public void setPhoneno(int phoneno)
	 {
	      ldriver.findElement(numPhoneno).sendKeys(new String(phoneno));
	 }
	 
	 public void setPassword(String password)
	 {
	      ldriver.findElement(txtPassword).sendKeys(password);
	 }
	 
	 public void clickSignUp()
	 {
		 ldriver.findElement(btnSignup).click();
		 
	 }
	 
	 
}
*/