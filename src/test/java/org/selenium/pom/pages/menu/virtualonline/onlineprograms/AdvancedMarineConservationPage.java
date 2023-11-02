package org.selenium.pom.pages.menu.virtualonline.onlineprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class AdvancedMarineConservationPage extends BasePage {
    private By pageTitle = By.xpath("(//h1[normalize-space()='Advanced Marine Conservation'])[1]");

    public AdvancedMarineConservationPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public AdvancedMarineConservationPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
