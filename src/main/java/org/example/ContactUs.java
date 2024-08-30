package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
    final public static String CONTACT_NAV_LINK = "menu-item-829";
    final public static String NAME = "wpforms-15-field_0";
    final public static String SUBJECT = "wpforms-15-field_5";
    final public static String EMAIL = "wpforms-15-field_4";
    final public static String MESSAGE = "wpforms-15-field_2";
    final public static String SEND_MESSAGE_BUTTON = "wpforms-submit-15";
    final public static String SUCESS_MESSAGE = "wpforms-confirmation-15";
    final public static String SUCESS_MESSAGE_TEXT = "Thanks for contacting us! We will be in touch with you shortly.";


    public static void fillContactUsForm(WebDriver driver,String name,String subject,String email,String message){
        driver.findElement(By.id(CONTACT_NAV_LINK)).click();
        WebElement nameField = driver.findElement(By.id(NAME));
        nameField.sendKeys(name);
        WebElement subjectField = driver.findElement(By.id(SUBJECT));
        subjectField.sendKeys(subject);
        WebElement emailField = driver.findElement(By.id(EMAIL));
        emailField.sendKeys(email);
        WebElement messageField = driver.findElement(By.id(MESSAGE));
        messageField.sendKeys(message);
        WebElement submitButton  = driver.findElement(By.id(SEND_MESSAGE_BUTTON));
        submitButton.click();
    }

    public static String getSucessMessage(WebDriver driver){
        WebElement sucessMessage  = driver.findElement(By.id(SUCESS_MESSAGE));
        return sucessMessage.getText();
    }
}

