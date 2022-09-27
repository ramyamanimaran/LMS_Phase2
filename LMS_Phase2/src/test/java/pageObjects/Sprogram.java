package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sprogram {

	public WebDriver ldriver;
	public  Sprogram(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements( rdriver,this);
}
	
	@FindBy(xpath="//input [@class='p-inputtext p-component']")
	WebElement Search;
	
	@FindBy(xpath="//input [@class='p-inputtext p-component p-filled']")
	WebElement Search1;
	
	public String TxtSearch() {
		return Search.getAttribute("placeholder");
	}

	public void EnterName(String Name) {
		Search.sendKeys(Name);
		Search1.click();
		
	}
	
}

