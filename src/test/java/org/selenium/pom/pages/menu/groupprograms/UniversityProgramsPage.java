package org.selenium.pom.pages.menu.groupprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class UniversityProgramsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='University Programs'])[1]");
    public UniversityProgramsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public UniversityProgramsPage load() {
        loadPage("/group-travel");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
