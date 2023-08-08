@smoke
Feature: Search | User Search For Product
  Scenario Outline: User Search Using <Product Name>
    When User Search With <Product Name>
    And Click Search Button
    And Choose Display Per Page 9
    Then Verify Search Result Matches <Product Name> The User Entered

    Examples:
      |Product Name|
      |Book        |
      |Laptop      |
      |Nike        |


  Scenario Outline: User Search Using <Serial Number>
    When User Search Using <Serial Number>
    And Click Search Button
    And Choose Product Based On <Serial Number>
    Then Verify Search Result Matches <Serial Number> The User Entered

    Examples:
      |Serial Number|
      |SCI_FAITH    |
      |APPLE_CAM   |
      |SF_PRO_11   |