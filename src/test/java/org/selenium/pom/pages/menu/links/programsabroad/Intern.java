package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Intern extends BasePage {
    private final By intern = By.xpath("//a[normalize-space()='Intern']");
    private final By allInternships = By.xpath("//a[normalize-space()='All internships']");
    private final By marineConservation = By.xpath("//a[@href='/internships/marine-conservation-internships/'][normalize-space()='Marine conservation']");
    private final By wildLifeConservation = By.xpath("//a[@href='/internships/wildlife-conservation-internships/'][normalize-space()='Wildlife conservation']");
    private final By endangeredSpeciesConservation = By.xpath("//a[@href='/internships/endangered-species/'][normalize-space()='Endangered species conservation']");
    private final By habitatsAndEcosystems = By.xpath("//a[@href='/internships/habitats-and-ecosystems/'][normalize-space()='Habitats and ecosystems']");
    private final By climateChange = By.xpath("//a[@href='/internships/climate-change-internship-programs/'][normalize-space()='Climate change']");
    private final By communityBasedConservation = By.xpath("//a[@href='/internships/community-based-conservation/'][normalize-space()='Community-based conservation']");
    private final By animalCare = By.xpath("//a[normalize-space()='Animal care']");
    public Intern(WebDriver driver) {
        super(driver);
    }

    @Step
    public Intern load() {
        loadPage("/");
        return this;
    }

    @Step
    public Intern navigateToInternshipsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(intern)).click();
        return  this;
    }

    @Step
    public Intern navigateToInternshipsAbroadPage(){
        wait.until(ExpectedConditions.elementToBeClickable(allInternships)).click();
        return this;
    }

    @Step
    public Intern navigateToMarineConservationInternshipsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(marineConservation)).click();
        return  this;
    }

    @Step
    public Intern navigateToWildlifeConservationInternshipsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(wildLifeConservation)).click();
        return  this;
    }

    @Step
    public Intern navigateToEndangeredSpeciesConservationInternshipsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(endangeredSpeciesConservation)).click();
        return  this;
    }

    @Step
    public Intern navigateToHabitatsAndEcosystemsInternshipsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(habitatsAndEcosystems)).click();
        return  this;
    }

    @Step
    public Intern navigateToClimateChangeInternshipsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(climateChange)).click();
        return  this;
    }

    @Step
    public Intern navigateToCommunityBasedConservationPage(){
        wait.until(ExpectedConditions.elementToBeClickable(communityBasedConservation)).click();
        return  this;
    }

    @Step
    public Intern navigateToAnimalCarePage(){
        wait.until(ExpectedConditions.elementToBeClickable(animalCare)).click();
        return  this;
    }
}
