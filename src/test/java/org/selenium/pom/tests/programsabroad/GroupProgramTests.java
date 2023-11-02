package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.programsabroad.GroupPrograms;
import org.selenium.pom.pages.menu.groupprograms.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupProgramTests extends BaseTest {
    private GroupPrograms groupPrograms;
    private final String groupTravelPageTitle = "Group Travel";
    private final String schoolTripsPageTitle = "School Trips Abroad";
    private final String serviceLearningPageTitle = "International Service Learning";
    private final String universityProgramsPageTitle = "University Programs";
    private final String corporateVolunteeringPageTitle = "Corporate Volunteering Abroad";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToProgramsAbroadMenu();
        groupPrograms = new GroupPrograms(getDriver());
    }

    @Description("Navigating to the Group Travel page via the Group Programs link")
    @Test(description = "Navigate to the Group Travel page via the Group Programs link")
    public void testNavigateGroupTravelPageViaGroupPrograms() {
        groupPrograms.navigateToGroupTravelPageViaGroupPrograms();
        GroupTravelPage groupTravel = new GroupTravelPage(getDriver());
        Assert.assertEquals(groupTravel.getPageTitle(), groupTravelPageTitle);
    }

    @Description("Navigating to the Group Travel page via the All group programs link")
    @Test(description = "Navigate to the Group Travel page via the All group programs link")
    public void testNavigateGroupTravelPageViaAllGroups() {
        groupPrograms.navigateToGroupTravelPageViaAllGroupPrograms();
        GroupTravelPage groupTravel = new GroupTravelPage(getDriver());
        Assert.assertEquals(groupTravel.getPageTitle(), groupTravelPageTitle);
    }

    @Description("Navigating to the School trips abroad page")
    @Test(description = "Navigate to the School trips abroad page")
    public void testNavigateToSchoolTripsAbroadPage() {
        groupPrograms.navigateToSchoolTripsPage();
        SchoolTripsAbroadPage schools = new SchoolTripsAbroadPage(getDriver());
        Assert.assertEquals(schools.getPageTitle(), schoolTripsPageTitle);
    }

    @Description("Navigating to the International service learning page")
    @Test(description = "Navigate to the International service learning page")
    public void testNavigateToServiceLearningPage() {
        groupPrograms.navigateToServiceLearningPage();
        ServiceLearningPage serviceLearning = new ServiceLearningPage(getDriver());
        Assert.assertEquals(serviceLearning.getPageTitle(), serviceLearningPageTitle);
    }

    @Description("Navigating to the University programs page")
    @Test(description = "Navigate to the University programs page")
    public void testNavigateToUniversityProgramsPage() {
        groupPrograms.navigateToUniversityProgramsPage();
        UniversityProgramsPage universityPrograms = new UniversityProgramsPage(getDriver());
        Assert.assertEquals(universityPrograms.getPageTitle(), universityProgramsPageTitle);
    }

    @Description("Navigating to the Corporate volunteering page")
    @Test(description = "Navigate to the Corporate volunteering page")
    public void testNavigateToCorporateVolunteeringPage() {
        groupPrograms.navigateToCorporateVolunteeringPage();
        CorporateVolunteeringPage corporateVolunteering = new CorporateVolunteeringPage(getDriver());
        Assert.assertEquals(corporateVolunteering.getPageTitle(), corporateVolunteeringPageTitle);
    }
}
