package org.selenium.pom.pages.menu.locations.africa;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerInSeychellesPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteer in Seychelles'])[1]");

    public VolunteerInSeychellesPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerInSeychellesPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
