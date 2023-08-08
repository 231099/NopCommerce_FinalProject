@smoke
  Feature: Home Slider | User Check Home Sliders For Home Page
    Scenario: User Check First Slider In Home Page
      When User Click On First Slider
      Then Verify Url Have Changed

      Scenario: User Check Second Slider In Home Page
        When User Click On Second Slider
        Then Verify Actual Url Matches Expected Url