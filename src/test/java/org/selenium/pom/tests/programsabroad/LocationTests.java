package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.locations.*;
import org.selenium.pom.pages.menu.locations.africa.VolunteerInAfricaPage;
import org.selenium.pom.pages.menu.locations.africa.VolunteerInMadagascarPage;
import org.selenium.pom.pages.menu.locations.africa.VolunteerInSAPage;
import org.selenium.pom.pages.menu.locations.africa.VolunteerInSeychellesPage;
import org.selenium.pom.pages.menu.locations.asia.VolunteerInAsiaPage;
import org.selenium.pom.pages.menu.locations.asia.VolunteerInThailandPage;
import org.selenium.pom.pages.menu.locations.australasia.VolunteerInAustralasiaPage;
import org.selenium.pom.pages.menu.locations.australasia.VolunteerInFijiPage;
import org.selenium.pom.pages.menu.locations.communitydevelopmentlocations.VolunteerInCambodiaPage;
import org.selenium.pom.pages.menu.locations.communitydevelopmentlocations.VolunteerInGhanaPage;
import org.selenium.pom.pages.menu.locations.communitydevelopmentlocations.VolunteerInNepalPage;
import org.selenium.pom.pages.menu.locations.europe.VolunteerInCanaryIslandPage;
import org.selenium.pom.pages.menu.locations.europe.VolunteerInEuropePage;
import org.selenium.pom.pages.menu.locations.europe.VolunteerInGreecePage;
import org.selenium.pom.pages.menu.locations.latinamerica.VolunteerInCostaRicaPage;
import org.selenium.pom.pages.menu.locations.latinamerica.VolunteerInLatinAmericaPage;
import org.selenium.pom.pages.menu.locations.latinamerica.VolunteerInMexicoPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocationTests extends BaseTest {
    private final String africaPageTitle = "Volunteer in Africa";
    private final String seychellesPageTitle = "Volunteer in Seychelles";
    private final String madagascarPageTitle = "Volunteer in Madagascar";
    private final String southAfricaPageTitle = "Volunteer in South Africa";
    private final String asiaPageTitle = "Volunteer in Asia";
    private final String thailandPageTitle = "Volunteer in Thailand";
    private final String australasiaPageTitle = "Volunteer in Australasia";
    private final String fijiPageTitle = "Volunteer in Fiji";
    private final String europePageTitle = "Volunteer in Europe";
    private final String greecePageTitle = "Volunteer in Greece";
    private final String canaryIslandPageTitle = "Volunteer in the Canary Islands, Spain";
    private final String latinAmericaPageTitle = "Volunteer in Latin America";
    private final String costaRicaPageTitle = "Volunteer in Costa Rica";
    private final String mexicoPageTitle = "Volunteer in Mexico";
    private final String ghanaPageTitle = "Volunteer in Ghana";
    private final String nepalPageTitle = "Volunteer in Nepal";
    private final String cambodiaPageTitle = "Volunteer in Cambodia";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver()).
                navigateToLocationsMenu();
    }

    @Description("Navigating to the Volunteer in Africa page")
    @Test(description = "Navigate to the Volunteer in Africa page")
    public void testNavigateToVolunteerInAfricaPage() {
        new Africa(getDriver()).navigateToAfricaPage();
        VolunteerInAfricaPage africa = new VolunteerInAfricaPage(getDriver());
        Assert.assertEquals(africa.getPageTitle(), africaPageTitle);
    }

    @Description("Navigating to the Volunteer in Seychelles page")
    @Test(description = "Navigate to the Volunteer in Seychelles page")
    public void testNavigateToVolunteerInSeychellesPage() {
        new Africa(getDriver()).navigateToSeychellesPage();
        VolunteerInSeychellesPage seychelles = new VolunteerInSeychellesPage(getDriver());
        Assert.assertEquals(seychelles.getPageTitle(), seychellesPageTitle);
    }

    @Description("Navigating to the Volunteer in Madagascar page")
    @Test(description = "Navigate to the Volunteer in Madagascar page")
    public void testNavigateToVolunteerInMadagascarPage() {
        new Africa(getDriver()).navigateToMadagascarPage();
        VolunteerInMadagascarPage madagascar = new VolunteerInMadagascarPage(getDriver());
        Assert.assertEquals(madagascar.getPageTitle(), madagascarPageTitle);
    }

    @Description("Navigating to the Volunteer in South Africa page")
    @Test(description = "Navigate to the Volunteer in South Africa page")
    public void testNavigateToVolunteerInSouthAfricaPage() {
        new Africa(getDriver()).navigateToSouthAfricaPage();
        VolunteerInSAPage southAfrica = new VolunteerInSAPage(getDriver());
        Assert.assertEquals(southAfrica.getPageTitle(), southAfricaPageTitle);
    }

    @Description("Navigating to the Volunteer in Asia page")
    @Test(description = "Navigate to the Volunteer in Asia page")
    public void testNavigateToVolunteerInAsiaPage() {
        new Asia(getDriver()).navigateToAsiaPage();
        VolunteerInAsiaPage asia = new VolunteerInAsiaPage(getDriver());
        Assert.assertEquals(asia.getPageTitle(), asiaPageTitle);
    }

    @Description("Navigating to the Volunteer in Thailand page")
    @Test(description = "Navigate to the Volunteer in Thailand page")
    public void testNavigateToVolunteerInThailandPage() {
        new Asia(getDriver()).navigateToThailandPage();
        VolunteerInThailandPage thailand = new VolunteerInThailandPage(getDriver());
        Assert.assertEquals(thailand.getPageTitle(), thailandPageTitle);
    }

    @Description("Navigating to the Volunteer in Australasia page")
    @Test(description = "Navigate to the Volunteer in Australasia page")
    public void testNavigateToVolunteerInAustralasiaPage() {
        new Australasia(getDriver()).navigateToAustralasiaPage();
        VolunteerInAustralasiaPage australasia = new VolunteerInAustralasiaPage(getDriver());
        Assert.assertEquals(australasia.getPageTitle(), australasiaPageTitle);
    }

    @Description("Navigating to the Volunteer in Fiji page")
    @Test(description = "Navigate to the Volunteer in Fiji page")
    public void testNavigateToVolunteerInFijiPage() {
        new Australasia(getDriver()).navigateToFijiPage();
        VolunteerInFijiPage fiji = new VolunteerInFijiPage(getDriver());
        Assert.assertEquals(fiji.getPageTitle(), fijiPageTitle);
    }

    @Description("Navigating to the Volunteer in Europe page")
    @Test(description = "Navigate to the Volunteer in Europe page")
    public void testNavigateToVolunteerInEuropePage() {
        new Europe(getDriver()).navigateToEuropePage();
        VolunteerInEuropePage europe = new VolunteerInEuropePage(getDriver());
        Assert.assertEquals(europe.getPageTitle(), europePageTitle);
    }

    @Description("Navigating to the Volunteer in Greece page")
    @Test(description = "Navigate to the Volunteer in Greece page")
    public void testNavigateToVolunteerInGreecePage() {
        new Europe(getDriver()).navigateToGreecePage();
        VolunteerInGreecePage greece = new VolunteerInGreecePage(getDriver());
        Assert.assertEquals(greece.getPageTitle(), greecePageTitle);
    }

    @Description("Navigating to the Volunteer in the Canary Islands, Spain page")
    @Test(description = "Navigate to the Volunteer in the Canary Islands, Spain page")
    public void testNavigateToVolunteerInCanaryIslandsSpainPage() {
        new Europe(getDriver()).navigateToCanaryIslandSpainPage();
        VolunteerInCanaryIslandPage canaryIsland = new VolunteerInCanaryIslandPage(getDriver());
        Assert.assertEquals(canaryIsland.getPageTitle(), canaryIslandPageTitle);
    }

    @Description("Navigating to the Volunteer in Latin America page")
    @Test(description = "Navigate to the Volunteer in Latin America page")
    public void testNavigateToVolunteerInLatinAmericaPage() {
        new LatinAmerica(getDriver()).navigateToLatinAmericaPage();
        VolunteerInLatinAmericaPage latinAmerica = new VolunteerInLatinAmericaPage(getDriver());
        Assert.assertEquals(latinAmerica.getPageTitle(), latinAmericaPageTitle);
    }

    @Description("Navigating to the Volunteer in Costa Rica page")
    @Test(description = "Navigate to the Volunteer in Costa Rica page")
    public void testNavigateToVolunteerInCostaRicaPage() {
        new LatinAmerica(getDriver()).navigateToCostaRicaPage();
        VolunteerInCostaRicaPage costaRica = new VolunteerInCostaRicaPage(getDriver());
        Assert.assertEquals(costaRica.getPageTitle(), costaRicaPageTitle);
    }

    @Description("Navigating to the Volunteer in Mexico page")
    @Test(description = "Navigate to the Volunteer in Mexico page")
    public void testNavigateToVolunteerInMexicoPage() {
        new LatinAmerica(getDriver()).navigateToMexicoPage();
        VolunteerInMexicoPage mexico = new VolunteerInMexicoPage(getDriver());
        Assert.assertEquals(mexico.getPageTitle(), mexicoPageTitle);
    }

    @Description("Navigating to the Volunteer in Ghana page")
    @Test(description = "Navigate to the Volunteer in Ghana page")
    public void testNavigateToVolunteerInGhanaPage() {
        new CommunityDevelopmentLocations(getDriver()).navigateToGhanaPage();
        VolunteerInGhanaPage ghana = new VolunteerInGhanaPage(getDriver());
        Assert.assertEquals(ghana.getPageTitle(), ghanaPageTitle);
    }

    @Description("Navigating to the Volunteer in Nepal page")
    @Test(description = "Navigate to the Volunteer in Nepal page")
    public void testNavigateToVolunteerInNepalPage() {
        new CommunityDevelopmentLocations(getDriver()).navigateToNepalPage();
        VolunteerInNepalPage nepal = new VolunteerInNepalPage(getDriver());
        Assert.assertEquals(nepal.getPageTitle(), nepalPageTitle);
    }

    @Description("Navigating to the Volunteer in Cambodia page")
    @Test(description = "Navigate to the Volunteer in Cambodia page")
    public void testNavigateToVolunteerInCambodiaPage() {
        new CommunityDevelopmentLocations(getDriver()).navigateToCambodiaPage();
        VolunteerInCambodiaPage cambodia = new VolunteerInCambodiaPage(getDriver());
        Assert.assertEquals(cambodia.getPageTitle(), cambodiaPageTitle);
    }

}
