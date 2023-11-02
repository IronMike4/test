package org.selenium.pom.pages.footer.policies;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ChildProtectionPolicyPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='GVI Child and Vulnerable Adult Protection Policy'])[1]");

    public ChildProtectionPolicyPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public ChildProtectionPolicyPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
