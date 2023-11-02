package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ProfessionalCourses extends BasePage {
    private final By impactAcademy = By.xpath("//a[normalize-space()='Impact academy']");
    private final By safariGuideTraining = By.xpath("//a[normalize-space()='Safari guide training']");
    private final By diveMasterTraining = By.xpath("//a[normalize-space()='Divemaster training']");

      public ProfessionalCourses(WebDriver driver) {
        super(driver);
    }

    @Step
    public ProfessionalCourses load() {
        loadPage("/");
        return this;
    }

    @Step
    public ProfessionalCourses navigateToCareerAccelerationCourses(){
        wait.until(ExpectedConditions.elementToBeClickable(impactAcademy)).click();
        return  this;
    }

    @Step
    public ProfessionalCourses navigateToFieldGuideTraining(){
        wait.until(ExpectedConditions.elementToBeClickable(safariGuideTraining)).click();
        return this;
    }

    @Step
    public ProfessionalCourses navigateToProfessionalDiveTraining(){
        wait.until(ExpectedConditions.elementToBeClickable(diveMasterTraining)).click();
        return  this;
    }
}
