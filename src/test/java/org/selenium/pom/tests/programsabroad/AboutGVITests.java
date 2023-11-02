package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.aboutgvi.*;
import org.selenium.pom.pages.menu.links.whygvi.AboutGVI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutGVITests extends BaseTest {
    private AboutGVI aboutGVI;
    private final String aboutUsPageTitle = "About Us";
    private final String climateActionPlanPageTitle = "Why GVI?";
    private final String storyOfGVITitle = "The Story of GVI";
    private String workForUsPageTitle = "WORK FOR US";
    private final String endorsementsPageTitle = "Endorsements";
    private final String awardsPageTitle = "Awards";
    private final String gviInTheNewsPageTitle = "GVI in the news";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToWhyGVIMenu();
        aboutGVI = new AboutGVI(getDriver());
    }

    @Description("Navigating to the About Us page")
    @Test(description = "Navigate to the About Us page")
    public void testNavigateToAboutUsPage() {
        aboutGVI.navigateToAboutUsPage();
        AboutUsPage aboutUs = new AboutUsPage(getDriver());
        Assert.assertEquals(aboutUs.getPageTitle(), aboutUsPageTitle);
    }

    @Description("Navigating to the Why GVI page")
    @Test(description = "Navigate to the Why GVI page")
    public void testNavigateToWhyGVIPage() {
        aboutGVI.navigateToWhyGVIPage();
        WhyGVIPage whyGVI = new WhyGVIPage(getDriver());
        Assert.assertEquals(whyGVI.getPageTitle(), climateActionPlanPageTitle);
    }

    @Description("Navigating to The Story of GVI page")
    @Test(description = "Navigate to The Story of GVI page")
    public void testNavigateToTheStoryOfGVIPage() {
        aboutGVI.navigateToTheStoryOfGVIPage();
        OurStoryPage story = new OurStoryPage(getDriver());
        Assert.assertEquals(story.getPageTitle(), storyOfGVITitle);
    }

    @Description("Navigating to the Work for us page")
    @Test(description = "Navigate to the Work for us page")
    public void testNavigateToWorkForUsPage() {
        aboutGVI.navigateToWorkForUsPage();
        WorkForUsPage workForUs = new WorkForUsPage(getDriver());
        Assert.assertEquals(workForUs.getPageTitle(), workForUsPageTitle);
    }

    @Description("Navigating to the Endorsements page")
    @Test(description = "Navigate to the Endorsements page")
    public void testNavigateToEndorsementsPage() {
        aboutGVI.navigateToEndorsementsPage();
        EndorsementsPage endorse = new EndorsementsPage(getDriver());
        Assert.assertEquals(endorse.getPageTitle(), endorsementsPageTitle);
    }

    @Description("Navigating to the Awards page")
    @Test(description = "Navigate to the Awards page")
    public void testNavigateToAwardsPage() {
        aboutGVI.navigateToAwardsPage();
        AwardsPage awards = new AwardsPage(getDriver());
        Assert.assertEquals(awards.getPageTitle(), awardsPageTitle);
    }

    @Description("Navigating to the GVI in the news page")
    @Test(description = "Navigate to the GVI in the news page")
    public void testNavigateToGVIInTheNewsPage() {
        aboutGVI.navigateToGVIInTheNewsPage();
        GVIInTheNewsPage news = new GVIInTheNewsPage(getDriver());
        Assert.assertEquals(news.getPageTitle(), gviInTheNewsPageTitle);
    }
}
