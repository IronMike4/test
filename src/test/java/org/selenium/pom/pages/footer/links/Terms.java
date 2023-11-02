package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Terms extends BasePage {
    private final By privacy = By.xpath("(//a[normalize-space()='Privacy'])[1]");
    private final By termsOfService = By.xpath("(//a[normalize-space()='Terms of service'])[1]");
    private final By websiteTermsOfUse = By.xpath("(//a[normalize-space()='Website terms of use'])[1]");
    private final By paymentPlans = By.xpath("(//a[normalize-space()='Payment plans'])[1]");
    private final By groupsPaymentPlanPolicy = By.xpath("(//a[normalize-space()='Groups payment plan policy'])[1]");
    private final By termsAndConditions = By.xpath("(//a[normalize-space()='GVI terms and conditions'])[1]");
    private final By groupsTermsAndConditions = By.xpath("(//a[normalize-space()='Groups terms and conditions'])[1]");
    private final By careerGuaranteePolicy = By.xpath("(//a[normalize-space()='GVI career guarantee policy'])[1]");
    private final By bushwiseTermsAndConditions = By.xpath("(//a[normalize-space()='Bushwise terms and conditions'])[1]");
    public Terms(WebDriver driver) {
        super(driver);
    }

    @Step
    public Terms load() {
        loadPage("/");
        return this;
    }

    @Step
    public Terms navigateToPrivacyPolicyPage(){
        wait.until(ExpectedConditions.elementToBeClickable(privacy)).click();
        return  this;
    }

    @Step
    public Terms navigateToTermsOfServicePage(){
        wait.until(ExpectedConditions.elementToBeClickable(termsOfService)).click();
        return this;
    }

    @Step
    public Terms navigateToWebsiteTermsOfUsePage(){
        wait.until(ExpectedConditions.elementToBeClickable(websiteTermsOfUse)).click();
        return  this;
    }

    @Step
    public Terms navigateToPaymentPlansPage(){
        wait.until(ExpectedConditions.elementToBeClickable(paymentPlans)).click();
        return  this;
    }

    @Step
    public Terms navigateToGroupsPaymentPlansPolicyPage(){
        wait.until(ExpectedConditions.elementToBeClickable(groupsPaymentPlanPolicy)).click();
        return  this;
    }

    @Step
    public Terms navigateToGVITermsAndConditionsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(termsAndConditions)).click();
        return  this;
    }

    @Step
    public Terms navigateToGroupsTermsAndConditionsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(groupsTermsAndConditions)).click();
        return  this;
    }

    @Step
    public Terms navigateToGVICareerGuaranteePolicyPage(){
        wait.until(ExpectedConditions.elementToBeClickable(careerGuaranteePolicy)).click();
        return  this;
    }

    @Step
    public Terms navigateToBushwiseTermsAndConditionsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(bushwiseTermsAndConditions)).click();
        return  this;
    }
}
