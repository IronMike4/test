package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class EnquiryForm extends BasePage {

    private final By firstNameFld = By.cssSelector("input[name='first_name']");
    private final By lastNameFld = By.cssSelector("input[name='last_name']");
    private final By phoneFld = By.cssSelector("input[name='phone_number']");
    private final By emailFld = By.cssSelector("input[name='email_address']");
    private final By commentFld = By.cssSelector("[rows]");
    private final By newsLetterChkBox =By.cssSelector("input[value='newsletter_signup']");
    private final By privatePolicyLink = By.linkText("Privacy Policy");
    private final By submitBtn = By.cssSelector("button[type='submit']");
    private final By enquiryFormTitle = By.xpath("//h2[normalize-space()='Enquiry form']");

    public EnquiryForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public EnquiryForm load() {
        loadPage("/enquiry-form");
        return this;
    }

    @Step
    public EnquiryForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public EnquiryForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public EnquiryForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public EnquiryForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public EnquiryForm enterComment(String comment) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(commentFld));
        e.clear();
        e.sendKeys(comment);
        return this;
    }

    @Step
    public EnquiryForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail()).
                enterComment(userInfo.getComment());
    }

    @Step
    public EnquiryForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public EnquiryForm navigateToPrivacyPolicyPage() {
        wait.until(ExpectedConditions.elementToBeClickable(privatePolicyLink)).click();
        return this;
    }

    @Step
    public EnquiryForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public String getEnquiryFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(enquiryFormTitle)).getText();
    }
}



