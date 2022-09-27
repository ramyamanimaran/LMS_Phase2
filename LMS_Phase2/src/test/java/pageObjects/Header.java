package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	public WebDriver ldriver;
	public Header(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements( rdriver,this);
}
	@FindBy(xpath="//span[1][contains(text(),'Program')]")
	WebElement Program;
	
	public void clickProgram() {
		Program.click();
	}
	
	
}
