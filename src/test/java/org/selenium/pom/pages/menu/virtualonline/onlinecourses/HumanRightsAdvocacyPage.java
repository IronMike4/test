package org.selenium.pom.pages.menu.virtualonline.onlinecourses;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HumanRightsAdvocacyPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Human Rights & Advocacy'])[1]");

    public HumanRightsAdvocacyPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public HumanRightsAdvocacyPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
