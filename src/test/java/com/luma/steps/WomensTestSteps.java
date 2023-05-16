package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.WomensJacketsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomensTestSteps {
    @When("^I mouse hover on womens menu$")
    public void iMouseHoverOnWomensMenu() {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("^I mouse hover on tops$")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTops();
    }

    @And("^I click on jackets$")
    public void iClickOnJackets() {
        new HomePage().clickOnJackets();
    }

    @And("^I select product name filter$")
    public void iSelectProductNameFilter() {
        new WomensJacketsPage().selectProductNameFilter("Product Name");
    }

    @Then("^I can view products sorted by name$")
    public void iCanViewProductsSortedByName() {
        Assert.assertEquals(new WomensJacketsPage().defaultProductList(), new WomensJacketsPage().afterSortingByProductName());
    }

    @And("^I select products price filter$")
    public void iSelectProductsPriceFilter() {
      new WomensJacketsPage().selectProductNameFilter1("Price");
    }

    @Then("^I can view products sorted by price$")
    public void iCanViewProductsSortedByPrice() {
        Assert.assertEquals(new WomensJacketsPage().getPriceList1(), new WomensJacketsPage().getPriceList2());
    }
}
