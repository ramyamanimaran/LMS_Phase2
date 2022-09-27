
Feature: Login
Background: 

Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    


# feature : Add new user button
@a1

Scenario: Verify the presence of Add new User button

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the button with text "+ icon and Add New User"
And close Browser

@a2

Scenario: Verify the functionality of Add new yser button

Given User is on Manage user page
When User clicks Add New User button
Then User should see the "User details" dialog box
And close Browser


#2 Feature: Cancel button


@c1
Scenario: Verify the presence of Cancel button in user detais window

Given User is on Manage user page
When User clicks A Add new user button
Then User should see a button with text Cancel in user details window
And close Browser
@c2

Scenario: Fucntionality of Cancel button

Given User is on User details window
When User clicks A cancel button
Then User details window should be closed
And close Browser



#3 Feature: Cancel icon




@i1

Scenario: Verify the presence of Cancel(x) icon in user detais window

Given User is on Manage user page
When User clicks A Add new user button
Then User should see a cancel(x) in user details window
And close Browser
@i2

Scenario: Fucntionality of Cancel(x) icon

Given User is on User details window
When User clicks A cancel(X) icon
Then User details window should be closed 
And close Browser


#4Feature: Delete Icon


@d1

Scenario: Verify the presence of Delete icon in manage user page

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the delete icon at the top left corner of the user table
And close Browser
@d2

Scenario: Behaviour of Delete icon when no rows unchecked

Given User table is displayed in manage user page
When no rows is checked
Then Delete icon at the top left corner of the user table disabled
And close Browser
@d3

Scenario: Behaviour of Delete icon when rows checked

Given User table is displayed in manage user page
When User checks the rows in user table
Then Delete icon at the top left corner of the user table enabled
And close Browser
@d4

Scenario: Behaviour of Delete icon when rows checked

Given User checks the rows in user table
When User clicks the delete icon at the top left corner of user table
Then Are you sure you want to delete the selected Users? button with text "No" the button with text "yes" and close(X) icon
And close Browser
@d5

Scenario: Validating Confirm dialog box by selecting Yes

Given User is in confirm dialog box after clicking delete icon
When User clicks button with text as "No"
Then Selected rows should not be deleted and dialog box should be closed
And close Browser
@d6

Scenario: ValidatingConfirm dialog box by selecting No

Given User is in confirm dialog box after clicking delete icon
When User clicks button with text "Yes"
Then Selected rows should be deleted and popup should be shown with success message "Users deleted"
And close Browser
@d7

Scenario: Validating Confirm dialog box by clicking close(x) icon

Given User is in confirm dialog box after clicking delete icon
When User clicks the close(x) icon
Then Confirm dialog box should be closed
And close Browser


#5Feature: Edit/Delete Icon in each row



@e1
Scenario: Verify the presence of Edit/Delete icon
Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the buttons with edit/delete icon in each row of Edit/Delete coulmn
And close Browser
@e2
Scenario: Fucntionality of delete button
Given User table is displayed in manage user page
When User clicks delete button
Then Confirm dialog box should be displayed with Text "Are you sure you want to delete (selected user name) ? , button with text No , the button with text yes and close(X) icon"
And close Browser
@e3
Scenario: Updating with Edit button
Given User table is displayed in manage user page
When User clicks Edit button
Then "User Details" dialog box should be displayed for editing
And close Browser



#6 Feature: Label Text



@l1

Scenario: Verify the presence of Label Texts

Given User is on Manage user page
When User clicks A Add new user button
Then User should see the placeholders with Text As "First name","Middle name", "Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","User Role","Visa status","Batch","Comments"
And close Browser


#7 Feature: Manage user page




Scenario: Verify landing in Manage user page

Given User is on any page after Login
When User clicks the Tab "User"
Then User should see the Manage user page
And close Browser

#8 Feature: Page Heading



@PageHeading
Scenario: 
Verify the Manage user page heading


Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the page heading as "Manage User"
And close Browser



#9 Feature: Pagination



@Pagination
Scenario: Verify the presence of pagination

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the pagination controls below data table
And close Browser
@t1

Scenario: Verify the Pagination control with less rows

Given User is on Manage user page
When Manage user table has less less than or equal to 5 rows
Then Pagination control should be disabled
And close Browser
@t2

Scenario: Verify the Pagination control with more than 5 rows

Given User is on Manage user page
When Manage user table has more than 5 rows
Then Pagination control should be enabled
And close Browser
@t3

Scenario: Verify pagination next link
Given User table is displayed in manage user page
When User clicks next link of pagination
Then Next page should be displayed
And close Browser
@t4

Scenario: Verify pagination next link after last record of user table
Given last page of User records are displayed
When User clicks next link of pagination
Then Next link of pagination should be disabled
And close Browser
@t5

Scenario: Verify pagination Previous link

Given User table is displayed in manage user page 
When User cliks previous link of pagination
Then previous page should be displayed
And close Browser
@t6

Scenario: Verify pagination previous link in first page of user table

Given First page of user table is displayed
When User cliks previous link of pagination
Then Previous link of pagination should be disabled
And close Browser
@t7

Scenario: Verify button with << icon

Given User table is displayed in manage user page
When User clicks << icon in pagination
Then User should see the First page of the table
And close Browser
@t8

Scenario: Verify button with >> icon
Given User table is displayed in manage user page 
When User clicks >> icon in pagination
Then User should see the last page of the table
And close Browser
@t9

