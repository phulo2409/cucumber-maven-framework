Feature: Register Test


#  Scenario: Register with empty data
##    When user leave all textbox blank
##    And click on Register button
##    Then user should see "First name is required." error message on First Name textbox
##    And user should see "Last name is required." error message on Last Name textbox
##    And user should see "Email is required." error message on Email textbox
##    And user should see "Password is required." error message is displayed on Password textbox
##
##  Scenario: Register with invalid email
##    When user enter an invalid email "phu@gmail" into Email textbox
##    And click on Register button
##    Then user should see "Wrong email" error message is displayed on Email textbox
##
##  Scenario Outline: Register with valid data
##    When user enter "<firstName>" into First Name textbox
##    And user enter "<lastName>" into Last Name textbox
##    And user enter "<email>" into Email textbox
##    And user enter "<company>" into Company textbox
##    And user enter "<password>" into Password textbox
##    And click on Register button
##    Then user should see "Your registration completed" sucess message is displayed
##
##    Examples:
##      | firstName | lastName | email              | company     | password |
##      | Phu       | Lo       | phulo123@gmail.com | Phu Lo Corp | 123456   |
##
##  Scenario: Register with exist email
##    When create an account with exist email
##      | firstName | lastName | email              | company     | password |
##      | Phu       | Lo       | phulo123@gmail.com | Phu Lo Corp | 123456   |
##    And click on Register button
##    Then user should see "The specified email already exists" error message is display on Email textbox
##
##  Scenario Outline: Register with password less than 6 characters
##    When user enter "<firstName>" into First Name textbox
##    And user enter "<lastName>" into Last Name textbox
##    And user enter "<email>" into Email textbox
##    And user enter "<company>" into Company textbox
##    And user enter "<password>" into Password textbox
##    And click on Register button
##    Then user should see "Password must meet the following rules: must have at least 6 characters and not greater than 64 characters" error message is displayed on Password textbox
##
##    Examples:
##      | firstName | lastName | email              | company     | password |
##      | Phu       | Lo       | phulo123@gmail.com | Phu Lo Corp | 123456   |
  @Register
  Scenario: Register with valid data
    Given user navigate to NopCommerce page and open Register page
    When user enter into First Name textbox
    And user enter into Last Name textbox
    And user enter into Email textbox
    And user enter into Company textbox
    And user enter into Password textbox
    And user enter into Confirm Password textbox
    And click on Register button
    Then user should see "Your registration completed" success message is displayed



