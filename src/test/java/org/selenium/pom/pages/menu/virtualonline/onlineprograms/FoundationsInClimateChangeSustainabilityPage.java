package org.selenium.pom.pages.menu.virtualonline.onlineprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FoundationsInClimateChangeSustainabilityPage extends BasePage {
    private By pageTitle = By.xpath("(//h1[normalize-space()='Foundations in Climate Change & Sustainability'])[1]");

    public FoundationsInClimateChangeSustainabilityPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public FoundationsInClimateChangeSustainabilityPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}