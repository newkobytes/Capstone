Feature: Register Feature Scenario

Scenario: This scenario is to register in the medicare application

Given I have launched the application
When I click on the SignUp button
And  I enter the User Details
And I enter the Password details
And I enter the Address details
And I click on confirm button
Then I should be registered as a medicare user
