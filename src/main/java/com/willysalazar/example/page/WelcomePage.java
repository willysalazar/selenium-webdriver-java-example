package com.willysalazar.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage  {

    private WebDriver driver;

    public WelcomePage (WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    private WebElement titleWelcomePage;

    @FindBy(xpath = "//h2")
    private WebElement subTitleWelcomePage;


    public String getTitle() {
        return driver.getTitle();
    }

    public String getTextTitleWelcome() {
        return titleWelcomePage.getText();
    }

    public String getTextSubTitleAvailable() {
        return subTitleWelcomePage.getText();
    }
}
