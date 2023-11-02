package org.selenium.pom.pages.menu.support;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class TravelDuringCovid19Page extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='Travel During COVID-19'])[1]");

    public TravelDuringCovid19Page(WebDriver driver) {
        super(driver);
    }

    @Step
    public TravelDuringCovid19Page load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
