package org.selenium.pom.pages.menu.programsabroad.volunteerprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteerProject extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='A wilder way to learn'])[1]");

    public VolunteerProject(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteerProject load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
