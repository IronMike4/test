package org.selenium.pom.pages.footer.participants;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolunteeringForALevelsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteering After Your A-Levels'])[1]");
    public VolunteeringForALevelsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolunteeringForALevelsPage load() {
        loadPage("/a-levels");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
