package org.selenium.pom.pages.footer.terms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class BushwiseTermsAndConditionsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Bushwise Terms and Conditions'])[1]");

    public BushwiseTermsAndConditionsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public BushwiseTermsAndConditionsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
