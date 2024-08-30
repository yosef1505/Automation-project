package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Men {
    final public static String MEN_NAV_LINK = "menu-item-266";
    final public static String ATID_Blue_Shoes = "//*[@id=\"main\"]/div/ul/li[1]/div[2]/a/h2";
    final public static String ADD_TO_CART_BUTTON = "//*[@id=\"product-360\"]/div[2]/form/button";
    final public static String ATID_BLUE_SHOES = "//*[@id=\"main\"]/div/div[1]/div";
    final public static String ATID_BLUE_SHOES_TEXT = "“ATID Blue Shoes” has been added to your cart.";
    final public static String FILTER = "//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[2]/button";
    final public static String SCROLL = "//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/span[1]";
    final public static String WOMEN_BUTTON = "//*[@id=\"woocommerce_product_categories-2\"]/ul/li[3]/a";
    final public static String WOMEN = "//*[@id=\"main\"]/div/header/h1";
    final public static String WOMEN_TEXT = "Women";



    public static void MenLinkClick(WebDriver driver) {
        WebElement menLink = driver.findElement(By.id(MEN_NAV_LINK));
        menLink.click();
    }

    public static void AtidShoesClick(WebDriver driver) {
        WebElement atidClick = driver.findElement(By.xpath(ATID_Blue_Shoes));
        atidClick.click();

        WebElement add = driver.findElement(By.xpath(ADD_TO_CART_BUTTON));
        add.click();

    }

    public static void filterPrice (WebDriver driver){
        WebElement slider = driver.findElement(By.xpath(SCROLL));

        for (int i = 1; i <= 5 ; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

        WebElement filter = driver.findElement(By.xpath(FILTER));
        filter.click();
    }

    public static void checkWomenButtonInMenPage(WebDriver driver){
        WebElement check = driver.findElement(By.xpath(WOMEN_BUTTON));
        check.click();
    }

    public static String getSWomenPage(WebDriver driver) {
        WebElement sucessMessage = driver.findElement(By.xpath(WOMEN));
        return sucessMessage.getText();

    }

    public static String getSucessMessage(WebDriver driver) {
        WebElement sucessMessage = driver.findElement(By.xpath(ATID_BLUE_SHOES));
        return sucessMessage.getText();

    }
}
