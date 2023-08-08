@smoke
  Feature: WishList | User Add Product To WishList
    Scenario: User Select Product To Be Added To WishList
      When User Click On Product To Be Added To WishList
      Then Verify Success Message Displayed With Green Background Color

      Scenario: User Check Wish List Isn't Empty
        When User Select Product And Add It To Wish List
        Then Verify Quantity in Wish List Is not Zero