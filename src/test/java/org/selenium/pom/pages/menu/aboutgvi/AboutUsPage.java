package org.selenium.pom.pages.menu.aboutgvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class AboutUsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='About Us'])[1]");

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public AboutUsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
