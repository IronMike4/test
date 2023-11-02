package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class SocialMedia extends BasePage {
    private final By facebook = By.xpath("(//a[@title='[object Object]'])[1]");
    private final By instagram = By.xpath("(//a[@title='[object Object]'])[2]");
    private final By youTube = By.xpath("(//a[@title='[object Object]'])[3]");
    private final By twitter = By.xpath("(//a[@href='https://twitter.com/gviworld'])[1]");
    private final By tikTok = By.xpath("(//a[@title='[object Object]'])[5]");
    private final By linkedIn = By.xpath("(//a[@title='[object Object]'])[6]");

    public SocialMedia(WebDriver driver) {
        super(driver);
    }

    @Step
    public SocialMedia load() {
        loadPage("/");
        return this;
    }

    @Step
    public SocialMedia navigateToFacebookPage(){
        wait.until(ExpectedConditions.elementToBeClickable(facebook)).click();
        return  this;
    }

    @Step
    public SocialMedia navigateToInstagramPage(){
        wait.until(ExpectedConditions.elementToBeClickable(instagram)).click();
        return this;
    }

    @Step
    public SocialMedia navigateToYouTubePage(){
        wait.until(ExpectedConditions.elementToBeClickable(youTube)).click();
        return  this;
    }

    @Step
    public SocialMedia navigateToTwitterPage(){
        wait.until(ExpectedConditions.elementToBeClickable(twitter)).click();
        return  this;
    }

    @Step
    public SocialMedia navigateToTikTokPage(){
        wait.until(ExpectedConditions.elementToBeClickable(tikTok)).click();
        return  this;
    }

    @Step
    public SocialMedia navigateToLinkedInPage(){
        wait.until(ExpectedConditions.elementToBeClickable(linkedIn)).click();
        return  this;
    }
}
