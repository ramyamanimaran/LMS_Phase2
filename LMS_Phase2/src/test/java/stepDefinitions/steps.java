package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MultipleDele;
import pageObjects.Header;
import pageObjects.Footer;
import pageObjects.AddNewPrgm;
import pageObjects.DelProgram;
import pageObjects.Delete;
import pageObjects.Edit;
import pageObjects.Sprogram;

public class steps extends BaseClass 
{
	
	
	/*public void pre_steps(String url) {
		//System.setProperty("webdriver.chrome.driver", "C:\\NumpyNinja\\Software\\chromedriver_win32 (5)\\chromedriver.exe");
		//this.driver= new ChromeDriver();
		//this.lp = new LoginPage(driver);
		this.header = new Header(driver);
		this.fp = new Footer(driver);
		dp= new  Delete(driver);
		Sp=new Sprogram(driver);
		ep= new Edit(driver);
		dp1=new DelProgram(driver);
		AnP=new AddNewPrgm(driver);
		MpD= new MultipleDele(driver);
		
		//driver.get(url);
		//driver.manage().window().maximize();
	}*/
	
	
	
/*Begin Login 
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		pre_steps("https://lms-frontend-phase2.herokuapp.com/login");
	}

	@When("User clicks the Login button after entering valid {string} and {string}")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password(String username,String password) {
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
	}

	@Then("User should see the LMS Home page.")
	public void user_should_see_the_lms_home_page() {
		lp.validate_login();
		
	}
End Login	
	
//Begin Header
@Given("User is logged on to LMS website")
public void user_is_logged_on_to_lms_website() {
	pre_steps("https://lms-frontend-phase2.herokuapp.com");
	lp.setUserName("LMS");
	lp.setPassword("LMS");
	lp.clickLogin();
}



@Then("User should see a heading with text {string} on the page")
public void user_should_see_a_heading_with_text_on_the_page(String string) {
	lp.validate_login();
}*/

	
	@When("User is on Program page")
	public void user_is_on_program_page()
	
{
		//this.driver = new ChromeDriver();
		this.header = new Header(driver);
		
this.fp = new Footer(driver);
dp= new  Delete(driver);
Sp=new Sprogram(driver);
ep= new Edit(driver);
dp1=new DelProgram(driver);
AnP=new AddNewPrgm(driver);
MpD= new MultipleDele(driver);
		header.clickProgram();
	}

	@Then("User should see the text as {string} below the table.")
	public void user_should_see_the_text_as_below_the_table(String string) {
	   
	fp.validate_Footer();
	//System.out.println("Total rows: "+total_rows);

	}

	@Then("User should see the footer as {string}")
	public void string_string(String string) {
	fp.validate_Footer_total();
	}
//End Header & Footer

//delete
@Then("User should see the Delete button on the top left hand side as Disabled")
public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
   dp.delButton();
}

//NoOfRecords
@Then("Verify that number of program records \\(rows of data in the table) displayed on the page are {int}")
public void verify_that_number_of_program_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	WebElement table =driver.findElement(By.xpath("//table[@role=\"grid\"]//tbody"));
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	if(rows.size()== 5 ) {
		System.out.println("Manage user page has 5 rows");
	}
	else {
		System.out.println("Wrong");
	}
}

//Start Sprogram



@Then(" Text box used for search has text as {string}")
public void Text_box_used_for_search_has_text_as(String sear)
			      {
		 Boolean search2 =  driver.findElement(By.xpath("//input[@placeholder='Search...']")).isDisplayed();
			 if(search2)
						 {
	System.out.println("Search field is visible with text as Search");
						 }
			 else
						 {
		System.out.println("Search field is missing");
						 }
							 }    

@Then("Text box used for search has text as {string}")
public void text_box_used_for_search_has_text_as(String string) {
	String Searchtxt=Sp.TxtSearch();
	System.out.println("text in the searchBox is:" +Searchtxt);
}


@When("User enters {string}  into search box.")
public void user_enters_into_search_box(String name) {
	Sp.EnterName(name);
}

@Then("Entries for {string} are shown.")
public void entries_for_are_shown(String string) {
	List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
	System.out.println("Rows Size: "+rows.size());
}

@When("User enters status as {string} into search box.")
public void user_enters_status_as_into_search_box(String string) {
    
}

