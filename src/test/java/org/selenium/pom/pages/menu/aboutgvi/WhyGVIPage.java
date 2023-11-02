package org.selenium.pom.pages.menu.aboutgvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class WhyGVIPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Why GVI?'])[1]");

    public WhyGVIPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public WhyGVIPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
