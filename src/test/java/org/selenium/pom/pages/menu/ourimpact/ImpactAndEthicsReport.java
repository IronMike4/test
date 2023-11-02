package org.selenium.pom.pages.menu.ourimpact;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ImpactAndEthicsReport extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='Impact and Ethics Reports'])[1]");

    public ImpactAndEthicsReport(WebDriver driver) {
        super(driver);
    }

    @Step
    public ImpactAndEthicsReport load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
