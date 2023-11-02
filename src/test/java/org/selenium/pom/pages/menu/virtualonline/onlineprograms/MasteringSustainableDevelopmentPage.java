package org.selenium.pom.pages.menu.virtualonline.onlineprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MasteringSustainableDevelopmentPage extends BasePage {
    private By pageTitle = By.xpath("(//h1[normalize-space()='Mastering Sustainable Development'])[1]");

    public MasteringSustainableDevelopmentPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public MasteringSustainableDevelopmentPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
