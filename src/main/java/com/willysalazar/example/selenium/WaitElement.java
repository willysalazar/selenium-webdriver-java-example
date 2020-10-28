package com.willysalazar.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElement {

    public static WebElement waitForMessage(WebDriver driver, WebElement webElement) {
        int timeWait = 5;
        WebDriverWait explicitWaitByElement = new WebDriverWait(driver, timeWait);
        explicitWaitByElement.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }

    public static WebElement waitVisibilityOf(WebDriver driver, WebElement webElement) {
        int timeWait = 5;
        WebDriverWait explicitWaitByElement = new WebDriverWait(driver, timeWait);
        explicitWaitByElement.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;

    }
}
