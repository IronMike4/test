package org.selenium.pom.pages.menu.programsabroad.volunteerprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class EndageredSpeciesConservation extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Endangered Species Conservation Volunteer Programs'])[1]");

    public EndageredSpeciesConservation(WebDriver driver) {
        super(driver);
    }

    @Step
    public EndageredSpeciesConservation load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
