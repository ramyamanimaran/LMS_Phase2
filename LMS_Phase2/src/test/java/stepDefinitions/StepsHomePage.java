package stepDefinitions;





import io.cucumber.java.en.Then;

import pageObjects.HomePage;


public class StepsHomePage extends BaseClass{
	
	
	
	
	
	@Then("User should be able to see the headerLMS")
	public void user_should_be_able_to_see_the_header_lms() {
		hp = new HomePage(driver);
		    hp.checkHeaderLMS();
	}

	@Then("User should be able to see the Program button")
	public void user_should_be_able_to_see_the_program_button() {
		hp = new HomePage(driver);
	    hp.checkHeaderProgram();
	}

	@Then("User should be able to see the Batch button")
	public void user_should_be_able_to_see_the_batch_button() {
		hp = new HomePage(driver);
	   hp.checkHeaderBatch();
	}

	@Then("User should be able to see the User button")
	public void user_should_be_able_to_see_the_user_button() {
	    hp.checkHeaderUser();
	}

	@Then("User should be able to see the Attendence button")
	public void user_should_be_able_to_see_the_attendence_button() {
	  hp.checkHeaderAttendance();
	}

	@Then("User should be able to see the Assignment button")
	public void user_should_be_able_to_see_the_assignment_button() {
	    hp.checkHeaderAssignment();
	}

	@Then("User should be able to see the Logout button")
	public void user_should_be_able_to_see_the_logout_button() {
	    hp.checkHeaderLogout();
	}


}
