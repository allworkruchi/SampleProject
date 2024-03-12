package com.yourcompany.gmail.pages;

import org.openqa.selenium.By;

public class GmailHomePage extends BasePage {
    private static final String URL = "https://mail.google.com/";

    private By composeButton = By.xpath("//div[@class='T-I T-I-KE L3']");

    public void open() {
        driver.get(URL);
    }

    public ComposePage clickComposeButton() {
        driver.findElement(composeButton).click();
        return new ComposePage();
    }
}