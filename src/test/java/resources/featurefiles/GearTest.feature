Feature: As A User I want to Verify Gear Page Functionalities

  Background: User is at Home Page

  @sanity @regression
  Scenario: User should be able to add the desired product to the cart successfully
    When I hover mouse on gear menu
    And I click on bags
    And I click on overnight duffle
    And I verify "overnight duffle" text
    And I change the overnight duffle quantity to 3
    And I click on add to cart
    And I verify the text as "You added Overnight Duffle to your shopping cart."
    And I click on shopping cart
    And I verify the text "Overnight Duffle"
    And I verify the quantity as 3
    And I verify the price as $135
    And I update the quantity to 5
    And I click on update the shopping cart
    And I verify the price to $225