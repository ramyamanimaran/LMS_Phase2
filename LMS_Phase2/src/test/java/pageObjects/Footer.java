package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Footer {
	public WebDriver ldriver;
	public 	Footer(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements( rdriver,this);

}
	
	@FindBy(xpath="//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	WebElement footer;
	
	@FindBy(xpath="//span[@class='p-paginator-current ng-star-inserted']")
	WebElement tableFooter;
	
	public void validate_Footer() {
		WebElement table =ldriver.findElement(By.xpath("//table[@role=\"grid\"]//tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		String getFooterText = footer.getText();
		// split string by space
		List<String> myList = new ArrayList<String>(Arrays.asList(getFooterText.split(" ")));

		//return myList.get(4);
		 if(tableFooter.getText().equals("Showing 1 to "+rows.size()+" of "+myList.get(4)+" entries")) {
		   	   System.out.println("Footer text is validated");
		   	   
		     }
		 else
		 {
			 Assert.assertEquals(true,false);
		 }
	}
	
	public void validate_Footer_total() {
		String getFooterText = footer.getText();
		//System.out.println("Footer Text: "+getFooterText);
		
		// split string by space
		List<String> myList = new ArrayList<String>(Arrays.asList(getFooterText.split(" ")));

		//System.out.println("myList: "+myList);
		
		//return myList.get(4);
		
		if(getFooterText.equals("In total there are "+myList.get(4)+" programs.")) {
		   	   System.out.println("Footer total is displayed as expected");
		   	   
		     }
		 else
		 {
			 Assert.assertEquals(true,false);
		 }
        
	}


	


	}


	

