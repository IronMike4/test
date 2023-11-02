package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.alumni.AlumniServicesPage;
import org.selenium.pom.pages.menu.alumni.AmbassadorProgramPage;
import org.selenium.pom.pages.menu.alumni.ReturneeScholarshipsPage;
import org.selenium.pom.pages.menu.links.whygvi.Alumni;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlumniTests extends BaseTest {
    private Alumni alumni;
    private String alumniServicesPageTitle = "Alumni Services";
    private String ambassadorPageTitle = "BECOME AN AMBASSADOR";
    private String returningPageTitle = "Returnee Scholarships";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToWhyGVIMenu();
        alumni = new Alumni(getDriver());
    }

    @Description("Navigating to the Alumni services page")
    @Test(description = "Navigate to the Alumni services page")
    public void testNavigateToAlumniServicesPage() {
        alumni.navigateToAlumniServicesPage();
        AlumniServicesPage alumni = new AlumniServicesPage(getDriver());
        Assert.assertEquals(alumni.getPageTitle(), alumniServicesPageTitle);
    }

    @Description("Navigating to the Become ambassador page")
    @Test(description = "Navigate to the Become ambassador page")
    public void testNavigateToTheBecomeAmbassadorPage() {
        alumni.navigateToAmbassadorProgramPage();
        AmbassadorProgramPage ambassador = new AmbassadorProgramPage(getDriver());
        Assert.assertEquals(ambassador.getPageTitle(), ambassadorPageTitle);
    }

    @Description("Navigating to the Returnee scholarships page")
    @Test(description = "Navigate to the Returnee scholarships page")
    public void testNavigateToTheReturneeScholarshipsPage() {
        alumni.navigateToReturneeScholarshipsPage();
        ReturneeScholarshipsPage returnee = new ReturneeScholarshipsPage(getDriver());
        Assert.assertEquals(returnee.getPageTitle(), returningPageTitle);
    }
}
