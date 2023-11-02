package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.virtualandonline.CareerGrowthProgramPartners;
import org.selenium.pom.pages.menu.virtualonline.careergrowthprogrampartners.RichmondSchoolPage;
import org.selenium.pom.pages.menu.virtualonline.careergrowthprogrampartners.UNCCharlottePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CareerGrowthProgramTests extends BaseTest {
    private CareerGrowthProgramPartners careerGrowth;
    private final String richmondSchoolExpectedUrl = "https://impactacademy.richmond.edu/?utm_source=www.gvi.co.uk&utm_medium=referral&utm_campaign=menu";
    private final String uncCharlotteExpectedUrl = "https://impactacademy.uncc.edu/?utm_source=www.gvi.co.uk&utm_medium=referral&utm_campaign=menu";
    private final String pageTitle = "Accelerate\n" +
            "your career for good";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToVirtualAndOnlineMenu();
        careerGrowth = new CareerGrowthProgramPartners(getDriver());
    }

    @Description("Navigating the Richmond School homepage")
    @Test(description = "Navigate to the Richmond School homepage")
    public void testNavigateToTheRichmondSchoolHomePage() {
        careerGrowth.navigateToRichmondSchoolOfProfessionalAndContinuingStudies();
        Assert.assertEquals(getDriver().getCurrentUrl(), richmondSchoolExpectedUrl);
        RichmondSchoolPage richmond = new RichmondSchoolPage(getDriver());
        Assert.assertEquals(richmond.getPageTitle(),pageTitle);

    }

    @Description("Navigating the UNC Charlotte homepage")
    @Test(description = "Navigate to the UNC Charlotte homepage")
    public void testNavigateToTheUNCCharlotteHomePage() {
        careerGrowth.navigateToUNCCharlotteHomepage();
        Assert.assertEquals(getDriver().getCurrentUrl(), uncCharlotteExpectedUrl);
        UNCCharlottePage charlotte = new UNCCharlottePage(getDriver());
        Assert.assertEquals(charlotte.getPageTitle(),pageTitle);
    }
}
