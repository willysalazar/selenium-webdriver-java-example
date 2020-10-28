package com.willysalazar.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    ChromeLocalDriverFactory chromeLocalDriverFactory;

    public DriverFactory() {
        ChromeOptions chromeOptions = new ChromeOptionsFactory().build();
        chromeLocalDriverFactory = new ChromeLocalDriverFactory(chromeOptions);
        chromeOptions.setHeadless(true);
    }

    public WebDriver createInstance(){
        return chromeLocalDriverFactory.driver();
    }
}
