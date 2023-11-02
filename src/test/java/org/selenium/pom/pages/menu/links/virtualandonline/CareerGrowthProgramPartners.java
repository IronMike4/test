package org.selenium.pom.pages.menu.links.virtualandonline;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CareerGrowthProgramPartners extends BasePage {

    private final By  richmondSchoolOfProfessionalAndContinuingStudies = By.xpath("//a[contains(text(),'Richmond School of Professional and Continuing Stu')]");
    private final By uNCCharlotte = By.xpath("//a[normalize-space()='UNC Charlotte']");
    private final By uCRiversideExtension  = By.xpath("//a[normalize-space()='UC Riverside Extension']");

    public CareerGrowthProgramPartners(WebDriver driver) {
        super(driver);
    }

    @Step
    public CareerGrowthProgramPartners load() {
        loadPage("/");
        return this;
    }

    @Step
    public CareerGrowthProgramPartners navigateToRichmondSchoolOfProfessionalAndContinuingStudies(){
        wait.until(ExpectedConditions.elementToBeClickable(richmondSchoolOfProfessionalAndContinuingStudies)).click();
        return  this;
    }

    @Step
    public CareerGrowthProgramPartners navigateToUNCCharlotteHomepage(){
        wait.until(ExpectedConditions.elementToBeClickable(uNCCharlotte)).click();
        return this;
    }

    @Step
    public CareerGrowthProgramPartners navigateTouCRiversideExtension(){
        wait.until(ExpectedConditions.elementToBeClickable(uCRiversideExtension)).click();
        return  this;
    }
}
