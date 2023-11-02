package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.base.PdfDownloadHelper;
import org.selenium.pom.pages.footer.links.Parents;
import org.selenium.pom.pages.menu.support.ParentsInformationPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentsTests extends BaseTest {
    private Parents parents;
    private final String parentsInfoPageTitle = "PARENT INFO";
    private PdfDownloadHelper pdfDownloadHelper;
    private final String parentInfoPackTitle = "P A R E N T  I N F O  P A C K";
    private final int expectedParentInfoPackPages = 29;

    @BeforeMethod
    public void setUp() {
        pdfDownloadHelper = new PdfDownloadHelper(getDriver());
        new PageNavigationHelper(getDriver());
        parents = new Parents(getDriver());
    }

    @Description("Navigating to the Parent Information page")
    @Test(description = "Navigate to the Parent Information page")
    public void testNavigateToParentInformationPage() {
        parents.navigateToParentInformationPage();
        ParentsInformationPage parents = new ParentsInformationPage(getDriver());
        Assert.assertEquals(parents.getPageTitle(), parentsInfoPageTitle);
    }

    @Description("Download Parent Info Pack")
    @Test(description = "Download Parent Info Pack")
    public void testDownloadParentInfoPack() {
        parents.navigateToParentPack();
        pdfDownloadHelper.downloadAndAssertPdf(parentInfoPackTitle, expectedParentInfoPackPages);
    }
}
