package com.willysalazar.example;

import com.willysalazar.example.utils.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger();

    @Test
    public void shouldValidateAddAndRemoveElements(){
        String textTitleAddRemoveElements =
                addRemoveElementsPage.
                        clickLinkAddRemoveElements().
                        addElements().
                        deleteElements().
                        getTextTitleAddRemoveElements();
        Assert.assertEquals(textTitleAddRemoveElements,textTitleAddRemoveElements);
        LOGGER.info("Test Add/Remove Elements successful");
    }

}
