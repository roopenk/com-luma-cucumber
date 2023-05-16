package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MensTestSteps {
    @When("^I mouse hover on Men menu$")
    public void iMouseHoverOnMenMenu() {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("^I mouse hover on Bottom menu$")
    public void iMouseHoverOnBottomMenu() {
        new HomePage().mouseHoverOnBottom();
    }

    @And("^I click on pants$")
    public void iClickOnPants() {
        new HomePage().clickOnPant();
    }

    @And("^I mouse hover on cronus yoga pant$")
    public void iMouseHoverOnCronusYogaPant() {
        new MenPage().mouseHoverOnCronusYogaPant();
    }

    @And("^I click on size$")
    public void iClickOnSize() {
        new MenPage().clickOnSize();
    }

    @And("^I click on colour$")
    public void iClickOnColour() {
        new MenPage().clickOnColor();
    }

    @And("^I click on add to Cart$")
    public void iClickOnAddToCart() {
        new MenPage().clickOnAddToCart();
    }

    @And("^I verify the text as You added Cronus Yoga Pant to your shopping cart\\.$")
    public void iVerifyTheTextAsYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals(new MenPage().getTextAfterAddToCart(), "You added Cronus Yoga Pant to your shopping cart.");
    }

    @And("^I click on shopping Cart$")
    public void iClickOnShoppingCart() {
        new MenPage().clickOnShoppingCart();
    }

    @And("^I verify the text Cronus Yoga Pant$")
    public void iVerifyTheTextCronusYogaPant() {
        Assert.assertEquals(new ShoppingCartPage().getCronusYogaPantText(), "Cronus Yoga Pant");
    }

    @And("^I verify the size (\\d+)$")
    public void iVerifyTheSize(int arg0) {
        Assert.assertEquals(new ShoppingCartPage().getSizeText(), "32");
    }

    @And("^I verify the colour Black$")
    public void iVerifyTheColourBlack() {
        Assert.assertEquals(new ShoppingCartPage().getColorText(), "Black");
    }
}
