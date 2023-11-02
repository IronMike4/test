package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.connectwithus.StayUpToDate;
import org.selenium.pom.pages.menu.stayuptodate.Blogs;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConnectWithUsTests extends BaseTest {
    private final String blogPageTitle = "GVI NEWSROOM";


    private StayUpToDate upToDate;

    @BeforeMethod
    public void setUp() {
        PageNavigationHelper navigationHelper = new PageNavigationHelper(getDriver());
        navigationHelper.loadSite();
        navigationHelper.selectPlanet();
        navigationHelper.navigateToProgramsAbroadMenu();
        upToDate = new StayUpToDate(getDriver());
    }

    @Description("Navigating to the Impact and ethics report page")
//    @Test(description = "Navigate to the Impact and ethics report page")
    @Test(enabled = false)
    public void testNavigateToImpactAndEthicsReportPage() {
        upToDate.navigateToBlogLandingPage();
        Blogs blogs = new Blogs(getDriver());
        Assert.assertEquals(blogs.getPageTitle(), blogPageTitle);
    }
}
