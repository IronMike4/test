package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.menu.help.FAQsPage;
import org.selenium.pom.pages.menu.links.whygvi.Help;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelpTests extends BaseTest {
    private Help help;
    private final String faqsPageTitle = "FAQS";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver())
                .navigateToWhyGVIMenu();
        help = new Help(getDriver());
    }

    @Description("Navigating to the FAQs page")
    @Test(description = "Navigate to the FAQs page")
    public void testNavigateToTheFAQsPage() {
        help.navigateToFAQsPage();
        FAQsPage faqs = new FAQsPage(getDriver());
        Assert.assertEquals(faqs.getPageTitle(), faqsPageTitle);
    }
}
