Feature: Register Test

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

  @Register_Dynamic
  Scenario Outline: Register with valid data - Dynamic
    Given user navigate to NopCommerce page and open Register page
    When user enter into "First name:" textbox with value "<First Name>"
    And user enter into "Last name:" textbox with value "<Last Name>"
    And user enter into "Email:" textbox with value "<Email>"
    And user enter into "Company name:" textbox with value "<Company>"
    And user enter into "Password:" textbox with value "<Password>"
    And user enter into "Confirm password:" textbox with value "<Password>"
    And click on Register button
    Then user should see "Your registration completed" success message is displayed

    Examples:
      | First Name | Last Name | Email    | Company     | Password |
      | Phu        | Lo        | phulo123 | Phu Lo Corp | 123456   |


