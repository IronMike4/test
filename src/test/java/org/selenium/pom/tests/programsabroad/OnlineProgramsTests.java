package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.virtualandonline.OnlinePrograms;
import org.selenium.pom.pages.menu.virtualonline.onlineprograms.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnlineProgramsTests extends BaseTest {
    private String foundationsInWildlifeConservationPageTitle = "Foundations In Wildlife Conservation";
    private String foundationsInMarineConservationPageTitle = "Foundations in Marine Conservation";
    private String foundationsInClimateChangeSustainabilityPageTitle = "Foundations in Climate Change & Sustainability";
    private String foundationsInSocialEntrepreneurshipPageTitle = "Foundations in Social Entrepreneurship";
    private String advancedMarineConservationPageTitle = "Advanced Marine Conservation";
    private String advancedWildlifeConservationPageTitle = "Advanced Wildlife Conservation";
    private String masteringSustainableDevelopmentPageTitle = "Mastering Sustainable Development";

    private OnlinePrograms onlinePrograms;

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToVirtualAndOnlineMenu();
        onlinePrograms = new OnlinePrograms(getDriver());
    }

    @Description("Navigating to the Foundations In Wildlife Conservation online program")
    @Test(description = "Navigate to the Foundations In Wildlife Conservation online program")
    public void testNavigateToFoundationsInWildlifeConservationOnlineProgram() {
        onlinePrograms.navigateToFoundationsInWildLifeConservationProgram();
        FoundationsInWildlifeConservationPage wildlifeConservation = new FoundationsInWildlifeConservationPage(getDriver());
        Assert.assertEquals(wildlifeConservation.getPageTitle(), foundationsInWildlifeConservationPageTitle);
    }

    @Description("Navigating to the Foundations in Marine Conservation online program")
    @Test(description = "Navigate to the Foundations in Marine Conservation online program")
    public void testNavigateToFoundationsInMarineConservationOnlineProgram() {
        onlinePrograms.navigateToFoundationsInMarineConservationProgram();
        FoundationsInMarineConservationPage marineConservation = new FoundationsInMarineConservationPage(getDriver());
        Assert.assertEquals(marineConservation.getPageTitle(), foundationsInMarineConservationPageTitle);
    }

    @Description("Navigating to the Foundations in Climate Change & Sustainability online program")
    @Test(description = "Navigate to the Foundations in Climate Change & Sustainability online program")
    public void testNavigateToFoundationsInClimateChangeSustainabilityOnlineProgram() {
        onlinePrograms.navigateToFoundationsInClimateChangeAndSustainabilityProgram();
        FoundationsInClimateChangeSustainabilityPage climateChange = new FoundationsInClimateChangeSustainabilityPage(getDriver());
        Assert.assertEquals(climateChange.getPageTitle(), foundationsInClimateChangeSustainabilityPageTitle);
    }

    @Description("Navigating to the Foundations in Social Entrepreneurship online program")
    @Test(description = "Navigate to the Foundations in Social Entrepreneurship online program")
    public void testNavigateToFoundationsInSocialEntrepreneurshipOnlineProgram() {
        onlinePrograms.navigateToFoundationsInSocialEntrepreneurshipProgram();
        FoundationsInSocialEntrepreneurshipPage socialEntrepreneurship = new FoundationsInSocialEntrepreneurshipPage(getDriver());
        Assert.assertEquals(socialEntrepreneurship.getPageTitle(), foundationsInSocialEntrepreneurshipPageTitle);
    }

    @Description("Navigating to the Advanced Marine Conservation online program")
    @Test(description = "Navigate to the Advanced Marine Conservation online program")
    public void testNavigateToAdvancedMarineConservationOnlineProgram() {
        onlinePrograms.navigateToAdvancedMarineConservationProgram();
        AdvancedMarineConservationPage marineConservation = new AdvancedMarineConservationPage(getDriver());
        Assert.assertEquals(marineConservation.getPageTitle(), advancedMarineConservationPageTitle);
    }

    @Description("Navigating to the Advanced Wildlife Conservation online program")
    @Test(description = "Navigate to the Advanced Wildlife Conservation online program")
    public void testNavigateToAdvancedWildlifeConservationOnlineProgram() {
        onlinePrograms.navigateToAdvancedWildlifeConservationProgram();
        AdvancedWildlifeConservationPage wildlifeConservation = new AdvancedWildlifeConservationPage(getDriver());
        Assert.assertEquals(wildlifeConservation.getPageTitle(), advancedWildlifeConservationPageTitle);
    }

    @Description("Navigating to the Mastering Sustainable Development online program")
    @Test(description = "Navigate to the Mastering Sustainable Development online program")
    public void testNavigateToMasteringSustainableDevelopmentOnlineProgram() {
        onlinePrograms.navigateToMasteringSustainableDevelopmentProgram();
        MasteringSustainableDevelopmentPage sustainableDevelopment = new MasteringSustainableDevelopmentPage(getDriver());
        Assert.assertEquals(sustainableDevelopment.getPageTitle(), masteringSustainableDevelopmentPageTitle);
    }
}
