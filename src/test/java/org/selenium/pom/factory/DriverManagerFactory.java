package org.selenium.pom.factory;

import org.selenium.pom.constants.DriverType;

public class DriverManagerFactory {
    public static DriverManager getManager(DriverType driverType) {
        switch (driverType) {
            case CHROME -> {
                return new ChromeDriverManager();
            }
            case FIREFOX -> {
                return new FirefoxDriverManager();
            }
            case EDGE -> {
                return new EdgeDriverManager();
            }
            case SAFARI -> {
                return new SafariDriverManager();
            }
            default -> throw new IllegalStateException("Unexpected value: " + driverType);
        }
    }
}
