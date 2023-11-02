package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Participants extends BasePage {
    private final By students = By.xpath("(//a[normalize-space()='Students'])[1]");
    private final By gapYear = By.xpath("(//a[normalize-space()='Gap year'])[1]");
    private final By under18s = By.xpath("(//a[normalize-space()='Under 18s'])[1]");
    private final By aLevels = By.xpath("(//a[normalize-space()='A-levels'])[1]");
    private final By groups = By.xpath("(//a[normalize-space()='Groups'])[1]");
    private final By families = By.xpath("(//a[normalize-space()='Families'])[1]");
    private final By careerBreakers = By.xpath("(//a[normalize-space()='Career breakers'])[1]");
    private final By over50s = By.xpath("(//a[normalize-space()='Over 50s'])[1]");
    public Participants(WebDriver driver) {
        super(driver);
    }

    @Step
    public Participants load() {
        loadPage("/");
        return this;
    }

    @Step
    public Participants navigateToStudentVolunteerPage(){
        wait.until(ExpectedConditions.elementToBeClickable(students)).click();
        return  this;
    }

    @Step
    public Participants navigateToGapYearPage(){
        wait.until(ExpectedConditions.elementToBeClickable(gapYear)).click();
        return this;
    }

    @Step
    public Participants navigateToTeensPage(){
        wait.until(ExpectedConditions.elementToBeClickable(under18s)).click();
        return  this;
    }

    @Step
    public Participants navigateToALevelsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(aLevels)).click();
        return  this;
    }

    @Step
    public Participants navigateToGroupTravelPage(){
        wait.until(ExpectedConditions.elementToBeClickable(groups)).click();
        return  this;
    }

    @Step
    public Participants navigateToFamiliesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(families)).click();
        return  this;
    }

    @Step
    public Participants navigateToCareerBreakers(){
        wait.until(ExpectedConditions.elementToBeClickable(careerBreakers)).click();
        return  this;
    }

    @Step
    public Participants navigateToOver50sPage(){
        wait.until(ExpectedConditions.elementToBeClickable(over50s)).click();
        return  this;
    }
}
