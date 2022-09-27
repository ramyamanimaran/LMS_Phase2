package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserPage;

public class StepsUser extends BaseClass {
	
	
		
		/*@Given("User opens url {string}")
		public void  user_opens_url(String url) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayesha\\eclipse-workspace\\LMS_Phase2\\src\\test\\resources\\drivers\\chromedriver.exe");	
			driver = new ChromeDriver(); 
			 
		 up =new UserPage(driver);
		 
			driver.get(url);
				
			
		}
		@Then("user enters userName as {string} and password as {string}")
		public void user_enters_username_as_(String name, String pass)
		{
			up.setUserName(name);
			up.setPassword(pass);
		}
		
		@And("clicks on Login")
		public void clicks_on_login() throws InterruptedException {
			
			up.clickLogin();
		     
		}*/
		
		@Given("User is on any page after Login")
		public void user_is_on_any_page_after_login() throws InterruptedException {
		Thread.sleep(1000);
		//driver.navigate().to("https://lms-frontend-phase2.herokuapp.com/");
		}
		
		@When("User clicks the Tab {string}")
		public void user_clicks_the_tab(String userclick) {
			up =new UserPage(driver);
			 
		    up.clickonuser();
		}
		@Then("User should see the Manage user page")
		public void user_should_see_the_manage_user_page() {
			
		
				if(driver.getCurrentUrl().equalsIgnoreCase("https://lms-frontend-phase2.herokuapp.com/user")){
					
			         System.out.println("User should be on Manage User page"); 
			      } else { 
			         System.out.println("Test Failed and user is not on manage user page"); 
			      } 
			      //driver.close(); 
			 	}
		
		@When("User is on the Manage user page after clicking User Tab")
		public void user_is_on_the_manage_user_page_after_clicking_user_tab() {
			up.clickonuser();
			//driver.navigate().to("https://lms-frontend-phase2.herokuapp.com/user");
		    
		}
		@Then("User should see the page heading as {string}")
		public void user_should_see_the_page_heading_as(String str) {
			
			if(driver.getPageSource().contains("Manage User"))
			{
				System.out.println("User is on Manage User page");
			}
			else 
			{
			Assert.assertEquals(true, false);
			}
		}
		@Then ("User should see the pagination controls below data table")
		public void user_should_see_the_pagination_controls_below_data_table()
		{
		
			Boolean pagination = driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/button")).isDisplayed();
			if(pagination)
			
			{
				System.out.println("pagination controls present");
			
			}
			else
			{
				System.out.println("pagination controls not present");
			}

			
		}
		@Given("User is on Manage user page")
		public void user_is_on_manage_user_page() {
			up.clickonuser();
		    //driver.navigate().to("https://lms-frontend-phase2.herokuapp.com/user");
		}

		@When("Manage user table has less less than or equal to {int} rows")
		public void manage_user_table_has_less_less_than_or_equal_to_rows(Integer int1) {
		    
			
			WebElement table = driver.findElement(By.xpath("//table[@role='grid']/tbody"));
			List<WebElement> rowcount = table.findElements(By.tagName("tr"));
			int rows = rowcount.size();
			System.out.println("total number of rows are:" +  rows);
		if(rows<=int1) {
			System.out.println("pagination controls are disabled");
		}
		else
		{
			System.out.println("pagination controls are enabled");
		}
		} 

		@Then("Pagination control should be disabled")
		public void pagination_control_should_be_disabled() {
			
			Boolean paginationcontrols = driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']")).isSelected();
			if(paginationcontrols)
			{
				System.out.println("Enabled");
			}
			else
			{
				System.out.println("It is disabled");
			}
		    
		}
		@When("Manage user table has more than {int} rows")
		public void manage_user_table_has_more_than_rows(Integer int2) {
			WebElement table = driver.findElement(By.xpath("//table[@role='grid']/tbody"));
			List<WebElement> rowcount = table.findElements(By.tagName("tr"));
			int totrows = rowcount.size();
			if(totrows>=int2) 
			{
				System.out.println("pagination controls are enabled");
			}
			else
			{
				System.out.println("pagination controls are disabled");
			}
			} 
		@Then("Pagination control should be enabled")
		public void pagination_control_should_be_enabled() {
			
			Boolean paginationcontrols = driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']")).isSelected();
			if(paginationcontrols)
			{
				System.out.println("Enabled");
			}
			else
			{
				System.out.println("It is disabled");
			}
		}
			
			@Given("User table is displayed in manage user page")
			public void user_table_is_displayed_in_manage_user_page() {
			    up.clickonuser();
			}
		
