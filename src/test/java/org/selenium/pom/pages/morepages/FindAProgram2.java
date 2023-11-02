package org.selenium.pom.pages.morepages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FindAProgram2 extends BasePage {
    private final By seaTurtleThaiApplyBtn = By.xpath("(//a)[200]");
    private final By findAProgramTitle = By.xpath("(//h4[normalize-space()='Find a program'])[1]");

    public FindAProgram2(WebDriver driver) {
        super(driver);
    }

    @Step
    public FindAProgram2 NavigateToSeaTurtleThaiApplication() {
        wait.until(ExpectedConditions.elementToBeClickable(seaTurtleThaiApplyBtn)).click();
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(findAProgramTitle)).getText();
    }

    @Step
    public FindAProgram2 load() {
        loadPage("/application-form");
        return this;
    }
}
