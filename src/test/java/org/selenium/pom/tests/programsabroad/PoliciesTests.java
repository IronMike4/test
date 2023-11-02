package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.footer.links.Policies;
import org.selenium.pom.pages.footer.policies.BritishStandardsPage;
import org.selenium.pom.pages.footer.policies.HealthAndHygienePage;
import org.selenium.pom.pages.menu.ourethics.ChildProtectionPage;
import org.selenium.pom.pages.menu.support.HealthAndSafetyPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PoliciesTests extends BaseTest {
    private Policies policies;
    private final String childProtectionPageTitle = "CHILD AND VULNERABLE ADULT PROTECTION POLICY";
    private final String healthAndSafetyPageTitle = "GVI’s health and safety";
    private final String healthAndHygienePageTitle = "Health and Hygiene";
    private final String britishStandards8848PageTitle = "British Standards 8848";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver());
        policies = new Policies(getDriver());
    }

    @Description("Navigating to the GVI Child and Vulnerable Adult Protection Policy page")
    @Test(description = "Navigate to the GVI Child and Vulnerable Adult Protection Policy page")
    public void testNavigateToGVIChildAndVulnerableAdultProtectionPolicyPage() {
        policies.navigateToChildVulnerableAdultProtectionPage();
        ChildProtectionPage childProtection = new ChildProtectionPage(getDriver());
        Assert.assertEquals(childProtection.getPageTitle(), childProtectionPageTitle);
    }

    @Description("Navigating to the Health and safety page")
    @Test(description = "Navigate to the Health and safety page")
    public void testNavigateToTheHealthAndSafetyPage() {
        policies.navigateToHealthAndSafetyPage();
        HealthAndSafetyPage safety = new HealthAndSafetyPage(getDriver());
        Assert.assertEquals(safety.getPageTitle(), healthAndSafetyPageTitle);
    }

    @Description("Navigating to the Health and Hygiene page")
    @Test(description = "Navigate to the Health and Hygiene page")
    public void testNavigateToTheHealthAndHygienePage() {
        policies.navigateToHealthAndHygienePage();
        HealthAndHygienePage hygiene = new HealthAndHygienePage(getDriver());
        Assert.assertEquals(hygiene.getPageTitle(), healthAndHygienePageTitle);
    }

    @Description("Navigating to the British Standards 8848 page")
    @Test(description = "Navigate to the British Standards 8848 page")
    public void testNavigateToTheBritishStandards8848Page() {
        policies.navigateToBritishStandardsPage();
        BritishStandardsPage britishStandards = new BritishStandardsPage(getDriver());
        Assert.assertEquals(britishStandards.getPageTitle(), britishStandards8848PageTitle);
    }
}
