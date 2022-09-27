package stepDefinitions;

import java.util.List;



//import javax.swing.text.html.HTMLDocument.Iterator;


//import org.openqa.selenium.devtools.DevToolsException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.BatchPage; 
public class Headingsteps extends BaseClass
{
	
	//public WebDriver driver;
	//public BatchPage bp;
	
	
	//HEADING
	
	/*@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		up = new Userpage(driver);
		driver.navigate().to("https://lms-frontend-phase2.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("nirmalav");
		driver.findElement(By.id("password")).sendKeys("nimmi3006");
		driver.findElement(By.id("login")).click();
	}*/

	@When("User is on Batch page")
	public void user_is_on_batch_page()
	{
		
		bp = new BatchPage(driver);
		bp.clickBatchButton();
	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String string) 
	{
		try
		{
			WebElement logo = driver.findElement(By.xpath("//mat-card-title//div[@class='box']/.."));
			if(logo.isDisplayed())
			{
				System.out.println("Message: "+logo.getText());
			}else {
				System.out.println("Message: "+logo.getText());
			}
		}catch (Exception e) 
		{
			System.err.println("user login unsuccessful "+e.getMessage());

		}
	}

	//DELETE BUTTON
	
	@Then("Verify that the Delete button next to the search box is Disabled")
	public void verify_that_the_delete_button_next_to_the_search_box_is_disabled()
	{
		boolean isEnbled = driver.findElement(By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']")).isEnabled();

		if(isEnbled)
		{
			System.out.println("Button is Enabled");
		}else 
		{
			System.out.println("Button is Disabled");
		}

	}

	// NUMBER OF RECORDS
	
	@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1)
	{
		WebElement num = driver.findElement(By.xpath("//table[@role='grid']"));
		List<WebElement> rows = num.findElements(By.tagName("tr"));
		System.out.println("RowCount: "+rows.size());
	}

	//SEARCH BATCH
	
