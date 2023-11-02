package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.programsabroad.ResearchFellowships;
import org.selenium.pom.pages.menu.programsabroad.researchfellowships.ResearchFellowshipsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResearchFellowshipTests extends BaseTest {
    private final String researchFellowshipsPageTitle = "Research fellowships";

    private ResearchFellowships researchFellowships;

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver()).
                navigateToProgramsAbroadMenu();
        researchFellowships = new ResearchFellowships(getDriver());
    }

    @Description("Navigate to the Research fellowships page via the Research fellowships link")
    @Test(description = "Navigate to the Research fellowships page via the Research fellowships link")
    public void testNavigateToResearchFellowshipsViaResearchFellowships() {
        researchFellowships.navigateToResearchFellowships();
        ResearchFellowshipsPage fellowship = new ResearchFellowshipsPage(getDriver());
        Assert.assertEquals(fellowship.getPageTitle(), researchFellowshipsPageTitle);
    }

    @Description("Navigate to the Research fellowships page via the All fellowships link")
    @Test(description = "Navigate to the Research fellowships page via the All fellowships link")
    public void testNavigateToResearchFellowshipsViaAllFellowships() {
        researchFellowships.navigateToAllFellowships();
        ResearchFellowshipsPage fellowship = new ResearchFellowshipsPage(getDriver());
        Assert.assertEquals(fellowship.getPageTitle(), researchFellowshipsPageTitle);
    }
}
