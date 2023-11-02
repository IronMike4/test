package org.selenium.pom.pages.menu.links.virtualandonline;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OnlinePrograms extends BasePage {

    private By foundationsInWildLifeConservation = By.xpath("//a[normalize-space()='Foundations in wildlife conservation']");
    private By foundationsInMarineConservation = By.xpath("//a[normalize-space()='Foundations in marine conservation']");
    private By foundationsInClimateChangeAndSustainability  = By.xpath("//a[normalize-space()='Foundations in climate change & sustainability']");
    private By foundationsInSocialEntrepreneurship  = By.xpath("//a[normalize-space()='Foundations in social entrepreneurship']");
    private By advancedMarineConservation   = By.xpath("//a[normalize-space()='Advanced marine conservation']");
    private By advancedWildlifeConservation   = By.xpath("//a[normalize-space()='Advanced wildlife conservation']");
    private By masteringSustainableDevelopment  = By.xpath("//a[normalize-space()='Mastering sustainable development']");

    public OnlinePrograms(WebDriver driver) {
        super(driver);
    }

    @Step
    public OnlinePrograms load() {
        loadPage("/");
        return this;
    }

    @Step
    public OnlinePrograms navigateToFoundationsInWildLifeConservationProgram(){
        wait.until(ExpectedConditions.elementToBeClickable(foundationsInWildLifeConservation)).click();
        return  this;
    }

    @Step
    public OnlinePrograms navigateToFoundationsInMarineConservationProgram(){
        wait.until(ExpectedConditions.elementToBeClickable(foundationsInMarineConservation)).click();
        return this;
    }

    @Step
    public OnlinePrograms navigateToFoundationsInClimateChangeAndSustainabilityProgram(){
        wait.until(ExpectedConditions.elementToBeClickable(foundationsInClimateChangeAndSustainability)).click();
        return  this;
    }

    @Step
    public OnlinePrograms navigateToFoundationsInSocialEntrepreneurshipProgram(){
        wait.until(ExpectedConditions.elementToBeClickable(foundationsInSocialEntrepreneurship)).click();
        return  this;
    }

    @Step
    public OnlinePrograms navigateToAdvancedMarineConservationProgram(){
        wait.until(ExpectedConditions.elementToBeClickable(advancedMarineConservation)).click();
        return  this;
    }

    @Step
    public OnlinePrograms navigateToAdvancedWildlifeConservationProgram(){
        wait.until(ExpectedConditions.elementToBeClickable(advancedWildlifeConservation)).click();
        return  this;
    }

    @Step
    public OnlinePrograms navigateToMasteringSustainableDevelopmentProgram(){
        wait.until(ExpectedConditions.elementToBeClickable(masteringSustainableDevelopment)).click();
        return  this;
    }
}
