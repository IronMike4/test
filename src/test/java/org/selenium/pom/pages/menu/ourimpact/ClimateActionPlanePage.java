package org.selenium.pom.pages.menu.ourimpact;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ClimateActionPlanePage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='Climate action plan'])[1]");

    public ClimateActionPlanePage(WebDriver driver) {
        super(driver);
    }

    @Step
    public ClimateActionPlanePage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
