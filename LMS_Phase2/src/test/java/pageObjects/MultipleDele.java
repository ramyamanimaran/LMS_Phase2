package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MultipleDele {

	public WebDriver ldriver;
	public  MultipleDele(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements( rdriver,this);
}

	@FindBy(xpath="(//div[@role='checkbox'])[2]")
	WebElement CheckBox1;
	
	@FindBy(xpath="(//div[@role='checkbox'])[3]")
	WebElement CheckBox2;
	
	@FindBy(xpath="//div/button[@ng-reflect-icon= 'pi pi-trash']")
	WebElement dButton;
	
	public void clickCheck1() {
		CheckBox1.click();
	}
	
	
	public void clickCheck2() {
		CheckBox2.click();
	}
	 
	public Boolean checkboxSelected() {
		Boolean chkBox1=CheckBox1.isEnabled();
		Boolean chkBox2=CheckBox2.isEnabled();
		if(chkBox1 && chkBox2) {
			return true;
		}
		else 
		{
		    return false;
		}
	}
	 
	public void clickDelete() {
		dButton.click();
	}
	
	public void delMessage() throws InterruptedException {
		Thread.sleep(1000);
		 if(ldriver.getPageSource().contains("Are you sure you want to delete the selected programs?")) {
		   	   System.out.println("User on Program Delete confirm Page");
		   	   
		     }
		 else
		 {
			 Assert.assertEquals(true,false);
		 }
	}
}
