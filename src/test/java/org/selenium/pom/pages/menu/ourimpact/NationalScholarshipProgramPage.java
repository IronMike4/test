package org.selenium.pom.pages.menu.ourimpact;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class NationalScholarshipProgramPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='National scholarship program'])[1]");

    public NationalScholarshipProgramPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public NationalScholarshipProgramPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
