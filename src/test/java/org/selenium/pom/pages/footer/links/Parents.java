package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Parents extends BasePage {
    private final By parentInfo = By.xpath("(//a[normalize-space()='Parent info'])[1]");
    private final By parentPack = By.xpath("(//a[normalize-space()='Parent pack'])[1]");

    public Parents(WebDriver driver) {
        super(driver);
    }

    @Step
    public Parents load() {
        loadPage("/");
        return this;
    }

    @Step
    public Parents navigateToParentInformationPage(){
        wait.until(ExpectedConditions.elementToBeClickable(parentInfo)).click();
        return  this;
    }

    @Step
    public Parents navigateToParentPack(){
        wait.until(ExpectedConditions.elementToBeClickable(parentPack)).click();
        return this;
    }
}
