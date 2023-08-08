@smoke
  Feature: Currencies | Check Euro Symbol For Each Product
    Scenario: Select Euro Currency From Drop Down List
      When Choose Euro From DropDown List
      Then Verify Each Product Has Euro Symbol