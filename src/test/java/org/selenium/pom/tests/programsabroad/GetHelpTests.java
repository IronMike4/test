package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.footer.gethelp.SendingPartnersPage;
import org.selenium.pom.pages.footer.links.GetHelp;
import org.selenium.pom.pages.menu.getintouch.ContactUsPage;
import org.selenium.pom.pages.menu.help.FAQsPage;
import org.selenium.pom.pages.menu.support.FundraisingPage;
import org.selenium.pom.pages.menu.support.TravelDuringCovid19Page;
import org.selenium.pom.pages.morepages.FindAProgram1;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetHelpTests extends BaseTest {
    private GetHelp getHelp;
    private final String findAProgramPageTitle = "FIND A PROGRAM";
    private final String fundraisingPageTitle = "FUNDRAISING";
    private final String fAQsPageTitle = "FAQS";
    private final String contactUsPageTitle = "CONTACT US";
    private final String travelDuringCovid19PageTitle = "TRAVEL DURING COVID-19";
    private final String sendingPartnersPageTitle = "Sending Partners";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver());
        getHelp = new GetHelp(getDriver());
    }

    @Description("Navigating to the Find a program page")
    @Test(description = "Navigate to the Find a program page")
    public void testNavigateToFindAProgramPage() {
        getHelp.navigateToFindAProgramPage();
        FindAProgram1 findAProgram = new FindAProgram1(getDriver());
        Assert.assertEquals(findAProgram.getPageTitle(), findAProgramPageTitle);
    }

    @Description("Navigating to the Fundraising page")
    @Test(description = "Navigate to the Fundraising page")
    public void testNavigateToTheFundraisingPage() {
        getHelp.navigateToFundraisingPage();
        FundraisingPage fundraising = new FundraisingPage(getDriver());
        Assert.assertEquals(fundraising.getPageTitle(), fundraisingPageTitle);
    }

    @Description("Navigating to the FAQs page")
    @Test(description = "Navigate to the FAQs page")
    public void testNavigateToTheFAQsPage() {
        getHelp.navigateToFAQsPage();
        FAQsPage faqs = new FAQsPage(getDriver());
        Assert.assertEquals(faqs.getPageTitle(), fAQsPageTitle);
    }

    @Description("Navigating to the Contact us page")
    @Test(description = "Navigate to the Contact us page")
    public void testNavigateToTheContactUsPage() {
        getHelp.navigateToContactUsPage();
        ContactUsPage contactUs = new ContactUsPage(getDriver());
        Assert.assertEquals(contactUs.getPageTitle(), contactUsPageTitle);
    }

    @Description("Navigating to the Travel During COVID-19 page")
    @Test(description = "Navigate to the Travel During COVID-19 page")
    public void testNavigateToTravelDuringCOVID19Page() {
        getHelp.navigateToTravelDuringCovidPage();
        TravelDuringCovid19Page travel = new TravelDuringCovid19Page(getDriver());
        Assert.assertEquals(travel.getPageTitle(), travelDuringCovid19PageTitle);
    }

    @Description("Navigating to the Sending Partners page")
    @Test(description = "Navigate to the Sending Partners page")
    public void testNavigateToSendingPartnersPage() {
        getHelp.navigateToSendingPartners();
        SendingPartnersPage sendingPartners = new SendingPartnersPage(getDriver());
        Assert.assertEquals(sendingPartners.getPageTitle(), sendingPartnersPageTitle);
    }
}
