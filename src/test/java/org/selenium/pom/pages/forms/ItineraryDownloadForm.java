package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class ItineraryDownloadForm extends BasePage {

    private final By itineraryDownloadFormTitle = By.xpath("(//button[normalize-space()='Download itinerary'])[1]");
    private final By downloadItineraryBtn = By.xpath("//*[@id=\"2\"]/div/div/div[3]/button");
    private final By firstNameFld = By.xpath("(//input[contains(@placeholder,'First Name*')])[2]");
    private final By lastNameFld = By.xpath("(//input[contains(@placeholder,'Last Name*')])[2]");
    private final By phoneFld = By.xpath("(//input[contains(@placeholder,'Phone*')])[2]");
    private final By emailFld = By.xpath("(//input[contains(@placeholder,'Email*')])[2]");
    private final By newsLetterChkBox = By.xpath("(//input[contains(@name,'newsletter')])[2]");
    private final By privatePolicyLink = By.cssSelector("form[id='itinerary_form'] a");
    private final By submitBtn = By.xpath("//form[@id='itinerary_form']//button[contains(@type,'submit')]");
    private final By downloadItineraryLink = By.xpath("//a[@title='Download itinerary ']");

    public ItineraryDownloadForm(WebDriver driver) {
        super(driver);
    }

    @Step
    public ItineraryDownloadForm load() {
        loadPage("/programs/volunteer-elephants-thailand/?tab=itinerary");
        return this;
    }

    @Step
    public String getItineraryDownloadFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(itineraryDownloadFormTitle)).getText();
    }

    @Step
    public ItineraryDownloadForm navigateToForm() {
        wait.until(ExpectedConditions.elementToBeClickable(downloadItineraryBtn)).click();
        return this;
    }

    @Step
    public ItineraryDownloadForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public ItineraryDownloadForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public ItineraryDownloadForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public ItineraryDownloadForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public ItineraryDownloadForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail());
    }

    @Step
    public ItineraryDownloadForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public ItineraryDownloadForm navigateToPrivacyPolicyPage() {
        wait.until(ExpectedConditions.elementToBeClickable(privatePolicyLink)).click();
        return this;
    }

    @Step
    public ItineraryDownloadForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public ItineraryDownloadForm navigateToDownloadDoc() {
        wait.until(ExpectedConditions.elementToBeClickable(downloadItineraryLink)).click();
        return this;
    }
}



