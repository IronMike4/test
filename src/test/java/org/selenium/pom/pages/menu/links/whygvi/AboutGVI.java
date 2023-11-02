package org.selenium.pom.pages.menu.links.whygvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class AboutGVI extends BasePage {
    private final By aboutUs = By.xpath("//a[normalize-space()='About us']");
    private final By whyGVI = By.xpath("//a[contains(@class,'my-auto text-xs text-black-lighter dark:text-gray-darken hover:text-white')][normalize-space()='Why GVI']");
    private final By theStoryOfGVI = By.xpath("//a[normalize-space()='Our story']");
    private final By meetTheTeam = By.xpath("//a[normalize-space()='Meet the team']");
    private final By workForUs = By.xpath("//a[normalize-space()='Work For us']");
    private final By endorsements = By.xpath("//a[normalize-space()='Endorsements']");
    private final By awards = By.xpath("//a[normalize-space()='Awards']");
    private final By gVIInTheNews = By.xpath("//a[normalize-space()='In the news']");
    private final By testimonials = By.xpath("//a[normalize-space()='Testimonials']");


    public AboutGVI(WebDriver driver) {
        super(driver);
    }

    @Step
    public AboutGVI load() {
        loadPage("/");
        return this;
    }

    @Step
    public AboutGVI navigateToAboutUsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(aboutUs)).click();
        return  this;
    }

    @Step
    public AboutGVI navigateToWhyGVIPage(){
        wait.until(ExpectedConditions.elementToBeClickable(whyGVI)).click();
        return this;
    }

    @Step
    public AboutGVI navigateToTheStoryOfGVIPage(){
        wait.until(ExpectedConditions.elementToBeClickable(theStoryOfGVI)).click();
        return  this;
    }

    @Step
    public AboutGVI navigateToMeetTheTeamPage(){
        wait.until(ExpectedConditions.elementToBeClickable(meetTheTeam)).click();
        return  this;
    }

    @Step
    public AboutGVI navigateToWorkForUsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(workForUs)).click();
        return  this;
    }

    @Step
    public AboutGVI navigateToEndorsementsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(endorsements)).click();
        return  this;
    }

    @Step
    public AboutGVI navigateToAwardsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(awards)).click();
        return  this;
    }

    @Step
    public AboutGVI navigateToGVIInTheNewsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(gVIInTheNews)).click();
        return  this;
    }

    @Step
    public AboutGVI navigateToTestimonialPage(){
        wait.until(ExpectedConditions.elementToBeClickable(testimonials)).click();
        return  this;
    }


}
