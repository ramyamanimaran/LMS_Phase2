package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Edit {
	public WebDriver ldriver;
	public String beforeStatus;
	public  Edit(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements( rdriver,this);
		
}
	
	@FindBy(xpath="(//div[@role='checkbox'])[2]")
	WebElement checkBox1;
	
	@FindBy(xpath="(//div[@class='p-checkbox-box p-component p-highlight'])[1]")
	WebElement checkBox2;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div/span[1]/button[1]")
	WebElement edit1;
	////button[@icon='pi pi-pencil'])[1]
	
	@FindBy(id="programName")
	WebElement Ename;
	
	@FindBy(xpath = "//button/span[contains(text(),'Save')]")
	WebElement saveB;
	
	@FindBy(id="programDescription")
	WebElement Edescription;
	
	@FindBy(xpath = "//div[@class='ng-star-inserted'][1]/p-radiobutton")
	WebElement active;
	
	@FindBy(xpath = "//div[@class='ng-star-inserted'][2]/p-radiobutton")
	WebElement inActive;
	
	@FindBy(xpath = "//button/span[contains(text(),'Cancel')]")
	WebElement cancelB;
	
	@FindBy(xpath = "//span[contains(text(), 'Save')]")
	WebElement SaveB;
	
	@FindBy(xpath = "//div[@class='p-toast-summary ng-tns-c90-13']")
	WebElement alert;
	
	public void Checkbox1() throws InterruptedException {
		Thread.sleep(1000);
		checkBox1.click();
	}
	
	public void selectCheckBox() {
		if (checkBox2.isDisplayed()) {
		System.out.println("checkbox is selected");	
		}
		else {
			System.out.println("checkbox is  not selected");	
			 Assert.assertEquals(true,false);
		}
	}
	
	public void checkEdit() throws InterruptedException {
		Thread.sleep(1000);
		edit1.click();
	}
	
	public void landPpage() {
		 if(ldriver.getPageSource().contains("Program Details")) {
		   	   System.out.println("User on Program Details Page");
		   	   
		     }
		 else
		 {
			 Assert.assertEquals(true,false);
		 }
	}
	
	public void editName() {
		Ename.clear();
		Ename.sendKeys("JavaSel");
		
	}
	public void SaveButton() {
		saveB.click();
	}
	
	public void editDescription() {
		Edescription.clear();
		Edescription.sendKeys("JSelenium");
	}
	
	public void RadioStatus() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("active.isEnabled(): "+active.isEnabled());
	if(active.isEnabled()) {
		System.out.println("first if: ");
		inActive.click();
		Thread.sleep(1000);
		beforeStatus="Active";
	}
	else {
		System.out.println("first if1111: ");
		active.click();
		Thread.sleep(1000);
		beforeStatus="Inactive";
	}
	System.out.println("beforeStatus: "+beforeStatus);
	}
	
	public String RadioStatus(String afterStatus) {
		System.out.println("beforeStatus: "+beforeStatus);
		System.out.println("afterStatus: "+afterStatus);
	if(afterStatus.equals(beforeStatus)) {
		return "Fail";
	}
	else {
		return "Pass";
	}
	}
	

	public void CancelButton() throws InterruptedException {
		cancelB.click();
		Thread.sleep(1000);
	}
	
	public void notLandPpage() {
		 if(ldriver.getPageSource().contains("Manage Program")) {

			 System.out.println("User not on Program Details Page");
		     }
		 else
		 {

			 System.out.println("User still on Program Details Page");
		   	  
		   	Assert.assertEquals(true,false);
		 }
	}
	
	public void buttonSave() throws InterruptedException {
		SaveB.click();
        Thread.sleep(500);
        
        try {
		
		 // Switching to Alert        
        Alert alert = ldriver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= alert.getText();		
        		
        // Displaying alert message		
        System.out.println("alertMessage: "+alertMessage);	
        }
        catch(Exception e)
        {
        	
        }
		
	}
	
}
