package org.selenium.pom.pages.footer.participants;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Over50sVolunteeringPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteering opportunities for older adults'])[1]");
    public Over50sVolunteeringPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public Over50sVolunteeringPage load() {
        loadPage("/over-50s-volunteering");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
