Feature: Login Feature
  As a user
  I want to be able to log in to the website
  
  Scenario: Unsuccessful login with password is registered in the database but the username is empty
    Given I have opened the application in the browser
    And I have been navigated to the login page
    When I enter username "" and password "secret_sauce"
    And I click the login button
    Then I should see the message "You need Username!" on the login form