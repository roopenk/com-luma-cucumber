package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffleText;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedProductPrice;

    // Defining Methods
    public String getShoppingCart() {
        log.info("Getting Shopping Cart Text " + shoppingCart.toString());
        return getTextFromElement(shoppingCart);
    }

    public String getCronusYogaPantText() {
        log.info("Getting Cronus Yoga Pant Text " + cronusYogaPant.toString());
        return getTextFromElement(cronusYogaPant);
    }

    public String getSizeText() {
        log.info("Getting Size Text " + size.toString());
        return getTextFromElement(size);
    }

    public String getColorText() {
        log.info("Getting Colour Text " + color.toString());
        return getTextFromElement(color);
    }

    public String getOverNightDuffleText() {
        log.info("Getting Over Night Duffle Text " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }

    public String getQty() {
        log.info("Getting Quantity Text " + qtyText.toString());
        String qty = driver.findElement((By) qtyText).getAttribute("value");
        return qty;
    }

    public String getProductPrice() {
        log.info("Getting Product Price Text " + productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public void changeQtyOfOverNightDuffle(String newQty) {
        log.info("Clearing Quantity " + newQty + " From Quantity Field " + qty.toString());
        driver.findElement((By) qty).clear();
        log.info("Sending Quantity " + newQty + " To Quantity Field " + qty.toString());
        sendTextToElement(qty, newQty);
    }

    public void clickOnUpdateShoppingCart() {
        log.info("Clicking On Update Shopping Cart " + updateShoppingCart.toString());
        clickOnElement(updateShoppingCart);
    }

    public String getUpdatedProductPrice() {
        log.info("Getting Updated Product Price Text " + updatedProductPrice.toString());
        return getTextFromElement(updatedProductPrice);
    }

}
