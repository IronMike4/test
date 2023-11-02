package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Success extends BasePage {
    private final By successMessage = By.xpath("(//h1[normalize-space()='Success!'])[1]");

    public Success(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
    }
}
