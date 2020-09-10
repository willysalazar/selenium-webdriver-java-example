package com.willysalazar.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.willysalazar.example.seleniumAbstract.SeleniumUtils.clickUsingJs;


public class ElementsPage {

    private WebDriver driver;

    public ElementsPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//span[contains(text(),'Text Box')]")
    private WebElement btnTextBox;

    @FindBy(xpath = "//div[@class='main-header']")
    private WebElement titleHeaderElements;

    @FindBy(id = "userName")
    private WebElement fieldFullName;

    @FindBy(id = "userEmail")
    private WebElement fieldEmail;

    @FindBy(id = "currentAddress")
    private WebElement fieldCurrentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement fieldPermanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//p[@id='name']")
    private WebElement txtOutputName;

    public ElementsPage clickOnTextBox(){
        btnTextBox.click();
        return this;
    }

    public String returnTitleSectionElements(){
        return titleHeaderElements.getText();
    }

    public ElementsPage fillFullName(String fullName){
        fieldFullName.sendKeys(fullName);
        return this;
    }

    public ElementsPage fillEmail(String email){
        fieldEmail.sendKeys(email);
        return this;
    }

    public ElementsPage fillCurrentAddress(String currentAddres){
        fieldCurrentAddress.sendKeys(currentAddres);
        return this;
    }

    public ElementsPage fillPermanentAddress(String permanentAddress){
        fieldPermanentAddress.sendKeys(permanentAddress);
        return this;
    }

    //TODO review btn subimit
    public ElementsPage clickOnSubimit(){
        clickUsingJs(driver,btnSubmit);
        return this;
    }

    public String outputTextName(){
        return txtOutputName.getText();
    }

}
