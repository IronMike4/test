package org.selenium.pom.pages.footer.terms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class GroupPaymentPlansPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='GVI Groups Payment Plans Policy'])[1]");

    public GroupPaymentPlansPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public GroupPaymentPlansPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
