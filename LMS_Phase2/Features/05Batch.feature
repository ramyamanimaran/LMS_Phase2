Feature: Delete Button

  Scenario: Validating the default state of Delete button
   Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
   	When User is on Batch page
   	Then Verify that the Delete button next to the search box is Disabled
   	
  
   #Feature: Delete Multiple Batch
 
 #Background: User is logged on to LMS website
  	Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Batch page
    Then User should see a heading with text "Manage Batch" on the page
  
  Scenario: Select Batch
    
   	When  User selects more than one Batch using checkbox
    Then Delete button is Enabled
  
 	Scenario: Delete multiple batches
 	
 		When User clicks on Delete button
 		Then User lands on Confirm Deletion form.
 		
 		
 		
 		#Feature: Edit Batch
 
  #Background: User is logged on to LMS website
  	Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Batch page
    Then User should see a heading with text "Manage Batch" on the page

  Scenario: Edit Feature
   When User clicks on Edit button
   Then User lands on Batch Details form.
    
  Scenario: Edit Batch Name
   When User edits Name
   Then User can see edited Name
    
  Scenario: Edit Batch Description
   When Edit Batch Description
   Then User can see edited descricption

 Scenario: Edit program name
   When user edits program name
   Then user can see edited program name
   
 Scenario: change status
   When user changes status
   Then User can see updated Status
   
 Scenario: Edit No of classes
   When user edits No of classes
   Then user can see updated No of classes
  
 
 
 
 #Feature: Heading

  #Scenario: Validate the heading
  Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Batch page
    Then User should see a heading with text "Manage Batch" on the page
    
    
    
    
#Feature: Number of records
   
  #Scenario: Validate that number of records (rows of data in the table) displayed
    
   Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
   	When User is on Batch page
    Then Verify that number of records (rows of data in the table) displayed on the page are 5
    
    
    #Feature: Pagination

  #Background: User is logged on to LMS website
   Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Batch page
    Then User should see a heading with text "Manage Batch" on the page

  Scenario: Verify previous link on the first page
    When User is on first page of Manage Batch
    Then Verify that previous link is disabled

  Scenario: Verify next link
    Given User is on the page number '1'
    When User clicks navigate > button
    Then User navigated to page number '2'

  Scenario: Verify previous link
    Given User is on page number '2'
    When User clicks navigate '<' button
    Then User navigated to page number 1
    
	Scenario: Verify next link on the last page
		When User is on last page of Manage Batch
    Then Verify that next link is disabled
    
    
    
    
    
    #Feature: Results in Ascending order

  #Background: User is logged on to LMS website
   Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Batch page
    Then User should see a heading with text "Manage Batch" on the page

  Scenario: Verify that the results are displayed in Ascending order of Batch name
    When User clicks on the Ascending arrow (down ) near to the Batch name
    Then User can see the results in Ascending order of Batch name

  Scenario: Verify that the results are displayed in Ascending order of batch Description
    When User clicks on the Ascending arrow (down ) near to the Batch Description
    Then User can see the results in Ascending order of Batch Description

  Scenario: Verify that the results are displayed in Ascending order of Batch Status
    When User clicks on the Ascending arrow (down ) near to the Batch Status
    Then User can see the results in Ascending order of Batch Status

  Scenario: Verify that the results are displayed in Ascending order No of Classes
    When User clicks on the Ascending arrow (down ) near to the No Of Classes
    Then User can see the results in Ascending order of No of Classes

  Scenario: Verify that the results are displayed in Ascending order of Program Name
    When User clicks on the Ascending arrow (down ) near to the Program Name
    Then User can see the results in Ascending order of Program Name
    
    
    
    
    
    
    #Feature: Results in Descending order

  #Background: User is logged on to LMS website
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Batch page
    Then User should see a heading with text "Manage Batch" on the page

  Scenario: Verify that the results are displayed in Descending order of Batch name
    When User clicks onthe Descending arrow (down ) near to the Batch name
    Then User can see the results in Descending order of Batch name

  Scenario: Verify that the results are displayed in Descending order of Batch Description
    When User clicks onthe Descending arrow (down ) near to the Batch Description
    Then User can see the results in Descending order of Batch Description

  Scenario: Verify that the results are displayed in Descending order of Batch Status
    When User clicks onthe Descending arrow (down ) near to the Batch Status
    Then User can see the results in Descending order of Batch Status

  Scenario: Verify that the results are displayed in Descending order No of Classes
    When User clicks on the Descending arrow (down ) near to the No Of Classes
    Then User can see the results in Descending order of No of Classes

  Scenario: Verify that the results are displayed in Descending order of Program Name
    When User clicks on the Descending arrow (down ) near to the Program Name
    Then User can see the results in Descending order of Program Name
    
    
    
    
    
    
  #Feature :  Search Batch

  Scenario: Search by Batch Name
    When user clicks on search box with Batch Name entered in it
    Then records of that "Batch Name" are displayed
    
 