package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Volunteer extends BasePage {
    private final By volunteerAbroad = By.xpath("//a[normalize-space()='Volunteer']");
    private final By volunteerProjects  = By.xpath("//a[normalize-space()='All projects']");
    private final By marineConservation = By.xpath("//a[@href='/volunteer-abroad/marine-conservation/']");
    private final By wildlifeConservation = By.xpath("//a[@href='/volunteer-abroad/wildlife-conservation/']");
    private final By endangeredSpecies = By.xpath("//a[@href='/volunteer-abroad/endangered-species/']");
    private final By citizenScience = By.xpath("//a[normalize-space()='Citizen science']");
    private final By habitatsAndEcosystems = By.xpath("//a[@href='/volunteer-abroad/habitats-and-ecosystems/']");
    private final By climateChange = By.xpath("//a[@href='/volunteer-abroad/climate-change-volunteer-programs/']");
    private final By communityBasedConservation = By.xpath("//a[@href='/volunteer-abroad/community-based-conservation/']");
    private final By volunteerWithAnimals = By.xpath("//a[normalize-space()='Volunteer with animals']");
    private final By volunteerAbroadInMultipleCountries = By.xpath("//a[normalize-space()='Multi country volunteering']");
    public Volunteer(WebDriver driver) {
        super(driver);
    }

    @Step
    public Volunteer load() {
        loadPage("/");
        return this;
    }

    @Step
    public Volunteer navigateToVolunteerAbroadPage(){
        wait.until(ExpectedConditions.elementToBeClickable(volunteerAbroad)).click();
        return  this;
    }

    @Step
    public Volunteer navigateToVolunteerProjectsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(volunteerProjects)).click();
        return this;
    }

    @Step
    public Volunteer navigateToMarineConservationPage(){
        wait.until(ExpectedConditions.elementToBeClickable(marineConservation)).click();
        return  this;
    }

    @Step
    public Volunteer navigateToWildlifeConservationPage(){
        wait.until(ExpectedConditions.elementToBeClickable(wildlifeConservation)).click();
        return  this;
    }

    @Step
    public Volunteer navigateToEndangeredSpeciesConservationVolunteerPage(){
        wait.until(ExpectedConditions.elementToBeClickable(endangeredSpecies)).click();
        return  this;
    }

    @Step
    public Volunteer navigateToCitizenSciencePage(){
        wait.until(ExpectedConditions.elementToBeClickable(citizenScience)).click();
        return  this;
    }

    @Step
    public Volunteer navigateToHabitatsAndEcosystemsVolunteer(){
        wait.until(ExpectedConditions.elementToBeClickable(habitatsAndEcosystems)).click();
        return  this;
    }

    @Step
    public Volunteer navigateToClimateChangeVolunteerPage(){
        wait.until(ExpectedConditions.elementToBeClickable(climateChange)).click();
        return  this;
    }

    @Step
    public Volunteer navigateToCommunityBasedConservationPage(){
        wait.until(ExpectedConditions.elementToBeClickable(communityBasedConservation)).click();
        return  this;
    }

    @Step
    public Volunteer navigateToVolunteerWithAnimalsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(volunteerWithAnimals)).click();
        return  this;
    }
    @Step
    public Volunteer navigateToVolunteerInMultipleCountriesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(volunteerAbroadInMultipleCountries)).click();
        return  this;
    }
}
