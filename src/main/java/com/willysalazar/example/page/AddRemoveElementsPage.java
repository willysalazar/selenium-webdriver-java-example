package com.willysalazar.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {

    private WebDriver driver;

    public AddRemoveElementsPage(WebDriver webDriver){
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*/h3")
    private WebElement titleAddRemoveElementsPage;

    @FindBy(linkText = "Add/Remove Elements")
    private WebElement linkTextAddRemoveElements;

    @FindBy(xpath = "//*[@id='content']/div/button")
    private WebElement buttonAddElement;

    @FindBy(xpath = "//*[@id='elements']/button")
    private WebElement buttonDelete;

    public String getTextTitleAddRemoveElements() {
        return titleAddRemoveElementsPage.getText();
    }

    public AddRemoveElementsPage clickLinkAddRemoveElements(){
        linkTextAddRemoveElements.click();
        return this;
    }

    public AddRemoveElementsPage addElements(){
        buttonAddElement.click();
        return this;
    }

    public AddRemoveElementsPage deleteElements(){
        buttonDelete.click();
        return this;
    }
}
