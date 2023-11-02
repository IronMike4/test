package org.selenium.pom.pages.menu.links.locations;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CommunityDevelopmentLocations extends BasePage {

    private final By ghana = By.xpath("//a[normalize-space()='Ghana']");
    private final By nepal = By.xpath("//a[normalize-space()='Nepal']");
    private final By cambodia = By.xpath("//a[normalize-space()='Cambodia']");

    public CommunityDevelopmentLocations(WebDriver driver) {
        super(driver);
    }

    @Step
    public CommunityDevelopmentLocations load() {
        loadPage("/");
        return this;
    }

    @Step
    public CommunityDevelopmentLocations navigateToGhanaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ghana)).click();
        return this;
    }

    @Step
    public CommunityDevelopmentLocations navigateToNepalPage(){
        wait.until(ExpectedConditions.elementToBeClickable(nepal)).click();
        return  this;
    }

    @Step
    public CommunityDevelopmentLocations navigateToCambodiaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(cambodia)).click();
        return  this;
    }
}
