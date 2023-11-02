package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class BlogSignUpForm extends BasePage {
    private final By firstNameFld = By.name("first_name");
    private final By lastNameFld = By.name("last_name");
    private final By phoneFld = By.name("phone_number");
    private final By emailFld = By.cssSelector("input[placeholder='Email*']");
    private final By privacyPolicyLink = By.xpath("(//a[contains(@class,'underline')][normalize-space()='Privacy Policy'])[1]");
    private final By newsLetterChkBox = By.xpath("//*[@id=\"featuredSignupForm\"]/div/label[2]/span");
    private final By enquireBtn = By.xpath("(//button[@type='submit'])[1]");
    private final By requestACallbackBtn = By.xpath("//*[@id=\"featuredSignupForm\"]/div/div/button[2]");
    private final By formTitle = By.xpath("//*[@id=\"featuredSignupForm\"]/h2");
    private final By exitBtn = By.xpath("(//div[contains(@class,'absolute bg-white rounded-full w-6 h-6 block close-icon before:top-[4px] after:top-[4px]')])[1]");


    public BlogSignUpForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public BlogSignUpForm load() {
        loadPage("/blog/smb-discovering-orchids-chiang-mais-hidden-gems");
        return this;
    }

    @Step
    public BlogSignUpForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public BlogSignUpForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public BlogSignUpForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.sendKeys(phone);
        return this;
    }

    @Step
    public BlogSignUpForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.sendKeys(email);
        return this;
    }

    @Step
    public BlogSignUpForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail());
    }

    @Step
    public BlogSignUpForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public BlogSignUpForm submitEnquiry() {
        wait.until(ExpectedConditions.elementToBeClickable(enquireBtn)).click();
        return this;
    }

    @Step
    public BlogSignUpForm submitACallbackRequest() {
        wait.until(ExpectedConditions.elementToBeClickable(requestACallbackBtn)).click();
        return this;
    }

    @Step
    public String getFormTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(formTitle)).getText();
    }
    @Step
    public BlogSignUpForm closeWidget() {
        wait.until(ExpectedConditions.elementToBeClickable(exitBtn)).click();
        return this;
    }
}
