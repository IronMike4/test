package org.selenium.pom.pages.menu.alumni;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MeetGVIAlumniPage extends BasePage {
    private final By pageTitle = By.xpath("");

    public MeetGVIAlumniPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public MeetGVIAlumniPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
