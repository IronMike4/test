package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class CompleteYourApplication extends BasePage {

    private final By ageFld = By.name("applicant_age");
    private final By startDateFld = By.xpath("(//div[contains(@class,'css-19bb58m')])[1]");
    private final By startDateOption5 = By.xpath("//*[@id=\"react-select-2-option-1\"]");
    private final By durationFld = By.xpath("(//div)[298]");
    private final By durationOption = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/section/div/div[2]/div/form/div[2]/div[1]/div[2]/div[2]/div/div");
    private final By confirmPeriodFld = By.xpath("(//div[@class=' css-19bb58m'])[3]");
    private final By confirmPeriodOption3 = By.xpath("//*[@id=\"react-select-4-option-2\"]");
    private final By timeToCallFld = By.xpath("(//div[@class=' css-19bb58m'])[4]");
    private final By timeToCallOption2 = By.xpath("//*[@id=\"react-select-5-option-1\"]");
    private final By totalDuration = By.xpath("//span[normalize-space()='2']");
    private final By totalAmount = By.xpath("(//span[contains(text(),'$')])[1]");
    private final By submitBtn = By.xpath("(//p[contains(@class,'text-base leading-[22px] pr-2 font-bold')])[1]");

    public CompleteYourApplication(WebDriver driver) {
        super(driver);
    }

    @Step
    public CompleteYourApplication loadSeaTurtle() {
        loadPage("/thank-you-for-your-application/?lead_id=00QRO000000PMOl2AO&program_id=THAL0513F&fundraising=&departure_date=&duration=&referring_form_type=application_form");
        return this;
    }

    @Step
    public CompleteYourApplication enterAge(String age) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ageFld)).sendKeys(age);
        return this;
    }

    @Step
    public CompleteYourApplication setAge(UserInfo userInfo) {
        return enterAge(userInfo.getAge());
    }

    @Step
    public CompleteYourApplication selectStartDateFld() {
        wait.until(ExpectedConditions.elementToBeClickable(startDateFld)).click();
        return this;
    }

    @Step
    public CompleteYourApplication selectStartDateOption() {
        wait.until(ExpectedConditions.elementToBeClickable(startDateOption5)).click();
        return this;
    }

    @Step
    public CompleteYourApplication selectDurationFld() {
        wait.until(ExpectedConditions.elementToBeClickable(durationFld)).click();
        return this;
    }

    @Step
    public CompleteYourApplication selectDurationOption() {
        wait.until(ExpectedConditions.elementToBeClickable(durationOption)).click();
        return this;
    }

    @Step
    public CompleteYourApplication selectConfirmationFld() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmPeriodFld)).click();
        return this;
    }

    @Step
    public CompleteYourApplication selectConfirmOption() {
        wait.until(ExpectedConditions.elementToBeClickable(confirmPeriodOption3)).click();
        return this;
    }

    public CompleteYourApplication selectTimeToCallFld() {
        wait.until(ExpectedConditions.elementToBeClickable(timeToCallFld)).click();
        return this;
    }

    @Step
    public CompleteYourApplication selectTimeToCallOption() {
        wait.until(ExpectedConditions.elementToBeClickable(timeToCallOption2)).click();
        return this;
    }

    @Step
    public String getTotalDuration() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(totalDuration)).getText();
    }

    @Step
    public String getTotalAmount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(totalAmount)).getText();
    }

    @Step
    public CompleteYourApplication submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }
}
