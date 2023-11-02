package org.selenium.pom.pages.footer.terms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class PrivacyPolicyPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Privacy Policy'])[1]");

    public PrivacyPolicyPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public PrivacyPolicyPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
