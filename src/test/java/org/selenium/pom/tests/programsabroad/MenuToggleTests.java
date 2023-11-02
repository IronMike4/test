package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.footer.toggle.PeopleHomePage;
import org.selenium.pom.pages.menu.links.programsabroad.MenuToggle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuToggleTests extends BaseTest {
    private MenuToggle menuToggle;
    private final String peopleHomePageTitle = "Go further. Join GVI People.";
    private final String expectedUrl = "https://people.gvi.co.uk/";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToProgramsAbroadMenu();
        menuToggle = new MenuToggle(getDriver());
    }

    @Description("Navigating to the People homepage")
    @Test(description = "Navigate to the People homepage")
    public void testNavigateToThePeopleHomePage() {
        menuToggle.switchToPlanet();
        PeopleHomePage people = new PeopleHomePage(getDriver());
        Assert.assertEquals(people.getPageTitle(), peopleHomePageTitle);

        // Assert the URL
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedUrl);
    }
}
