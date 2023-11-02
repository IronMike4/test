package org.selenium.pom.pages.menu.support;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HealthAndSafetyPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[contains(text(),'GVI’s health and safety')])[1]");

    public HealthAndSafetyPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public HealthAndSafetyPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
