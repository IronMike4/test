package org.selenium.pom.utils;

import org.selenium.pom.constants.EnvType;

import java.util.Properties;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
        String env = System.getProperty("env", String.valueOf(EnvType.UK));
        switch (EnvType.valueOf(env)) {
            case AU -> properties = PropertyUtils.propertyLoader("src/test/resources/au_config.properties");
            case CA -> properties = PropertyUtils.propertyLoader("src/test/resources/ca_config.properties");
            case IE -> properties = PropertyUtils.propertyLoader("src/test/resources/ie_config.properties");
            case SA -> properties = PropertyUtils.propertyLoader("src/test/resources/sa_config.properties");
            case UK -> properties = PropertyUtils.propertyLoader("src/test/resources/uk_config.properties");
            case US -> properties = PropertyUtils.propertyLoader("src/test/resources/us_config.properties");
            default -> throw new IllegalStateException("Invalid env type: " + env);
        }
    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl() {
        String prop = properties.getProperty("baseUrl");
        if (prop != null) return prop;
        else throw new RuntimeException("property baseUrl is not specified in the uk_config.properties file");
    }
}
