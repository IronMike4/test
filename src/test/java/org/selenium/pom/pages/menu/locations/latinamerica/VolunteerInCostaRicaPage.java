package org.selenium.pom.pages.menu.locations.latinamerica;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerInCostaRicaPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteer in Costa Rica'])[1]");

    public VolunteerInCostaRicaPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerInCostaRicaPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
