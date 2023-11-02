package org.selenium.pom.pages.menu.links.whygvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Alumni extends BasePage {
    private final By alumniServices = By.xpath("//a[contains(@class,'my-auto text-xs text-black-lighter dark:text-gray-darken hover:text-white')][normalize-space()='Alumni']");
    private final By ambassadorProgram = By.xpath("//a[normalize-space()='Ambassador program']");
    private final By returneeScholarships = By.xpath("//a[normalize-space()='Returnee scholarships']");
    private final By meetGVIAlumni = By.xpath("//a[normalize-space()='Meet GVI alumni']");
    public Alumni(WebDriver driver) {
        super(driver);
    }

    @Step
    public Alumni load() {
        loadPage("/");
        return this;
    }

    @Step
    public Alumni navigateToAlumniServicesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(alumniServices)).click();
        return  this;
    }

    @Step
    public Alumni navigateToAmbassadorProgramPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ambassadorProgram)).click();
        return this;
    }

    @Step
    public Alumni navigateToReturneeScholarshipsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(returneeScholarships)).click();
        return  this;
    }

    @Step
    public Alumni navigateToMeetGVIAlumniPage(){
        wait.until(ExpectedConditions.elementToBeClickable(meetGVIAlumni)).click();
        return  this;
    }
}
