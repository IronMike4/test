package org.selenium.pom.pages.menu.links.connectwithus;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FollowUs extends BasePage {

    private final By instagram = By.xpath("");
    private final By tikTok = By.xpath("");
    private final By youTube = By.xpath("");
    private final By linkedIn = By.xpath("");
    private final By facebook = By.xpath("");

    public FollowUs(WebDriver driver) {
        super(driver);
    }

    @Step
    public FollowUs load() {
        loadPage("/");
        return this;
    }

    @Step
    public FollowUs navigateToInstagram(){
        wait.until(ExpectedConditions.elementToBeClickable(instagram)).click();
        return this;
    }

    @Step
    public FollowUs navigateToTikTok(){
        wait.until(ExpectedConditions.elementToBeClickable(tikTok)).click();
        return  this;
    }

    @Step
    public FollowUs navigateToYouTube(){
        wait.until(ExpectedConditions.elementToBeClickable(youTube)).click();
        return  this;
    }

    @Step
    public FollowUs navigateToLinkedIn(){
        wait.until(ExpectedConditions.elementToBeClickable(linkedIn)).click();
        return  this;
    }

    @Step
    public FollowUs navigateToFacebook(){
        wait.until(ExpectedConditions.elementToBeClickable(facebook)).click();
        return  this;
    }
}
