package org.selenium.pom.pages.footer.participants;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CareerBreaksPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Career Breaks'])[1]");
    public CareerBreaksPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public CareerBreaksPage load() {
        loadPage("/career-breaks");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
