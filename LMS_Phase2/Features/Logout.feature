Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    Then click on logout
    Then User should be able to see the loginpage url
    And close Browser