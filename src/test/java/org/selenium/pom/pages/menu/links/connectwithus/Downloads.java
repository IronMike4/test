package org.selenium.pom.pages.menu.links.connectwithus;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Downloads extends BasePage {

    private final By downloadABrochure = By.xpath("//div[contains(@class,'w-full pt-4 pb-4 lg:pt-0 lg:w-3/12')]");

    public Downloads(WebDriver driver) {
        super(driver);
    }

    @Step
    public Downloads load() {
        loadPage("/");
        return this;
    }

    @Step
    public Downloads navigateToBrochureDownloads(){
        wait.until(ExpectedConditions.elementToBeClickable(downloadABrochure)).click();
        return this;
    }
}
