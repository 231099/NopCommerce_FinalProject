@smoke
Feature: Login | User Enter Email And Password (Login Form)
  Scenario: User Enter Valid Data In Login Form
    Given User Navigate To Login Form
    When User Enter Valid Email & Password
    And Press Login Button
    Then Verify Successful Login

    Scenario: User Enter Invalid Data In Login Form
      Given User Navigate To Login Form
      When User Enter Invalid Email & Password
      And Press Login Button
      Then Verify UnsSuccessful Login