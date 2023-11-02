package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxDriverManager extends DriverManager {

    @Override
    protected void startDriver() throws MalformedURLException {
        WebDriverManager.firefoxdriver().cachePath("Drivers").setup();
        FirefoxOptions opt = new FirefoxOptions();
//        driver = new FirefoxDriver();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),opt);
        driver.manage().window().maximize();
    }
}


