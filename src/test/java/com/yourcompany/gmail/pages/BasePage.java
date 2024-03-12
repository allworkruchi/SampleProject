package com.yourcompany.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    protected static WebDriver driver;

    public BasePage() {
        if (driver == null) {
            // Set up Chrome WebDriver
            System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized"); // Maximize browser window
            driver = new ChromeDriver(options);
        }
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}