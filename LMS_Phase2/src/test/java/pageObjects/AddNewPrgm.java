package pageObjects;



	import org.openqa.selenium.Alert;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AddNewPrgm {
		public WebDriver ldriver;
		public  AddNewPrgm(WebDriver rdriver) {
			ldriver= rdriver;
			PageFactory.initElements( rdriver,this);
	}

		@FindBy(xpath="	//span[contains(text(),'A New Program')]")
		WebElement AnewPgm;
		
		@FindBy(xpath="//button[@label='Save']")
		WebElement BSave;
		
		@FindBy(id="programName")
		WebElement pName;
		
		@FindBy(xpath="//input/@ng-reflect-model")
		WebElement pGetName;
		
		@FindBy(id="programDescription")
		WebElement pDescription;
		
		@FindBy(xpath = "//div[@class='ng-star-inserted'][1]/p-radiobutton")
		WebElement active;
		
		@FindBy(xpath = "//div[@class='ng-star-inserted'][2]/p-radiobutton")
		WebElement inActive;
		
		@FindBy(xpath = "//button/span[contains(text(),'Cancel')]")
		WebElement cancelB;
		
		@FindBy(xpath = "//span[contains(text(), 'Save')]")
		WebElement SaveB;
		
		
		public void AnewPgmButton() {
			AnewPgm.click();
		}

		public void buttonSave() throws InterruptedException {
			BSave.click();
			Thread.sleep(1000);
			
		}

		public void buttonCancel() throws InterruptedException {
			cancelB.click();
			Thread.sleep(1000);
			
		}
		
		public void addPName() {
			pName.sendKeys("Ninja");
		}
		
		public void addPDescription() {
			pDescription.sendKeys("Ninja tester");
		}
		

		
		public String getPName() {
			return pName.getAttribute("ng-reflect-model");
		}
		
		public String getPDescription() {
			return pDescription.getAttribute("ng-reflect-model");
		}
		
		public void addStatus() {
			active.click();
		}
		
		public boolean getStatus() {
			return active.isEnabled();
		}
		
		public void statusMsg() {
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

	
	
	
	
	


