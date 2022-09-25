package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
 public WebDriver ldriver;
	 
	 public LogoutPage (WebDriver rdriver) {
		 ldriver= rdriver;
		 System.out.println("RAMYA"+rdriver);
		 PageFactory.initElements( rdriver, this);
	 }
	 
	 @FindBy (xpath="//span[contains(text(),'Logout')]")
	 WebElement btnLogout;
	 
	 
	 
	

	 public void clickLogout()
	 {
		 System.out.println("RAMYA"+ldriver.getCurrentUrl());
		 System.out.println("this is button logout"+btnLogout);
		 btnLogout.click();
		 
	 }

}
