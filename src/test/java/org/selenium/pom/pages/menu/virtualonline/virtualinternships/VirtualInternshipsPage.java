package org.selenium.pom.pages.menu.virtualonline.virtualinternships;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VirtualInternshipsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Virtual internship programs'])[1]");

    public VirtualInternshipsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VirtualInternshipsPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
