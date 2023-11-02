package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

    @Override
    protected void startDriver() {
        WebDriverManager.edgedriver().cachePath("Drivers").setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
}

