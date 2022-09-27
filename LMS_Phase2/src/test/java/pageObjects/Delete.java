package pageObjects;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Delete {
		public WebDriver ldriver;
		public  Delete(WebDriver rdriver) {
			ldriver= rdriver;
			PageFactory.initElements( rdriver,this);
	}
		@FindBy(xpath="//div/button[@ng-reflect-icon= 'pi pi-trash']")
		WebElement dButton;
		
		public void delButton() {
			System.out.println("Inside delButton method");
			if(dButton.isEnabled()) {
				System.out.println("Button is enabled");
			}
			else {
				System.out.println("Button is not enabled");
			}
		}
		



}
