package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class ParentConsultationForm extends BasePage {

    private final By firstNameFld = By.cssSelector("input[placeholder='First Name*']");
    private final By lastNameFld = By.cssSelector("input[placeholder='Last Name*']");
    private final By phoneFld = By.cssSelector("input[placeholder='Phone*']");
    private final By emailFld = By.xpath("(//input[@placeholder='Email*'])[1]");
    private final By commentFld = By.cssSelector("textarea[name='why_want_to_apply']");
    private final By newsLetterChkBox = By.cssSelector("input[value='newsletter_signup']");
    private final By privatePolicyLink = By.cssSelector("p[class='py-2'] a");
    private final By submitBtn = By.xpath("//button[@type='submit']//div[contains(text(),'Apply')]");
    private final By parentConsultationBtn = By.xpath("(//button[normalize-space()='Free parent consultation'])[1]");
    private final By parentConsultationFormTitle = By.xpath("(//h1[normalize-space()='Free parent consultation'])[1]");

    public ParentConsultationForm(WebDriver driver) {
        super(driver);
    }


    @Step
    public ParentConsultationForm load() {
        loadPage("/parent-info");
        return this;
    }

    @Step
    public ParentConsultationForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public ParentConsultationForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public ParentConsultationForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public ParentConsultationForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public ParentConsultationForm enterComment(String comment) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(commentFld));
        e.clear();
        e.sendKeys(comment);
        return this;
    }

    @Step
    public ParentConsultationForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail()).
                enterComment(userInfo.getComment());
    }

    @Step
    public ParentConsultationForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public ParentConsultationForm navigateToPrivacyPolicyPage() {
        wait.until(ExpectedConditions.elementToBeClickable(privatePolicyLink)).click();
        return this;
    }

    @Step
    public ParentConsultationForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public ParentConsultationForm navigateToParentConsultationForm() {
        wait.until(ExpectedConditions.elementToBeClickable(parentConsultationBtn)).click();
        return this;
    }

    @Step
    public String getParentConsultationFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(parentConsultationFormTitle)).getText();
    }
}



