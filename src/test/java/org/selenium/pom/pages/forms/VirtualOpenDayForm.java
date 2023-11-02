package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class VirtualOpenDayForm extends BasePage {

    private final By firstNameFld = By.xpath("(//input[@placeholder='First Name*'])[1]");
    private final By lastNameFld = By.xpath("(//input[contains(@placeholder,'Last Name*')])[1]");
    private final By phoneFld = By.xpath("(//input[contains(@placeholder,'Phone*')])[1]");
    private final By emailFld = By.xpath("(//input[contains(@placeholder,'Email*')])[1]");
    private final By newsLetterChkBox = By.xpath("(//input[contains(@name,'newsletter')])[1]");
    private final By privatePolicyLink = By.xpath("(//a[normalize-space()='Privacy Policy'])[1]");
    private final By submitBtn = By.xpath("(//button[contains(@type,'submit')])[1]");
    private final By itineraryDownloadFormTitle = By.xpath("//h2[normalize-space()='Enquiry form']");

    public VirtualOpenDayForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public VirtualOpenDayForm load() {
        loadPage("/opendays/sign-up");
        return this;
    }

    @Step
    public VirtualOpenDayForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public VirtualOpenDayForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public VirtualOpenDayForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public VirtualOpenDayForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public VirtualOpenDayForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail());
    }

    @Step
    public VirtualOpenDayForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public VirtualOpenDayForm navigateToPrivacyPolicyPage() {
        wait.until(ExpectedConditions.elementToBeClickable(privatePolicyLink)).click();
        return this;
    }

    @Step
    public VirtualOpenDayForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public String getItineraryDownloadFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(itineraryDownloadFormTitle)).getText();
    }
}



