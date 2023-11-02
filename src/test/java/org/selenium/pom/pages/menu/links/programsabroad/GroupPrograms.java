package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class GroupPrograms extends BasePage {
    private final By groupPrograms = By.xpath("//a[normalize-space()='Group programs']");
    private final By allGroupPrograms = By.xpath("//a[normalize-space()='All group programs']");
    private final By schoolExpeditionGroups = By.xpath("//a[normalize-space()='School expedition groups']");
    private final By serviceLearningGroups = By.xpath("//a[normalize-space()='Service learning groups']");
    private final By universityGroups = By.xpath("//a[normalize-space()='University groups']");
    private final By corporateGroups = By.xpath("//a[normalize-space()='Corporate groups']");
    public GroupPrograms(WebDriver driver) {
        super(driver);
    }

    @Step
    public GroupPrograms load() {
        loadPage("/");
        return this;
    }

    @Step
    public GroupPrograms navigateToGroupTravelPageViaGroupPrograms(){
        wait.until(ExpectedConditions.elementToBeClickable(groupPrograms)).click();
        return  this;
    }

    @Step
    public GroupPrograms navigateToGroupTravelPageViaAllGroupPrograms(){
        wait.until(ExpectedConditions.elementToBeClickable(allGroupPrograms)).click();
        return this;
    }

    @Step
    public GroupPrograms navigateToSchoolTripsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(schoolExpeditionGroups)).click();
        return  this;
    }

    @Step
    public GroupPrograms navigateToServiceLearningPage(){
        wait.until(ExpectedConditions.elementToBeClickable(serviceLearningGroups)).click();
        return  this;
    }

    @Step
    public GroupPrograms navigateToUniversityProgramsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(universityGroups)).click();
        return  this;
    }

    @Step
    public GroupPrograms navigateToCorporateVolunteeringPage(){
        wait.until(ExpectedConditions.elementToBeClickable(corporateGroups)).click();
        return  this;
    }
}