			@When("User clicks next link of pagination")
			public void user_cliks_next_link_of_pagination() {
				
				WebElement click = driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button/../../button[3]"));
				if(click.isEnabled())
				{
					System.out.println("clicks next");
				}
				else
				{
					System.out.println("Unable to click next");
				}
			}
			@Then("Next page should be displayed")
			public void next_page_should_be_displayed() {
			
				boolean pageclick = driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button/../../button[3]")).isEnabled();
				 
				if(pageclick)
				{
					
					System.out.println("clicks next");	
				}
			
				{
					System.out.println("unable to click next");
				}
			}
		    
			@Given("last page of User records are displayed")
			public void last_page_of_user_records_are_displayed() {
				up.clickonuser();
		
				int paginationsize = driver.findElements(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button")).size();
				//List<String> names = new ArrayList<String>();
				
				for(int i=1;i<paginationsize; i++)
				{
					String paginationselector = "//span[@class='p-paginator-pages ng-star-inserted']/button["+i+"]";
					driver.findElement(By.xpath(paginationselector)).click();
				}
				int totalpages = paginationsize;
				System.out.println("total number of pages are:" + totalpages );
				System.out.println("Lastpage of User records displayed");
				}
			
			@Then("Next link of pagination should be disabled")
			public void next_link_of_pagination_should_be_disabled() {
				
				
					String paginationselector = "//span[@class='p-paginator-pages ng-star-inserted']/../button[4]";
					//driver.findElement(By.xpath(paginationselector)).click();
					WebElement n = driver.findElement(By.xpath(paginationselector));
					if(n.isEnabled())
					{
					System.out.println("goes to next page if enabled");
					}
					else
					{
						System.out.println("Next link is disabled");
					}
						
					
				}
			@When("User cliks previous link of pagination")
			public void user_cliks_previous_link_of_pagination() {
				
				WebElement click = driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button/../../button[2]"));
				//click.click();
				if(click.isEnabled())
				{
					System.out.println("clicks previous link");
				}
				else
				{
					System.out.println("Unable to click previous link");
				}
			    
			}
			@Then("previous page should be displayed")
			public void previous_page_should_be_displayed() {
				

				WebElement pageclick = driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button/../../button[2]"));
				//pageclick.click();
				if(pageclick.isEnabled())
				{	
					System.out.println("clicks previous link");	
				}
			
				{
					System.out.println("unable to click previous");
				}
			}
			@Given("First page of user table is displayed")
			public void first_page_of_user_table_is_displayed() {
			   up.clickonuser();
			    driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button")).click();
			    
			}
			@Then("Previous link of pagination should be disabled")
			public void previous_link_of_pagination_should_be_disabled() {
				
				WebElement pageclick = driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button/../../button[2]"));
				//pageclick.click();
				if(pageclick.isEnabled())
				{	
					System.out.println("clicks previous link");	
				}
			
				{
					System.out.println("unable to click previous");
				}
			 
			}
			@When("User clicks << icon in pagination")
			public void user_clicks_icon_in_pagination() {
				
				WebElement click1 = driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button/../../button[2]"));
				if(click1.isEnabled())
				{	
					System.out.println("<< clicks on previous icon");	
				}
			
				{
					System.out.println("unable to click");
				}
			}
			@Then("User should see the First page of the table")
			public void user_should_see_the_first_page_of_the_table() {
				//WebElement click1 = driver.findElement(By.xpath("//span[@class='p-paginator-current ng-star-inserted']/../button[3]"));
				WebElement click2 = driver.findElement(By.xpath("//span[@class='p-paginator-current ng-star-inserted']/../button[1]"));
				if(click2.isEnabled())
				//click1.click();
				//click2.click();
				{	
					System.out.println("goes to first page");	
				}  
			}
			    
			@When("User clicks >> icon in pagination")
			public void user_clicks_icon_in_pagination2() {
				
				WebElement click3 = driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button/../../button[4]"));
				if(click3.isEnabled())
				{	
					System.out.println(">> clicks >> icon");	
				}
				else
				{
					System.out.println("unable to click");
				}
			   
			}
			@Then("User should see the last page of the table")
			public void user_should_see_the_last_page_of_the_table() {
				WebElement click4 = driver.findElement(By.xpath("//span[@class='p-paginator-current ng-star-inserted']/../button[4]"));
				if(click4.isEnabled())
				{	
					System.out.println("goes to last page");	
				}  
				else
				{
					System.out.println("element disabled");
			}
			}
			
			@Given("User is logged on to the LMS website")
			public void user_is_logged_on_to_the_lms_website() throws InterruptedException {
				Thread.sleep(1000);
			}
			@When("User lands on Manage User page")
			public void user_lands_on_manage_user_page() throws InterruptedException {
				Thread.sleep(1000);
			 up.clickonuser();   
			}
			@Then("User should see the text  {string} below the user table.")
			public void user_should_see_the_text_beow_the_user_table(String t) {
				{
					WebElement text2 = driver.findElement(By.xpath("//div/mat-card//p-table/div/p-paginator/div/span[1]"));
					if(text2.isDisplayed());
					{
						System.out.println("text displayed is: " + text2.getText());
					}
				}
			}
			//@Then("User should see the table footer as \"In total there are 4 users\".")
			
			@When("User lands on Manage User page1")
			public void user_lands_on_manage_user_page1() throws InterruptedException {
					 
				//Thread.sleep(1000);
				up.clickonuser();
				//div//p-table/div/div[2]/div
				//div//p-table/div/div[2]/div"
				//div/mat-card//p-table/div/p-paginator/div/span[1]
			}	
			@Then("User should see the table footer as {string}.")
			public void User_should_see_the_table_footer_as(String foot)
			{
				//JavascriptExecutor js= (JavascriptExecutor)driver;
				//js.executeScript("window.scroll(0,2000)");
				WebElement footer = driver.findElement(By.xpath("//div//p-table/div/div[2]/div"));
				System.out.println("User sees footer as: " +footer.getText());	
				
			}
			
			@Then("User should see the button with text {string}")
			public void user_should_see_the_button_with_text_(String Button)
			{
			WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Add New User')]"));
			String button1= button.getText();
			if(button1.contains("Add New User"))
					{
				System.out.println("Displays : " +button1);
					}
			else 
			{
				System.out.println("Button is not displayed");
					
				}
			}
			
	@When("User clicks Add New User button")
			public void user_clicks_add_new_user_button(){
			
			    up.clickonAddUser();
			}
		
		
			@Then("User should see the {string} dialog box")
			public void user_should_see_the_dialog_box(String Ud) {
				
				String ud = driver.findElement(By.xpath("//span[contains(text(),'User Details')]")).getText();
					System.out.println("Displays User Details" +ud);
				}
				
			@Then("User should see the table header as {string}")
			public void then_user_should_see_the_table_header_as(String AlHead)
			{
				List<WebElement> allHeader = driver.findElements(By.xpath("//table[@role='grid']/thead/tr/th"));
				System.out.println("Header in table are below: ");
				System.out.println("Total headers are:" +allHeader.size());
				for(WebElement header:allHeader)
				{
					System.out.println(header.getText());
				}
				
			}
			
			@When("User clicks sort icon in table header")
			public void user_clicks_sort_icon_in_table_header() {
				up.clickonsorticon();
				
			   
			}
			@Then("Table rows should be sorted")
			public void table_rows_should_be_sorted() 
			{
				List<WebElement> colname= driver.findElements(By.xpath("//table[@role='grid']/tbody/tr[i]/td[2]"));
				String[] beforesort = new String[colname.size()];
				for(int i=0;i<colname.size();i++)
				{
					beforesort[i]=colname.get(i).getText();
					System.out.println(beforesort[i]);
					System.out.println(colname);
				}	
			System.out.println("sorted and displayed in ascending order");
			up.clickonsorticon();
			System.out.println("sorted and displayed in descending order");
			
			}
			@When("User checks empty checkbox in header")
			public void user_checks_empty_checkbox_in_header() throws InterruptedException {
			    Thread.sleep(2000);
				up.clickcheckbox();
				Thread.sleep(1000);
			}
			@Then("Check box in all the rows of user table should be checked")
			public void check_box_in_all_the_rows_of_user_table_should_be_checked() throws InterruptedException 
			{
				
			 Boolean check = driver.findElement(By.xpath("(//div[@class='p-checkbox-box p-highlight'])")).isDisplayed();
			  
			  	if(check)
			  			{
			  				System.out.println("Checkboxes are selected");
			  			}
			  			else
			  			{
			  				System.out.println("Checkboxes are not selected");
			  			}
			}

			  	@When("User unchecks checkbox in header")
			  	public void user_unchecks_checkbox_in_header() throws InterruptedException {
			  	   up.clickcheckbox();
			  	   Thread.sleep(2000);
			  	   up.clickcheckbox();
			  	}
			  	@Then("Check box in all the rows of user table should be unchecked")
			  	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
			  		 Boolean check = driver.findElement(By.xpath("(//div[@role='checkbox'])[1]")).isDisplayed();
					  	 if(check)
					  			{
					  				System.out.println("Checkboxes are unchecked");
					  			}
					  			else
					  			{
					  				System.out.println("Checkboxes are selected");
					  			}	  	 
			 
			  	}
			  	
