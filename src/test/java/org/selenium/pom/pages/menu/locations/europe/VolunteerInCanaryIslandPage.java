package org.selenium.pom.pages.menu.locations.europe;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerInCanaryIslandPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteer in the Canary Islands, Spain'])[1]");

    public VolunteerInCanaryIslandPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerInCanaryIslandPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
