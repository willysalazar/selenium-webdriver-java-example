package com.willysalazar.example.toolsqa;

import com.willysalazar.example.pageObjects.DemoQaPage;
import com.willysalazar.example.pageObjects.ElementsPage;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.willysalazar.example.utils.BaseTest;

public class ElementsTest extends BaseTest {

    @Test
    public void should_be_fill_text_box_elements_with_success() {
        DemoQaPage demoqa = new DemoQaPage(driver);
        demoqa.clickOnCardElements();
        ElementsPage elements = new ElementsPage(driver);
        Assert.assertEquals(elements.returnTitleSectionElements(), "Elements");

        String outputName =
                elements
                .clickOnTextBox()
                .fillFullName("Willy")
                .fillEmail("willy@teste.com")
                .fillCurrentAddress("CurrentAddress")
                .fillPermanentAddress("PermanentAddress")
                .clickOnSubimit()
                .outputTextName();

        Assert.assertEquals(outputName, "Name:Willy");
    }
}