			  	@Then("User should see the delete icon at the top left corner of the user table")
			  	public void User_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table()
			  	{
			  		
			  		Boolean delete = driver.findElement(By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']")).isDisplayed();
			  		if(delete)
			  		{
			  			System.out.println("Delete icon present");
		  			}
		  			else
		  			{
		  				System.out.println("Delete icon not present");
		  			}	  	 
			  		}
			  	
			  	@When("no rows is checked")
			  	public void no_rows_is_checked() 
			  	{
			  		Boolean norows = driver.findElement(By.xpath("(//div[@role='checkbox'])[1]")).isDisplayed();
			  		if(norows)
			  		{
			  			System.out.println("no rows are checked");
		  			}
		  			else
		  			{
		  				System.out.println("rows are checked");
		  			}	  	 
			  		}
			  	
			  	@Then("Delete icon at the top left corner of the user table disabled")
			  	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() 
			  	{
			  		Boolean delete = driver.findElement(By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']")).isEnabled();
			  		if(delete)
			  		{
			  			System.out.println("Delete icon enabled");
		  			}
		  			else
		  			{
		  				System.out.println("Delete icon is disabled");
		  			}	  	 
			  		}
			  	
			  	
			  	@When("User checks the rows in user table")
			  	public void user_checks_the_rows_in_user_table() throws InterruptedException 
			  	{
			  		up.clickonuser();
			  		Thread.sleep(1000);
			  	   up.clickcheckbox();
			  	   Thread.sleep(1000);
			  	}
			  	@Then("Delete icon at the top left corner of the user table enabled")
			  	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() 
			  	{
			  		
			  		Boolean delete = driver.findElement(By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']")).isEnabled();
			  		if(delete)
			  		{
			  			System.out.println("Delete icon enabled");
		  			}
		  			else
		  			{
		  				System.out.println("Delete icon is disabled");
		  			}	  	 
			  		}
			  	@When("User clicks the delete icon at the top left corner of user table")
			  	public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() throws InterruptedException {
			  	   Thread.sleep(1000);
			  		//up.clickcheckbox();
			  	    Thread.sleep(1000);
			  		up.clickDeleteicon();
			  			  		
			  	}
			  		@Then("Are you sure you want to delete the selected Users? button with text {string} the button with text {string} and close\\(X) icon")
			  		public void are_you_sure_you_want_to_delete_the_selected_users_button_with_text_the_button_with_text_and_close_x_icon(String y, String n){
			  		
			  		//String dialog = driver.findElement(By.xpath("//div[@class='ng-trigger ng-trigger-animation ng-tns-c133-15 p-dialog p-confirm-dialog p-component ng-star-inserted']")).getText();
				  		
				  		if(driver.getPageSource().contains("Are you sure you want to delete the selected Users?"))
				  					{
				  					System.out.println("user is on confirm deletion page");
				  				}
				  		else
				  		{
				  			Assert.assertEquals(true, false);
				  		}
			  		}
			  		
			  		@Given("User is in confirm dialog box after clicking delete icon")
			  		public void user_is_in_confirm_dialog_box_after_clicking_delete_icon() throws InterruptedException {
			  		  up.clickonuser();
			  		  Thread.sleep(1000);
			  			up.clickcheckbox();
			  			Thread.sleep(1000);
			  			up.clickDeleteicon();
			  		}
			  		@When("User clicks button with text {string}")
			  		public void user_clicks_button_with_text(String yes) {
			  			
			  		  up.delYes();
			  		}
			  		
			  		@Then("Selected rows should be deleted and popup should be shown with success message {string}")
			  		public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String yes) {
			  			
			  			try {
			  					
			  					 // Switching to Alert        
			  			        Alert alert = driver.switchTo().alert();		
			  			        		
			  			        // Capturing alert message.    
			  			        String alertMessage= alert.getText();		
			  			        		
			  			        // Displaying alert message		
			  			        System.out.println("alertMessage: "+alertMessage);	
			  			        }
			  			        catch(Exception e)
			  			        {
			  			        	
			  			        }
			  		}
			  			
			  			@When("User clicks button with text as {string}")
				  		public void user_clicks_button_with(String no) throws InterruptedException {
				  			
			  				//Thread.sleep(1000);
				  		  up.delNo();
				  		}
			  		@Then("Selected rows should not be deleted and dialog box should be closed")
			  		public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
			  			
		  			        System.out.println("dialog box is closed");	
		  			        
		  		} 
			  		
			  		@When("User clicks the close\\(x) icon")
			  		public void user_clicks_the_close_x_icon() {
			  		up.closeBtn();
			  		}
			  		@Then("Confirm dialog box should be closed")
			  		public void confirm_dialog_box_should_be_closed() throws InterruptedException {
			  			
			  			//Thread.sleep(5000);
			  			Boolean b = driver.findElement(By.xpath("//button[@ng-reflect-ng-class='p-confirm-dialog-reject']")).isDisplayed();
	  					if(b)
			  					{
	  					System.out.println("confirm Dialog box is not closed");
	  				}
	  		else
	  		{
	  			System.out.println("confirm Dialog box is closed");
	  		}
			  		}
			  @Then("User should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
			  public void user_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() throws InterruptedException {

					
				
				  Thread.sleep(1000);
					 Boolean check1= driver.findElement(By.xpath("//table[@role='grid']/tbody/tr/td[8]//button")).isDisplayed();
				
					
				  if(check1)
				  			{
				  				System.out.println("Edit & Delete buttons are present in each row");
				  			}
				  			else
				  			{
				  				System.out.println("Edit & Delete buttons not available in each row");
				  			}	  	 
			  }		  
				  
	          @When("User clicks delete button")
				  public void user_clicks_delete_button() throws InterruptedException {
				  { 
	        	  Thread.sleep(1000);
		up.clickDeleteinrow();
					  }
	          }
				      
				      @Then("Confirm dialog box should be displayed with Text {string}")
				      public void confirm_dialog_box_should_be_displayed_with_text(String string) {
				          
				    		if(driver.getPageSource().contains("Are you sure you want to delete"))
		  					{
		  					System.out.println("user is on confirm deletion page");
		  				}
		  		else
		  		{
		  			Assert.assertEquals(true, false);
		  		}
	  		} 
				      @When("User clicks Edit button")
				      public void user_clicks_edit_button() throws InterruptedException {
				    	  Thread.sleep(1000);
				    	  up.clickEditinrow();
				          
				      }
				      @Then("{string} dialog box should be displayed for editing")
				      public void dialog_box_should_be_displayed_for_editing(String string) {
				      
				    		if(driver.getPageSource().contains("User Details"))
		  					{
		  					System.out.println("User Details dialog box opens");
		  				}
		  		else
		  		{
		  			Assert.assertEquals(true, false);
		  		}
				      }
				      @Then("User should see the Search input field after the delete icon")
				      public void user_should_see_the_search_input_field_after_the_delete_icon() {
				         
				    Boolean search1= driver.findElement(By.xpath("//span[@class='p-input-icon-left']")).isDisplayed();
						 
					 if(search1)
					 {
					System.out.println("Search field is visible");
					 }
					 else
					 {
					System.out.println("Search field is missing");
					 }
						 }
				      
		 @Then("User should see the search input field with search icon and text as {string}")
	 public void user_should_see_the_search_input_field_with_search_icon_and_text_as_(String sear)
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
				     @When("User types Name to search")
				     public void user_types_name_to_search()
				     {
				    	 up.clicksearch();
				     }

				    @Then("Rows with the name should be displayed")
				    public void rows_with_the_name_should_be_displayed() throws InterruptedException
				    {
				        {
					    	Thread.sleep(1000);
					    	WebElement table = driver.findElement(By.xpath("//table[@role='grid']/tbody"));
					    	List<WebElement> rowsList =table.findElements(By.tagName("tr"));
					    	List<WebElement> columnsList = null;
					    	for(WebElement row: rowsList)
					    	{
					    	 columnsList = row.findElements(By.tagName("td"));
					    		for (WebElement column: columnsList)
					    		{
					    			String result = column.getText();
					    			if(result.contains("Smith"))
					    			{
					    				System.out.println("Search results are wrong for input John");
					    			}
					    			else
					    			{
					    				System.out.println("search results are correct ");
					    			}
					    			
					    			
					    		}
				    }
				        }
				    }

	@When("User types random text in search field which has no matching entry")
	public void user_types_random_text_in_search_field_which_has_no_matching_entry() {
	    up.wrongsearch();
	}
	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
		if(driver.findElement(By.xpath("//span[@class='p-paginator-current ng-star-inserted']")).isDisplayed())
			 {
		 System.out.println("No rows are displayed");
	 }
	 else
	 {
		 System.out.println("some rows are displayed");
	 }
	}

	@When("User clicks ID in any row")
	public void user_clicks_id_in_any_row() throws InterruptedException {
		Thread.sleep(1000);
	up.clickid();
	}
	@Then("User details dialog box displayed with user information")
	public void user_details_dialog_box_displayed_with_user_information() throws InterruptedException {
	   Thread.sleep(1000);
	   
	   if (driver.getPageSource().contains("Linkedin URL"))
		
		{
			 System.out.println("User details dialog box appears");
		 }
		 else
		 {
			 System.out.println("No dialog box opens");
		 }
		}




	@When("User clicks A Add new user button")
	public void user_clicks_a_add_new_user_button() throws InterruptedException {
	   Thread.sleep(1000);
	 up.clickAddnew();
	}
	   
	   
	   @Then("User should see User details window with heading {string}")
	public void user_should_see_user_details_window_with_heading(String userdet) {
	    
		   String ud = driver.findElement(By.xpath("//div[@class='p-dialog-header ng-tns-c132-6 ng-star-inserted']")).getText();
		   if(ud.equals("User Details"))
		   {
			   System.out.println("User details window appears with heading as User Details");
		   }
		   else 
		   {
			   System.out.println("Doesnot appear");
		   }
	}

	   @Then("User should see a button with text Cancel in user details window")
	   public void user_should_see_a_button_with_text_cancel_in_user_details_window() {
	     
		   Boolean cancel = driver.findElement(By.xpath("//div[@class='p-dialog-header ng-tns-c132-6 ng-star-inserted']")).isDisplayed();
		   if(cancel)
		   {
			   System.out.println("Cancel button appears");
		   }
		   else 
		   {
			   System.out.println("Doesnot appear");
		   }
	}
	   
	   @Given("User is on User details window")
	   public void user_is_on_user_details_window() throws InterruptedException {
	      
		   up.clickonuser();
		   Thread.sleep(1000);
		   up.clickAddnew();
		   Thread.sleep(1000);
	   }
	   @When("User clicks A cancel button")
	   public void user_clicks_a_cancel_button() throws InterruptedException {
		   
		   JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,2000)");
		   up.clickcancel();
		   Thread.sleep(2000);
	   
	   }
	   @Then("User details window should be closed")
	   public void user_details_window_should_be_closed() throws InterruptedException {
		   //Thread.sleep(2000);
		   //WebElement container = driver.findElement(By.xpath("//div[@role='dialog']"));
		   
		
		if(driver.getPageSource().contains("U001"))  
		{
			  System.out.println("User details window is closed");
			}
		   else
			{
			 System.out.println("User Details window is still open");
			}
		
		}
	   
