package org.selenium.pom.pages.footer.policies;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HealthAndHygienePage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Health and Hygiene'])[1]");

    public HealthAndHygienePage(WebDriver driver) {
        super(driver);
    }

    @Step
    public HealthAndHygienePage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
