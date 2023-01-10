
Feature: saucedemo login
  I want to use this template for my feature file

  Scenario Outline: Verify the saucedemo login 
    Given User visit the login page
    When User Enter <Username> and <Password> and Click On login button
    
    Examples: 
    
      | Username        |   Password     |
      | standard_user   |   secret_sauce |
      | standard_user   |   secret_sauce | 
      
