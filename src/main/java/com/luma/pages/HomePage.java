package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jackets;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;

    // Defining Methods
    public void mouseHoverOnWomenMenu() {
        log.info("Mouse Hovering On Womens Menu " + womenMenu.toString());
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        log.info("Mouse Hovering On Tops Menu " + tops.toString());
        mouseHoverToElement(tops);
    }

    public void clickOnJackets() {
        log.info("Clicking On Jackets " + jackets.toString());
        clickOnElement(jackets);
    }

    public void mouseHoverOnMenMenu() {
        log.info("Mouse Hovering On Men Menu " + menMenu.toString());
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() {
        log.info("Mouse Hovering On Bottoms Menu " + bottomMenu.toString());
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPant() {
        log.info("Clicking On Pants " + pants.toString());
        clickOnElement(pants);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
        log.info("Mouse Hovering On Gear Menu " + gearMenu.toString());
    }

    public void clickOnBags() {
        log.info("Clicking On Bags " + bags.toString());
        clickOnElement(bags);
    }

}
