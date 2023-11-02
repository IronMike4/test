package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.whygvi.Support;
import org.selenium.pom.pages.menu.support.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SupportTests extends BaseTest {
    private Support support;
    private String scholarshipsPageTitle = "SCHOLARSHIPS";
    private String getTravelDuringCovid19PageTitle = "TRAVEL DURING COVID-19";
    private String healthAndSafetyPageTitle = "GVI’s health and safety";
    private String parentInfoPageTitle = "Parent Information";
    private String referAFriendPageTitle = "REFER A FRIEND";
    private String fundraisingPageTitle = "FUNDRAISING";
    private String bursariesPageTitle = "BURSARIES";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToWhyGVIMenu();
        support = new Support(getDriver());
    }

    @Description("Navigating to the Find a scholarships page")
    @Test(description = "Navigate to the Find a scholarships page")
    public void testNavigateToScholarshipsPage() {
        support.navigateToScholarshipsPage();
        ScholarshipsPage scholarships = new ScholarshipsPage(getDriver());
        Assert.assertEquals(scholarships.getPageTitle(), scholarshipsPageTitle);
    }

    @Description("Navigating to the Travel During COVID-19 page")
    @Test(description = "Navigate to the Travel During COVID-19 page")
    public void testNavigateToTheTravelDuringCOVID19Page() {
        support.navigateToTravelDuringCovid19Page();
        TravelDuringCovid19Page covid19 = new TravelDuringCovid19Page(getDriver());
        Assert.assertEquals(covid19.getPageTitle(), getTravelDuringCovid19PageTitle);
    }

    @Description("Navigating to the Health and safety page")
    @Test(description = "Navigate to the Health and safety page")
    public void testNavigateToTheHealthAndSafetyPage() {
        support.navigateToHealthAndSafetyPage();
        HealthAndSafetyPage healthAndSafety = new HealthAndSafetyPage(getDriver());
        Assert.assertEquals(healthAndSafety.getPageTitle(), healthAndSafetyPageTitle);
    }

    @Description("Navigating to the Refer a friend page")
    @Test(description = "Navigate to the Refer a friend page")
    public void testNavigateToTheReferAFriendPage() {
        support.navigateToReferAFriendPage();
        ReferAFriendPage referAFriend = new ReferAFriendPage(getDriver());
        Assert.assertEquals(referAFriend.getPageTitle(), referAFriendPageTitle);
    }

    @Description("Navigating to the Fundraising page")
    @Test(description = "Navigate to the Fundraising page")
    public void testNavigateToFundraisingPage() {
        support.navigateToFundraisingPage();
        FundraisingPage fundraising = new FundraisingPage(getDriver());
        Assert.assertEquals(fundraising.getPageTitle(), fundraisingPageTitle);
    }

    @Description("Navigating to the Bursaries page")
    @Test(description = "Navigate to the Bursaries page")
    public void testNavigateToBursariesPage() {
        support.navigateToBursariesPage();
        BursariesPage bursaries = new BursariesPage(getDriver());
        Assert.assertEquals(bursaries.getPageTitle(), bursariesPageTitle);
    }
}
