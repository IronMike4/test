package org.selenium.pom.pages.morepages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class HomePage extends BasePage {
    private final By homePageHeading = By.xpath("(//h1[normalize-space()='LIVE A WILDER LIFE'])[1]");
    private final By newsletterEmailFld = By.xpath("//input[@placeholder='Enter your email address']");
    private final By subscribeBtn = By.cssSelector("button[type='submit']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step
    public HomePage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getHomePageHeading(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(homePageHeading)).getText();
    }

    @Step
    public HomePage enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(newsletterEmailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public HomePage subscribe() {
        wait.until(ExpectedConditions.elementToBeClickable(subscribeBtn)).click();
        return this;
    }

    @Step
    public HomePage setUserEmail(UserInfo userInfo) {
        return enterEmail(userInfo.getEmail());
    }
}
