package com.willysalazar.example.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasicAuthPage {

    private WebDriver driver;


    public BasicAuthPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/pre")
    private WebElement textNotAuthorize;

    @FindBy(xpath = "//*[@id='content']/div/h3")
    private WebElement textTitletAuthorize;

    @FindBy(linkText = "Basic Auth")
    private WebElement linkTextBasicAuth;

    public String getTextNotAuthorize() {
        return textNotAuthorize.getText();
    }

    public String getTextTitleBasicAuth() {
        return textTitletAuthorize.getText();
    }

    public BasicAuthPage clickLinkBasicAuth(){
        linkTextBasicAuth.click();
        return this;
    }

    public BasicAuthPage navigateToBasicAuth(String user, String pass){
        driver.navigate().to("http://" + user + ":" + user + "@the-internet.herokuapp.com/basic_auth");
        return this;
    }



}
