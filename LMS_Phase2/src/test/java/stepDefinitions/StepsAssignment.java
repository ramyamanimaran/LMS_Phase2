package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;

public class StepsAssignment extends BaseClass{
		
		/*@Given("User is logged on to LMS website")
		public void user_is_logged_on_to_lms_website() {
			System.setProperty("webdriver.chrome.driver", "C:/NumpyProjects/workspace/LMS_Phase21/drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			 hp = new HeadingPage(driver);
			 fp = new FooterPage(driver);
			 ep = new EditPage(driver);
			  sp= new SearchPage(driver);
			   dp = new DeletePage(driver);
		    ap = new AddNewPage(driver);
		   asp =new  Ascending(driver);
	       dsp = new Decending(driver);
	       fap = new FillPage(driver);
		}*/

		@When("User is on Manage Assignment page")
		public void user_is_on_manage_assignment_page() {
			driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("LMS");
			driver.findElement(By.id("password")).sendKeys("LMS");
			driver.findElement(By.id("login")).click();
			ap= new AssignmentPage(driver);
			ap.assignment();

		    
		}

		@Then("User should see a heading with text {string} on the Assignment page")
		public void user_should_see_a_heading_with_text_on_the_Assignment_page(String string) {
			String expectedText="Manage Program";
			String actualText=driver.findElement(By.xpath("(//div[@class='box'])[1]")).getText();
			if(actualText.equals(expectedText)) {
				System.out.println("pass");
			}
		}
		
		//Footer Page
			@Then("User should see the Assignment text as {string}")
			public void user_should_see_the_Assignment_text_as(String string) {
			ap.entries();
			    
			}

			@Then("User should see the Assignment footer as {string}")
			public void user_should_see_the_Assignment_footer_as(String string) {
				ap.assignmentText();

			    
			}
			//Search Assignment
			/*@When("User is on Manage Assignment page")
			public void user_is_on_assignment_page() throws InterruptedException {
				driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("LMS");
				driver.findElement(By.id("password")).sendKeys("LMS");
				driver.findElement(By.id("login")).click();
				//hp.assignment();
				driver.findElement(By.xpath("//button[@routerlink='/assignment']")).click();
			}*/

			@Then("Text box used for Assignment search has text as {string}")
			public void text_box_used_for_Assignment_search_has_text_as(String string) throws InterruptedException {
				Thread.sleep(2000);
			    ap.sAssign();
			}

			/*@Given("User is on Assignment page")
			public void user_is_on_assignment_page1() {
				driver.get("https://lms-frontend-phase2.herokuapp.com/logi");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("LMS");
				driver.findElement(By.id("password")).sendKeys("LMS");
				driver.findElement(By.id("login")).click();
			}*/

			@When("User clicks on search with <name phrase> into search box.")
			public void user_clicks_on_search_with_name_phrase_into_search_box() throws InterruptedException {
				Thread.sleep(2000);
				ap.sAssign1();
			}

