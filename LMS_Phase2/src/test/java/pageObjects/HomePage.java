package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public WebDriver ldriver;
	 
	 public HomePage (WebDriver rdriver) {
		 ldriver= rdriver;
		 PageFactory.initElements( rdriver, this);
	 }
	 
	 
	 @FindBy (xpath ="//span[contains(text(),'LMS - Learning Management System')]")
	 WebElement headerLMS;
	 
	 
	 @FindBy (xpath ="//app-header/mat-toolbar[1]/button[1]/span[1]")
	 WebElement headerProgram;
	 
	 @FindBy (xpath ="//span[contains(text(),'Batch')]")
	 WebElement headerBatch;
	 
	 @FindBy (xpath ="//span[contains(text(),'User')]")
	 WebElement headerUser;
	 
	 @FindBy (xpath ="//span[contains(text(),'Assignment')]")
	 WebElement headerAssignment;
	 
	 @FindBy (xpath ="//span[contains(text(),'Attendance')]")
	 WebElement headerAttendance;
	 
	 @FindBy (xpath ="//span[contains(text(),'Logout')]")
	 WebElement headerLogout;
	 
	 public void checkHeaderLMS()
	 {//check if header is  visible
		 
	     // boolean t = headerLMS.isDisplayed();
	      if (headerLMS!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	 
	 }
	 
	 public void checkHeaderProgram()
	{//check if header is  visible
	    // boolean t = headerProgram.isDisplayed();
	      if (headerProgram!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	 
	 }
	 
	 public void checkHeaderBatch()
	 {//check if header is  visible
	      //boolean t = headerBatch.isDisplayed();
	      if (headerBatch!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	 
	 }
	 
	 public void checkHeaderUser()
	 {//check if header is  visible
	      //boolean t = headerUser.isDisplayed();
	      if (headerUser!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	 
	 }
	 
	 public void checkHeaderAssignment()
	 {//check if header is  visible
	      //boolean t = headerAssignment.isDisplayed();
	      if (headerAssignment!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	 
	 }
	 
	 
	 
	 
	 public void checkHeaderAttendance()
	 {//check if header is  visible
	     // boolean t = headerAttendance.isDisplayed();
	      if (headerAttendance!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	 
	 }
	 
	 public void checkHeaderLogout()
	 {//check if header is  visible
	      //boolean t = headerLogout.isDisplayed();
	      if (headerLogout!=null) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	 
	 }
	 
}
