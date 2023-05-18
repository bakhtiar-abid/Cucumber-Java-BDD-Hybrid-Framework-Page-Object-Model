
@skip
Feature: Registration page feature

  Background:
    Given  user is on registration page

  Scenario: Navigate to registration page
    Given user is on home page
    When user click on my registration page
    And user gets the title of the page
    Then page title should be "Your store. Register"

    Scenario: Unable to register without first name field
      Given user gets the title of the page
      When page title should be "Your store. Register"
      Then user enters last name "Mike"
      * user enters email as "john.mike@gmail.com"
      * user enters phone number "017468484948"
      * user enters fax number "8802385857"
      * user enters password for registration page "123456"
      * user enters confirm password for registration page "123456"
      * user click on registration button
      * user see error message "First name is required."

