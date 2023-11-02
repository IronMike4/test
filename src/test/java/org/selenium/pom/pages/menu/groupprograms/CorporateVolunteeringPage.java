package org.selenium.pom.pages.menu.groupprograms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CorporateVolunteeringPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Corporate Volunteering Abroad'])[1]");
    public CorporateVolunteeringPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public CorporateVolunteeringPage load() {
        loadPage("/group-travel");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
