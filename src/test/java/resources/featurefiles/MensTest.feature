Feature: As a User I want to verify Mens page functionalities
  Background: User is at Home Page
    @sanity @regression
    Scenario: User should be able to add desired product to the cart successfully
      When I mouse hover on Men menu
      And I mouse hover on Bottom menu
      And I click on pants
      And I mouse hover on cronus yoga pant
      And I click on size
      And I click on colour
      And I click on add to Cart
      And I verify the text as You added Cronus Yoga Pant to your shopping cart.
      And I click on shopping Cart
      And I verify the text Cronus Yoga Pant
      And I verify the size 32
      And I verify the colour Black