package org.selenium.pom.pages.menu.programsabroad.intern;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CommunityBasedConservationPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Community-based conservation internship projects'])[1]");

    public CommunityBasedConservationPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public CommunityBasedConservationPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
