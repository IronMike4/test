package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ProfessionalApprenticeships extends BasePage {
    private final By professionalApprenticeships = By.xpath("//a[normalize-space()='Professional apprenticeships']");
    private final By allApprenticeships = By.xpath("//a[normalize-space()='All apprenticeships']");

    public ProfessionalApprenticeships(WebDriver driver) {
        super(driver);
    }

    @Step
    public ProfessionalApprenticeships load() {
        loadPage("/");
        return this;
    }

    @Step
    public ProfessionalApprenticeships navigateToProfessionalApprenticeships(){
        wait.until(ExpectedConditions.elementToBeClickable(professionalApprenticeships)).click();
        return  this;
    }

    @Step
    public ProfessionalApprenticeships navigateToAllApprenticeships(){
        wait.until(ExpectedConditions.elementToBeClickable(allApprenticeships)).click();
        return this;
    }
}
