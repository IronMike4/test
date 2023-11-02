package org.selenium.pom.pages.menu.ourimpact;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OurPartnersPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='Our partners'])[1]");

    public OurPartnersPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public OurPartnersPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
