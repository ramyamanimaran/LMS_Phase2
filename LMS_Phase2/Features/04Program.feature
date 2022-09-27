Feature: LoginPage
Background: Login
  
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"


 



#Feature: Header

  Scenario: Validate the heading
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    Then User should see a heading with text "Manage Program" on the page
   And close Browser
    
    
    
    #Feature: Footer

  @Footer
  Scenario: Validate the text below the table
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Program page
    Then User should see the text as "Showing x to y of z entries" below the table. 
		#x- starting record number on that page
		#y-ending record number on that page
		#z-Total number of records"
		And close Browser
   
  @tag2
  Scenario: Validate the footer
  Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
  When User is on Program page
  Then User should see the footer as "In total there are z programs"  
  #".z- Total number of records "
  And close Browser
	

 
    #Feature: Delete Button
@Delete
  Scenario: Validating the default state of Delete button 
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Program page
    Then User should see the Delete button on the top left hand side as Disabled 
    And close Browser
    
    
    
    
    #Feature: Number of records 
 
  @NRecords
  Scenario: Validate that number of records (rows of data in the table) displayed 
   Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on Program page
    Then Verify that number of program records (rows of data in the table) displayed on the page are 5
    And close Browser
    
    
    
    
   
#Feature: Search Program

  
 @Sprogram
  Scenario: Validate Search Feature
  #Given User is logged on to LMS website
  When User is on Program page
  Then Text box used for search has text as 'Search'
    And close Browser
    
  @Sprogram1
  Scenario: Search Program By Status
    #Given User is on Program page
     
    When User enters status as "Active" into search box.
    Then Entries for status as "Active" are shown.
    And close Browser

  @Sprogram1
  Scenario Outline: Search Program By Name
    #Given User is on Program page
    When User enters "<name phrase>"  into search box.
    Then Entries for "<name phrase>" are shown.
  And close Browser

    Examples: 
      | name phrase | status  |
      | Java3       | success |
      | java core   | success |
      
      
      
      
      #Feature: Edit Program Details
  
@edit1
  Scenario: Select Program
    #Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected
    And close Browser
@edit1
  Scenario: Edit Feature
    #Given User is on Program page
    When User clicks on <Edit> button
    Then User lands on Program Details form.
    And close Browser
@edit1
  Scenario: Edit Program Name
    Given User is on Program Details form
    When User edits Name and selects the Save button
    Then User can see updated Name
    And close Browser
@edit1
  Scenario: Edit Program Description
    Given User is on Program Details form
    When User edits Description and selects the Save button
    Then User can see updated Description
    And close Browser
@edit1
  Scenario: Edit Program Status
    Given User is on Program Details form
    When User changes status and selects the Save button
    Then User can see updated program Status
    And close Browser
@edit1
  Scenario: Click Cancel
    Given User is on Program Details form
    When User clicks <Cancel> button
    Then User can see Program Details form disappears
    And close Browser
