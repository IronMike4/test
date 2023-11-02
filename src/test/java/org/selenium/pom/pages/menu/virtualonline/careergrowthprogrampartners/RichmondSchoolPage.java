package org.selenium.pom.pages.menu.virtualonline.careergrowthprogrampartners;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class RichmondSchoolPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[@class='primary-title primary-header-title uk-margin-remove'])[1]");

    public RichmondSchoolPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public RichmondSchoolPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
