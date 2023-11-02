package org.selenium.pom.pages.menu.links.whygvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OurImpact extends BasePage {
    private final By impactAndEthicsReport = By.xpath("//a[normalize-space()='The impact & ethics report']");
    private final By ourClimateActionPlan = By.xpath("//a[normalize-space()='Our climate action plan']");
    private final By ourPartners = By.xpath("//a[normalize-space()='Our partners']");
    private final By nationalScholarship = By.xpath("//a[normalize-space()='National scholarship program']");

    public OurImpact(WebDriver driver) {
        super(driver);
    }

    @Step
    public OurImpact load() {
        loadPage("/");
        return this;
    }

    @Step
    public OurImpact navigateToImpactAndEthicsReportPage(){
        wait.until(ExpectedConditions.elementToBeClickable(impactAndEthicsReport)).click();
        return  this;
    }

    @Step
    public OurImpact navigateToOurClimateActionPlanPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ourClimateActionPlan)).click();
        return this;
    }

    @Step
    public OurImpact navigateToOurPartnersPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ourPartners)).click();
        return this;
    }

    @Step
    public OurImpact navigateToNationalScholarshipPage(){
        wait.until(ExpectedConditions.elementToBeClickable(nationalScholarship)).click();
        return  this;
    }
}
