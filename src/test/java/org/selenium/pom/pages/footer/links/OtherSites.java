package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OtherSites extends BasePage {
    private final By careersAbroad = By.xpath("(//a[normalize-space()='Careers abroad'])[1]");
    private final By charitablePrograms = By.xpath("(//a[normalize-space()='GVI charitable programs'])[1]");

    public OtherSites(WebDriver driver) {
        super(driver);
    }

    @Step
    public OtherSites load() {
        loadPage("/");
        return this;
    }

    @Step
    public OtherSites navigateToCareersAbroadPage(){
        wait.until(ExpectedConditions.elementToBeClickable(careersAbroad)).click();
        return  this;
    }

    @Step
    public OtherSites navigateToGVICharitableProgramsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(charitablePrograms)).click();
        return this;
    }
}
