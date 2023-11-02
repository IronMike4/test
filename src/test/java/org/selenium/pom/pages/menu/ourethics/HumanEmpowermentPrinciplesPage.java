package org.selenium.pom.pages.menu.ourethics;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HumanEmpowermentPrinciplesPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='Human Empowerment Principles'])[1]");

    public HumanEmpowermentPrinciplesPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public HumanEmpowermentPrinciplesPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
