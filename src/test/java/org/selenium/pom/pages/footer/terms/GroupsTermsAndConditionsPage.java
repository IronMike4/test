package org.selenium.pom.pages.footer.terms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class GroupsTermsAndConditionsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Groups Terms and Conditions'])[1]");

    public GroupsTermsAndConditionsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public GroupsTermsAndConditionsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
