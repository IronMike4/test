package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class GetMoreInfoForm extends BasePage {
    private final By firstNameFld = By.xpath("(//input[@placeholder='First Name*'])[1]");
    private final By lastNameFld = By.xpath("(//input[@placeholder='Last Name*'])[1]");
    private final By phoneFld = By.xpath("//input[@placeholder='Phone*']");
    private final By emailFld = By.xpath("(//input[@placeholder='Email*'])[1]");
    private final By privacyPolicyLink = By.xpath("(//a[normalize-space()='Privacy Policy'])[1]");
    private final By newsLetterChkBox = By.xpath("//input[@name='newsletter']");
    private final By submitBtn = By.xpath("//div[contains(text(),'Get more information')]");
    private final By formTitle = By.xpath("(//h1[normalize-space()='Get more info'])[1]");


    public GetMoreInfoForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public GetMoreInfoForm loadVolEle() {
        loadPage("/programs/volunteer-elephants-thailand");
        return this;
    }

    @Step
    public GetMoreInfoForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public GetMoreInfoForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public GetMoreInfoForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public GetMoreInfoForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public GetMoreInfoForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail());
    }

    @Step
    public GetMoreInfoForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public GetMoreInfoForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public String getFormTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(formTitle)).getText();
    }
}
