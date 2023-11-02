package org.selenium.pom.pages.menu.programsabroad.intern;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HabitatsAndEcosystemsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Habitat & ecosystem internship programs'])[1]");

    public HabitatsAndEcosystemsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public HabitatsAndEcosystemsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