	   @Then("User should see a cancel\\(x) in user details window")
	   public void user_should_see_a_cancel_x_in_user_details_window() {
	   
		   Boolean cani = driver.findElement(By.xpath("//button[@tabindex=-'1']")).isDisplayed();
				   if(cani)
				   {
		   System.out.println(" Cancel icon appears in user details window");
		}
	  else
		{
		 System.out.println("Cancel icon does not appear");
		}
	   }
	   

	@When("User clicks A cancel\\(X) icon")
	public void user_clicks_a_cancel_x_icon() {
	   
		up.clickcancelicon();
	}

	@Then("User should see a button with text Submit in user details window")
	public void user_should_see_a_button_with_text_submit_in_user_details_window() {
	  
		Boolean sub = driver.findElement(By.xpath("//button[@color='primary']")).isDisplayed();
		if(sub)
		{
			  System.out.println(" User sees a submit button with text submit");
				}
			  else
				{
				 System.out.println("Submit button does not appear");
				}
		}

	@Then("User should see the placeholders with Text As {string},{string}, {string},{string},{string}, {string},{string}, {string},{string}.{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_see_the_placeholders_with_text_as(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n, String o, String p, String q, String r) 

	{
			Boolean fn = driver.findElement(By.xpath("//input[@data-placeholder='First name']/..//label")).isDisplayed();
			Boolean mn = driver.findElement(By.xpath("//input[@data-placeholder='Middle name']/..//label")).isDisplayed();
			Boolean ln = driver.findElement(By.xpath("//input[@data-placeholder='Last name']/..//label")).isDisplayed();

				if(fn||mn||ln)
				{
					  System.out.println("User sees the placeholder as First name, middle name and last name ");
				}
				else
				{
				 System.out.println("something does not appear");
				}

				String ea = driver.findElement(By.xpath("//input[@data-placeholder='Email address']/..//label")).getText();
				if(ea.equals("Email address"))
				{
					
						  System.out.println("User sees the email Address placeholder ");
					}
					else
					{
					 System.out.println("does not see");
					}


				Boolean pn= driver.findElement(By.xpath("//input[@data-placeholder='Phone no']/..//label")).isDisplayed();
				if(pn)
				{
					 System.out.println("User sees the phone number");
						}
						else
						{
						 System.out.println("does not see");
						}

				Boolean ad = driver.findElement(By.xpath("//input[@data-placeholder='Phone no']/..//label")).isDisplayed();
				Boolean city = driver.findElement(By.xpath("//input[@data-placeholder='City']/..//label")).isDisplayed();
				if(ad||city)
				{
					 System.out.println("User sees address and city ");
						}
						else
						{
						 System.out.println("does not see");
						}

				if(driver.getPageSource().contains("State"))
				{
					System.out.println("State appears with dropdown");
					
				}
				else
				{
					System.out.println("does not appear");
				}
				String prg = driver.findElement(By.xpath("//input[@data-placeholder='Program']/..//label")).getText();
				{
				if(prg.contains("Program"))
				{
					System.out.println("User sees Program ");
					}
					else
					{
					 System.out.println("does not see");
					}
				}
				Boolean ug = driver.findElement(By.xpath("//input[@data-placeholder='UG Program']/..//label")).isDisplayed();
				Boolean pg = driver.findElement(By.xpath("//input[@data-placeholder='PG Program']/..//label")).isDisplayed();
				if(ug||pg)
				{
					System.out.println(" User sees UG Program and PG Program");
				}
				else
				{
				 System.out.println("does not see");
				}


				Boolean skill = driver.findElement(By.xpath("//input[@data-placeholder='Skill']/..//label")).isDisplayed();
				Boolean exp = driver.findElement(By.xpath("//input[@data-placeholder='Experience']/..//label")).isDisplayed();
				Boolean urole = driver.findElement(By.xpath("//input[@data-placeholder='Skill']/..//label")).isDisplayed();
				if(skill||exp||urole)
				{
					System.out.println(" User sees skill, experience and user role");
					}
					else
					{
					 System.out.println("does not see");
					}	

		
		Boolean vs = driver.findElement(By.xpath("//input[@data-placeholder='Visa status']/..//label")).isDisplayed();
		Boolean bt = driver.findElement(By.xpath("//input[@data-placeholder='Batch']/..//label")).isDisplayed();
		Boolean cmt = driver.findElement(By.xpath("//input[@data-placeholder='Batch']/..//label")).isDisplayed();
		if(vs||bt||cmt)
		{
			System.out.println(" User sees Visa status, batch and comments");
		}
		else
		{
		 System.out.println("does not see anything");
		}	

	}

	@Then("User should see the input fields for {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"User Role\",Visa status\",{string},{string} corresponding to their labels")
	public void user_should_see_the_input_fields_for_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_user_role_visa_status_corresponding_to_their_labels(String stringg, String stringh, String stringi, String stringj) throws InterruptedException {
	    
		
	Boolean fname = driver.findElement(By.xpath("//div[1]/div[1]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean mname = driver.findElement(By.xpath("//div[1]/div[2]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean lname = driver.findElement(By.xpath("//div[1]/div[3]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	if(fname||mname||lname)
	{
		System.out.println("Input for first name and middle name and last name appears");
	}
	else
	{
		System.out.println("Input fields do not appear");
	}
	Boolean email1 = driver.findElement(By.xpath("//div[2]/div[1]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean phn = driver.findElement(By.xpath("//div[2]/div[2]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean input =  driver.findElement(By.xpath("//textarea[@data-placeholder='Address']")).isDisplayed();
	if(email1||phn||input)
	{
		System.out.println("User sees the input fields for Email Address, Phone number and Address");
		}
		else
		{
		 System.out.println("does not see anything");
		}	



	Boolean cityy = driver.findElement(By.xpath("//div[5]/div[1]/mat-form-field/div/div[1]/div/input")).isDisplayed();

		if(cityy)
	{
		System.out.println("input for city field appears");
	}
	else
	{
		System.out.println("city field does not appear");
	}

	Boolean state2 = driver.findElement(By.xpath("//div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")).isDisplayed();
	if(state2==true)
	{
		System.out.println("Dropdown appears");
		}
		else
		{
			System.out.println("does not appear");
		}

	Boolean Post = driver.findElement(By.xpath("//div[5]/div[3]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean Prog = driver.findElement(By.xpath("//div[6]/div[1]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean Ugp = driver.findElement(By.xpath("//div[6]/div[2]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean Pgp = driver.findElement(By.xpath("//div[6]/div[3]/mat-form-field/div/div[1]/div/input")).isDisplayed();

	if(Post||Prog||Ugp||Pgp)
	{
		System.out.println("User is able to see Postal code, Program, UG program and PG program");
	}
	else
	{
		System.out.println("does not see something");
	}	


	Boolean usersk = driver.findElement(By.xpath("//div[7]/div[1]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean role = driver.findElement(By.xpath("//div[1]/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]")).isDisplayed();
	Boolean vista = driver.findElement(By.xpath("//div[8]/div[1]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean batc = driver.findElement(By.xpath("//div[8]/div[2]/mat-form-field/div/div[1]/div/input")).isDisplayed();
	Boolean com = driver.findElement(By.xpath("//div[8]/div[3]/mat-form-field/div/div[1]/div/input")).isDisplayed();

	if(usersk||vista||role||batc||com)
	{
		System.out.println("User is able to see Skills, User role, Visa status, batch, comments ");
		}
		else
		{
			System.out.println("does not see something");
		}	
	}


	@Given("User is on {string} window")
	public void user_is_on_window(String string) throws InterruptedException {
	   up.clickonuser();
	   Thread.sleep(1000);
	   up.clickAddnew();
	}
	@When("User clicks the drop down icon for state")
	public void user_clicks_the_drop_down_icon_for_state() throws InterruptedException {
		
		Thread.sleep(1000);
		up.clickdropd();
	   
	}
	@Then("User should select from the drop down menu")
	public void user_should_select_from_the_drop_down_menu() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> states =driver.findElements(By.xpath("//mat-option[@role='option']/span"));
		//state.click();
		for(WebElement state :states)
		{
			if(state.getText().equals("Connecticut"))
			{
				
				state.click();
				System.out.println("selected!");
				break;
				
			}
		}
	}
		@When("User clicks the drop down icon for User Role")
		public void user_clicks_the_drop_down_icon_for_user_role() throws InterruptedException
		{
			Thread.sleep(1000);	
			
			 up.clickuserrole();
			 Thread.sleep(2000);
				
		}
		
				
		@Then("User should select from the drop down menu1")
		public void user_should_select_from_the_drop_down_menu1() throws InterruptedException {
			Thread.sleep(2000);
			List<WebElement> userr =driver.findElements(By.xpath("//span[@class='mat-option-text']/../../mat-option/span"));
			//state.click();
			Thread.sleep(1000);
			List<WebElement> cb = driver.findElements(By.xpath("//mat-pseudo-checkbox"));
			for(WebElement userr1 :userr)
			{
				if(userr1.getText().equals("Admin"))
				{
				for(WebElement cbuserr1: cb)
				{
					Thread.sleep(1000);
				cbuserr1.click();
									break;
					
				}
			}
		}

		}
		

		@When("User clicks save button with all details empty")
		public void user_clicks_save_button_with_all_details_empty() {
			
			if(driver.getPageSource().contains("Save"))
			{
				System.out.println("Save button is present");
			}
			else
			{
				System.out.println("There is no save button here !");
			}
			
			
		   
		}
		
		
		@Then("User should see a message \"Mandatory Fields cannot be empty")
		public void user_should_see_a_message_mandatory_fields_cannot_be_empty() {
			
				
				if(driver.getPageSource().contains("Save"))
				{
					System.out.println("Save button is present");
				}
				else
				{
					System.out.println("There is no save button here !");
				}
		  
		}
		
		
		@When("User clicks Save button by entering all valid values in required fields")
		public void user_clicks_save_button_by_entering_all_valid_values_in_required_fields() {
			{
				if(driver.getPageSource().contains("Save"))
			{
				System.out.println("Save button is present");
			}
			else
			{
				System.out.println("There is no save button here !");
			}
	  
	}
		}
		@Then("New User Should be Saved.")
		public void new_user_should_be_saved() {
			if(driver.getPageSource().contains("Save"))
			{
				System.out.println("Save button is present");
			}
			else
			{ 
				System.out.println("There is no save button here !");
			}
	  
	}
		@Then("User should see the button with text as\"+ Add C\\/O, Apt, Suite, Unit\"")
		public void user_should_see_the_button_with_text_as_add_c_o_apt_suite_unit() {
		    
			Boolean add2 = driver.findElement(By.xpath("//span[contains(text(),'+ Add C/O, Apt, Suite, Unit ')]")).isDisplayed();
				if(add2)
				{
				System.out.println("Address Apt, Suite is visible in the window");
					}
				else
				{
					System.out.println("Not visible");
				}
		}
		
		@When("User clicks the button {string}")
		public void user_clicks_the_button(String Add2) throws InterruptedException {
			up.clickAdd2();
			Thread.sleep(3000);
			
		}
		@Then("User should see the input field with Label {string}")
		public void user_should_see_the_input_field_with_label(String Addr2) {
			
			Boolean c = driver.findElement(By.xpath("//textarea[@id='mat-input-7']")).isDisplayed();
			if(c)
			{
			System.out.println("User is able to see Address 2 input field");	
			}
			else
			{
				System.out.println("Unable to see");
			}
		    
		}
		

	@When("User clicks postal code input field")
	public void user_clicks_postal_code_input_field() throws InterruptedException {
		
		up.clickpc();
		Thread.sleep(1000);
	  
	}
	@Then("User should see the input Number arrows in the postal code input field")
	public void user_should_see_the_input_number_arrows_in_the_postal_code_input_field() {
	 
		Boolean dropdown =driver.findElement(By.xpath("//div[5]/div[3]/mat-form-field")).isDisplayed();
		if(dropdown)
		{
			System.out.println("Input number arrows appear");
		}
		else
		{
			System.out.println("Donot appear");
		}
	}



		
		
		
		}

		   








		


		
	


