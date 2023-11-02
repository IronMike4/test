package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ThankYou extends BasePage {

    private final By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you!']");

    public ThankYou(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getThankYouMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(thankYouMessage)).getText();
    }
}

