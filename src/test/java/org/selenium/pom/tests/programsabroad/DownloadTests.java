package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.base.PdfDownloadHelper;
import org.selenium.pom.pages.footer.downloads.GoogleScholarPage;
import org.selenium.pom.pages.footer.links.Downloads;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadTests extends BaseTest {
    private Downloads downloads;
    private final String googleScholarPageTitle = "GVI Planet and People";
    private PdfDownloadHelper pdfDownloadHelper;
    private final String parentInfoPackTitle = "P A R E N T  I N F O  P A C K";
    private final int expectedParentInfoPackPages = 29;

    @BeforeMethod
    public void setUp() {
        pdfDownloadHelper = new PdfDownloadHelper(getDriver());
        new PageNavigationHelper(getDriver());
        downloads = new Downloads(getDriver());
    }

    @Description("Navigating to the Google Scholar page")
    @Test(description = "Navigate to the Google Scholar page")
    public void testNavigateToTheGoogleScholarPage() {
        downloads.navigateToGoogleScholar();
        switchToNewTab();
        GoogleScholarPage googleScholar = new GoogleScholarPage(getDriver());
        Assert.assertEquals(googleScholar.getPageTitle(), googleScholarPageTitle);
        closeTabAndSwitchBackToOriginal();
    }

    @Description("Download Parent Info Pack")
    @Test(description = "Download Parent Info Pack")
    public void testDownloadParentInfoPack() {
        downloads.navigateToTheParentPack();
        switchToNewTab();
        pdfDownloadHelper.downloadAndAssertPdf(parentInfoPackTitle, expectedParentInfoPackPages);
        closeTabAndSwitchBackToOriginal();
    }
}
