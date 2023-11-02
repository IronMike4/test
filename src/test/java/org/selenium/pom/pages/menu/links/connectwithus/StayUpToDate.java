package org.selenium.pom.pages.menu.links.connectwithus;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class StayUpToDate extends BasePage {

    private final By readOurBlog = By.xpath("(//div[contains(@class,'w-full pt-4 pb-16 lg:pt-0 lg:w-3/12')])[1]");
    private final By googleScholar = By.xpath("");

    public StayUpToDate(WebDriver driver) {
        super(driver);
    }

    @Step
    public StayUpToDate load() {
        loadPage("/");
        return this;
    }

    @Step
    public StayUpToDate navigateToBlogLandingPage(){
        wait.until(ExpectedConditions.elementToBeClickable(readOurBlog)).click();
        return this;
    }

    @Step
    public StayUpToDate navigateToGVIPublications(){
        wait.until(ExpectedConditions.elementToBeClickable(googleScholar)).click();
        return  this;
    }
}
