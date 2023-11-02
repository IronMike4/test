package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.getintouch.ContactUsPage;
import org.selenium.pom.pages.menu.getintouch.GVIVirtualOpenDaysPage;
import org.selenium.pom.pages.menu.links.whygvi.GetInTouch;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetInTouchTests extends BaseTest {
    private final String contactUsPageTitle = "CONTACT US";
    private final String gviOpenDaysPageTitle = "GVI VIRTUAL OPEN DAYS";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToWhyGVIMenu();
    }

    @Description("Navigating to the Contact Us page")
    @Test(description = "Navigate to the Contact Us page")
    public void testContactUsPageNavigation() {
        new GetInTouch(getDriver()).navigateToContactUsPage();
        ContactUsPage contactUs = new ContactUsPage(getDriver());
        Assert.assertEquals(contactUs.getPageTitle(), contactUsPageTitle);
    }

    @Description("Navigating to the GVI Open Day page")
    @Test(description = "Navigate to the GVI Open Day page")
    public void testGVIOpenDayPageNavigation() {
        new GetInTouch(getDriver()).navigateToGVIOpenDayPage();
        GVIVirtualOpenDaysPage openDay = new GVIVirtualOpenDaysPage(getDriver());
        Assert.assertEquals(openDay.getPageTitle(), gviOpenDaysPageTitle);
    }
}
