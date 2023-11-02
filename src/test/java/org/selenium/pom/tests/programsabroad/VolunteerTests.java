package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.programsabroad.FindAProgram;
import org.selenium.pom.pages.menu.links.programsabroad.Volunteer;
import org.selenium.pom.pages.menu.programsabroad.volunteerprograms.*;
import org.selenium.pom.pages.morepages.FindAProgram1;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VolunteerTests extends BaseTest {
    private final String volunteerAbroadPageTitle = "THE WHOLE WILD WORLD";
    private final String volunteerProjectPageTitle = "A WILDER WAY TO LEARN";
    private final String marineConservationPageTitle = "Marine Conservation Volunteering";
    private final String wildlifeConservationPageTitle = "Wildlife conservation volunteering";
    private final String endangeredSpeciesConservationPageTitle = "Endangered Species Conservation Volunteer Programs";
    private final String citizenSciencePageTitle = "Citizen Science – Collaborate in Scientific Research";
    private final String habitatsEcosystemsPageTitle = "Habitat & ecosystem volunteer programs";
    private final String climateChangePageTitle = "Climate Change Volunteer Programs";
    private final String communityBasedConservationPageTitle = "Community-based conservation volunteer programs";
    private final String volunteerWithAnimalsPageTitle = "Volunteer with animals";
    private final String multipleCountriesPageTitle = "THE WHOLE WILD WORLD";
    private final String findAProgramPageTitle = "FIND A PROGRAM";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToProgramsAbroadMenu();
    }

    @Description("Navigating to the Volunteer abroad page")
    @Test(description = "Navigate to the Volunteer abroad page")
    public void testNavigateToTheVolunteerAbroadPage() {
        new Volunteer(getDriver()).navigateToVolunteerAbroadPage();
        VolunteerAbroad volunteer = new VolunteerAbroad(getDriver());
        Assert.assertEquals(volunteer.getPageTitle(), volunteerAbroadPageTitle);
    }

    @Description("Navigating to the Volunteer projects page")
    @Test(description = "Navigate to the Volunteer projects page")
    public void testNavigatingToTheVolunteerProjectsPage() {
        new Volunteer(getDriver()).navigateToVolunteerProjectsPage();
        VolunteerProject volunteerProject = new VolunteerProject(getDriver());
        Assert.assertEquals(volunteerProject.getPageTitle(), volunteerProjectPageTitle);
    }

    @Description("Navigating to the Marine conservation page")
    @Test(description = "Navigate to the Marine conservation page")
    public void testNavigateToTheMarineConservationPage() {
        new Volunteer(getDriver()).navigateToMarineConservationPage();
        MarineConservation marine = new MarineConservation(getDriver());
        Assert.assertEquals(marine.getPageTitle(), marineConservationPageTitle);
    }

    @Description("Navigating to the Wildlife conservation page")
    @Test(description = "Navigate to the Wildlife conservation page")
    public void testNavigateToTheWildlifeConservationPage() {
        new Volunteer(getDriver()).navigateToWildlifeConservationPage();
        WildlifeConservation wildlife = new WildlifeConservation(getDriver());
        Assert.assertEquals(wildlife.getPageTitle(), wildlifeConservationPageTitle);
    }

    @Description("Navigating to the Endangered species conservation volunteer programs page")
    @Test(description = "Navigate to the Endangered species conservation volunteer programs page")
    public void testNavigateToTheEndangeredSpeciesConservationPage() {
        new Volunteer(getDriver()).navigateToEndangeredSpeciesConservationVolunteerPage();
        EndageredSpeciesConservation endangeredSpecies = new EndageredSpeciesConservation(getDriver());
        Assert.assertEquals(endangeredSpecies.getPageTitle(), endangeredSpeciesConservationPageTitle);
    }

    @Description("Navigating to the Citizen science volunteer page")
    @Test(description = "Navigate to the Citizen science volunteer page")
    public void testNavigateToTheCitizenScienceVolunteerPage() {
        new Volunteer(getDriver()).navigateToCitizenSciencePage();
        CitizenScience citizenScience = new CitizenScience(getDriver());
        Assert.assertEquals(citizenScience.getPageTitle(), citizenSciencePageTitle);
    }

    @Description("Navigating to the Habitats and ecosystems volunteer programs page")
    @Test(description = "Navigate to the Habitats and ecosystems volunteer programs page")
    public void testNavigateToTheHabitatsAndEcosystemsVolunteerPage() {
        new Volunteer(getDriver()).navigateToHabitatsAndEcosystemsVolunteer();
        HabitatsEcosystems habitatsEcosystems = new HabitatsEcosystems(getDriver());
        Assert.assertEquals(habitatsEcosystems.getPageTitle(), habitatsEcosystemsPageTitle);
    }

    @Description("Navigating to the Climate change volunteer programs page")
    @Test(description = "Navigate to the Climate change volunteer programs page")
    public void testNavigateToTheClimateChangeVolunteerPage() {
        new Volunteer(getDriver()).navigateToClimateChangeVolunteerPage();
        ClimateChange climateChange = new ClimateChange(getDriver());
        Assert.assertEquals(climateChange.getPageTitle(), climateChangePageTitle);
    }

    @Description("Navigating to the Community-based conservation volunteer programs page")
    @Test(description = "Navigate to the Community-based conservation volunteer programs page")
    public void testNavigateToTheCommunityBasedConservationVolunteerPage() {
        new Volunteer(getDriver()).navigateToCommunityBasedConservationPage();
        CommunityBasedConservation communityBased = new CommunityBasedConservation(getDriver());
        Assert.assertEquals(communityBased.getPageTitle(), communityBasedConservationPageTitle);
    }

    @Description("Navigating to the Volunteer with animals page")
    @Test(description = "Navigate to the Volunteer with animals page")
    public void testNavigateToTheVolunteerWithAnimalsPage() {
        new Volunteer(getDriver()).navigateToVolunteerWithAnimalsPage();
        VolunteerWithAnimals volunteerWithAnimals = new VolunteerWithAnimals(getDriver());
        Assert.assertEquals(volunteerWithAnimals.getPageTitle(), volunteerWithAnimalsPageTitle);
    }

    @Description("Navigating to the Volunteer Abroad in Multiple Countries page")
    @Test(description = "Navigate to the Volunteer Abroad in Multiple Countries page")
    public void testNavigateToTheVolunteerAbroadInMultipleCountriesPage() {
        new Volunteer(getDriver()).navigateToVolunteerInMultipleCountriesPage();
        VolunteerInMultipleCountries multipleCountries = new VolunteerInMultipleCountries(getDriver());
        Assert.assertEquals(multipleCountries.getPageTitle(), multipleCountriesPageTitle);
    }

    @Description("Navigating to the Find a program page from the programs abroad menu")
    @Test(description = "Navigate to the Find a program page from the programs abroad menu")
    public void testNavigateToFindAProgramPageFromProgramsAbroadMenu() {
        new FindAProgram(getDriver()).navigateToFindAProgramPage();
        FindAProgram1 findAProgram = new FindAProgram1(getDriver());
        Assert.assertEquals(findAProgram.getPageTitle(), findAProgramPageTitle);
    }
}
