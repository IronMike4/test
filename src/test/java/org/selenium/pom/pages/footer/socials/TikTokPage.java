package org.selenium.pom.pages.footer.socials;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class TikTokPage extends BasePage {
    private final By pageTitle = By.xpath("//h1[@class='tiktok-fqd5k2-H1ShareTitle e1457k4r8']");

    public TikTokPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public TikTokPage load() {
        loadPage("/");
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
