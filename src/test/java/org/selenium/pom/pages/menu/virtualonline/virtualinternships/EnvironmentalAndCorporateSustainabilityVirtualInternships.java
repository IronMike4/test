package org.selenium.pom.pages.menu.virtualonline.virtualinternships;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class EnvironmentalAndCorporateSustainabilityVirtualInternships extends BasePage {
    private By pageTitle = By.xpath("(//h1[normalize-space()='Environmental and Corporate Sustainability'])[1]");

    public EnvironmentalAndCorporateSustainabilityVirtualInternships(WebDriver driver) {
        super(driver);
    }

    @Step
    public EnvironmentalAndCorporateSustainabilityVirtualInternships load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
