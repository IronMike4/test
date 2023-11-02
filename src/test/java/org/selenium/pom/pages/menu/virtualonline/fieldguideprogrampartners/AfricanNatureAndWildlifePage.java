package org.selenium.pom.pages.menu.virtualonline.fieldguideprogrampartners;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class AfricanNatureAndWildlifePage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='African Nature and Wildlife'])[1]");

    public AfricanNatureAndWildlifePage(WebDriver driver) {
        super(driver);
    }

    @Step
    public AfricanNatureAndWildlifePage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