@Then("Entries for status as {string} are shown.")
public void entries_for_status_as_are_shown(String string) {
  
}

//End Sprogram

//Begin Edit

@When("User selects Program using checkbox")
public void user_selects_program_using_checkbox() throws InterruptedException {
	ep.Checkbox1();
}

@Then("Program gets selected")
public void program_gets_selected() {
	ep.selectCheckBox();
	
}

@When("User clicks on <Edit> button")
public void user_clicks_on_edit_button() throws InterruptedException {
	ep.checkEdit();
}

@Then("User lands on Program Details form.")
public void user_lands_on_program_details_form() {
	ep.landPpage();
}

@Given("User is on Program Details form")
public void user_is_on_program_details_form() throws InterruptedException {
	ep.checkEdit();
	ep.landPpage();
}

@When("User edits Name and selects the Save button")
public void user_edits_name_and_selects_the_save_button() {
	ep.editName();
	ep.SaveButton();
}

@Then("User can see updated Name")
public void user_can_see_updated_name() {
    
	 WebElement baseTable = driver.findElement(By.tagName("table"));
	  
	 //To find first row of table
	 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[2]"));
     String rowtext = tableRow.getText();
	 System.out.println("First row of table : "+rowtext);
	 
	 if(rowtext.equals("JavaSel")) {
		 System.out.println("text updated successfully");
	 }
	 else {
		 System.out.println("text not updated successfully");
	 Assert.assertEquals(true,false);
	 }
	    
}

@When("User edits Description and selects the Save button")
public void user_edits_description_and_selects_the_save_button() {
	ep.editDescription();
	ep.SaveButton();
}

@Then("User can see updated Description")
public void user_can_see_updated_description() {
	WebElement baseTable = driver.findElement(By.tagName("table"));
	  
	 //To find first row of table
	 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[3]"));
   String rowtext = tableRow.getText();
	 System.out.println("First row of table : "+rowtext);
	 
	 if(rowtext.equals("JSelenium")) {
		 System.out.println("text updated successfully");
	 }
	 else {
		 System.out.println("text updated not successfully");
	 Assert.assertEquals(true,false);
	 }
	 

}

@When("User changes status and selects the Save button")
public void user_changes_status_and_selects_the_save_button() throws InterruptedException {
	ep.RadioStatus();
	ep.SaveButton();
}

@Then("User can see updated program Status")
public void user_can_see_updated_program_status() {
	
	WebElement baseTable = driver.findElement(By.tagName("table"));
	  
	 //To find first row of table
	 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[4]"));
  String rowtext = tableRow.getText();
	 System.out.println("First row of table : "+rowtext);
	 String updateStatus=ep.RadioStatus(rowtext);
	 if(updateStatus.equals("Pass")) {
		 System.out.println("Status updated successfully");
	 }
	 else {
		 System.out.println("Status not updated successfully");
	 Assert.assertEquals(true,false);
	 }
}

@When("User clicks <Cancel> button")
public void user_clicks_cancel_button() throws InterruptedException {
	ep.CancelButton();
}

@Then("User can see Program Details form disappears")
public void user_can_see_program_details_form_disappears() {
    ep.notLandPpage();
    
}

@When("User clicks <Save> button")
public void user_clicks_save_button() throws InterruptedException {
	ep.buttonSave();
}

@Then("User can see {string} message")
public void user_can_see_message(String string) {
	//Assert.assertEqual(Actualmessage, alertMessage);
	dp1.delConfirm();
}

//Begin Delete

@When("User clicks on <Delete> button")
public void user_clicks_on_delete_button() throws InterruptedException {
    dp1.delButton();    
}

@Then("User lands on Program Confirm Deletion form del")
public void user_lands_on_Program_confirm_deletion_form_del() throws InterruptedException {
   dp1.delMessage();
}

@Given("User is on Confirm Deletion form")
public void user_is_on_confirm_deletion_form() throws InterruptedException {
	dp1.delButton();
}

@When("User clicks <Yes> button")
public void user_clicks_yes_button() {
    dp1.delYes();
}

@When("User clicks <No> button")
public void user_clicks_no_button() {
    dp1.delNo();
}

