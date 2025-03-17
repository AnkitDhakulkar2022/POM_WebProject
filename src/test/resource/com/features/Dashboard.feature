Feature: saucedemo Dashboard scenario

Background:
 Given User launch the browser and enter the saucedemo website
    
  @Dashboard
  Scenario Outline: saucedemo Dashboard
   And User enter the Username "<Username>"
    And User enter the Password  "<Password>"
    And User click on login button  
    Given User select the product and click on add to cart button
    When User click on cart icon
    Then User redirect to the Checkout page
    
     Examples: 
      | Username  | Password |
      | standard_user |    secret_sauce |

    