package org.selenium.pom.pages.programs;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class VolElephantThailand extends BasePage {
    private final By speakToAlumniTab = By.xpath("//div[contains(text(),'Speak to alumni')]");
    private final By speakToOurAlumniBtn = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[2]/div/div/div/section[2]/div/div/div[2]/button/p");
    private final By chatToAlumniBtn = By.xpath("(//button[normalize-space()='Chat to alumni'])[1]");
    private final By callMeBackBtn = By.xpath("(//a[normalize-space()='Call me back'])[1]");
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Volunteer with Elephants in Thailand'])[1]");
    public VolElephantThailand(WebDriver driver) {
        super(driver);
    }

    @Step
    public VolElephantThailand load() {
        loadPage("/programs/volunteer-elephants-thailand");
        return this;
    }

    @Step
    public VolElephantThailand navigateToSpeakToAlumniTab(){
        wait.until(ExpectedConditions.elementToBeClickable(speakToAlumniTab)).click();
        return this;
    }

    @Step
    public VolElephantThailand navigateToSpeakToAlumniForm(){
        wait.until(ExpectedConditions.elementToBeClickable(chatToAlumniBtn)).click();
        return this;
    }

    @Step
    public VolElephantThailand navigateToFormViaSpeakToAlumniBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(speakToOurAlumniBtn)).click();
        return this;
    }

    @Step
    public VolElephantThailand navigateToCallBackForm(){
        wait.until(ExpectedConditions.elementToBeClickable(callMeBackBtn)).click();
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
