package org.selenium.pom.pages.menu.locations.europe;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerInGreecePage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteer in Greece'])[1]");

    public VolunteerInGreecePage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerInGreecePage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
