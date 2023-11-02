package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class HangTight extends BasePage {
    private final By hangTightMessage = By.xpath("//h1[normalize-space()='Hang tight!']");

    public HangTight(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getHangTightMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(hangTightMessage)).getText();
    }
}
