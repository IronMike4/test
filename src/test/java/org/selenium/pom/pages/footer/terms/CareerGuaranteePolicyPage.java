package org.selenium.pom.pages.footer.terms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CareerGuaranteePolicyPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='GVI Career Guarantee Policy'])[1]");

    public CareerGuaranteePolicyPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public CareerGuaranteePolicyPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
