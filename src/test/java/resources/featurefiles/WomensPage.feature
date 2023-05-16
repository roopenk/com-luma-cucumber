Feature: As a User I want to verify the womens page functionalities
  Background: User is at the home page
    @sanity @regression
      Scenario: User should be able to view the products according to Name filter
      When I mouse hover on womens menu
      And I mouse hover on tops
      And I click on jackets
      And I select product name filter
      Then I can view products sorted by name

      @smoke @regression
        Scenario: User should be able to view the products according to price filter
        When I mouse hover on womens menu
        And I mouse hover on tops
        And I click on jackets
        And I select products price filter
        Then I can view products sorted by price

