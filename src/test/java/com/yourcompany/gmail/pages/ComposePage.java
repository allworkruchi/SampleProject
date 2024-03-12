package com.yourcompany.gmail.pages;

import org.openqa.selenium.By;

public class ComposePage extends BasePage {
    private By composeWindow = By.xpath("//div[contains(@class, 'AD')]");
    private By emailAddressField = By.name("to");
    private By subjectField = By.name("subjectbox");
    private By bodyField = By.xpath("//div[@role='textbox']");

    public boolean isComposeWindowDisplayed() {
        return driver.findElement(composeWindow).isDisplayed();
    }

    public boolean isEmailAddressFieldEmpty() {
        return driver.findElement(emailAddressField).getText().isEmpty();
    }

    public boolean isSubjectFieldEmpty() {
        return driver.findElement(subjectField).getText().isEmpty();
    }

    public boolean isBodyFieldEmpty() {
        return driver.findElement(bodyField).getText().isEmpty();
    }
}