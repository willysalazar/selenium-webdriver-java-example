package com.willysalazar.example;

import com.willysalazar.example.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomeTest extends BaseTest {

    @Test
    public void shouldValidateTitleTheInternet() {
        String title = welcomePage.getTitle();
        Assert.assertEquals(title, "The Internet");
    }

    @Test
    public void shouldValidateTitleWelcome() {
        String titleWelcome = welcomePage.getTextTitleWelcome();
        Assert.assertEquals(titleWelcome, "Welcome to the-internet");
    }

    @Test
    public void shouldValidateSubTitleAvailableExamples() {
        String titleWelcome = welcomePage.getTextSubTitleAvailable();
        Assert.assertEquals(titleWelcome, "Available Examples");
    }
}
