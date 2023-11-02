package org.selenium.pom.pages.menu.links.locations;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Asia extends BasePage {

    private final By asia = By.xpath("//a[normalize-space()='Asia']");
    private final By thailand = By.xpath("//a[normalize-space()='Thailand']");

    public Asia(WebDriver driver) {
        super(driver);
    }

    @Step
    public Asia load() {
        loadPage("/");
        return this;
    }

    @Step
    public Asia navigateToAsiaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(asia)).click();
        return this;
    }

    @Step
    public Asia navigateToThailandPage(){
        wait.until(ExpectedConditions.elementToBeClickable(thailand)).click();
        return  this;
    }
}
