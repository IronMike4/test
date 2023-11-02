package org.selenium.pom.pages.menu.getintouch;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class SpeakToOurAlumniPage extends BasePage {
    private final By pageTitle = By.xpath("");

    public SpeakToOurAlumniPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public SpeakToOurAlumniPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
