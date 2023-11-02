package org.selenium.pom.pages.menu.links.locations;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Europe extends BasePage {

    private final By europe = By.xpath("//a[normalize-space()='Europe']");
    private final By greece = By.xpath("//a[normalize-space()='Greece']");
    private final By canaryIslandSpain = By.xpath("//a[normalize-space()='Canary Islands, Spain']");

    public Europe(WebDriver driver) {
        super(driver);
    }

    @Step
    public Europe load() {
        loadPage("/");
        return this;
    }

    @Step
    public Europe navigateToEuropePage(){
        wait.until(ExpectedConditions.elementToBeClickable(europe)).click();
        return this;
    }

    @Step
    public Europe navigateToGreecePage(){
        wait.until(ExpectedConditions.elementToBeClickable(greece)).click();
        return  this;
    }

    @Step
    public Europe navigateToCanaryIslandSpainPage(){
        wait.until(ExpectedConditions.elementToBeClickable(canaryIslandSpain)).click();
        return  this;
    }
}
