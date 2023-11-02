package org.selenium.pom.pages.menu.programsabroad.intern;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class WildlifeConservationPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Wildlife conservation internships'])[1]");

    public WildlifeConservationPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public WildlifeConservationPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
