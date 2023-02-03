Feature: Login functionality validation

  // pre-requisite for all the test cases
  @Background: Given User opens the Browser and enter the url

  @SmokeTest
  Scenario: Validate the user is able to login with valid credentials into the application
#    Given User opens the Browser and enter the url
    # sasi changes
    And User enters the userid and password
    Then user clicks on Login button

    @SmokeTest
  Scenario: Validate1 the user is able to login with valid credentials into the application
    Given User opens the Browser and enter the url
    Then Verify that Login page is displayed
    And User enters the userid and password
    Then user clicks on Login button
    Then Verfy that user is nvigated to Dashboard page
    Then Close the browser

  @Smoke
  Scenario: Validate1 the user is able to login with valid credentials into the application
#    Given User opens the Browser and enter the url
    Then Verify that Login page is displayed
    And User enters the userid and password
    Then user clicks on Login button
    Then Verfy that user is nvigated to Dashboard page
    Then Close the browser


  @SmokeTest
  Scenario: Validate1 the user is able to login with valid credentials into the application
#    Given User opens the Browser and enter the url
    Then Verify that Login page is displayed
    And User enters the userid and password
    Then user clicks on Login button
    Then Verfy that user is nvigated to Dashboard page
    Then Close the browser