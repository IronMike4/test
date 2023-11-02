package org.selenium.pom.pages.menu.help;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FAQsPage extends BasePage {
    private final By pageTitle = By.xpath("(//h4[normalize-space()='FAQs'])[1]");

    public FAQsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public FAQsPage load() {
        loadPage("/about-us/faq");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
