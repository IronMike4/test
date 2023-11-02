package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.whygvi.OurEthics;
import org.selenium.pom.pages.menu.ourethics.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OurEthicsTests extends BaseTest {
    private final String badgeOfEthicsPageTitle = "GVI'S BADGE OF ETHICS";
    private final String tenEthicalCommitmentsPageTitle = "OUR TEN ETHICAL COMMITMENTS";
    private final String humanEmpowermentPrinciplesPageTitle = "HUMAN EMPOWERMENT PRINCIPLES";
    private final String childProtectionPolicyPageTitle = "CHILD AND VULNERABLE ADULT PROTECTION POLICY";
    private final String ethicsAToZPageTitle = "A - Z OF ETHICS";

    private OurEthics ourEthics;

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToWhyGVIMenu();
        ourEthics = new OurEthics(getDriver());
    }

    @Description("Navigating to the GVI's Badge of Ethics page")
    @Test(description = "Navigate to the GVI's Badge of Ethics page")
    public void testNavigateToGVIsBadgeOfEthicsPage() {
        ourEthics.navigateToBadgeOfEthicsPage();
        GVIsBadgeOfEthicsPage ethicsPage = new GVIsBadgeOfEthicsPage(getDriver());
        Assert.assertEquals(ethicsPage.getPageTitle(), badgeOfEthicsPageTitle);
    }

    @Description("Navigating to the Our Ten Ethical Commitments page")
    @Test(description = "Navigate to the Our Ten Ethical Commitments page")
    public void testNavigateToOurTenEthicalCommitmentsPage() {
        ourEthics.navigateToTenEthicalCommitmentsPage();
        OurTenEthicalCommitmentsPage commitmentsPage = new OurTenEthicalCommitmentsPage(getDriver());
        Assert.assertEquals(commitmentsPage.getPageTitle(), tenEthicalCommitmentsPageTitle);
    }

    @Description("Navigating to the Human Empowerment Principles page")
    @Test(description = "Navigate to the Human Empowerment Principles page")
    public void testNavigateToHumanEmpowermentPrinciplesPage() {
        ourEthics.navigateToHumanEmpowermentPrinciplesPage();
        HumanEmpowermentPrinciplesPage empowermentPage = new HumanEmpowermentPrinciplesPage(getDriver());
        Assert.assertEquals(empowermentPage.getPageTitle(), humanEmpowermentPrinciplesPageTitle);
    }

    @Description("Navigating to the GVI Child and Vulnerable Adult Protection Policy page")
    @Test(description = "Navigate to the GVI Child and Vulnerable Adult Protection Policy page")
    public void testNavigateToGVIChildVulnerableAdultProtectionPolicyPage() {
        ourEthics.navigateToChildProtectionPage();
        ChildProtectionPage childProtectionPage = new ChildProtectionPage(getDriver());
        Assert.assertEquals(childProtectionPage.getPageTitle(), childProtectionPolicyPageTitle);
    }

    @Description("Navigating to the Ethics A – Z page")
    @Test(description = "Navigate to the Ethics A – Z page")
    public void testNavigateToEthicsAToZPage() {
        ourEthics.navigateToEthicsAToZPage();
        EthicsAToZPage ethicsPage = new EthicsAToZPage(getDriver());
        Assert.assertEquals(ethicsPage.getPageTitle(), ethicsAToZPageTitle);
    }
}