@Then("User can see Confirm Deletion form disappears")
public void user_can_see_confirm_deletion_form_disappears() {
	dp1.delConfirm();
}

//End Delete

// Begin AddNewProgram

@When("User clicks <Save> button without entering data")
public void user_clicks_save_button_without_entering_data() throws InterruptedException {
	AnP.buttonSave();
}

@When("User is on Program Details form to add new program")
public void User_is_on_Program_Details_form_to_add_new_program() {
	AnP.AnewPgmButton();
}

@Then("User gets message {string}")
public void user_gets_message(String string) {
	WebElement msg = driver.findElement(By.xpath("//small[@class='p-invalid ng-star-inserted']"));
	
  if(msg.getText().equals("Name is required.")) {
	  System.out.println("got the message");
  }
  else
  {
	  System.out.println("No msg displayed");
  Assert.assertEquals(true,false);
  }
}
@When("User clicks <A New Program> button")
public void user_clicks_a_new_program_button() {
	AnP.AnewPgmButton();
}


@When("User enters <Name> in name text box")
public void user_enters_name_in_name_text_box() {
    AnP.addPName();
}

@When("User enters <Name> in description text box")
public void user_enters_name_in_description_text_box() {
    AnP.addPDescription();
}

@Then("User can see {string} entered in name")
public void user_can_see_entered_in_name(String string) {
   String nText = AnP.getPName();
   if(nText.isEmpty())
   {
	   System.out.println("Name field is empty");
       Assert.assertEquals(true,false);
	   
   }
   else {
	   System.out.println("Name field is not empty");
   }
}

@Then("User can see {string} entered in description")
public void user_can_see_entered_in_description(String string) {
   String nDescription = AnP.getPDescription();
   if(nDescription.isEmpty())
   {
	   System.out.println("Description field is empty");
       Assert.assertEquals(true,false);
	   
   }
   else {
	   System.out.println("Description field is not empty");
   }
}

@When("User selects <Status> using radiobutton")
public void user_selects_status_using_radiobutton() {
   AnP.addStatus();
}

@Then("User can see {string} status selected")
public void user_can_see_status_selected(String string) {
    if(AnP.getStatus())
    {
 	   System.out.println("Status is enabled");
 	   
    }
    else {
 	   System.out.println("Status is not enabled");
       Assert.assertEquals(true,false);
    }
}

@When("User clicks <Save> button on add new program")
public void user_clicks_save_button_on_add_new_program() throws InterruptedException {
	AnP.addPName();
	AnP.addPDescription();
	AnP.addStatus();
	AnP.buttonSave();
}

@Then("User gets message 'Successful Program created' on add new program")
public void user_gets_successful_message() {
	AnP.statusMsg();
}



@When("User clicks <Cancel> button on add new program")
public void user_clicks_Cancel_button_on_add_new_program() throws InterruptedException {
	AnP.addPName();
	AnP.addPDescription();
	AnP.addStatus();
	AnP.buttonCancel();
}
//End AddNewPrgm

//begin pagination

@When("User is on first page of Manage Program")
public void user_is_on_first_page_of_manage_batch() 
{
   boolean isSelc = driver.findElement(By.xpath("//button[text()='1']")).isEnabled();
   if(isSelc)
   {
	   System.out.println("User is on First Page of Manage program");
   }
   else
   {
	   System.out.println("User is not on First Page of Manage program");
		Assert.assertEquals(true,false);
   }
}

@Then("Verify that previous program link is disabled")
public void verify_that_previous_program_link_is_disabled() 
{
   boolean isEnble =  driver.findElement(By.xpath("//button[@disabled][2]")).isEnabled();
   
   if(isEnble)
   {
	   System.out.println("Previous Link button is Enabled");
		Assert.assertEquals(true,false);
   }
   else
   {
	   System.out.println("Previous Link button is Disabled");
   }
}

@Given("User is on the program page number {string}")
public void user_is_on_the_program_page_number(String string)
{
	//driver.findElement(By.xpath("//button[text()='1']")).click();
	//System.out.println("User is on Page Number 1");
	   boolean isSelc = driver.findElement(By.xpath("//button[text()='1']")).isEnabled();
	   if(isSelc)
	   {
		   System.out.println("User is on Page Number 1");
	   }
	   else
	   {
		   System.out.println("User is not  on Page Number 1");
			Assert.assertEquals(true,false);
	   }
	   
}

