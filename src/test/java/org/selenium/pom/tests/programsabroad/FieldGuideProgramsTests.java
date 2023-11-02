package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.links.virtualandonline.FieldGuideProgramPartners;
import org.selenium.pom.pages.menu.virtualonline.fieldguideprogrampartners.AfricanNatureAndWildlifePage;
import org.selenium.pom.pages.menu.virtualonline.fieldguideprogrampartners.FGASAFieldGuidingPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FieldGuideProgramsTests extends BaseTest {
    private FieldGuideProgramPartners fieldGuideProgramPartners;
    private final String fgasaFieldGuidingPageTitle = "FGASA Field Guiding";
    private final String africanNaturePageTitle = "African Nature and Wildlife";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToVirtualAndOnlineMenu();
        fieldGuideProgramPartners = new FieldGuideProgramPartners(getDriver());
    }

    @Description("Navigating to the FGASA Field Guiding online course")
    @Test(description = "Navigate to the FGASA Field Guiding online course")
    public void testNavigateToFGASAFieldGuidingOnlineCourse() {
        fieldGuideProgramPartners.navigateToFGASAFieldGuidingOnlineCourse();
        FGASAFieldGuidingPage fieldGuiding = new FGASAFieldGuidingPage(getDriver());
        Assert.assertEquals(fieldGuiding.getPageTitle(), fgasaFieldGuidingPageTitle);
    }

    @Description("Navigating to the African Nature and Wildlife online course")
    @Test(description = "Navigate to the African Nature and Wildlife online course")
    public void testNavigateToTheAfricanNatureWildlifeOnlineCourse() {
        fieldGuideProgramPartners.navigateToAfricanNatureAndWildlifeOnlineCourse();
        AfricanNatureAndWildlifePage africanNature = new AfricanNatureAndWildlifePage(getDriver());
        Assert.assertEquals(africanNature.getPageTitle(), africanNaturePageTitle);
    }
}
