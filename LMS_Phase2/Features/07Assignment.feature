Feature: Heading
Background: Login
  
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"

@Heading
Scenario: Validate the heading


When User is on Manage Assignment page
Then User should see a heading with text "Manage Assignment" on the Assignment page
 And close Browser



#Feature: Footer
@Footer
Scenario: Validate the text below the table

When User is on Manage Assignment page
Then User should see the Assignment text as "Showing 1 to 3 of 3 entries"
 And close Browser

@Footer
Scenario: Validate the footer

When User is on Manage Assignment page
Then User should see the Assignment footer as "In total there are 3 programs"
 And close Browser




#Feature: Search

@Search
Scenario: Validate Search Feature

When User is on Manage Assignment page
Then Text box used for Assignment search has text as 'Search'
 And close Browser
 
 
@Search
Scenario: Search Assignment By Name

When User is on Manage Assignment page
When User clicks on search with <name phrase> into search box.
Then Entries for <name phrase> are shown.
 And close Browser




#Feature: Edit





@Edit
Scenario: Select Assignment

 When User is on Manage Assignment page
       When User selects Assignments using check box
   Then Assignment gets selected
   And close Browser
@Edit
  Scenario: Edit Feature
  
  When User is on Manage Assignment page
       When User clicks on<Edit>button
    Then User Lands on Assignment Details Form
     And close Browser
@Edit
  Scenario: Edit Assignment Name
 
    Given User is on Assignment  Details form
    When User edits Name
    Then User can see updated Assignment Name
     And close Browser
@Edit
  Scenario: Edit Assignment Description
  
  When User is on Manage Assignment page
  Given User is on Assignment  Details form
    When User edits Description
    Then User can see updated Assignment Description
     And close Browser
@Edit
  Scenario: Edit Assignment Grade
  
  When User is on Manage Assignment page
   Given User is on Assignment  Details form
    When User edits Grade
    Then User can see updated Grade
     And close Browser
@Edit
  Scenario: Edit Assignment Due Date
  
  When User is on Manage Assignment page
  Given User is on Assignment  Details form
    When User edits Due Date
    Then User can see updated Due Date
     And close Browser
@Edit
  Scenario: Click Cancel
  
  When User is on Manage Assignment page
   Given User is on Assignment  Details form
    When User clicks <Cancel> button
    Then User can see Assignment Details form disappears
     And close Browser
@Edit
  Scenario: Click Save
  
  When User is on Manage Assignment page
   Given User is on Assignment  Details form
    When User clicks <Save> button
    Then User can see 'Successful Assignment Updated' message
     And close Browser

      