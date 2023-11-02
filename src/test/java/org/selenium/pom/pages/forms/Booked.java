package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Booked extends BasePage {

    private final By bookedMessage = By.xpath("(//h1[normalize-space()=\"You're booked!\"])[1]");

    public Booked(WebDriver driver) {
        super(driver);
    }

    @Step
    public String getBookedMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(bookedMessage)).getText();
    }
}

