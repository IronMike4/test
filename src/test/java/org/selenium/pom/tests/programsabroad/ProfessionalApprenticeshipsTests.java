package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.programsabroad.ProfessionalApprenticeships;
import org.selenium.pom.pages.menu.programsabroad.professionalapprenticeships.ProfessionalApprenticeshipPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfessionalApprenticeshipsTests extends BaseTest {
    private final String professionalApprenticeshipsPageTitle = "Professional apprenticeships";

    private ProfessionalApprenticeships professionalApprenticeships;

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver()).
                navigateToProgramsAbroadMenu();
        professionalApprenticeships = new ProfessionalApprenticeships(getDriver());
    }

    @Description("Navigate to the Professional apprenticeships page via the Professional apprenticeships link")
    @Test(description = "Navigate to the Professional apprenticeships page via the Professional apprenticeships link")
    public void testNavigateToProfessionalApprenticeshipsViaProfessionalApprenticeships() {
        professionalApprenticeships.navigateToProfessionalApprenticeships();
        ProfessionalApprenticeshipPage apprenticeships = new ProfessionalApprenticeshipPage(getDriver());
        Assert.assertEquals(apprenticeships.getPageTitle(), professionalApprenticeshipsPageTitle);
    }

    @Description("Navigating to the Professional apprenticeships page via the All apprenticeships link")
    @Test(description = "Navigate to the Professional apprenticeships page via the All apprenticeships link")
    public void testNavigateToProfessionalApprenticeshipsViaAllApprenticeships() {
        professionalApprenticeships.navigateToAllApprenticeships();
        ProfessionalApprenticeshipPage apprenticeships = new ProfessionalApprenticeshipPage(getDriver());
        Assert.assertEquals(apprenticeships.getPageTitle(), professionalApprenticeshipsPageTitle);
    }
}