			@Then("Entries for <name phrase> are shown.")
			public void entries_for_name_phrase_are_shown() {
			   //sp.sAssign1();
				
				System.out.println( "Sql");
			}
/*Edit page
		

			@When("User selects Assignments using check box")
			public void user_selects_assignments_using_check_box() throws InterruptedException {
				ap.Checkbox1();
			}

			@Then("Assignment gets selected")
			public void assignment_gets_selected() {
				ap.selectCheckBox();
			}

			@When("User clicks on<Edit>button")
			public void user_clicks_on_edit_button() throws InterruptedException {
				ap.checkEdit();
			}

			@Then("User Lands on Assignment Details Form")
			public void user_lands_on_assignment_details_form() {
				ap.landPpage();
			}

			@Given("User is on Assignment  Details form")
			public void user_is_on_assignment_details_form() throws InterruptedException {
				ap.checkEdit();
				ap.landPpage();
			}

			@When("User edits Name")
			public void user_edits_name() throws InterruptedException {
				ap.editName(); 
			}

			@Then(" User can see updated Assignment Name")
			public void user_can_see_updated_Assingment_Name() {
				 WebElement baseTable = driver.findElement(By.tagName("table"));
				  
				 //To find first row of table
				 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[2]"));
			     String rowtext = tableRow.getText();
				 System.out.println("First row of table : "+rowtext);
				 
				 if(rowtext.equals("Sql Assignment")) {
					 System.out.println("text updated successfully");
				 }
				 else {
					 System.out.println("text not updated successfully");
				// Assert.assertEquals(true,false);
				 }
			}

		@Given("User is on Assignment Details form")
			public void user_is_on_assignment_details_form1() {
			   
			}

			@When("User edits Description")
			public void user_edits_description() {
				ap.editDescription(); 
			}

			@Then("User can see updated Assignment Description")
			public void user_can_see_updated_Assignment_description() {
				WebElement baseTable = driver.findElement(By.tagName("table"));
				  
				 //To find first row of table
				 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[3]"));
			   String rowtext = tableRow.getText();
				 System.out.println("First row of table : "+rowtext);
				 
				 if(rowtext.equals("SQL Practice")) {
					 System.out.println("text updated successfully");
				 }
				 else {
					 System.out.println("text updated not successfully");
				 //Assert.assertEquals(true,false);
				 }
			}

			@When("User edits Grade")
			public void user_edits_grade() {
				ap.editGrade();
			}

			@Then("User can see updated Grade")
			public void user_can_see_updated_grade() {
				WebElement baseTable = driver.findElement(By.tagName("table"));
				  
				 //To find first row of table
				 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[4]"));
			   String rowtext = tableRow.getText();
				 System.out.println("First row of table : "+rowtext);
				 
				 if(rowtext.equals("Manage")) {
					 System.out.println("text updated successfully");
				 }
				 else {
					 System.out.println("text updated not successfully");
					// Assert.assertEquals(true,false);
			}
				
			}

			@When("User edits Due Date")
			public void user_edits_due_date() {
				ap.editdate();
			}

			@Then("User can see updated Due Date")
			public void user_can_see_updated_due_date() {
				WebElement baseTable = driver.findElement(By.tagName("table"));
				  
				 //To find first row of table
				 WebElement tableRow = baseTable.findElement(By.xpath("//table//tbody//tr[1]/td[5]"));
			   String rowtext = tableRow.getText();
				 System.out.println("First row of table : "+rowtext);
				 
				 if(rowtext.equals("26/05/2022")) {
					 System.out.println("text updated successfully");
				 }
				 else {
					 System.out.println("text updated not successfully");
					// Assert.assertEquals(true,false);
			}
			}

			@When("User clicks <Cancel> button")
			public void user_clicks_cancel_button() {
				ap.cancel();
			}

			@Then("User can see Assignment Details form disappears")
			public void user_can_see_assignment_details_form_disappears() throws InterruptedException {
				ap.checkEdit();
				ap.notLandPpage();
			}

			@When("User clicks <Save> button")
			public void user_clicks_save_button() throws InterruptedException {
				ap.save();
			}

			@Then("User can see {string} message")
			public void user_can_see_message(String string) {
			  
			}*/
			
			
			/*Delpage
			@When("User clicks on <Delete> button after selecting an assignment")
			public void user_clicks_on_delete_button_after_selecting_an_assignment() throws InterruptedException {
				ap.delButton();
			}

			@Then("User lands on Confirm Deletion form.")
			public void user_lands_on_confirm_deletion_form() throws InterruptedException {
				ap.delMessage();
			}

			@Given("User is on Confirm Deletion form")
			public void user_is_on_confirm_deletion_form() {
				ap.delConfirm();
			}

			@When("User clicks <Yes> button")
			public void user_clicks_yes_button() {
				ap.delYes();
			}

			@When("User clicks <No> button")
			public void user_clicks_no_button() {
				ap.delNo();
			}

			@Then("User can see Confirm Deletion form disappears")
			public void user_can_see_confirm_deletion_form_disappears() {
				ap.delConfirm();
			}*/
}
