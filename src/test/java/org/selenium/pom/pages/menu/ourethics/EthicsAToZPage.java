package org.selenium.pom.pages.menu.ourethics;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class EthicsAToZPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='A - Z of Ethics'])[1]");

    public EthicsAToZPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public EthicsAToZPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
