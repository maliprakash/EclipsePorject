
Feature: To check FB login functionality


@test1
Scenario: Test login fuctionality
Given user is on loginpage
When user enter username
And user enter password
Then user click on login button

@test2
Scenario: Test login fuctionality
Given user is on loginpage1
When user enter invalid username
And user enter invalid password
Then user click on login button1


