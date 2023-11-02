package org.selenium.pom.pages.menu.aboutgvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class WorkForUsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='Work for us'])[1]");

    public WorkForUsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public WorkForUsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
