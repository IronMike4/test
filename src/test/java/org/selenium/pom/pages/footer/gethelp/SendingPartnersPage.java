package org.selenium.pom.pages.footer.gethelp;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class SendingPartnersPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Sending Partners'])[1]");

    public SendingPartnersPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public SendingPartnersPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
