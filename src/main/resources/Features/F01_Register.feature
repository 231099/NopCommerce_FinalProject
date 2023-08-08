@smoke
Feature: Register | User Register
  Scenario: Enter valid data in Registration Form
    Given user navigate to register page
    When User Enter Valid Data
    And Press Register Button
    Then Verify Successful Registration

    Scenario: User Enter Invalid Data In Registration Form
      Given user navigate to register page
      When User Enter Invalid Data
      And Press Register Button
      Then Verify UnsSuccessful Registration