package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.footer.links.Participants;
import org.selenium.pom.pages.footer.participants.*;
import org.selenium.pom.pages.menu.groupprograms.GroupTravelPage;
import org.selenium.pom.pages.menu.programsabroad.under18.VolunteeringForTeensPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParticipantsTests extends BaseTest {
    private Participants participants;
    private final String studentsVolunteeringPageTitle = "Student volunteering abroad";
    private final String gapYearsPageTitle = "Gap years";
    private final String volunteeringForTeensPageTitle = "Volunteering for Teens";
    private final String volunteeringAfterALevelsPageTitle = "Volunteering After Your A-Levels";
    private final String groupTravelPageTitle = "Group Travel";
    private final String familyVolunteerPageTitle = "Family volunteer opportunities";
    private final String careerBreaksPageTitle = "Career Breaks";
    private final String over50sVolunteeringPageTitle = "Volunteering opportunities for older adults";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver());
        participants = new Participants(getDriver());
    }

    @Description("Navigating to the Student volunteering abroad page")
    @Test(description = "Navigate to the Student volunteering abroad page")
    public void testNavigateToStudentVolunteeringAbroadPage() {
        participants.navigateToStudentVolunteerPage();
        StudentsVolunteeringPage studentsVolunteering = new StudentsVolunteeringPage(getDriver());
        Assert.assertEquals(studentsVolunteering.getPageTitle(), studentsVolunteeringPageTitle);
    }

    @Description("Navigating to the Gap year page")
    @Test(description = "Navigate to the Gap year page")
    public void testNavigateToGapYearPage() {
        participants.navigateToGapYearPage();
        GapYearPage gapYear = new GapYearPage(getDriver());
        Assert.assertEquals(gapYear.getPageTitle(), gapYearsPageTitle);
    }

    @Description("Navigating to the Volunteering for Teens page")
    @Test(description = "Navigate to the Volunteering for Teens page")
    public void testNavigateToVolunteeringForTeensPage() {
        participants.navigateToTeensPage();
        VolunteeringForTeensPage teens = new VolunteeringForTeensPage(getDriver());
        Assert.assertEquals(teens.getPageTitle(), volunteeringForTeensPageTitle);
    }

    @Description("Navigating to the Volunteering After Your A-Levels page")
    @Test(description = "Navigate to the Volunteering After Your A-Levels page")
    public void testNavigateToVolunteeringAfterYourALevelsPage() {
        participants.navigateToALevelsPage();
        VolunteeringForALevelsPage aLevels = new VolunteeringForALevelsPage(getDriver());
        Assert.assertEquals(aLevels.getPageTitle(), volunteeringAfterALevelsPageTitle);
    }

    @Description("Navigating to the Group Travel page")
    @Test(description = "Navigate to the Group Travel page")
    public void testNavigateToTheGroupTravelPage() {
        participants.navigateToGroupTravelPage();
        GroupTravelPage groupTravel = new GroupTravelPage(getDriver());
        Assert.assertEquals(groupTravel.getPageTitle(), groupTravelPageTitle);
    }

    @Description("Navigating to the Family volunteer opportunities page")
    @Test(description = "Navigate to the Family volunteer opportunities page")
    public void testNavigateToFamilyVolunteerOpportunitiesPage() {
        participants.navigateToFamiliesPage();
        FamilyVolunteerPage familyVolunteer = new FamilyVolunteerPage(getDriver());
        Assert.assertEquals(familyVolunteer.getPageTitle(), familyVolunteerPageTitle);
    }

    @Description("Navigating to the Career Breaks page")
    @Test(description = "Navigate to the Career Breaks page")
    public void testNavigateToCareerBreaksPage() {
        participants.navigateToCareerBreakers();
        CareerBreaksPage careerBreaks = new CareerBreaksPage(getDriver());
        Assert.assertEquals(careerBreaks.getPageTitle(), careerBreaksPageTitle);
    }

    @Description("Navigating to the Over 50s Volunteering page")
    @Test(description = "Navigate to the Over 50s Volunteering page")
    public void testNavigateToOver50sVolunteeringPage() {
        participants.navigateToOver50sPage();
        Over50sVolunteeringPage over50s = new Over50sVolunteeringPage(getDriver());
        Assert.assertEquals(over50s.getPageTitle(), over50sVolunteeringPageTitle);
    }
}
