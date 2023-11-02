package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class JustAMoment extends BasePage {
    private final By justAMomentMessage = By.xpath("//h1[normalize-space()='Just a moment...']");
    public JustAMoment(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getJustAMomentMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(justAMomentMessage)).getText();
    }
}
