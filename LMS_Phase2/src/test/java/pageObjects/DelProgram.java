package pageObjects;




import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DelProgram {
	public WebDriver ldriver;
	public  DelProgram(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements( rdriver,this);
}
	@FindBy(xpath="//tbody/tr[1]/td[5]/div/span[2]/button")
	WebElement dButton;
	
	@FindBy(xpath="//div/span[@class='p-dialog-title ng-tns-c133-4 ng-star-inserted']")
	WebElement delMsg;
	
	@FindBy(xpath="//button[@ng-reflect-ng-class='p-confirm-dialog-accept']")
	WebElement delYes1;
	
	@FindBy(xpath="//button[@ng-reflect-ng-class='p-confirm-dialog-reject']")
	WebElement delNo1;
	
	

@FindBy(xpath="//tbody/tr[1]/td[2]")
WebElement dText;


	public void delButton() throws InterruptedException {
		Thread.sleep(1000);
		dButton.click();
		Thread.sleep(1000);
	}
	
	public void delMessage() throws InterruptedException {
		Thread.sleep(1000);
		if(ldriver.getPageSource().contains("Are you sure you want to delete "+dText.getText()+"?")) {
		    System.out.println("User on Delete confirm Page");
		   
		    }
		else
		{
		Assert.assertEquals(true,false);
		}
		}
	public void delYes() {
		delYes1.click();
	}
	
	public void delConfirm() {

        //Thread.sleep(500);
        
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
	
	
	public void delNo() {
		delNo1.click();
	}
	
}
