$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GearTest.feature");
formatter.feature({
  "line": 1,
  "name": "As A User I want to Verify Gear Page Functionalities",
  "description": "",
  "id": "as-a-user-i-want-to-verify-gear-page-functionalities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5717487500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is at Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to add the desired product to the cart successfully",
  "description": "",
  "id": "as-a-user-i-want-to-verify-gear-page-functionalities;user-should-be-able-to-add-the-desired-product-to-the-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I hover mouse on gear menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on bags",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on overnight duffle",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify \"overnight duffle\" text",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I change the overnight duffle quantity to 3",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the text as \"You added Overnight Duffle to your shopping cart.\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the text \"Overnight Duffle\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the quantity as 3",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I verify the price as $135",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I update the quantity to 5",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on update the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify the price to $225",
  "keyword": "And "
});
formatter.match({
  "location": "GearTestSteps.iHoverMouseOnGearMenu()"
});
formatter.result({
  "duration": 245376200,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iClickOnBags()"
});
formatter.result({
  "duration": 1120985700,
  "status": "passed"
});
formatter.match({
  "location": "GearTestSteps.iClickOnOvernightDuffle()"
});
formatter.result({
  "duration": 1282605400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "overnight duffle",
      "offset": 10
    }
  ],
  "location": "GearTestSteps.iVerifyText(String)"
});
formatter.result({
  "duration": 118639200,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.luma.steps.GearTestSteps.iVerifyText(GearTestSteps.java:32)\r\n\tat ✽.And I verify \"overnight duffle\" text(GearTest.feature:10)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 42
    }
  ],
  "location": "GearTestSteps.iChangeTheOvernightDuffleQuantityTo(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearTestSteps.iClickOnAddToCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "You added Overnight Duffle to your shopping cart.",
      "offset": 22
    }
  ],
  "location": "GearTestSteps.iVerifyTheTextAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearTestSteps.iClickOnShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Overnight Duffle",
      "offset": 19
    }
  ],
  "location": "GearTestSteps.iVerifyTheText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 25
    }
  ],
  "location": "GearTestSteps.iVerifyTheQuantityAs(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "135",
      "offset": 23
    }
  ],
  "location": "GearTestSteps.iVerifyThePriceAs$(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 25
    }
  ],
  "location": "GearTestSteps.iUpdateTheQuantityTo(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GearTestSteps.iClickOnUpdateTheShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "225",
      "offset": 23
    }
  ],
  "location": "GearTestSteps.iVerifyThePriceTo$(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 747819200,
  "status": "passed"
});
formatter.uri("MensTest.feature");
formatter.feature({
  "line": 1,
  "name": "As a User I want to verify Mens page functionalities",
  "description": "",
  "id": "as-a-user-i-want-to-verify-mens-page-functionalities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4335927100,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "User is at Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to add desired product to the cart successfully",
  "description": "",
  "id": "as-a-user-i-want-to-verify-mens-page-functionalities;user-should-be-able-to-add-desired-product-to-the-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on Men menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on Bottom menu",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on pants",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on cronus yoga pant",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on size",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on colour",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on add to Cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the text as You added Cronus Yoga Pant to your shopping cart.",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on shopping Cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify the text Cronus Yoga Pant",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the size 32",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I verify the colour Black",
  "keyword": "And "
});
formatter.match({
  "location": "MensTestSteps.iMouseHoverOnMenMenu()"
});
formatter.result({
  "duration": 162317900,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iMouseHoverOnBottomMenu()"
});
formatter.result({
  "duration": 180923400,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iClickOnPants()"
});
formatter.result({
  "duration": 975840600,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iMouseHoverOnCronusYogaPant()"
});
formatter.result({
  "duration": 248971400,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iClickOnSize()"
});
formatter.result({
  "duration": 117839800,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iClickOnColour()"
});
formatter.result({
  "duration": 103319700,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iClickOnAddToCart()"
});
formatter.result({
  "duration": 89196700,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iVerifyTheTextAsYouAddedCronusYogaPantToYourShoppingCart()"
});
formatter.result({
  "duration": 1607700800,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iClickOnShoppingCart()"
});
formatter.result({
  "duration": 2200928900,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iVerifyTheTextCronusYogaPant()"
});
formatter.result({
  "duration": 36628600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 18
    }
  ],
  "location": "MensTestSteps.iVerifyTheSize(int)"
});
formatter.result({
  "duration": 35828400,
  "status": "passed"
});
formatter.match({
  "location": "MensTestSteps.iVerifyTheColourBlack()"
});
formatter.result({
  "duration": 39076200,
  "status": "passed"
});
formatter.after({
  "duration": 717058900,
  "status": "passed"
});
formatter.uri("WomensPage.feature");
formatter.feature({
  "line": 1,
  "name": "As a User I want to verify the womens page functionalities",
  "description": "",
  "id": "as-a-user-i-want-to-verify-the-womens-page-functionalities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3977231500,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "User is at the home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to view the products according to Name filter",
  "description": "",
  "id": "as-a-user-i-want-to-verify-the-womens-page-functionalities;user-should-be-able-to-view-the-products-according-to-name-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on womens menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on tops",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on jackets",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select product name filter",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I can view products sorted by name",
  "keyword": "Then "
});
formatter.match({
  "location": "WomensTestSteps.iMouseHoverOnWomensMenu()"
});
formatter.result({
  "duration": 157611500,
  "status": "passed"
});
formatter.match({
  "location": "WomensTestSteps.iMouseHoverOnTops()"
});
formatter.result({
  "duration": 152565800,
  "status": "passed"
});
formatter.match({
  "location": "WomensTestSteps.iClickOnJackets()"
});
formatter.result({
  "duration": 993053500,
  "status": "passed"
});
formatter.match({
  "location": "WomensTestSteps.iSelectProductNameFilter()"
});
formatter.result({
  "duration": 1235792100,
  "status": "passed"
});
formatter.match({
  "location": "WomensTestSteps.iCanViewProductsSortedByName()"
});
formatter.result({
  "duration": 336907100,
  "status": "passed"
});
formatter.after({
  "duration": 710636300,
  "status": "passed"
});
});