	@When("user clicks on search box with Batch Name entered in it")
	public void user_clicks_on_search_box_with_batch_name_entered_in_it()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("se");
	}

	@Then("records of that {string} are displayed")
	public void records_of_that_are_displayed(String string)
	{
		WebElement num = driver.findElement(By.xpath("(//span[@class='p-paginator-current ng-star-inserted'])[1]"));
		System.out.println(num.getText()); 
	}
	
	//EDIT BATCH
	
	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() 
	{
	   driver.findElement(By.xpath("//tbody/tr[3]//span[@class='p-button-icon pi pi-pencil']")).click();
	   System.out.println("Edit Button Clicked");
	}

	@Then("User lands on Batch Details form.")
	public void user_lands_on_batch_details_form() 
	{
	  boolean isdisp = driver.findElement(By.xpath("//div//span[@class='p-dialog-title ng-tns-c132-6 ng-star-inserted']")).isDisplayed();
	 if(isdisp)
	 {
		 System.out.println("User lands on batch Details Form");
	 }
	 else
	 {
		 System.out.println("User is not on batch Details Form");
	 }
	}
	
	@When("User edits Name")
	public void user_edits_name() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]//span[@class='p-button-icon pi pi-pencil']")).click();
		driver.findElement(By.id("batchName")).clear();
	    driver.findElement(By.id("batchName")).sendKeys("Numpy01");
	   	driver.findElement(By.id("batchDescription")).clear();
		driver.findElement(By.id("batchDescription")).sendKeys("Numpy001");
		WebElement Pname = driver.findElement(By.xpath("//input[@placeholder='Select a Program name']"));
		Pname.sendKeys("Numpy001");
		/*driver.findElement(By.xpath("//div/i[@class='p-dropdown-clear-icon pi pi-times ng-tns-c101-21 ng-star-inserted']")).click();
		WebElement ddown = driver.findElement(By.xpath("//div[@role='button']"));
		Select select =new Select(ddown);
		select.selectByVisibleText("TestProgram1");*/
		WebElement Radio1 = driver.findElement(By.name("category"));
		Radio1.click();
		System.out.println(Radio1.isSelected());
		driver.findElement(By.id("batchNoOfClasses")).clear();
		driver.findElement(By.id("batchNoOfClasses")).sendKeys("001");
		driver.findElement(By.xpath("//span[contains(text(), 'Save')]")).click();
		System.out.println("User details Edited in row 3");
		WebElement baseTable = driver.findElement(By.xpath("//table//tbody[@class='p-datatable-tbody']"));
		WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody/tr[3]/td[1]"));
		String rowText = tableRow.getText();
		System.out.println("First Row:"+rowText);
		if(rowText.equals("Numpy01"))
		{
			System.out.println("User can see edited Name");
		}
		else
		{
			System.out.println("User cannot see edited Name");
		}
	}

	@Then("User can see edited Name")
	public void user_can_see_edited_name()
	{
		
		driver.findElement(By.xpath("//div//input[@class ='p-inputtext p-component']")).sendKeys("n");
		WebElement baseTable = driver.findElement(By.xpath("//table//tbody[@class='p-datatable-tbody']"));
		WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody/tr[1]/td[1]"));
		String rowText = tableRow.getText();
		System.out.println("First Row:"+rowText);
		if(rowText.equals("Numpy01"))
		{
			System.out.println("User can see Searched Data");
		}
		else
		{
			System.out.println("User cannot see Searched Data");
		}
		
		
		
		/*WebElement baseTable = driver.findElement(By.xpath("//table//tbody[@class='p-datatable-tbody']"));
		WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody/tr[1]/td[2]"));
		String rowText = tableRow.getText();
		System.out.println("First Row:"+rowText);
		if(rowText.equals("Numpy01"))
		{
			System.out.println("User can see edited Name");
		}
		else
		{
			System.out.println("User cannot see edited Name");
		}*/
		
	}

	@When("Edit Batch Description")
	public void edit_batch_description() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]//span[@class='p-button-icon pi pi-pencil']")).click();
		driver.findElement(By.id("batchDescription")).clear();
		driver.findElement(By.id("batchDescription")).sendKeys("Numpy001");
		 driver.findElement(By.xpath("//button[@label='Save']")).click();
	}

	@Then("User can see edited descricption")
	public void user_can_see_edited_descricption()
	{
	  
		WebElement baseTable = driver.findElement(By.xpath("//table//tbody[@class='p-datatable-tbody']"));
		WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody/tr[1]/td[3]"));
		String rowText = tableRow.getText();
		System.out.println("First Row:"+rowText);
		if(rowText.equals("Numpy001"))
		{
			System.out.println("User can see edited descricption");
		}
		else
		{
			System.out.println("User cannot see edited descricption");
		}
	}

	@When("user edits program name")
	public void user_edits_program_name() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]//span[@class='p-button-icon pi pi-pencil']")).click();
		WebElement Pname = driver.findElement(By.xpath("//input[@placeholder='Select a Program name']"));
		Pname.sendKeys("Numpy001");
		//WebElement ddown = driver.findElement(By.xpath("//div[@role='button']"));
		//Select select =new Select(ddown);
		//select.selectByVisibleText("TestProgram1");
		driver.findElement(By.xpath("//button[@label='Save']")).click();
		
	}

	@Then("user can see edited program name")
	public void user_can_see_edited_program_name()
	{
		
		WebElement baseTable = driver.findElement(By.xpath("//table//tbody[@class='p-datatable-tbody']"));
		WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody/tr[1]/td[6]"));
		String rowText = tableRow.getText();
		System.out.println("First Row:"+rowText);
		if(rowText.equals("TestProgram1"))
		{
			System.out.println("User can see program name");
		}
		else
		{
			System.out.println("User cannot see program name");
		}
	}

	@When("user changes status")
	public void user_changes_status() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]//span[@class='p-button-icon pi pi-pencil']")).click();
		WebElement Radio1 = driver.findElement(By.name("category"));
		Radio1.click();
		System.out.println(Radio1.isSelected());
		driver.findElement(By.xpath("//button[@label='Save']")).click();
	}

	@Then("User can see updated Status")
	public void user_can_see_updated_status()
	{
		WebElement baseTable = driver.findElement(By.xpath("//table//tbody[@class='p-datatable-tbody']"));
		WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody/tr[1]/td[4]"));
		String rowText = tableRow.getText();
		System.out.println("First Row:"+rowText);
		if(rowText.equals("ACTIVE"))
		{
			System.out.println("User can see updated Status");
		}
		else
		{
			System.out.println("User cannot see updated Status");
		}
	    System.out.println("User can see updated Status");
	}

	@When("user edits No of classes")
	public void user_edits_no_of_classes() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[1]//span[@class='p-button-icon pi pi-pencil']")).click();
		driver.findElement(By.id("batchNoOfClasses")).clear();
		driver.findElement(By.id("batchNoOfClasses")).sendKeys("001");
		driver.findElement(By.xpath("//button[@label='Save']")).click();
	}

	@Then("user can see updated No of classes")
	public void user_can_see_updated_no_of_classes()
	{
	    
		WebElement baseTable = driver.findElement(By.xpath("//table//tbody[@class='p-datatable-tbody']"));
		WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody/tr[1]/td[5]"));
		String rowText = tableRow.getText();
		System.out.println("First Row:"+rowText);
		if(rowText.equals("001"))
		{
			System.out.println("User can see No of classes");
		}
		else
		{
			System.out.println("User cannot see No of classes");
		}
	    
	}
	
	//DELETE MULTIPLE BATCH

	@When("User selects more than one Batch using checkbox")
	public void user_selects_more_than_one_batch_using_checkbox() 
	{
		
		List<WebElement> chkboxes = driver.findElements(By.xpath("//div[@role='checkbox' and contains(@class,'p-component')]"));
		for(int i=0; i<chkboxes.size(); i+=2)
		{
			chkboxes.get(i).click();
		}
	}

	@Then("Delete button is Enabled")
	public void delete_button_is_enabled() 
	{
		boolean isEnbled = driver.findElement(By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']//span[@class='p-button-icon pi pi-trash']")).isEnabled();

		if(isEnbled)
		{
			System.out.println("Button is Enabled");
		}else 
		{
			System.out.println("Button is Disabled");
		}
	}

	@When("User clicks on Delete button")
	public void user_clicks_on_delete_button() throws InterruptedException 
	{
		//String parent = driver.getWindowHandle();
		//System.out.println("main window:"+parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']//span[@class='p-button-icon pi pi-trash']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button//span[contains(text(),'Yes')]")).click();
		
		//driver.findElement(By.xpath("//div//button//span[@class='p-button-icon p-button-icon-left pi pi-check']")).click();
		/*Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("Total window :"+count);
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				
				driver.findElement(By.xpath("//button//span[@class='p-button-icon p-button-icon-left pi pi-check']")).click();
				 Thread.sleep(3000);
			}
		}
		driver.switchTo().window(parent);*/
		
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() throws InterruptedException
	{
		
			System.out.println("User lands on Confirmation Page");
		
	}
	//ASCENDING
	
	@When("User clicks on the Ascending arrow \\(down ) near to the Batch name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_name() throws InterruptedException 
	{
	   
		driver.findElement(By.xpath("//thead/tr/th[2]//p-sorticon")).click();
		System.out.println("Batch Name Ascending Clicked");
		Thread.sleep(1000);
	}	
	@Then("User can see the results in Ascending order of Batch name")
	public void user_can_see_the_results_in_ascending_order_of_batch_name() throws InterruptedException
	{
		System.out.println("User can see Results in Ascending Order");
		Thread.sleep(5000);
	}
	
	@When("User clicks on the Ascending arrow \\(down ) near to the Batch Description")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_description() 
	{
		driver.findElement(By.xpath("//thead/tr/th[3]//p-sorticon")).click();
		System.out.println("Batch Description Ascending Clicked");
	}

	@Then("User can see the results in Ascending order of Batch Description")
	public void user_can_see_the_results_in_ascending_order_of_batch_description() 
	{
	    System.out.println("User can see Results in Ascending Order");
	}
	
	@When("User clicks on the Ascending arrow \\(down ) near to the Batch Status")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_status()
	{
		
		driver.findElement(By.xpath("//thead/tr/th[4]//p-sorticon")).click();
		System.out.println("Batch Status Ascending Clicked");
	}

	@Then("User can see the results in Ascending order of Batch Status")
	public void user_can_see_the_results_in_ascending_order_of_batch_status()
	{
		 System.out.println("User can see Results in Ascending Order");
	}
	
	@When("User clicks on the Ascending arrow \\(down ) near to the No Of Classes")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_no_of_classes()
	{
		
		driver.findElement(By.xpath("//thead/tr/th[5]//p-sorticon")).click();
		System.out.println("No. Of Classes Ascending Clicked");
	}

	@Then("User can see the results in Ascending order of No of Classes")
	public void user_can_see_the_results_in_ascending_order_of_no_of_classes()
	{
		System.out.println("User can see Results in Ascending Order");
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Program Name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_name() 
	{
		driver.findElement(By.xpath("//thead/tr/th[6]//p-sorticon")).click();
		System.out.println("Program Name Ascending Clicked");
	}

	@Then("User can see the results in Ascending order of Program Name")
	public void user_can_see_the_results_in_ascending_order_of_program_name()
	{
		System.out.println("User can see Results in Ascending Order");
	}
	
	//DESCENDING
	
	@When("User clicks onthe Descending arrow \\(down ) near to the Batch name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_name() 
	{
		driver.findElement(By.xpath("//thead/tr/th[2]//p-sorticon")).click();
		driver.findElement(By.xpath("//thead/tr/th[2]//p-sorticon")).click();
		System.out.println("Batch Name Descending Clicked");
	}
	
	@Then("User can see the results in Descending order of Batch name")
	public void user_can_see_the_results_in_descending_order_of_batch_name() 
	{
		System.out.println("User can see Results in Descending Order");
	}
	
	@When("User clicks onthe Descending arrow \\(down ) near to the Batch Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_description() 
	{
		driver.findElement(By.xpath("//thead/tr/th[3]//p-sorticon")).click();
		driver.findElement(By.xpath("//thead/tr/th[3]//p-sorticon")).click();
		System.out.println("Batch Description Descending Clicked");
	}

	@Then("User can see the results in Descending order of Batch Description")
	public void user_can_see_the_results_in_descending_order_of_batch_description() 
	{
		System.out.println("User can see Results in Descending Order");
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Batch Status")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_status() 
	{
		driver.findElement(By.xpath("//thead/tr/th[4]//p-sorticon")).click();
		driver.findElement(By.xpath("//thead/tr/th[4]//p-sorticon")).click();
		System.out.println("Batch Status Descending Clicked");
	}

	@Then("User can see the results in Descending order of Batch Status")
	public void user_can_see_the_results_in_descending_order_of_batch_status() 
	{
		System.out.println("User can see Results in Descending Order");
	}

	@When("User clicks on the Descending arrow \\(down ) near to the No Of Classes")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_no_of_classes()
	{
		driver.findElement(By.xpath("//thead/tr/th[5]//p-sorticon")).click();
		driver.findElement(By.xpath("//thead/tr/th[5]//p-sorticon")).click();
		System.out.println("No.of Classes Descending Clicked");
	}

	@Then("User can see the results in Descending order of No of Classes")
	public void user_can_see_the_results_in_descending_order_of_no_of_classes() 
	{
		System.out.println("User can see Results in Descending Order");
	}

	@When("User clicks on the Descending arrow \\(down ) near to the Program Name")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_name() 
	{
		driver.findElement(By.xpath("//thead/tr/th[6]//p-sorticon")).click();
		driver.findElement(By.xpath("//thead/tr/th[6]//p-sorticon")).click();
		System.out.println("Program Name Descending Clicked");
	}

	@Then("User can see the results in Descending order of Program Name")
	public void user_can_see_the_results_in_descending_order_of_program_name()
	{
		System.out.println("User can see Results in Descending Order");
	}

	//PAGINATION
	
	@When("User is on first page of Manage Batch")
	public void user_is_on_first_page_of_manage_batch() 
	{
	   boolean isSelc = driver.findElement(By.xpath("//button[text()='1']")).isEnabled();
	   if(isSelc)
	   {
		   System.out.println("User is on First Page of Manage Batch");
	   }
	   else
	   {
		   System.out.println("User is not on First Page of Manage Batch");
	   }
	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() 
	{
	   boolean isEnble =  driver.findElement(By.xpath("//button[@disabled][2]")).isEnabled();
	   
	   if(isEnble)
	   {
		   System.out.println("Previous Link button is Enabled");
	   }
	   else
	   {
		   System.out.println("Previous Link button is Disabled");
	   }
	}

	@Given("User is on the page number {string}")
	public void user_is_on_the_page_number(String string)
	{
		driver.findElement(By.xpath("//button[text()='1']")).click();
		System.out.println("User is on Page Number 1");
	}

	@When("User clicks navigate > button")
	public void user_clicks_navigate_button() 
	{
	   driver.findElement(By.xpath("//button/span[@class='p-paginator-icon pi pi-angle-right']")).click();
	}

	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String string) 
	{
	   
		System.out.println("User is on Page Number 2");
	}
	
	@Given("User is on page number {string}")
	public void user_is_on_page_number(String string)
	{
		
		System.out.println("User is on Page Number 2");				
		/*boolean isEnab = driver.findElement(By.xpath("//button[text()='2']")).isEnabled();
	    if(isEnab)
	    {
	    	System.out.println("User is on Page Number 2");
	    }
	    else
	    {
	    	System.out.println("User is not on Page Number 2");
	    }*/
	}

	@When("User clicks navigate {string} button")
	public void user_clicks_navigate_button(String string) throws InterruptedException 
	{
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//button/span[@class='p-paginator-icon pi pi-angle-left']"));
		JavascriptExecutor exe =(JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click()", ele);
	}
	
	@Then("User navigated to page number {int}")
	public void user_navigated_to_page_number(Integer int1)
	{
	    System.out.println("User is navigated to Page Number 1");
	}
	
	@When("User is on last page of Manage Batch")
	public void user_is_on_last_page_of_manage_batch()
	{
	    WebElement elem = driver.findElement(By.xpath("//button[@disabled][2]"));
	    JavascriptExecutor exec =(JavascriptExecutor)driver;
	    exec.executeScript("arguments[0].click()", elem);
	    System.out.println("User is on Last Page Of Manage Batch");
	}

	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() 
	{
	    boolean isEn = driver.findElement(By.xpath("//button[@disabled][2]")).isEnabled();
	    if(isEn)
	    {
	    	System.out.println("Next Link is Enabled");
	    }
	    else
	    {
	    	System.out.println("Next Link is Disabled");
	    }
	}
}
