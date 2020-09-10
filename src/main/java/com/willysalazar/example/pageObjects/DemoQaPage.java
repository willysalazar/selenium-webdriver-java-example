package com.willysalazar.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.willysalazar.example.seleniumAbstract.SeleniumUtils.clickUsingJs;


public class DemoQaPage {

    private WebDriver driver;

    public DemoQaPage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[contains(text(),'Elements')]")
    private WebElement btnCardElements;


    //TODO review accessibility cards
    public DemoQaPage clickOnCardElements(){
        clickUsingJs(driver, btnCardElements);
        return this;
    }


}
