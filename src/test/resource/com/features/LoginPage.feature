Feature: saucedemo Login scenario
 Background:
Given User launch the browser and enter the saucedemo website
 @Login @InvalidEmail
  Scenario Outline: Login to saucedemo 
   
    When User enter the Username "<Username>"
    And User enter the Password  "<Password>"
    And User click on login button
    Then User redirect to the dashboard
    

    Examples: 
      | Username  | Password |
      | standard_user |    secret_sauce |
     
     @InvalidEmail
  Scenario Outline: InvalidEmail to saucedemo 
   
    When User enter the Username "<Username>"
    And User enter the Password  "<Password>"
    And User click on login button
    Then User redirect to the dashboard
    

    Examples: 
      | Username  | Password |
      | standard_userrr |    secret_sauce |
     
     
      @InvalidPass
  Scenario Outline: InvalidPass to saucedemo 
   
    When User enter the Username "<Username>"
    And User enter the Password  "<Password>"
    And User click on login button
    Then User redirect to the dashboard
    

    Examples: 
      | Username  | Password |
      | standard_user |    secret_saucett |
     
     @InvalidCredential
  Scenario Outline: InvalidCredential to saucedemo 
   
    When User enter the Username "<Username>"
    And User enter the Password  "<Password>"
    And User click on login button
    Then User redirect to the dashboard
    

    Examples: 
      | Username  | Password |
      | standard_usertt |    secret_saucett |
     