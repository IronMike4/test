package org.selenium.pom.pages.menu.programsabroad.professionalapprenticeships;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ProfessionalApprenticeshipPage extends BasePage {
    private final By pageTitle = By.xpath("(//h2[normalize-space()='Professional apprenticeships'])[1]");

    public ProfessionalApprenticeshipPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public ProfessionalApprenticeshipPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
