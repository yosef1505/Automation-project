package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Store {

    final public static String STORE_NAV_LINK = "menu-item-45";
    final public static String ANCHOR_BRACELET = "wc-block-search__input-1";
    final public static String SEARCH_BUTTON = "wc-block-product-search__button";
    final public static String MAXIMIZE_BUTTON = "//*[@id=\"product-160\"]/div[1]/a";
    final public static String DEFAULT_SORTING = "//*[@id=\"main\"]/div/form/select";


    public static void storeLinkClick(WebDriver driver){
        WebElement storeLink = driver.findElement(By.id(STORE_NAV_LINK));
        storeLink.click();

        WebElement search = driver.findElement(By.id(ANCHOR_BRACELET));
        search.sendKeys("Anchor Bracelet");

        WebElement searchbutton = driver.findElement(By.className(SEARCH_BUTTON));
        searchbutton.click();

        WebElement maximize = driver.findElement(By.xpath(MAXIMIZE_BUTTON));
        maximize.click();
    }

    public static void sorting(WebDriver driver){
        WebElement default_sorting  =  driver.findElement(By.xpath(DEFAULT_SORTING));
        default_sorting.click();

        Select dropdown = new Select(driver.findElement(By.xpath(DEFAULT_SORTING)));
        dropdown.selectByIndex(1);
    }


}
