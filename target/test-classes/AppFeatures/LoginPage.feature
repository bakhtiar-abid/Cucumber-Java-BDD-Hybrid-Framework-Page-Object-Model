Feature: Login page feature

  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Customer Login"

  Scenario: Forgot Password link
    Given user is on login page
    Then forgot your password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "latexaid@gmail.com"
    And user enters password "User@123"
    And user clicks on Login button
    When user gets the title of the page
    Then page title should be "My Account"