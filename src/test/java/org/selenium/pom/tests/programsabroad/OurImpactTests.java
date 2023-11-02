package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.whygvi.OurImpact;
import org.selenium.pom.pages.menu.ourimpact.ClimateActionPlanePage;
import org.selenium.pom.pages.menu.ourimpact.ImpactAndEthicsReport;
import org.selenium.pom.pages.menu.ourimpact.NationalScholarshipProgramPage;
import org.selenium.pom.pages.menu.ourimpact.OurPartnersPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OurImpactTests extends BaseTest {
    private final String impactAndEthicsReportPageTitle = "IMPACT AND ETHICS REPORTS";
    private final String climateActionPlanPageTitle = "CLIMATE ACTION PLAN";
    private final String globalPartnersPageTitle = "OUR PARTNERS";
    private final String nationalScholarshipProgramPageTitle = "NATIONAL SCHOLARSHIP PROGRAM";

    private OurImpact ourImpact;

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToWhyGVIMenu();
        ourImpact = new OurImpact(getDriver());
    }

    @Description("Navigating to the Impact and ethics report page")
    @Test(description = "Navigate to the Impact and ethics report page")
    public void testNavigateToImpactAndEthicsReportPage() {
        ourImpact.navigateToImpactAndEthicsReportPage();
        ImpactAndEthicsReport impactAndEthics = new ImpactAndEthicsReport(getDriver());
        Assert.assertEquals(impactAndEthics.getPageTitle(), impactAndEthicsReportPageTitle);
    }

    @Description("Navigating to the Climate Action Plan page")
    @Test(description = "Navigate to the Climate Action Plan page")
    public void testNavigateToClimateActionPlanPage() {
        ourImpact.navigateToOurClimateActionPlanPage();
        ClimateActionPlanePage climateAction = new ClimateActionPlanePage(getDriver());
        Assert.assertEquals(climateAction.getPageTitle(), climateActionPlanPageTitle);
    }

    @Description("Navigating to the Global Partnerships page")
    @Test(description = "Navigate to the Global Partnerships page")
    public void testNavigateToGlobalPartnershipsPage() {
        ourImpact.navigateToOurPartnersPage();
        OurPartnersPage partners = new OurPartnersPage(getDriver());
        Assert.assertEquals(partners.getPageTitle(), globalPartnersPageTitle);
    }

    @Description("Navigating to the National Scholarship Program page")
    @Test(description = "Navigate to the National Scholarship Program page")
    public void testNavigateToNationalScholarshipProgramPage() {
        ourImpact.navigateToNationalScholarshipPage();
        NationalScholarshipProgramPage scholarship = new NationalScholarshipProgramPage(getDriver());
        Assert.assertEquals(scholarship.getPageTitle(), nationalScholarshipProgramPageTitle);
    }
}
