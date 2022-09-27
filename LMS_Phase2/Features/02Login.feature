Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "LMS" and password as "LMS"
    And click on login
    Then Page Title should be "LMS"
    And close Browser
    
    
    
  Scenario Outline: Login Data Driven
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "<username>" and password as "<password>"
    And click on login
    Then Page Title should be "LMS"
    And close Browser
    
    Examples:
    |username | password|
    |LMS | LMS|
    
     
  Scenario Outline: Login Data Driven
    Given User launch Chrome Browser
    When User opens URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters username as "<username>" and password as "<password>"
    And click on login
    Then Page Title should be "LMS"
    
    
    Examples:
    |username | password|
    | | |
