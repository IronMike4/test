package org.selenium.pom.pages.menu.aboutgvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class AwardsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Awards'])[1]");

    public AwardsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public AwardsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
