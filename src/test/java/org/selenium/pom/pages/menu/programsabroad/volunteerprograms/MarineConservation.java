package org.selenium.pom.pages.menu.programsabroad.volunteerprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MarineConservation extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Marine Conservation Volunteering'])[1]");

    public MarineConservation(WebDriver driver) {
        super(driver);
    }

    @Step
    public MarineConservation load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
