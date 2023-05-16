package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OverNightDuffle extends Utility {

    private static final Logger log = LogManager.getLogger(OverNightDuffle.class.getName());
    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    // Defining Methods
    public String getOverNightDuffelText() {
        log.info("Getting Over Night Duffle Text " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantityTo3(String newQty) {
        log.info("Clearing Quantity " + newQty + " From Quantity Field " + qty.toString());
        driver.findElement((By) qty).clear();
        log.info("Sending Quantity " + newQty + " To Quantity Field " + qty.toString());
        sendTextToElement(qty, newQty);
    }

    public void clickOnAddToCart() {
        log.info("Clicking On Add To Cart " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getAddToCartText() {
        log.info("Getting Add To Cart Text " + addToCartText.toString());
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        log.info("Clicking On Shopping Cart " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

}
