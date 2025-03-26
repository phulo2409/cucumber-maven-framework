Feature: Register Test

  Background:
    Given user navigate to NopCommerce page and open Register page
    And create an account successfully
    And click on "Log out" button on menu bar
    And click on "Log in" button on menu bar

  @Login
  Scenario: Register with valid data
    When user enter into Email textbox in Login page
    And user enter into Password textbox in Login page
    And click on Login button
    Then user should see "My account" item on menu bar
