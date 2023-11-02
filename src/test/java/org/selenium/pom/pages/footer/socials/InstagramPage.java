package org.selenium.pom.pages.footer.socials;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class InstagramPage extends BasePage {
    private final By pageTitle = By.xpath("(//h2[normalize-space()='gvitravel'])[1]");

    public InstagramPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public InstagramPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
