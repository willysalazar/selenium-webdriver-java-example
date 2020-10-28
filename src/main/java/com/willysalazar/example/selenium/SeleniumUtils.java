package com.willysalazar.example.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {

    public static void clickUsingJs(WebDriver driver, WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

}
