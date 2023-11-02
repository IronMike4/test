package org.selenium.pom.pages.menu.links.whygvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Help extends BasePage {
    private final By fAQs = By.xpath("//a[contains(@class,'my-auto text-xs text-black-lighter dark:text-gray-darken hover:text-white')][normalize-space()='FAQs']");

    public Help(WebDriver driver) {
        super(driver);
    }

    @Step
    public Help load() {
        loadPage("/");
        return this;
    }

    @Step
    public Help navigateToFAQsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(fAQs)).click();
        return  this;
    }
}
