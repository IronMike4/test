package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class CallBackRequestGenericForm extends BasePage {

    private final By callBackRequestFormTitle = By.xpath("//h2[normalize-space()='Call back request']");
    private final By firstNameFld = By.cssSelector("input[placeholder='First Name*']");
    private final By lastNameFld = By.cssSelector("input[placeholder='Last Name*']");
    private final By phoneFld = By.cssSelector("input[placeholder='Phone*']");
    private final By emailFld = By.cssSelector("input[placeholder='Email*']");
    private final By commentFld = By.cssSelector("textarea[name='why_want_to_apply']");
    private final By newsLetterChkBox =By.cssSelector("input[value='newsletter_signup']");
    private final By privatePolicyLink = By.linkText("Privacy Policy");
    private final By submitBtn = By.cssSelector("button[type='submit']");

    public CallBackRequestGenericForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public CallBackRequestGenericForm load() {
        loadPage("/enquiry-form");
        return this;
    }

    @Step
    public String getCallBackFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(callBackRequestFormTitle)).getText();
    }

    @Step
    public CallBackRequestGenericForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public CallBackRequestGenericForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public CallBackRequestGenericForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public CallBackRequestGenericForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public CallBackRequestGenericForm enterComment(String comment) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(commentFld));
        e.clear();
        e.sendKeys(comment);
        return this;
    }

    @Step
    public CallBackRequestGenericForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail()).
                enterComment(userInfo.getComment());
    }

    @Step
    public CallBackRequestGenericForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public CallBackRequestGenericForm navigateToPrivacyPolicyPage() {
        wait.until(ExpectedConditions.elementToBeClickable(privatePolicyLink)).click();
        return this;
    }

    @Step
    public CallBackRequestGenericForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }
}



