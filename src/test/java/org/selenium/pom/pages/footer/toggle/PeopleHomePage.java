package org.selenium.pom.pages.footer.toggle;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class PeopleHomePage extends BasePage {
    private final By pageTitle = By.xpath("(//p[normalize-space()='Go further. Join GVI People.'])[1]");
    public PeopleHomePage(WebDriver driver) {
        super(driver);
    }

    @Step
    public PeopleHomePage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
