package org.selenium.pom.factory;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public abstract class DriverManager {
    protected WebDriver driver;

    protected abstract void startDriver() throws MalformedURLException;

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            try {
                startDriver();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver;
    }
}