package org.selenium.pom.pages.menu.conservationissues;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class PlasticPollutionPage extends BasePage {
    private final By pageTitle = By.xpath("");

    public PlasticPollutionPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public PlasticPollutionPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
