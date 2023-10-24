package com.willysalazar.example.driver;

import org.openqa.selenium.chrome.ChromeOptions;

class ChromeOptionsFactory {

    ChromeOptions build() {

        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("start-maximized");
        optionsChrome.addArguments("lang=pt-BR");
        // Looks like all the below options/capabilities that were listed here were
        // deprecated so I had to comment them out to make the code work

        // optionsChrome.addArguments("--ignore-certificate-errors");
        // optionsChrome.addArguments("--web-security=false");
        // optionsChrome.addArguments("--ssl-protocol=any");
        // optionsChrome.addArguments("--ignore-ssl-errors=true");
        optionsChrome.setAcceptInsecureCerts(true);

        return optionsChrome;
    }
}
