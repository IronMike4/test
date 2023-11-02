package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Amazing extends BasePage {
    private final By amazingMessage = By.xpath("(//h1[normalize-space()='Amazing!'])[1]");

    public Amazing(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getAmazingMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(amazingMessage)).getText();
    }
}
