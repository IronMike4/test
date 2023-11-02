package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.virtualandonline.OnlineCourses;
import org.selenium.pom.pages.menu.virtualonline.onlinecourses.*;
import org.selenium.pom.pages.menu.virtualonline.virtualinternships.MarineConservationVirtualInternships;
import org.selenium.pom.pages.menu.virtualonline.virtualinternships.WildlifeConservationVirtualInternships;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnlineCoursesTests extends BaseTest {
    private OnlineCourses onlineCourses;
    private String wildlifeConservationPageTitle = "Wildlife Conservation";
    private String conservationAndScientificResearchPageTitle = "Conservation and Scientific Research";
    private String marineConservationPageTitle = "Marine Conservation";
    private String careersInSustainableDevelopmentPageTitle = "Careers in Sustainable Development";
    private String climateCrisisAndSustainabilityPageTitle = "Climate Crisis and Sustainability";
    private String ethicsInSustainableDevelopmentPageTitle = "Ethics in Sustainable Development";
    private String impactMeasurementPageTitle = "Impact Measurement";
    private String leadingTeamsForImpactPageTitle = "Leading Teams for Impact";
    private String socialEntrepreneurshipPageTitle = "Social Entrepreneurship and Impact Investing";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToVirtualAndOnlineMenu();
        onlineCourses = new OnlineCourses(getDriver());
    }

    @Description("Navigating to the Wildlife Conservation online course")
    @Test(description = "Navigate to the Wildlife Conservation online course")
    public void testNavigateToWildlifeConservationOnlineCourse() {
        onlineCourses.navigateToWildlifeConservationOnlineCourse();
        WildlifeConservationVirtualInternships wildlife = new WildlifeConservationVirtualInternships(getDriver());
        Assert.assertEquals(wildlife.getPageTitle(), wildlifeConservationPageTitle);
    }

    @Description("Navigating to the Conservation and Scientific Research online course")
    @Test(description = "Navigate to the Conservation and Scientific Research online course")
    public void testNavigateToConservationAndScientificResearchOnlineCourse() {
        onlineCourses.navigateToConservationAndScientificResearch();
        ConservationAndScientificResearchPage scientificResearch = new ConservationAndScientificResearchPage(getDriver());
        Assert.assertEquals(scientificResearch.getPageTitle(), conservationAndScientificResearchPageTitle);
    }

    @Description("Navigating to the Marine Conservation online course")
    @Test(description = "Navigate to the Marine Conservation online course")
    public void testNavigateToMarineConservationOnlineCourse() {
        onlineCourses.navigateToMarineConservationOnlineCourse();
        MarineConservationVirtualInternships marineConservation = new MarineConservationVirtualInternships(getDriver());
        Assert.assertEquals(marineConservation.getPageTitle(), marineConservationPageTitle);
    }

    @Description("Navigating to the Careers in Sustainable Development online course")
    @Test(description = "Navigate to the Careers in Sustainable Development online course")
    public void testNavigateToCareersInSustainableDevelopmentOnlineCourse() {
        onlineCourses.navigateToCareersInSustainableDevelopmentOnlineCourse();
        CareersInSustainableDevelopmentPage sustainableDevelopment = new CareersInSustainableDevelopmentPage(getDriver());
        Assert.assertEquals(sustainableDevelopment.getPageTitle(), careersInSustainableDevelopmentPageTitle);
    }

    @Description("Navigating to the Climate Crisis and Sustainability online course")
    @Test(description = "Navigate to the Climate Crisis and Sustainability online course")
    public void testNavigateToClimateCrisisAndSustainabilityOnlineCourse() {
        onlineCourses.navigateToClimateCrisisAndSustainabilityOnlineCourse();
        ClimateCrisisAndSustainabilityPage climateCrisis = new ClimateCrisisAndSustainabilityPage(getDriver());
        Assert.assertEquals(climateCrisis.getPageTitle(), climateCrisisAndSustainabilityPageTitle);
    }

    @Description("Navigating to the Ethics in Sustainable Development online course")
    @Test(description = "Navigate to the Ethics in Sustainable Development online course")
    public void testNavigateToEthicsInSustainableDevelopmentOnlineCourse() {
        onlineCourses.navigateToEthicsInSustainableDevelopmentOnlineCourse();
        EthicsInSustainableDevelopmentPage ethics = new EthicsInSustainableDevelopmentPage(getDriver());
        Assert.assertEquals(ethics.getPageTitle(), ethicsInSustainableDevelopmentPageTitle);
    }

    @Description("Navigating to the Impact Measurement online course")
    @Test(description = "Navigate to the Impact Measurement online course")
    public void testNavigateToImpactMeasurementOnlineCourse() {
        onlineCourses.navigateToImpactMeasurementOnlineCourse();
        ImpactMeasurementPage impactMeasurement = new ImpactMeasurementPage(getDriver());
        Assert.assertEquals(impactMeasurement.getPageTitle(), impactMeasurementPageTitle);
    }

    @Description("Navigating to the Leading Teams for Impact online course")
    @Test(description = "Navigate to the Leading Teams for Impact online course")
    public void testNavigateToLeadingTeamsForImpactOnlineCourse() {
        onlineCourses.navigateToLeadingTeamsForImpactOnlineCourse();
        LeadingTeamsForImpactPage leadingTeams = new LeadingTeamsForImpactPage(getDriver());
        Assert.assertEquals(leadingTeams.getPageTitle(), leadingTeamsForImpactPageTitle);
    }

    @Description("Navigating to the Social Entrepreneurship and Impact Investing online course")
    @Test(description = "Navigate to the Social Entrepreneurship and Impact Investing online course")
    public void testNavigateToSocialEntrepreneurshipAndImpactInvestingOnlineCourse() {
        onlineCourses.navigateToSocialEntrepreneurshipOnlineCourse();
        SocialEntrepreneurshipAndImpactInvestingPage socialEntrepreneurship = new SocialEntrepreneurshipAndImpactInvestingPage(getDriver());
        Assert.assertEquals(socialEntrepreneurship.getPageTitle(), socialEntrepreneurshipPageTitle  );
    }
}
