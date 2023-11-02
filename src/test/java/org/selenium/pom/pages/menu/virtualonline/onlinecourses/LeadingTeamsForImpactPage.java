package org.selenium.pom.pages.menu.virtualonline.onlinecourses;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class LeadingTeamsForImpactPage extends BasePage {
    private By pageTitle = By.xpath("(//h1[normalize-space()='Leading Teams for Impact'])[1]");

    public LeadingTeamsForImpactPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public LeadingTeamsForImpactPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
