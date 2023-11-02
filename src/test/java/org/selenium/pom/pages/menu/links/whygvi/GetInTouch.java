package org.selenium.pom.pages.menu.links.whygvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class GetInTouch extends BasePage {
    private final By contactUs = By.xpath("//a[contains(@class,'my-auto text-xs text-black-lighter dark:text-gray-darken hover:text-white')][normalize-space()='Contact us']");
    private final By speakToAlumni = By.xpath("//a[normalize-space()='Speak to our alumni']");
    private final By gVIOpenDay = By.xpath("//a[normalize-space()='GVI Virtual Open Days']");

    public GetInTouch(WebDriver driver) {
        super(driver);
    }

    @Step
    public GetInTouch load() {
        loadPage("/");
        return this;
    }

    @Step
    public GetInTouch navigateToContactUsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(contactUs)).click();
        return  this;
    }

    @Step
    public GetInTouch navigateToSpeakToAlumniPage(){
        wait.until(ExpectedConditions.elementToBeClickable(speakToAlumni)).click();
        return this;
    }

    @Step
    public GetInTouch navigateToGVIOpenDayPage(){
        wait.until(ExpectedConditions.elementToBeClickable(gVIOpenDay)).click();
        return  this;
    }
}
