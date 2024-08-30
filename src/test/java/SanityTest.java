import org.example.ContactUs;
import org.example.Men;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Men.*;
import static org.example.Store.*;


public class SanityTest extends BaseWeb {

    WebDriver driver = init();



    @Test()
    public void testValidUrl(){
        WebElement storeLink = driver.findElement(By.id(STORE_NAV_LINK));
        storeLink.click();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://atid.store/store/");
    }


    //MEN TESTING
    @Test()
    public void testMenValidUrl(){
        MenLinkClick(driver);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://atid.store/product-category/men/");
    }

    @Test()
    public void addToCart(){
        MenLinkClick(driver);
        AtidShoesClick(driver);
        String sucessAddToCartText = Men.getSucessMessage(driver);
        Assert.assertEquals(sucessAddToCartText.substring(10), Men.ATID_BLUE_SHOES_TEXT);
    }

    @Test()
    public void filterByPrice(){
        MenLinkClick(driver);
        filterPrice(driver);
    }

    @Test()
    public void checkWomenButton(){
        MenLinkClick(driver);
        checkWomenButtonInMenPage(driver);
        Assert.assertEquals(Men.getSWomenPage(driver) , WOMEN_TEXT);
    }





    //STORE TESTING

    @Test()
    public void store(){

        storeLinkClick(driver);
    }

    @Test()
    public void sort(){
        WebElement storeLink = driver.findElement(By.id(STORE_NAV_LINK));
        storeLink.click();
        sorting(driver);
    }



    //CONTACT_US TESTING
    @Test()
    public void testValidContactUs(){
        ContactUs.fillContactUsForm(driver,"yosef","abo qweder","yosef@gmail.com","Helllllo!");
        Assert.assertEquals(ContactUs.getSucessMessage(driver),ContactUs.SUCESS_MESSAGE_TEXT);

    }

    @Test
    public void testInValidEmail() {
        ContactUs.fillContactUsForm(driver, "yosef", "helllo", "yosef1999", "qweder");
        driver.getPageSource().toString().contains("Please enter a valid email address.");

    }
}
