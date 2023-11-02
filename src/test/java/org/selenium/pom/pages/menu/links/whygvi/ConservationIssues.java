package org.selenium.pom.pages.menu.links.whygvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ConservationIssues extends BasePage {
    private final By plasticPollution = By.xpath("//a[normalize-space()='Plastic pollution']");
    private final By climateChange = By.xpath("//a[contains(@href,'/conservation-issues/climate-change/')]");
    private final By endangeredSpecies = By.xpath("//a[normalize-space()='Endangered species']");
    private final By deforestation = By.xpath("//a[normalize-space()='Deforestation']");
    private final By overfishing = By.xpath("//a[normalize-space()='Overfishing']");
    public ConservationIssues(WebDriver driver) {
        super(driver);
    }

    @Step
    public ConservationIssues load() {
        loadPage("/");
        return this;
    }

    @Step
    public ConservationIssues navigateToPlasticPollutionPage(){
        wait.until(ExpectedConditions.elementToBeClickable(plasticPollution)).click();
        return  this;
    }

    @Step
    public ConservationIssues navigateToClimateChangePage(){
        wait.until(ExpectedConditions.elementToBeClickable(climateChange)).click();
        return this;
    }

    @Step
    public ConservationIssues navigateToEndangeredSpeciePage(){
        wait.until(ExpectedConditions.elementToBeClickable(endangeredSpecies)).click();
        return  this;
    }

    @Step
    public ConservationIssues navigateToDeforestationPage(){
        wait.until(ExpectedConditions.elementToBeClickable(deforestation)).click();
        return  this;
    }

    @Step
    public ConservationIssues navigateToOverfishingPage(){
        wait.until(ExpectedConditions.elementToBeClickable(overfishing)).click();
        return  this;
    }
}
