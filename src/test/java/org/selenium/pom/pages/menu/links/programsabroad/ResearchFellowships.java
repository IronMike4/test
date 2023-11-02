package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ResearchFellowships extends BasePage {
    private final By researchFellowships = By.xpath("//a[normalize-space()='Research fellowship']");
    private final By allFellowships = By.xpath("//a[normalize-space()='All fellowships']");

    public ResearchFellowships(WebDriver driver) {
        super(driver);
    }

    @Step
    public ResearchFellowships load() {
        loadPage("/");
        return this;
    }

    @Step
    public ResearchFellowships navigateToResearchFellowships(){
        wait.until(ExpectedConditions.elementToBeClickable(researchFellowships)).click();
        return  this;
    }

    @Step
    public ResearchFellowships navigateToAllFellowships(){
        wait.until(ExpectedConditions.elementToBeClickable(allFellowships)).click();
        return this;
    }
}
