package com.willysalazar.example.utils;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.willysalazar.example.driver.DriverFactory;
import com.willysalazar.example.page.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import com.willysalazar.example.report.ReportListener;

import static com.willysalazar.example.utils.PropertyLoader.returnConfigValue;

@Listeners({ExtentITestListenerClassAdapter.class, ReportListener.class})
public abstract class BaseTest {

    protected static WebDriver driver;
    protected WelcomePage welcomePage;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void preCondition() {
        driver = new DriverFactory().createInstance();
        driver.get(returnConfigValue("url.base"));
        welcomePage = new WelcomePage(driver);
    }

    @AfterMethod
    public void postCondition(){
        driver.quit();
    }
}