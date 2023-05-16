package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {

    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;

    // Declaring Methods
    public void clickOnOvernightDuffle() { // Method to click on overnight duffle
        log.info("Clicking On Overnight Duffle " + overnightDuffle.toString());
        clickOnElement(overnightDuffle);
    }
}


