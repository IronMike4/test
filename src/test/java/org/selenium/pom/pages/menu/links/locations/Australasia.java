package org.selenium.pom.pages.menu.links.locations;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Australasia extends BasePage {

    private final By australasia = By.xpath("//a[normalize-space()='Australasia']");
    private final By fiji = By.xpath("//a[normalize-space()='Fiji']");

    public Australasia(WebDriver driver) {
        super(driver);
    }

    @Step
    public Australasia load() {
        loadPage("/");
        return this;
    }

    @Step
    public Australasia navigateToAustralasiaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(australasia)).click();
        return this;
    }

    @Step
    public Australasia navigateToFijiPage(){
        wait.until(ExpectedConditions.elementToBeClickable(fiji)).click();
        return  this;
    }
}
