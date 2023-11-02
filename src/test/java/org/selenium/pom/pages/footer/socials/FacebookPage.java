package org.selenium.pom.pages.footer.socials;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FacebookPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='GVI - Volunteer Abroad'])[1]");

    public FacebookPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public FacebookPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
