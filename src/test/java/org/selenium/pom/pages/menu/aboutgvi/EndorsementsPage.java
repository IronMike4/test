package org.selenium.pom.pages.menu.aboutgvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class EndorsementsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Endorsements'])[1]");

    public EndorsementsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public EndorsementsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
