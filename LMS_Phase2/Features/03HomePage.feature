Feature: HomePage

  Scenario: validating the titles of the homepage, positive scenario
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    And User should be able to see the headerLMS
    And User should be able to see the Program button
    And User should be able to see the Batch button
    And User should be able to see the User button
    And User should be able to see the Attendence button
    And User should be able to see the Assignment button
    And User should be able to see the Logout button
    And close Browser
    
    
        