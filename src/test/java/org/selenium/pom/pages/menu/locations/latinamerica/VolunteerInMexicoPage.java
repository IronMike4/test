package org.selenium.pom.pages.menu.locations.latinamerica;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerInMexicoPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteer in Mexico'])[1]");

    public VolunteerInMexicoPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerInMexicoPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
