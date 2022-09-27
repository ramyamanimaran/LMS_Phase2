package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 public WebDriver ldriver;
	 
	 public LoginPage (WebDriver rdriver) 
	 {
		 ldriver= rdriver;
		 PageFactory.initElements( rdriver, this);
	 }
	 
	 
	 
	 
     
	 @FindBy (xpath ="//input[@id ='username']")
	 WebElement txtUsername;
	 
	 @FindBy (xpath="//input[@id ='password']")
	 WebElement txtPassword;
	 
	 @FindBy (xpath="//button[@id='login']")
	 WebElement btnLogin;
	 
	 
	 
	 public String getPageTitle() {
		 return ldriver.getTitle();
	 }

	 public void setUserName(String uname)
	 {
		 txtUsername.clear();
		 txtUsername.sendKeys(uname);
	 }
	 
	 public void setPassword(String pwd)
	 {
		 txtPassword.clear();
		 txtPassword.sendKeys(pwd);
	 }
	 
	 public void clickLogin()
	 {
		 btnLogin.click();
		 
	 }
	 
}
