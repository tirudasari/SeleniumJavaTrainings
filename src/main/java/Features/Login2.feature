Feature: Login functionality validation

  @Smoke
  Scenario: Validate the user is able to login with valid credentials into the application

    Given User opens the Browser and enter the url
    Then Verify that Login page is displayed
    And User enters the userid and password
    Then user clicks on Login button
    Then Verfy that user is nvigated to Dashboard page

    @SmokeTest @Smoke
  Scenario: Validate1 the user is able to login with valid credentials into the application
    Given User opens the Browser and enter the url
    Then Verify that Login page is displayed
    And User enters the userid and password
    Then user clicks on Login button
    Then Verfy that user is nvigated to Dashboard page
    Then Close the browser

  @SmokeTest @Smoke
  Scenario: Validate1 the user is able to login with valid credentials into the application

    Given User opens the Browser and enter the url
    Then Verify that Login page is displayed
    And User enters the userid and password
    Then user clicks on Login button
    Then Verfy that user is nvigated to Dashboard page
    Then Close the browser


  @Smoke
  Scenario Outline: Validate1 the user is able to login with valid credentials into the application
    Given User opens the Browser and enter the url
    Then Verify that Login page is displayed
    And User enters the "<userid>" and "<password>"
    Then user clicks on Login button
    Then Verfy that user is nvigated to Dashboard page
    Then Close the browser

    Examples:
      |userid       |password    |
      |standard_user|secret_sauce|
      |locked_out_user|secret_sauce|

