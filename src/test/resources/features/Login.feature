Feature: Login Feature
  As a user
  I want to be able to log in to the website
  
  Scenario: Unsuccessful login with password is registered in the database but the username is empty
    Given I have opened the application in the browser
    And I have been navigated to the login page
    When I enter username "" and password "secret_sauce"
    And I click the login button
    Then I should see the message "You need Username!" on the login form

  Scenario: Unsuccessful login with username is registered in the database but the password not registered in the database
    Given I have opened the application in the browser
    And I have been navigated to the login page
    When I enter username "standard_user" and password "secretsauce"
    And I click the login button
    Then I should see the message "You need Password!" on the login form

  Scenario: Unsuccesfull login with username is registered in the database but the password is empty
    Given I have opened the application in the browser
    And I have been navigated to the login page
    When I enter username "standard_user" and password ""
    And I click the login button
    Then I should see the message "You need Password!" on the login form

  Scenario: Unsuccesfull login with password is registered in the database but the username not registered in the database
    Given I have opened the application in the browser
    And I have been navigated to the login page
    When I enter username "secret_sauce" and password "secret_sauce"
    And I click the login button
    Then I should see the message "Username  and password do not match any User in  this service!" on the login form

  Scenario: Unsuccesfull login with username is not registered in the database but the password is empty
    Given I have opened the application in the browser
    And I have been navigated to the login page
    When I enter username "standarduser" and password ""
    And I click the login button
    Then I should see the message "You need Username & Password!" on the login form
