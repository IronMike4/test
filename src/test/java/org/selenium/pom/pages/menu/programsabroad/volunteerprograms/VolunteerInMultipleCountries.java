package org.selenium.pom.pages.menu.programsabroad.volunteerprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerInMultipleCountries extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='The whole wild world'])[1]");

    public VolunteerInMultipleCountries(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerInMultipleCountries load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
