package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class BrochureDownloadForm extends BasePage {

    private final By brochureDownloadFormTitle = By.xpath("(//h1[normalize-space()='Download Brochure'])[1]");
//    private By downloadBrochureBtn = By.xpath("(//button[normalize-space()='Download'])[1]");
    private final By downloadBrochureBtn = By.cssSelector(".submit-button.group.flex.items-center.mt-2.justify-center.py-2.w-full");
    private final By firstNameFld = By.xpath("(//input[@placeholder='First Name*'])[1]");
    private final By lastNameFld = By.xpath("(//input[@placeholder='Last Name*'])[1]");
    private final By phoneFld = By.xpath("(//input[@placeholder='Phone*'])[1]");
    private final By emailFld = By.xpath("(//input[@placeholder='Email*'])[1]");
    private final By newsLetterChkBox = By.name("newsletter");
    private final By privatePolicyLink = By.linkText("Privacy Policy");
    private final By submitBtn = By.xpath("(//div[contains(text(),'Download')])[1]");
    private final By downloadBrochureLink = By.xpath("//a[contains(@title,'Download Brochure')]");

    public BrochureDownloadForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public BrochureDownloadForm load() {
        loadPage("/volunteering-for-teens");
        return this;
    }

    @Step
    public String getBrochureDownloadFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(brochureDownloadFormTitle)).getText();
    }

    @Step
    public BrochureDownloadForm navigateToForm() {
        wait.until(ExpectedConditions.elementToBeClickable(downloadBrochureBtn)).click();
        return this;
    }

    @Step
    public BrochureDownloadForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public BrochureDownloadForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public BrochureDownloadForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public BrochureDownloadForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public BrochureDownloadForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail());
    }

    @Step
    public BrochureDownloadForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public BrochureDownloadForm navigateToPrivacyPolicyPage() {
        wait.until(ExpectedConditions.elementToBeClickable(privatePolicyLink)).click();
        return this;
    }

    @Step
    public BrochureDownloadForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public BrochureDownloadForm navigateToDownloadDoc() {
        wait.until(ExpectedConditions.elementToBeClickable(downloadBrochureLink)).click();
        return this;
    }
}



