package org.selenium.pom.pages.menu.links.virtualandonline;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VirtualInternshipPrograms extends BasePage {
    private final By virtualInternshipPrograms = By.xpath("(//a[normalize-space()='Virtual internship programs'])[1]");
    private final By marineConservation = By.xpath("//a[@href='/virtual-internship/marine-conservation/']");
    private final By wildLifeConservation = By.xpath("//a[@href='/virtual-internship/wildlife-conservation/']");
    private final By environmentalAndCorporateSustainability = By.xpath("//a[normalize-space()='Environmental and corporate sustainability']");
    private final By climateCrisisAndCleanEnergy = By.xpath("//a[normalize-space()='Climate crisis and clean energy']");
    private final By whatsIncluded = By.xpath("(//a[normalize-space()=\"What's included\"])[1]");

    public VirtualInternshipPrograms(WebDriver driver) {
        super(driver);
    }

    @Step
    public VirtualInternshipPrograms load() {
        loadPage("/");
        return this;
    }

    @Step
    public VirtualInternshipPrograms navigateToVirtualInternshipPrograms(){
        wait.until(ExpectedConditions.elementToBeClickable(virtualInternshipPrograms)).click();
        return  this;
    }

    @Step
    public VirtualInternshipPrograms navigateToMarineConservationInternship(){
        wait.until(ExpectedConditions.elementToBeClickable(marineConservation)).click();
        return this;
    }

    @Step
    public VirtualInternshipPrograms navigateToWildlifeConservationInternship(){
        wait.until(ExpectedConditions.elementToBeClickable(wildLifeConservation)).click();
        return  this;
    }

    @Step
    public VirtualInternshipPrograms navigateToEnvironmentalAndCorporateSustainability(){
        wait.until(ExpectedConditions.elementToBeClickable(environmentalAndCorporateSustainability)).click();
        return  this;
    }

    @Step
    public VirtualInternshipPrograms navigateToClimateCrisisAndCleanEnergy(){
        wait.until(ExpectedConditions.elementToBeClickable(climateCrisisAndCleanEnergy)).click();
        return  this;
    }

    @Step
    public VirtualInternshipPrograms navigateToWhatsIncluded(){
        wait.until(ExpectedConditions.elementToBeClickable(whatsIncluded)).click();
        return  this;
    }
}
