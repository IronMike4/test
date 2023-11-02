package org.selenium.pom.pages.menu.programsabroad.researchfellowships;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ResearchFellowshipsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h2[normalize-space()='Research fellowships'])[1]");

    public ResearchFellowshipsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public ResearchFellowshipsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
