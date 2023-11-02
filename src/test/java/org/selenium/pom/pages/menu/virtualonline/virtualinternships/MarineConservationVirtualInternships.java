package org.selenium.pom.pages.menu.virtualonline.virtualinternships;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MarineConservationVirtualInternships extends BasePage {
    private By pageTitle = By.xpath("(//h1[normalize-space()='Marine conservation'])[1]");

    public MarineConservationVirtualInternships(WebDriver driver) {
        super(driver);
    }

    @Step
    public MarineConservationVirtualInternships load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
