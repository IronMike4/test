package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Under18 extends BasePage {
    private final By volunteeringForTeens  = By.xpath("(//a[normalize-space()='Under 18'])[1]");
    private final By under18 = By.xpath("(//a[normalize-space()='All teen programs'])[1]");

    public Under18(WebDriver driver) {
        super(driver);
    }

    @Step
    public Under18 load() {
        loadPage("/");
        return this;
    }

    @Step
    public Under18 navigateToVolunteeringForTeensPage(){
        wait.until(ExpectedConditions.elementToBeClickable(volunteeringForTeens)).click();
        return  this;
    }

    @Step
    public Under18 navigateToVolunteerForTeensViaUnder18sLink(){
        wait.until(ExpectedConditions.elementToBeClickable(under18)).click();
        return this;
    }
}
