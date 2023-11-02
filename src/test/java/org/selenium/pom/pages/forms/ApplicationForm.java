package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class ApplicationForm extends BasePage {

    private final By firstNameFld = By.name("first_name");
    private final By lastNameFld = By.name("last_name");
    private final By phoneFld = By.name("phone_number");
    private final By emailFld = By.name("email_address");

    private final By commentFld = By.id("motiv");
    private final By newsLetterChkBox = By.cssSelector("span[class='checkmark']");
    private final By tsAndCsChkBox = By.xpath("(//span[contains(@class,'')])[15]");
    private final By submitBtn = By.cssSelector("p[class='text-base leading-[22px] pr-2 font-bold']");
    private final By appFormTitle = By.xpath("(//h2[normalize-space()='Application form'])[1]");

    public ApplicationForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public ApplicationForm loadSeaTurtle() {
        loadPage("/application-form/?program_id=7522");
        return this;
    }

    @Step
    public ApplicationForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public ApplicationForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public ApplicationForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public ApplicationForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public ApplicationForm enterComment(String comment) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(commentFld));
        e.clear();
        e.sendKeys(comment);
        return this;
    }

    @Step
    public ApplicationForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail()).
                enterComment(userInfo.getComment());
    }

    @Step
    public ApplicationForm selectNewsletter() {
        wait.until(ExpectedConditions.elementToBeClickable(newsLetterChkBox)).click();
        return this;
    }

    @Step
    public ApplicationForm selectTsAndCs() {
        wait.until(ExpectedConditions.elementToBeClickable(tsAndCsChkBox)).click();
        return this;
    }

    @Step
    public ApplicationForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public String getAppFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(appFormTitle)).getText();
    }
}



