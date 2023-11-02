package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Policies extends BasePage {
    private final By childAndVulnerableAdultProtection = By.xpath("(//a[normalize-space()='Child and vulnerable adult protection'])[1]");
    private final By healthAndSafety = By.xpath("(//a[normalize-space()='Health and safety'])[1]");
    private final By socialDistancingAndHygiene = By.xpath("(//a[normalize-space()='Social distancing and hygiene'])[1]");
    private final By britishStandards8848 = By.xpath("(//a[normalize-space()='British standards 8848'])[1]");

    public Policies(WebDriver driver) {
        super(driver);
    }

    @Step
    public Policies load() {
        loadPage("/");
        return this;
    }

    @Step
    public Policies navigateToChildVulnerableAdultProtectionPage(){
        wait.until(ExpectedConditions.elementToBeClickable(childAndVulnerableAdultProtection)).click();
        return  this;
    }

    @Step
    public Policies navigateToHealthAndSafetyPage(){
        wait.until(ExpectedConditions.elementToBeClickable(healthAndSafety)).click();
        return this;
    }

    @Step
    public Policies navigateToHealthAndHygienePage(){
        wait.until(ExpectedConditions.elementToBeClickable(socialDistancingAndHygiene)).click();
        return  this;
    }

    @Step
    public Policies navigateToBritishStandardsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(britishStandards8848)).click();
        return  this;
    }
}
