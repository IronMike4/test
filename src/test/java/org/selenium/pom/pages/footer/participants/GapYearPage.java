package org.selenium.pom.pages.footer.participants;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class GapYearPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Gap years'])[1]");
    public GapYearPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public GapYearPage load() {
        loadPage("/gap-year");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
