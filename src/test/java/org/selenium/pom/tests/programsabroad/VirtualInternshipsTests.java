package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.virtualandonline.FindAProgram;
import org.selenium.pom.pages.menu.links.virtualandonline.VirtualInternshipPrograms;
import org.selenium.pom.pages.menu.virtualonline.virtualinternships.*;
import org.selenium.pom.pages.morepages.FindAProgram1;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VirtualInternshipsTests extends BaseTest {
    private final String virtualInternshipsPageTitle = "Virtual internship programs";
    private final String findAProgramPageTitle = "FIND A PROGRAM";
    private final String marineConservationPageTitle = "Marine conservation";
    private final String wildlifeConservationPageTitle = "Wildlife Conservation";
    private final String corporateSustainabilityPageTitle = "Environmental and Corporate Sustainability";
    private final String climateCrisisPageTitle = "Climate Crisis and Clean Energy";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToVirtualAndOnlineMenu();
    }

    @Description("Navigating to the Virtual internship programs page")
    @Test(description = "Navigate to the Virtual internship programs page")
    public void testNavigateToVirtualInternshipProgramsPage() {
        new VirtualInternshipPrograms(getDriver()).navigateToVirtualInternshipPrograms();
        VirtualInternshipsPage virtualInternships = new VirtualInternshipsPage(getDriver());
        Assert.assertEquals(virtualInternships.getPageTitle(), virtualInternshipsPageTitle);
    }

    @Description("Navigating to the Marine conservation virtual internships page")
    @Test(description = "Navigate to the Marine conservation virtual internships page")
    public void testNavigateToMarineConservationPage() {
        new VirtualInternshipPrograms(getDriver()).navigateToMarineConservationInternship();
        MarineConservationVirtualInternships marineConservation = new MarineConservationVirtualInternships(getDriver());
        Assert.assertEquals(marineConservation.getPageTitle(), marineConservationPageTitle);
    }

    @Description("Navigating Navigate to the Wildlife conservation virtual internships page")
    @Test(description = "Navigate to the Wildlife conservation virtual internships page")
    public void testNavigateToWildlifeConservationPage() {
        new VirtualInternshipPrograms(getDriver()).navigateToWildlifeConservationInternship();
        WildlifeConservationVirtualInternships wildlife = new WildlifeConservationVirtualInternships(getDriver());
        Assert.assertEquals(wildlife.getPageTitle(), wildlifeConservationPageTitle);
    }

    @Description("Navigating to the Environmental and Corporate Sustainability virtual internships page")
    @Test(description = "Navigate to the Environmental and Corporate Sustainability virtual internships page")
    public void testNavigateToEnvironmentalAndCorporateSustainabilityPage() {
        new VirtualInternshipPrograms(getDriver()).navigateToEnvironmentalAndCorporateSustainability();
        EnvironmentalAndCorporateSustainabilityVirtualInternships corporateSustainability = new EnvironmentalAndCorporateSustainabilityVirtualInternships(getDriver());
        Assert.assertEquals(corporateSustainability.getPageTitle(), corporateSustainabilityPageTitle);
    }

    @Description("Navigating to the Climate Crisis and Clean Energy virtual internships page")
    @Test(description = "Navigate to the Climate Crisis and Clean Energy virtual internships page")
    public void testNavigateToClimateCrisisAndCleanEnergyPage() {
        new VirtualInternshipPrograms(getDriver()).navigateToClimateCrisisAndCleanEnergy();
        ClimateCrisisAndCleanEnergyVirtualInternships climateCrisis = new ClimateCrisisAndCleanEnergyVirtualInternships(getDriver());
        Assert.assertEquals(climateCrisis.getPageTitle(), climateCrisisPageTitle);
    }

    @Description("Navigating to the Find a program page from the virtual online menu")
    @Test(description = "Navigate to the Find a program page from the virtual online menu")
    public void testNavigateToFindAProgramPageFromVirtualOnlineMenu() {
        new FindAProgram(getDriver()).navigateToFindAProgramPage();
        FindAProgram1 findAProgram = new FindAProgram1(getDriver());
        Assert.assertEquals(findAProgram.getPageTitle(), findAProgramPageTitle);
    }
}
