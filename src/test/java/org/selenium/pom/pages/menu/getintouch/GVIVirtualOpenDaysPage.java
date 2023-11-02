package org.selenium.pom.pages.menu.getintouch;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class GVIVirtualOpenDaysPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='GVI virtual open days'])[1]");

    public GVIVirtualOpenDaysPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public GVIVirtualOpenDaysPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
