package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class CallBackRequestSpecific extends BasePage {

    private final By firstNameFld = By.cssSelector("input[placeholder='First Name*']");
    private final By lastNameFld = By.cssSelector("input[placeholder='Last Name*']");
    private final By phoneFld = By.cssSelector("input[placeholder='Phone*']");
    private final By emailFld = By.cssSelector("input[placeholder='Email*']");
    private final By commentFld = By.cssSelector("textarea[name='why_want_to_apply']");
    private final By newsLetterChkBox =By.name("newsletter");
    private final By privatePolicyLink = By.linkText("Privacy Policy");
    private final By submitBtn = By.cssSelector("button[type='submit']");
    private final By enquiryFormTitle = By.xpath("(//h2[normalize-space()='Call back request'])[1]");

    public CallBackRequestSpecific(WebDriver driver) {
        super(driver);
    }

    @Step
    public CallBackRequestSpecific load() {
        loadPage("/enquiry-form/?type=specific_callback&program=5675&program_title=Volunteer%20with%20Elephants%20in%20Thailand");
        return this;
    }

    @Step
    public CallBackRequestSpecific enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public CallBackRequestSpecific enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public CallBackRequestSpecific enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public CallBackRequestSpecific enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public CallBackRequestSpecific enterComment(String comment) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(commentFld));
        e.clear();
        e.sendKeys(comment);
        return this;
    }

    @Step
    public CallBackRequestSpecific setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail()).
                enterComment(userInfo.getComment());
    }

    @Step
    public CallBackRequestSpecific selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public CallBackRequestSpecific navigateToPrivacyPolicyPage() {
        wait.until(ExpectedConditions.elementToBeClickable(privatePolicyLink)).click();
        return this;
    }

    @Step
    public CallBackRequestSpecific submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public String getEnquiryFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(enquiryFormTitle)).getText();
    }
}



