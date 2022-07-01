#Author: daniel@google.com (Daniel)
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#Sample Feature Definition Template
@regression
Feature: Signup and login with a user account

  Rule: As a new user, I want to register by creating a username and
    password so that the system can remember me and my data

  Background: Go to login
    Given User is navigating to Advantage Shopping page
    And User performs click on login button

  @signup_user_and_login
  Scenario Outline: Signup user
    When User performs click on 'CREATE NEW ACCOUNT'
    And User types in new <username>
    And User types in <email>
    And User types in new <password> with at least one upper case, one digit, one special character
    And User types in password <confirmation>
    And User performs click on checkbox 'I agree to the www.AdvantageOnlineShopping.com Conditions of Use and Privacy Notice'
    And user performs click on register button
    Then User validates user logged in

    Examples:
      | username  | email | password  | confirmation |
      |     1     |   1   |     1     |      1       |