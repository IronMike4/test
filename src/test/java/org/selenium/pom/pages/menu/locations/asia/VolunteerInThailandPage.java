package org.selenium.pom.pages.menu.locations.asia;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerInThailandPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteer in Thailand'])[1]");

    public VolunteerInThailandPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerInThailandPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
