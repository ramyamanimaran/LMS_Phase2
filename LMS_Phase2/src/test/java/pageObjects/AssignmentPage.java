
 
 package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AssignmentPage {

	WebDriver ldriver;
	public AssignmentPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
}
	@FindBy(xpath="//button[@routerlink='/assignment']")
	WebElement assignmentclk;
	
	public void assignment() {
		 assignmentclk.click();

	}






	@FindBy(xpath="//span[@class='p-paginator-current ng-star-inserted']")
	WebElement entriesText;

	@FindBy(xpath="//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	WebElement assignmentText;


	public void entries() {
	entriesText.getText();
	String expectedText="Showing 1 to 3 of 3 entries";
	//WebDriver driver = null;
	String actualText=ldriver.findElement(By.xpath("(//div[@class='box'])[1]")).getText();
	if(actualText.equals(expectedText)) {
	System.out.println("pass");
	}
	else {
	System.out.println("Fail");
	}
}
	public void assignmentText() {
		 assignmentText.getText();
		String expectedText="assignmentText";
		// WebDriver driver=null;
		 String actualText=ldriver.findElement(By.xpath("//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")).getText();
		 if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
            System.out.println("Fail");
		}
		}



	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement search;
	
	
	
	public void sAssign() {
		search.sendKeys("Sq");
	}
	public void sAssign1() {
		search.clear();
		search.sendKeys("Sql Assignment");
	
}

	@FindBy(xpath="(//div[@role='checkbox'])[2]")
	WebElement checkBox1;
	
	@FindBy(xpath="(//div[@class='p-checkbox-box p-component p-highlight'])[1]")
	WebElement checkBox2;
	
	@FindBy(xpath="(//div[@class='p-checkbox-box p-component'])[1]")
	WebElement  edit1;
	
	@FindBy(xpath="//input[@id='assignment']")
	WebElement  Ename;
	
	@FindBy(xpath="//input[@id='assignmentDescription']")
	WebElement  Edescription;
	
	@FindBy(xpath="//input[@id='assignmentGraderId']")
			WebElement EGrade;
	
	@FindBy(xpath="//span[@class='p-button-icon pi pi-calendar']")
			WebElement Calbutton;

	@FindBy(xpath="//span[@class='ng-tns-c105-8 p-highlight p-ripple ng-star-inserted']")
			WebElement Edate;


	@FindBy(xpath="//button[@class='p-button-rounded p-button-danger p-button p-component ng-star-inserted']")
	WebElement Clkcancel;
	
	@FindBy(xpath="//button[@class='p-button-rounded p-button-success p-button p-component ng-star-inserted']")
	WebElement Save;
	
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
	public void editName() throws InterruptedException {
		
		 Ename.clear();
		 Ename.sendKeys("Sql Assignment");
}
	public void editDescription() {
		Edescription.clear();
		Edescription.sendKeys("SQL Practice");
}
	public void editGrade() {
		 EGrade.clear();
		 EGrade.sendKeys("1");
	}
	public void calenderbtn() {
		Calbutton.click();
}
	public void editdate() {
		 Edate.clear();
		 Edate.sendKeys("1");
	}
	public void cancel() {
		Clkcancel.click();
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
	public void save() throws InterruptedException {
		 Save.click();
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