@When("User clicks program navigate > button")
public void user_clicks_program_navigate_fwd_button() 
{
   driver.findElement(By.xpath("//button/span[@class='p-paginator-icon pi pi-angle-right']")).click();
}

@Then("User navigated to program page number {string}")
public void user_navigated_to_program_page_number(String string) 
{
	 boolean isSelc = driver.findElement(By.xpath("//button[text()='2']")).isEnabled();
	   if(isSelc)
	   {
		   System.out.println("User is on Page Number 2");
	   }
	   else
	   {
		   System.out.println("User is not  on Page Number 2");
			Assert.assertEquals(true,false);
	   }
}

@Given("User is on program page number {string}")
public void user_is_on_program_page_number(String string)
{
	driver.findElement(By.xpath("//button[text()='2']")).click();
				
	boolean isEnab = driver.findElement(By.xpath("//button[text()='2']")).isEnabled();
    if(isEnab)
    {
    	System.out.println("User is on Page Number 2");
    }
    else
    {
    	System.out.println("User is not on Page Number 2");
    	Assert.assertEquals(true,false);
    }
}

@When("User clicks program navigate < button")
public void user_clicks_program_navigate_backbutton ()throws InterruptedException 
{
	Thread.sleep(3000);
	
	WebElement ele = driver.findElement(By.xpath("//button/span[@class='p-paginator-icon pi pi-angle-left']"));
	JavascriptExecutor exe =(JavascriptExecutor)driver;
	exe.executeScript("arguments[0].click()", ele);
}

@Then("User navigated to program page number {int}")
public void user_navigated_to_program_page_number(Integer int1)
{

    boolean isSelc = driver.findElement(By.xpath("//button[text()='1']")).isEnabled();
	   if(isSelc)
	   {
		   System.out.println("User is navigated to Page Number 1");
	   }
	   else
	   {
		   System.out.println("User is not navigated to Page Number 1");
			Assert.assertEquals(true,false);
	   }
	   
}

@When("User is on last page of Manage Program")
public void user_is_on_last_page_of_manage_batch()
{
    WebElement elem = driver.findElement(By.xpath("//span[@class='p-paginator-icon pi pi-angle-double-right']"));
    JavascriptExecutor exec =(JavascriptExecutor)driver;
    exec.executeScript("arguments[0].click()", elem);
    System.out.println("User is on Last Page Of Manage program ");
    
    /*boolean isSelc = driver.findElement(By.xpath("//button[@disabled][2]")).isEnabled();
	   if(isSelc)
	   {
		   System.out.println("User is not on Last Page Of Manage program ");
		   Assert.assertEquals(true,false);
	   }
	   else
	   {
		   System.out.println("User is on Last Page Of Manage program ");
	   }*/
}

@Then("Verify that program next link is disabled")
public void verify_that_program_next_link_is_disabled() 
{
    boolean isEn = driver.findElement(By.xpath("//button[@disabled][2]")).isEnabled();
    if(isEn)
    {
    	System.out.println("Next Link is Enabled");
    	 Assert.assertEquals(true,false);
    }
    else
    {
    	System.out.println("Next Link is Disabled");
    }
}

