package org.selenium.pom.pages.menu.links.locations;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Africa extends BasePage {

    private final By africa = By.xpath("//a[normalize-space()='Africa']");
    private final By seychelles = By.xpath("//a[normalize-space()='Seychelles']");
    private final By madagascar = By.xpath("//a[normalize-space()='Madagascar']");
    private final By southAfrica = By.xpath("//a[normalize-space()='South Africa']");

    public Africa(WebDriver driver) {
        super(driver);
    }

    @Step
    public Africa load() {
        loadPage("/");
        return this;
    }

    @Step
    public Africa navigateToAfricaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(africa)).click();
        return this;
    }

    @Step
    public Africa navigateToSeychellesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(seychelles)).click();
        return  this;
    }

    @Step
    public Africa navigateToMadagascarPage(){
        wait.until(ExpectedConditions.elementToBeClickable(madagascar)).click();
        return  this;
    }

    @Step
    public Africa navigateToSouthAfricaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(southAfrica)).click();
        return  this;
    }
}
