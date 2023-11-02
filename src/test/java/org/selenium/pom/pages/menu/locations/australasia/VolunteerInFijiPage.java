package org.selenium.pom.pages.menu.locations.australasia;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerInFijiPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteer in Fiji'])[1]");

    public VolunteerInFijiPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerInFijiPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
