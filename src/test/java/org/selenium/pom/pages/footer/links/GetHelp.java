package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class GetHelp extends BasePage {
    private final By howToApply = By.xpath("(//a[normalize-space()='How to apply'])[1]");
    private final By fundraising = By.xpath("(//a[@class='block py-1 text-xs text-white dark:text-gray-darken'][normalize-space()='Fundraising'])[1]");
    private final By fAQs = By.xpath("(//a[@class='block py-1 text-xs text-white dark:text-gray-darken'][normalize-space()='FAQs'])[1]");
    private final By contactUs = By.xpath("(//a[@class='block py-1 text-xs text-white dark:text-gray-darken'][normalize-space()='Contact us'])[1]");
    private final By travelDuringCovid = By.xpath("(//a[@class='block py-1 text-xs text-white dark:text-gray-darken'][normalize-space()='Travel during COVID-19'])[1]");
    private final By sendingPartners = By.xpath("(//a[normalize-space()='Sending partners'])[1]");

    public GetHelp(WebDriver driver) {
        super(driver);
    }

    @Step
    public GetHelp load() {
        loadPage("/");
        return this;
    }

    @Step
    public GetHelp navigateToFindAProgramPage(){
        wait.until(ExpectedConditions.elementToBeClickable(howToApply)).click();
        return  this;
    }

    @Step
    public GetHelp navigateToFundraisingPage(){
        wait.until(ExpectedConditions.elementToBeClickable(fundraising)).click();
        return this;
    }

    @Step
    public GetHelp navigateToFAQsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(fAQs)).click();
        return  this;
    }

    @Step
    public GetHelp navigateToContactUsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(contactUs)).click();
        return  this;
    }

    @Step
    public GetHelp navigateToTravelDuringCovidPage(){
        wait.until(ExpectedConditions.elementToBeClickable(travelDuringCovid)).click();
        return  this;
    }

    @Step
    public GetHelp navigateToSendingPartners(){
        wait.until(ExpectedConditions.elementToBeClickable(sendingPartners)).click();
        return  this;
    }
}
