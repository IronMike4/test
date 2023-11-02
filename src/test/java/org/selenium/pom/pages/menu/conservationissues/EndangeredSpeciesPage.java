package org.selenium.pom.pages.menu.conservationissues;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class EndangeredSpeciesPage extends BasePage {
    private final By pageTitle = By.xpath("");

    public EndangeredSpeciesPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public EndangeredSpeciesPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
