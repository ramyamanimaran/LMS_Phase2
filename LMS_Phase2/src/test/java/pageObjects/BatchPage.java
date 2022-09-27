package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

public class BatchPage 
{
	public WebDriver ldriver;
	public BatchPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By BatchButton = By.xpath("//button[@routerlink='/batch']");
	
	
	public void clickBatchButton()
	{
		ldriver.findElement(BatchButton).click();
	}


}


