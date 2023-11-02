package org.selenium.pom.pages.menu.links.virtualandonline;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OnlineCourses extends BasePage {

    private By wildLifeConservation = By.xpath("//a[@href='/online-course/wildlife-conservation/']");
    private By conservationAndScientificResearch = By.xpath("//a[normalize-space()='Conservation and scientific research']");
    private By marineConservation = By.xpath("//a[@href='/online-course/marine-conservation/']");
    private By careersInSustainableDevelopment  = By.xpath("//a[normalize-space()='Careers in sustainable development']");
    private By climateCrisisAndSustainability  = By.xpath("//a[normalize-space()='Climate crisis and sustainability']");
    private By ethicsInSustainableDevelopment  = By.xpath("//a[normalize-space()='Ethics in sustainable development']");
    private By impactMeasurement  = By.xpath("//a[normalize-space()='Impact measurement']");
    private By leadingTeamsForImpact  = By.xpath("//a[normalize-space()='Leading teams for impact']");
    private By socialEntrepreneurshipAndImpactInvesting  = By.xpath("//a[normalize-space()='Social entrepreneurship and impact investing']");

    public OnlineCourses(WebDriver driver) {
        super(driver);
    }

    @Step
    public OnlineCourses load() {
        loadPage("/");
        return this;
    }

    @Step
    public OnlineCourses navigateToWildlifeConservationOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(wildLifeConservation)).click();
        return  this;
    }

    @Step
    public OnlineCourses navigateToConservationAndScientificResearch(){
        wait.until(ExpectedConditions.elementToBeClickable(conservationAndScientificResearch)).click();
        return this;
    }

    @Step
    public OnlineCourses navigateToMarineConservationOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(marineConservation)).click();
        return  this;
    }

    @Step
    public OnlineCourses navigateToCareersInSustainableDevelopmentOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(careersInSustainableDevelopment)).click();
        return  this;
    }

    @Step
    public OnlineCourses navigateToClimateCrisisAndSustainabilityOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(climateCrisisAndSustainability)).click();
        return  this;
    }

    @Step
    public OnlineCourses navigateToEthicsInSustainableDevelopmentOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(ethicsInSustainableDevelopment)).click();
        return  this;
    }

    @Step
    public OnlineCourses navigateToImpactMeasurementOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(impactMeasurement)).click();
        return  this;
    }

    @Step
    public OnlineCourses navigateToLeadingTeamsForImpactOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(leadingTeamsForImpact)).click();
        return  this;
    }

    @Step
    public OnlineCourses navigateToSocialEntrepreneurshipOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(socialEntrepreneurshipAndImpactInvesting)).click();
        return  this;
    }
}
