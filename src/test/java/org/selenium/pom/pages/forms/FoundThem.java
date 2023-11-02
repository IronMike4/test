package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FoundThem extends BasePage {

    private final By foundThemMessage = By.xpath("//h1[normalize-space()='We found them!']");


    public FoundThem(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getFoundThemMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(foundThemMessage)).getText();
    }
}
