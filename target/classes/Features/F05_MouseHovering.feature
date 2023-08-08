@smoke
  Feature: MouseHovering | User Hover On Categories
    Scenario: User Mouse Hover on Computers Category
      When User Hover On Computer Category
      Then Verify Computer Category Contains Three SubCategories
      And Click NoteBooks SubCategory
      Then Verify You Are On NoteBooks Page