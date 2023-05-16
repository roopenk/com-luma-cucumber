package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomensJacketsPage extends Utility {

    private static final Logger log = LogManager.getLogger(WomensJacketsPage.class.getName());
    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement productFilter;
    @CacheLookup
    @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
    WebElement nameList1;
    @CacheLookup
    @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
    WebElement nameList2;
    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    WebElement priceList1;
    @CacheLookup
    @FindBy(xpath = "//div[@class='price-box price-final_price'")
    WebElement priceList3;
    @CacheLookup
    @FindBy(xpath = "//div[@class='price-box price-final_price'")
    WebElement priceList4;
    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    WebElement priceList2;
    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']")
    List<WebElement> productList;
    @CacheLookup
    @FindBy(xpath = "//div[@class='price-box price-final_price'")
    WebElement priceList;

    // Defining Methods
    public void selectProductNameFilter(String filterName) {
        log.info("Selecting Products' Name " + filterName + " From Drop Down " + nameList1.toString());
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }

    public ArrayList<String> defaultProductList() {
        // Get all the products name and stored into array list
        List<WebElement> jacketsElementsList = productList;
        ArrayList<String> jacketsNameBefore = new ArrayList<>();
        for (WebElement e : jacketsElementsList) {
            jacketsNameBefore.add(e.getText());
        }
        System.out.println(jacketsNameBefore);
        log.info("Default Product List" + productList.toString());
        return jacketsNameBefore;

    }

    public ArrayList<String> afterSortingByProductName() {
        List<WebElement> jacketsElementsList = productList;
        ArrayList<String> jacketsNameAfter = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameAfter.add(value.getText());
        }
        System.out.println(jacketsNameAfter);
        log.info("Product list after sort by Product name" + productList.toString());
        return jacketsNameAfter;
    }

    public void selectProductNameFilter1(String filterName) {
        log.info("Selecting Products' Price " + filterName + " From Drop Down " + priceList.toString());
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }

    public ArrayList<String> getPriceList1() {
        List<WebElement> beforeFilterProductList = driver.findElements((By) priceList3);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        log.info("Storing And Sorting Products' Prices " + priceList3.toString());
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public ArrayList<String> getPriceList2() {
        log.info("Storing And Sorting Products' Prices " + priceList4.toString());
        List<WebElement> afterFilterProductList = driver.findElements((By) priceList4);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }
        return afterFilterProductList1;
    }

}
