package org.selenium.pom.pages.footer.downloads;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class GoogleScholarPage extends BasePage {
    private final By pageTitle = By.xpath("(//div[normalize-space()='GVI Planet and People'])[1]");
    public GoogleScholarPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public GoogleScholarPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