//Ascending

	@When("User clicks on the Ascending arrow down near to the Program name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_Program_name() throws InterruptedException 
	{
	   
		driver.findElement(By.xpath("//thead/tr/th[2]//p-sorticon")).click();
		System.out.println("Program Name Ascending Clicked");
		Thread.sleep(1000);
	}	
	@Then("User can see the results in Ascending order of Program name")
	public void user_can_see_the_results_in_ascending_order_of_Program_name() throws InterruptedException
	{
		//System.out.println("User can see Results in Ascending Order");
		//Thread.sleep(5000);
		List<WebElement> tdList = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
		String strArry [] = new String[tdList.size()];
		for(int i=0;i < tdList.size();i++)
		{
			strArry[i]=tdList.get(i).getText();
		}
		
		boolean sortFunctionality = true;
		outer: 
		for(int i=0;i < strArry.length;i++)
		{
			for(int j=i+1;j < i;j++)
			{
				int result = strArry[j].compareTo(strArry[i]);
				if(!(result > 0))
				{
						System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry[i]);
						sortFunctionality=false;
						break outer;
				}
				else
				{
					 System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry[i]);
				}
			}
		}
		
		
		if(sortFunctionality)
		{
			System.out.println("Ascending SORT Functionality is working");
		}
		else
		{
			System.out.println("Ascending SORT Functionality is not working");
			Assert.assertEquals(true,false);
		}
	}
	
	@When("User clicks on the Ascending arrow down near to the Program Description")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_Program_description() 
	{
		driver.findElement(By.xpath("//thead/tr/th[3]//p-sorticon")).click();
		System.out.println("Program Description Ascending Clicked");
	}

	@Then("User can see the results in Ascending order of Program Description")
	public void user_can_see_the_results_in_ascending_order_of_Program_description() 
	{
		List<WebElement> tdList = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
		String strArry [] = new String[tdList.size()];
		for(int i=0;i < tdList.size();i++)
		{
			strArry[i]=tdList.get(i).getText();
		}
		
		boolean sortFunctionality = true;
		outer: 
		for(int i=0;i < strArry.length;i++)
		{
			for(int j=i+1;j < i;j++)
			{
				int result = strArry[j].compareTo(strArry[i]);
				if(!(result > 0))
				{
						System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry[i]);
						sortFunctionality=false;
						break outer;
				}
				else
				{
					 System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry[i]);
				}
			}
		}
		
		
		if(sortFunctionality)
		{
			System.out.println("Program Description Ascending SORT Functionality is working");
		}
		else
		{
			System.out.println("Program Description Ascending SORT Functionality is not working");
			Assert.assertEquals(true,false);
		}
	}
	
	@When("User clicks on the Ascending arrow down near to the Program Status")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_Program_status() 
	{
		driver.findElement(By.xpath("//thead/tr/th[4]//p-sorticon")).click();
		System.out.println("Program Status Ascending Clicked");
	}

	@Then("User can see the results in Ascending order of Program Status")
	public void user_can_see_the_results_in_ascending_order_of_Program_status()
	{
		List<WebElement> tdList = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td[4]"));
		String strArry [] = new String[tdList.size()];
		for(int i=0;i < tdList.size();i++)
		{
			strArry[i]=tdList.get(i).getText();
		}
		
		boolean sortFunctionality = true;
		outer: 
		for(int i=0;i < strArry.length;i++)
		{
			for(int j=i+1;j < i;j++)
			{
				int result = strArry[j].compareTo(strArry[i]);
				if(!(result > 0))
				{
						System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry[i]);
						sortFunctionality=false;
						break outer;
				}
				else
				{
					 System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry[i]);
				}
			}
		}
		
		
		if(sortFunctionality)
		{
			System.out.println("Program Status Ascending SORT Functionality is working");
		}
		else
		{
			System.out.println("Program Status Ascending SORT Functionality is not working");
			Assert.assertEquals(true,false);
		}
	}
