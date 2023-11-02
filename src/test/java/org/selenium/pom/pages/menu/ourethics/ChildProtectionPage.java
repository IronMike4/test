package org.selenium.pom.pages.menu.ourethics;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ChildProtectionPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='Child And Vulnerable Adult Protection Policy'])[1]");

    public ChildProtectionPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public ChildProtectionPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
