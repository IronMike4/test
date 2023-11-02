package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.programsabroad.Under18;
import org.selenium.pom.pages.footer.participants.VolunteeringForTeensPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Under18Tests extends BaseTest {
    private final String volunteeringForTeensPageTitle = "Volunteering for Teens";

    private Under18 under18;

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToProgramsAbroadMenu();
        under18 = new Under18(getDriver());
    }

    @Description("Navigating to the Volunteering for Teens page")
    @Test(description = "Navigate to the Volunteering for Teens page")
    public void testNavigateToTheVolunteeringForTeensPage() {
        under18.navigateToVolunteeringForTeensPage();
        VolunteeringForTeensPage volunteer = new VolunteeringForTeensPage(getDriver());
        Assert.assertEquals(volunteer.getPageTitle(), volunteeringForTeensPageTitle);
    }

    @Description("Navigating to the Volunteering for teens page via the Under 18 link")
    @Test(description = "Navigate to the Volunteering for teens page via the Under 18 link")
    public void testNavigateToTheVolunteeringForTeensViaUnder18() {
        under18.navigateToVolunteerForTeensViaUnder18sLink();
        VolunteeringForTeensPage volunteer = new VolunteeringForTeensPage(getDriver());
        Assert.assertEquals(volunteer.getPageTitle(), volunteeringForTeensPageTitle);
    }
}
