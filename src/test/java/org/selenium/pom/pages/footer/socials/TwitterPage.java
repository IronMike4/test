package org.selenium.pom.pages.footer.socials;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class TwitterPage extends BasePage {
    private final By pageTitle = By.xpath("");

    public TwitterPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public TwitterPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
