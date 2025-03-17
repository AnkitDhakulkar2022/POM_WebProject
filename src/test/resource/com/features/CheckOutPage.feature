Feature: saucedemo Checkout scenario

Background:
 Given User launch the browser and enter the saucedemo website

  @Checkout
  Scenario Outline: saucedemo checkout
    And User enter the Username "<Username>"
    And User enter the Password  "<Password>"
    And User click on login button  
    Given User select the product and click on add to cart button
    When User click on cart icon
    
    Given User click on checkout button
    Then User redirect to the checkout information page
    When User enter firstName "<Firstname>";
    And User enter LastName "<LastName>"
    And USer enter ZipCode "<ZipCode>"
    Then User click on continue button
    Then User redirect to the overview page and click on finish button
    
    Examples: 
 | Username    | Password         | Firstname   | LastName |ZipCode|
 |standard_user|secret_sauce  | Ankit |    D     |444444|
    
    
    