//End Ascending	
	
	//Descending

		@When("User clicks on the Descending arrow down near to the Program name")
		public void user_clicks_on_the_Descending_arrow_down_near_to_the_Program_name() throws InterruptedException 
		{
		   
			driver.findElement(By.xpath("//thead/tr/th[2]//p-sorticon")).click();
			driver.findElement(By.xpath("//thead/tr/th[2]//p-sorticon")).click();
			System.out.println("Program Name Descending Clicked");
			Thread.sleep(1000);
		}	
		@Then("User can see the results in Descending order of Program name")
		public void user_can_see_the_results_in_Descending_order_of_Program_name() throws InterruptedException
		{
			//System.out.println("User can see Results in Descending Order");
			//Thread.sleep(5000);
			List<WebElement> tdList = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
			String strArry [] = new String[tdList.size()];
			for(int i=0;i < tdList.size();i++)
			{
				strArry[i]=tdList.get(i).getText();
			}
			
			boolean sortFunctionality = true;
			outer: 
			for(int i=0;i < strArry.length;i++)
			{
				for(int j=i+1;j < i;j++)
				{
					int result = strArry[j].compareTo(strArry[i]);
					if(!(result > 0))
					{
							System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry[i]);
							sortFunctionality=false;
							break outer;
					}
					else
					{
						 System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry[i]);
					}
				}
			}
			
			
			if(sortFunctionality)
			{
				System.out.println("Descending SORT Functionality is working");
			}
			else
			{
				System.out.println("Descending SORT Functionality is not working");
				Assert.assertEquals(true,false);
			}
		}
		
		@When("User clicks on the Descending arrow down near to the Program Description")
		public void user_clicks_on_the_Descending_arrow_down_near_to_the_Program_description() 
		{
			driver.findElement(By.xpath("//thead/tr/th[3]//p-sorticon")).click();
			driver.findElement(By.xpath("//thead/tr/th[3]//p-sorticon")).click();
			System.out.println("Program Description Descending Clicked");
		}

		@Then("User can see the results in Descending order of Program Description")
		public void user_can_see_the_results_in_Descending_order_of_Program_description() 
		{
			List<WebElement> tdList = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
			String strArry [] = new String[tdList.size()];
			for(int i=0;i < tdList.size();i++)
			{
				strArry[i]=tdList.get(i).getText();
			}
			
			boolean sortFunctionality = true;
			outer: 
			for(int i=0;i < strArry.length;i++)
			{
				for(int j=i+1;j < i;j++)
				{
					int result = strArry[j].compareTo(strArry[i]);
					if(!(result > 0))
					{
							System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry[i]);
							sortFunctionality=false;
							break outer;
					}
					else
					{
						 System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry[i]);
					}
				}
			}
			
			
			if(sortFunctionality)
			{
				System.out.println("Program Description Descending SORT Functionality is working");
			}
			else
			{
				System.out.println("Program Description Descending SORT Functionality is not working");
				Assert.assertEquals(true,false);
			}
		}
		
		@When("User clicks on the Descending arrow down near to the Program Status")
		public void user_clicks_on_the_Descending_arrow_down_near_to_the_Program_status() 
		{
			driver.findElement(By.xpath("//thead/tr/th[4]//p-sorticon")).click();
			driver.findElement(By.xpath("//thead/tr/th[4]//p-sorticon")).click();
			System.out.println("Program Status Descending Clicked");
		}

		@Then("User can see the results in Descending order of Program Status")
		public void user_can_see_the_results_in_Descending_order_of_Program_status()
		{
			List<WebElement> tdList = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td[4]"));
			String strArry [] = new String[tdList.size()];
			for(int i=0;i < tdList.size();i++)
			{
				strArry[i]=tdList.get(i).getText();
			}
			
			boolean sortFunctionality = true;
			outer: 
			for(int i=0;i < strArry.length;i++)
			{
				for(int j=i+1;j < i;j++)
				{
					int result = strArry[j].compareTo(strArry[i]);
					if(!(result > 0))
					{
							System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry[i]);
							sortFunctionality=false;
							break outer;
					}
					else
					{
						 System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry[i]);
					}
				}
			}
			
			
			if(sortFunctionality)
			{
				System.out.println("Program Status Descending SORT Functionality is working");
			}
			else
			{
				System.out.println("Program Status Descending SORT Functionality is not working");
				Assert.assertEquals(true,false);
			}
		}
//End Descending	
		
//Begin Multiple Deletion pgm
		

@When("User selects more than one Program using checkbox")
public void user_selects_more_than_one_program_using_checkbox() {
    MpD.clickCheck1();
    MpD.clickCheck2();
    
}

@Then("Programs get selected")
public void programs_get_selected() {
	if(MpD.checkboxSelected()) {
		System.out.println("Both CheckBox are selected");
	}
	else {
		System.out.println("CheckBoxes are not selected");
		Assert.assertEquals(true,false);
	}
}


@When("User clicks on <Delete> button on top left corner")
public void user_clicks_on_delete_button_on_top_left_corner() {
	MpD.clickCheck1();
    MpD.clickCheck2();
    MpD.clickDelete();
}

@Then("User lands on Program Confirm Deletion form.")
public void user_lands_on_Program_confirm_deletion_form() throws InterruptedException {
	MpD.delMessage();
}

@Given("User is on Program Confirm Deletion form")
public void user_is_on_Program_confirm_deletion_form() throws InterruptedException {
	dp1.delButton();
}

@After
public void post_steps() {
	//driver.close();
}

}
