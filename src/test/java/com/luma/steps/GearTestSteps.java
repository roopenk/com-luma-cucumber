package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDuffle;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearTestSteps {
    @When("^I hover mouse on gear menu$")
    public void iHoverMouseOnGearMenu() {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("^I click on bags$")
    public void iClickOnBags() {
        new HomePage().clickOnBags();
    }

    @And("^I click on overnight duffle$")
    public void iClickOnOvernightDuffle() {
        new GearPage().clickOnOvernightDuffle();
    }

    @And("^I verify \"([^\"]*)\" text$")
    public void iVerifyText(String arg0) throws Throwable {
        Assert.assertEquals(new OverNightDuffle().getOverNightDuffelText(), "Overnight Duffle");
        throw new PendingException();
    }

    @And("^I change the overnight duffle quantity to (\\d+)$")
    public void iChangeTheOvernightDuffleQuantityTo(int arg0) {
        new OverNightDuffle().changeQuantityTo3("3");
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new OverNightDuffle().clickOnAddToCart();
    }

    @And("^I verify the text as \"([^\"]*)\"$")
    public void iVerifyTheTextAs(String arg0) throws Throwable {
        Assert.assertEquals(new OverNightDuffle().getAddToCartText(), "You added Overnight Duffle to your shopping cart.");
        throw new PendingException();
    }

    @And("^I click on shopping cart$")
    public void iClickOnShoppingCart() {
        new OverNightDuffle().clickOnShoppingCart();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0) throws Throwable {
        Assert.assertEquals(new ShoppingCartPage().getOverNightDuffleText(), "Overnight Duffle");
        throw new PendingException();
    }

    @And("^I verify the quantity as (\\d+)$")
    public void iVerifyTheQuantityAs(int arg0) {
        Assert.assertEquals(new ShoppingCartPage().getQty(), "3");
    }

    @And("^I verify the price as \\$(\\d+)$")
    public void iVerifyThePriceAs$(int arg0) {
        Assert.assertEquals(new ShoppingCartPage().getProductPrice(), "$135.00");
    }

    @And("^I update the quantity to (\\d+)$")
    public void iUpdateTheQuantityTo(int arg0) {
        new ShoppingCartPage().changeQtyOfOverNightDuffle("5");
    }

    @And("^I click on update the shopping cart$")
    public void iClickOnUpdateTheShoppingCart() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @Then("^I verify the price to \\$(\\d+)$")
    public void iVerifyThePriceTo$(int arg0) {
        Assert.assertEquals(new ShoppingCartPage().getUpdatedProductPrice(), "$225.00");
    }
}