@edit1
  Scenario: Click Save
    Given User is on Program Details form
    When User clicks <Save> button
    Then User can see 'Successful Program Updated' message
    And close Browser
      
      
      
      
      
      #Feature: Select Program

  

  @Delete1
  Scenario: Select Program
    Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected
    And close Browser
    

  @Delete1
  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on <Delete> button
    Then User lands on Program Confirm Deletion form del
    And close Browser

  @Delete1
  Scenario: Click Yes
    Given User is on Confirm Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Program Deleted' message
    And close Browser

  @Delete1
  Scenario: Click No
    Given User is on Confirm Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears
    And close Browser
      
      
      
      
      
      #Feature: Add New Program


  @ANewP
  Scenario: Validate Add New Program
    Given User is on Program page
    When User clicks <A New Program> button
    Then User lands on Program Details form.
    And close Browser

  @ANewP
  Scenario: Empty form submission
    Given User is on Program Details form to add new program
    When User clicks <Save> button without entering data
    Then User gets message 'Name is required'
    And close Browser

  @ANewP1
  Scenario: Enter Program Name
    Given User is on Program Details form to add new program
    When User enters <Name> in name text box
    Then User can see 'Name' entered in name
    And close Browser

  @ANewP1
  Scenario: Enter Program Description
    Given User is on Program Details form to add new program
    When User enters <Name> in description text box
    Then User can see 'Name' entered in description
    And close Browser

  @ANewP1
  Scenario: Select Status
    Given User is on Program Details form to add new program
    When User selects <Status> using radiobutton
    Then User can see 'Active/Inactive' status selected
    And close Browser

  @ANewP1
  Scenario: Click Save
    Given User is on Program Details form to add new program
    When User clicks <Save> button on add new program
    Then User gets message 'Successful Program created' on add new program
    And close Browser

  @ANewP1
  Scenario: Click Cancel
    Given User is on Program Details form to add new program
    When User clicks <Cancel> button on add new program
    Then User can see Program Details form disappears
    And close Browser
      
      
      
      
      
      #Feature: Multiple Program Deletion

  
  @MultiDele1
  Scenario: Select multiple Program
    Given User is on Program page
    When User selects more than one Program using checkbox
    Then Programs get selected
    And close Browser
    
    

  @MultiDele1
  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on <Delete> button on top left corner
    Then User lands on Program Confirm Deletion form.
    And close Browser

  @MultiDele1
  Scenario: Click Yes
    Given User is on Program Confirm Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Programs Deleted' message
    And close Browser

  @MultiDele1
  Scenario: Click No
    Given User is on Program Confirm Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears
    And close Browser
      
      
      
      #Feature: Pagination


  @Page
  Scenario: Verify previous link on the first page
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    When User is on first page of Manage Program
    Then Verify that previous program link is disabled
    And close Browser

  @Page
  Scenario: Verify next link
    Given User is on the program page number '1'
    When User clicks program navigate > button
    Then User navigated to program page number '2'
    And close Browser

  @Page
  Scenario: Verify previous link
    Given User is on the program page number '2'
    When User clicks program navigate < button
    Then User navigated to program page number '1'
    And close Browser

  @Page
  
  Scenario: Verify next link on the last page
   # Given User is logged on to LMS website
    When User is on last page of Manage Program
    Then Verify that program next link is disabled
    And close Browser
      
      
      
      
      #Feature: Results in Ascending order

  @Ascending
  Scenario: Verify that the results are displayed in Ascending order of Program name
    Given User is on Program page
    When User clicks on the Ascending arrow down near to the Program name
    Then User can see the results in Ascending order of Program name
    And close Browser
   
  @Ascending
  Scenario: Verify that the results are displayed in Ascending order of Program Description
    Given User is on Program page
    When User clicks on the Ascending arrow down near to the Program Description 
    Then User can see the results in Ascending order of Program Description
    And close Browser
    
    @Ascending1
    Scenario: Verify that the results are displayed in Ascending order of Program Status
    Given User is on Program page
    When User clicks on the Ascending arrow down near to the Program Status 
    Then User can see the results in Ascending order of Program Status
    And close Browser
    
    

      
      
      #Feature: Results in Descending order

 
  @Descending
  Scenario: Verify that the results are displayed in Descending order of Program name
    Given User is on Program page
    When User clicks on the Descending arrow down near to the Program name
    Then User can see the results in Descending order of Program name
    And close Browser
   
  @Descending
  Scenario: Verify that the results are displayed in Descending order of Program Description
    Given User is on Program page
    When User clicks on the Descending arrow down near to the Program Description 
    Then User can see the results in Descending order of Program Description
    And close Browser
    
    @Descending
    Scenario: Verify that the results are displayed in Descending order of Program Status
    Given User is on Program page
    When User clicks on the Descending arrow down near to the Program Status 
    Then User can see the results in Descending order of Program Status
    And close Browser
    
    