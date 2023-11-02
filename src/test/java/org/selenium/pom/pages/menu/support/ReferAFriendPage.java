package org.selenium.pom.pages.menu.support;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ReferAFriendPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='Refer a Friend'])[1]");

    public ReferAFriendPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public ReferAFriendPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
