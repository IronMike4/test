package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.footer.links.Terms;
import org.selenium.pom.pages.footer.terms.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TermsTests extends BaseTest {
    private Terms terms;
    private final String privacyPageTitle = "Privacy Policy";
    private final String termsOfServicePageTitle = "Terms of Service (TOS)";
    private final String websiteTermsOfUsePageTitle = "Website Terms of Use";
    private final String paymentPlansPageTitle = "Payment Plans";
    private final String groupPaymentPlansPageTitle = "GVI Groups Payment Plans Policy";
    private final String gviTermsAndConditionsPageTitle = "Terms and Conditions";
    private final String groupsTermsAndConditionsPageTitle = "Groups Terms and Conditions";
    private final String careerGuaranteePageTitle = "GVI Career Guarantee Policy";
    private final String bushWiseTermsAndConditionsPageTitle = "Bushwise Terms and Conditions";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver());
         terms = new Terms(getDriver());
    }

    @Description("Navigating to the Privacy Policy page")
    @Test(description = "Navigate to the Privacy Policy page")
    public void testNavigateToThePrivacyPolicyPage() {
        terms.navigateToPrivacyPolicyPage();
        PrivacyPolicyPage privacyPolicy = new PrivacyPolicyPage(getDriver());
        Assert.assertEquals(privacyPolicy.getPageTitle(), privacyPageTitle);
    }

    @Description("Navigating to the Terms of Service page")
    @Test(description = "Navigate to the Terms of Service page")
    public void testNavigateToTheTermsOfServicePage() {
        terms.navigateToTermsOfServicePage();
        TermsOfServicePage termsOfService = new TermsOfServicePage(getDriver());
        Assert.assertEquals(termsOfService.getPageTitle(), termsOfServicePageTitle);
    }

    @Description("Navigate to the Website Terms of Use page")
    @Test(description = "Navigate to the Website Terms of Use page")
    public void testNavigateToTheWebsiteTermsOfUsePage() {
        terms.navigateToWebsiteTermsOfUsePage();
        WebsiteTermsOfUsePage termsOfUse = new WebsiteTermsOfUsePage(getDriver());
        Assert.assertEquals(termsOfUse.getPageTitle(), websiteTermsOfUsePageTitle);
    }

    @Description("Navigating to the Payment Plans page")
    @Test(description = "Navigate to the Payment Plans page")
    public void testNavigateToThePaymentPlansPage() {
        terms.navigateToPaymentPlansPage();
        PaymentPlansPage paymentPlans = new PaymentPlansPage(getDriver());
        Assert.assertEquals(paymentPlans.getPageTitle(), paymentPlansPageTitle);
    }

    @Description("Navigating to the Groups Payment Plans Policy page")
    @Test(description = "Navigate to the Groups Payment Plans Policy page")
    public void testNavigateToTheGroupsPaymentPlansPolicyPage() {
        terms.navigateToGroupsPaymentPlansPolicyPage();
        GroupPaymentPlansPage groupsPayments = new GroupPaymentPlansPage(getDriver());
        Assert.assertEquals(groupsPayments.getPageTitle(), groupPaymentPlansPageTitle);
    }

    @Description("Navigating to the  GVI Terms and Conditions page")
    @Test(description = "Navigate to the  GVI Terms and Conditions page")
    public void testNavigateToTheGVITermsAndConditionsPage() {
        terms.navigateToGVITermsAndConditionsPage();
        TermsAndConditionsPage termsAndConditions = new TermsAndConditionsPage(getDriver());
        Assert.assertEquals(termsAndConditions.getPageTitle(), gviTermsAndConditionsPageTitle);
    }

    @Description("Navigating to the  Groups Terms and Conditions page")
    @Test(description = "Navigate to the Groups Terms and Conditions page")
    public void testNavigateToTheGroupsTermsAndConditionsPage() {
        terms.navigateToGroupsTermsAndConditionsPage();
        GroupsTermsAndConditionsPage groupsTerms = new GroupsTermsAndConditionsPage(getDriver());
        Assert.assertEquals(groupsTerms.getPageTitle(), groupsTermsAndConditionsPageTitle);
    }

    @Description("Navigating to the GVI Career Guarantee Policy page")
    @Test(description = "Navigate to the GVI Career Guarantee Policy page")
    public void testNavigateToTheGVICareerGuaranteePolicyPage() {
        terms.navigateToGVICareerGuaranteePolicyPage();
        CareerGuaranteePolicyPage careerGuarantee = new CareerGuaranteePolicyPage(getDriver());
        Assert.assertEquals(careerGuarantee.getPageTitle(), careerGuaranteePageTitle);
    }

    @Description("Navigating to the Bushwise Terms and Conditions page")
    @Test(description = "Navigate to the Bushwise Terms and Conditions page")
    public void testNavigateToBushwiseTermsAndConditionsPage() {
        terms.navigateToBushwiseTermsAndConditionsPage();
        BushwiseTermsAndConditionsPage bushWiseTerms = new BushwiseTermsAndConditionsPage(getDriver());
        Assert.assertEquals(bushWiseTerms.getPageTitle(), bushWiseTermsAndConditionsPageTitle);
    }
}
