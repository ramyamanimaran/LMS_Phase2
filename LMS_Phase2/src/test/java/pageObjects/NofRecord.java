package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NofRecord {

	public WebDriver ldriver;
	public  NofRecord (WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements( rdriver,this);
}
	
	
	
	
}