Scenario: Verifiy the entry details below data table

Given User is logged on to the LMS website
When User lands on Manage User page
Then User should see the text  "Showing 1 to 4 of 4 entries" below the user table. 
And close Browser


#10Feature: Search by name



@s1
Scenario: Verify the presence of Input field for searching

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the Search input field after the delete icon
And close Browser
@s2

Scenario: Verify the presence of search icon and text in the search input field

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the search input field with search icon and text as "Search"
And close Browser

@s3

Scenario: Verify the functionality of search

Given User is on Manage user page
When User types Name to search
Then Rows with the name should be displayed
And close Browser
@s4

Scenario: Verify the functionality of search

Given User is on Manage user page
When User types random text in search field which has no matching entry
Then No rows is displayed
 And close Browser
 
 
 #11Feature: Submit button




@sb1

Scenario: Verify the presence of Submit button in user detais window

Given User is on Manage user page
When User clicks A Add new user button
Then User should see a button with text Submit in user details window
And close Browser


#12 Feature: Table footer





@f1
Scenario: Verify table footer

Given User is logged on to the LMS website
When User lands on Manage User page1
Then User should see the table footer as "In total there are 4 users".
And close Browser


#13Feature: Table header



@h1

Scenario: Verify Table header

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the table header as "Empty checkbox-icon , ID with sorticon, Name with Sorticon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit/Delete as column names"
And close Browser
@h2

Scenario: Verify the functionality of sort icon present in table header

Given User table is displayed in manage user page
When User clicks sort icon in table header
Then Table rows should be sorted
And close Browser
@h3

Scenario: Check box in table header

Given User table is displayed in manage user page
When User checks empty checkbox in header
Then Check box in all the rows of user table should be checked
And close Browser
@h4

Scenario: Check box in table header

Given User table is displayed in manage user page
When User unchecks checkbox in header
Then Check box in all the rows of user table should be unchecked
And close Browser
#14Feature: User Details Window




@ud1
Scenario: Verify the heading of User details window

Given User is on Manage user page
When User clicks A Add new user button
Then User should see User details window with heading "User Details"
And close Browser


#15Feature: User ID



@u1
Scenario: Verify ID functionality

Given User table is displayed in manage user page
When User clicks ID in any row
Then User details dialog box displayed with user information
And close Browser



#16 Feature: User Details Window



@ud1
Scenario: Verify the heading of User details window

Given User is on Manage user page
When User clicks A Add new user button
Then User should see User details window with heading "User Details"
And close Browser

#17 Feature: Cancel button


@c1
Scenario: Verify the presence of Cancel button in user detais window

Given User is on Manage user page
When User clicks A Add new user button
Then User should see a button with text Cancel in user details window
And close Browser

@c2

Scenario: Fucntionality of Cancel button

Given User is on User details window
When User clicks A cancel button
Then User details window should be closed
And close Browser


#18 Feature: Cancel icon


@i1

Scenario: Verify the presence of Cancel(x) icon in user detais window

Given User is on Manage user page
When User clicks A Add new user button
Then User should see a cancel(x) in user details window
And close Browser

@i2

Scenario: Fucntionality of Cancel(x) icon

Given User is on User details window
When User clicks A cancel(X) icon
Then User details window should be closed 
And close Browser


#19 Feature: Submit button



@sb1

Scenario: Verify the presence of Submit button in user detais window

Given User is on Manage user page
When User clicks A Add new user button
Then User should see a button with text Submit in user details window
And close Browser



#20 Feature: Label Text

@l1

Scenario: Verify the presence of Label Texts

Given User is on Manage user page
When User clicks A Add new user button
Then User should see the placeholders with Text As "First name","Middle name", "Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","User Role","Visa status","Batch","Comments"
And close Browser





#Feature: Input fields


@if1
Scenario: Verify the presence of input fields

Given User is on Manage user page
When User clicks A Add new user button
Then User should see the input fields for "First name","Middle name", Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","User Role",Visa status","Batch","Comments" corresponding to their labels
And close Browser



#Feature: Dropdown


@dd1
Scenario: verify drop down menu

Given User is on "User details" window
When User clicks the drop down icon for state
Then User should select from the drop down menu
And close Browser

@dd2
Scenario: verify drop down menu

Given User is on "User details" window
When User clicks the drop down icon for User Role
Then User should select from the drop down menu1
And close Browser


#Feature: Save button functionality

@sbtn1
Scenario: Validating the User details window with all fields empty

Given User is on User details window
When User clicks save button with all details empty
Then User should see a message "Mandatory Fields cannot be empty
And close Browser

@sbtn2
Scenario: Adding new User

Given User is on User details window
When User clicks Save button by entering all valid values in required fields
Then New User Should be Saved. 
And close Browser




#Feature: Address buttons


@add1
Scenario: Validating the presence of Address2 button

Given User is on Manage user page 
When User clicks A Add new user button
Then User should see the button with text as"+ Add C/O, Apt, Suite, Unit"
And close Browser

@add2
Scenario: Validating Address2 in User details window

Given User is on User details window
When User clicks the button "+ Add C/O, Apt, Suite, Unit"
Then User should see the input field with Label "Address2"
And close Browser




#Feature: Input Number Arrows


@ina1

Scenario: Validating the presence of input number arrows in postal code input field

Given User is on User details window
When User clicks postal code input field
Then User should see the input Number arrows in the postal code input field
And close Browser
