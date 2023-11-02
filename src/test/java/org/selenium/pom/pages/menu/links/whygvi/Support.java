package org.selenium.pom.pages.menu.links.whygvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Support extends BasePage {
    private final By scholarships = By.xpath("//a[normalize-space()='Scholarships']");
    private final By travelDuringCovid19 = By.xpath("//a[contains(@class,'my-auto text-xs text-black-lighter dark:text-gray-darken hover:text-white')][normalize-space()='Travel during COVID-19']");
    private final By healthAndSafety = By.xpath("//a[normalize-space()='Support and safety']");
    private final By parentInformation = By.xpath("//a[normalize-space()='Information for parents']");
    private final By referAFriend = By.xpath("//a[normalize-space()='Refer a friend']");
    private final By fundraising = By.xpath("//a[contains(@class,'my-auto text-xs text-black-lighter dark:text-gray-darken hover:text-white')][normalize-space()='Fundraising']");
    private final By bursaries = By.xpath("//a[normalize-space()='Bursaries']");
    public Support(WebDriver driver) {
        super(driver);
    }

    @Step
    public Support load() {
        loadPage("/");
        return this;
    }

    @Step
    public Support navigateToScholarshipsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(scholarships)).click();
        return  this;
    }

    @Step
    public Support navigateToTravelDuringCovid19Page(){
        wait.until(ExpectedConditions.elementToBeClickable(travelDuringCovid19)).click();
        return this;
    }

    @Step
    public Support navigateToHealthAndSafetyPage(){
        wait.until(ExpectedConditions.elementToBeClickable(healthAndSafety)).click();
        return  this;
    }

    @Step
    public Support navigateToParentInformationPage(){
        wait.until(ExpectedConditions.elementToBeClickable(parentInformation)).click();
        return  this;
    }

    @Step
    public Support navigateToReferAFriendPage(){
        wait.until(ExpectedConditions.elementToBeClickable(referAFriend)).click();
        return  this;
    }

    @Step
    public Support navigateToFundraisingPage(){
        wait.until(ExpectedConditions.elementToBeClickable(fundraising)).click();
        return  this;
    }

    @Step
    public Support navigateToBursariesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(bursaries)).click();
        return  this;
    }
}
