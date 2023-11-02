package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeDriverManager extends DriverManager {

    @Override
    protected void startDriver() throws MalformedURLException {
        WebDriverManager.chromedriver().cachePath("Drivers").setup();
        ChromeOptions opt = new ChromeOptions();
//        driver = new ChromeDriver();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),opt);
        driver.manage().window().maximize();
    }
}

