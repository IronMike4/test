package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.programsabroad.Intern;
import org.selenium.pom.pages.menu.programsabroad.intern.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InternTests extends BaseTest {
    private Intern intern;
    private final String internshipsPageTitle = "Internships";
    private final String internshipsAbroadPageTitle = "Internships at a glance";
    private final String marineConservationPageTitle = "Marine Conservation Internships Abroad";
    private final String wildlifeConservationPageTitle = "Wildlife conservation internships";
    private final String endangeredSpeciesPageTitle = "Endangered Species Conservation Internship Programs";
    private final String habitatsAndEcosystemsPageTitle = "Habitat & ecosystem internship programs";
    private final String climateChangePageTitle = "Climate Change Internship Programs";
    private final String communityBasedConservationPageTitle = "Community-based conservation internship projects";
    private final String animalCarePageTitle = "Animal Care Internships";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToProgramsAbroadMenu();
        intern = new Intern(getDriver());
    }

    @Description("Navigating to the Internships page")
    @Test(description = "Navigate to the Internships page")
    public void testNavigateToTheInternshipsPage() {
        intern.navigateToInternshipsPage();
        InternshipsPage intern = new InternshipsPage(getDriver());
        Assert.assertEquals(intern.getPageTitle(), internshipsPageTitle);
    }

    @Description("Navigating to the Internships abroad page")
    @Test(description = "Navigate to the Internships abroad page")
    public void testNavigateToTheInternshipsAbroadPage() {
        intern.navigateToInternshipsAbroadPage();
        InternshipsAbroadPage internAbroad = new InternshipsAbroadPage(getDriver());
        Assert.assertEquals(internAbroad.getPageTitle(), internshipsAbroadPageTitle);
    }

    @Description("Navigating to the Marine conservation internships page")
    @Test(description = "Navigate to the Marine conservation internships page")
    public void testNavigateToTheMarineConservationInternshipsPage() {
        intern.navigateToMarineConservationInternshipsPage();
        MarineConservationPage marine = new MarineConservationPage(getDriver());
        Assert.assertEquals(marine.getPageTitle(), marineConservationPageTitle);
    }

    @Description("Navigating to the Wildlife conservation internships page")
    @Test(description = "Navigate to the Wildlife conservation internships page")
    public void testNavigateToTheWildlifeConservationInternshipsPage() {
        intern.navigateToWildlifeConservationInternshipsPage();
        WildlifeConservationPage wildlife = new WildlifeConservationPage(getDriver());
        Assert.assertEquals(wildlife.getPageTitle(), wildlifeConservationPageTitle);
    }

    @Description("Navigating to the Endangered species conservation internships page")
    @Test(description = "Navigate to the Endangered species conservation internships page")
    public void testNavigateToTheEndangeredSpeciesConservationInternshipsPage() {
        intern.navigateToEndangeredSpeciesConservationInternshipsPage();
        EndangeredSpeciesPage endangeredSpecies = new EndangeredSpeciesPage(getDriver());
        Assert.assertEquals(endangeredSpecies.getPageTitle(), endangeredSpeciesPageTitle);
    }

    @Description("Navigating to the Habitats and ecosystems internship programs page")
    @Test(description = "Navigate to the Habitats and ecosystems internship programs page")
    public void testNavigateToTheHabitatsAndEcosystemsInternshipPage() {
        intern.navigateToHabitatsAndEcosystemsInternshipsPage();
        HabitatsAndEcosystemsPage habitats = new HabitatsAndEcosystemsPage(getDriver());
        Assert.assertEquals(habitats.getPageTitle(), habitatsAndEcosystemsPageTitle);
    }

    @Description("Navigating to the Climate change internship programs page")
    @Test(description = "Navigate to the Climate change internship programs page")
    public void testNavigateToTheClimateChangeInternshipPage() {
        intern.navigateToClimateChangeInternshipsPage();
        ClimateChangePage climateChange = new ClimateChangePage(getDriver());
        Assert.assertEquals(climateChange.getPageTitle(), climateChangePageTitle);
    }

    @Description("Navigating to the Community-based conservation internship projects page")
    @Test(description = "Navigate to the Community-based conservation internship projects page")
    public void testNavigateToTheCommunityBasedConservationInternshippage() {
        intern.navigateToCommunityBasedConservationPage();
        CommunityBasedConservationPage communityBased = new CommunityBasedConservationPage(getDriver());
        Assert.assertEquals(communityBased.getPageTitle(), communityBasedConservationPageTitle);
    }

    @Description("Navigating to the Animal care internships page")
    @Test(description = "Navigate to the Animal care internships page")
    public void testNavigateToTheAnimalCareInternshipsPage() {
        intern.navigateToAnimalCarePage();
        AnimalCarePage animalCare = new AnimalCarePage(getDriver());
        Assert.assertEquals(animalCare.getPageTitle(), animalCarePageTitle);
    }
}
