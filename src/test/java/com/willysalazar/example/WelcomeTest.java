package com.willysalazar.example;

import com.willysalazar.example.utils.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomeTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger();

    @Test
    public void shouldValidateTitleTheInternet() {
        String title = welcomePage.getTitle();
        Assert.assertEquals(title, "The Internet");
        LOGGER.info("Title found: " + title);
    }

    @Test
    public void shouldValidateTitleWelcome() {
        String titleWelcome = welcomePage.getTextTitleWelcome();
        Assert.assertEquals(titleWelcome, "Welcome to the-internet");
        LOGGER.info("Title found: " + titleWelcome);
    }

    @Test
    public void shouldValidateSubTitleAvailableExamples() {
        String titleWelcome = welcomePage.getTextSubTitleAvailable();
        Assert.assertEquals(titleWelcome, "Available Examples");
        LOGGER.info("Title found: " + titleWelcome);

    }
}
