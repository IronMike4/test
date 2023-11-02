package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverManager extends DriverManager {

    @Override
    protected void startDriver() {
        WebDriverManager.safaridriver().cachePath("Drivers").setup();
        driver = new SafariDriver();
        driver.manage().window().maximize();
    }
}

