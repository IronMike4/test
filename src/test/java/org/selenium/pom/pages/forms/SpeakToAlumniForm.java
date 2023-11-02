package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class SpeakToAlumniForm extends BasePage {
    private final By firstNameFld = By.xpath("(//input[contains(@placeholder,'First Name*')])[1]");
    private final By lastNameFld = By.xpath("(//input[contains(@placeholder,'Last Name*')])[1]");
    private final By phoneFld = By.xpath("(//input[contains(@placeholder,'Phone*')])[1]");
    private final By emailFld = By.xpath("(//input[contains(@placeholder,'Email*')])[1]");
    private final By newsLetterChkBox = By.xpath("(//input[contains(@name,'newsletter')])[1]");
    private final By submitBtn = By.xpath("(//button[contains(@type,'submit')])[2]");
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Connect with our alumni'])[1]");
    private final By chatToAlumniBtn = By.xpath("(//button[normalize-space()='Chat to alumni'])[1]");

    public SpeakToAlumniForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public SpeakToAlumniForm loadVolEle() {
        loadPage("/programs/volunteer-elephants-thailand/?tab=speak-to-alumni");
        return this;
    }

    @Step
    public SpeakToAlumniForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public SpeakToAlumniForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public SpeakToAlumniForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public SpeakToAlumniForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public SpeakToAlumniForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail());
    }

    @Step
    public SpeakToAlumniForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public SpeakToAlumniForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }

    @Step
    public SpeakToAlumniForm navigateToSpeakToAlumniForm(){
        wait.until(ExpectedConditions.elementToBeClickable(chatToAlumniBtn)).click();
        return this;
    }
}
