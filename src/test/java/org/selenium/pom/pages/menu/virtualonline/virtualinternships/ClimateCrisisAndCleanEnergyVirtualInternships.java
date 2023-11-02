package org.selenium.pom.pages.menu.virtualonline.virtualinternships;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ClimateCrisisAndCleanEnergyVirtualInternships extends BasePage {
    private By pageTitle = By.xpath("(//h1[normalize-space()='Climate Crisis and Clean Energy'])[1]");

    public ClimateCrisisAndCleanEnergyVirtualInternships(WebDriver driver) {
        super(driver);
    }

    @Step
    public ClimateCrisisAndCleanEnergyVirtualInternships load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
