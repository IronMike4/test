package org.selenium.pom.pages.forms;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.UserInfo;

public class GroupApplicationForm extends BasePage {

    private final By firstNameFld = By.xpath("//*[@id=\"requestForm\"]/div[2]/label[1]/input");
    private final By lastNameFld = By.xpath("//input[@name='last_name']");
    private final By phoneFld = By.cssSelector("input[placeholder='Phone*']");
    private final By emailFld = By.cssSelector("input[placeholder='Email*']");
    private final By genderFld = By.xpath("(//div[@class=' css-19bb58m'])[1]");
    private final By genderMale = By.cssSelector("#react-select-2-option-0");
    private final By genderFemale = By.cssSelector("#react-select-2-option-1");
    private final By institutionName = By.cssSelector("input[placeholder='Name of your institution*']");
    private final By citizenship = By.xpath("//*[@id=\"requestForm\"]/div[5]/div/div/div[1]/div[2]");
    private final By countrySA = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/form/div[5]/div/div[2]/div/div[204]");
    private final By countryAlgeria = By.xpath("//*[@id=\"react-select-14-option-2\"]");
    private final By day = By.xpath("//*[@id=\"requestForm\"]/div[7]/div[1]/div/div[1]/div[2]");
    private final By month = By.xpath("//*[@id=\"requestForm\"]/div[7]/div[2]/div/div[1]/div[2]");
    private final By year = By.xpath("//*[@id=\"requestForm\"]/div[7]/div[3]/div/div[1]/div[2]");
    private final By day13 = By.cssSelector("#react-select-4-option-12");
    private final By monthJune = By.xpath("//*[@id=\"react-select-5-option-5\"]");
    private final By year94 = By.xpath("//*[@id=\"react-select-6-option-29\"]");
    private final By dietReqYes = By.cssSelector("input[value='Yes'][name='dietary_requirements']");
    private final By dietReqCommentsFld = By.cssSelector("textarea[placeholder='Dietary requirements details']");
    private final By dietReqNo = By.cssSelector("input[value='No'][name='dietary_requirements']");
    private final By medicalReqYes = By.cssSelector("input[value='Yes'][name='medical_conditions']");
    private final By medicalReqComments = By.cssSelector("textarea[placeholder='Medical condition details']");
    private final By medicalReqNo = By.cssSelector("input[value='No'][name='medical_conditions']");
    private final By guardianTitleFld = By.cssSelector("input[placeholder='Title']");
    private final By guardianFirstNameFld = By.xpath("(//input[@name='parent_first_name'])[1]");
    private final By guardianLastNameFld = By.xpath("//input[@name='parent_last_name']");
    private final By relationship = By.xpath("(//div[@class=' css-19bb58m'])[6]");
    private final By parent = By.cssSelector("#react-select-7-option-0");
    private final By guardianPhoneFld = By.cssSelector("input[placeholder='Phone number*']");
    private final By guardianEmailFld = By.cssSelector("input[placeholder='Email Address*']");
    private final By newsLetterChkBox = By.xpath("//input[contains(@name,'newsletter')]");
    private final By privacyPolicyLink = By.xpath("//a[normalize-space()='Privacy Policy']");
    private final By tsAndCsChkBox = By.xpath("//input[@id='parental_consent']");
    private final By submitBtn = By.cssSelector("button[type='submit']");
    private final By groupAppFormTitle = By.xpath("(//h2[normalize-space()='Application form'])[1]");

    public GroupApplicationForm(WebDriver driver) {
        super(driver);
    }

    public GroupApplicationForm load() {
        loadPage("/group-application-form/?type=application&program=246341&program_title=Greece%20Coastal%20Conservation%20Global%20Citizens&group_institute=null");
        return this;
    }

    @Step
    public GroupApplicationForm enterFirstName(String firstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    @Step
    public GroupApplicationForm enterLastName(String lastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameFld));
        e.clear();
        e.sendKeys(lastName);
        return this;
    }

    @Step
    public GroupApplicationForm enterPhone(String phone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneFld));
        e.clear();
        e.sendKeys(phone);
        return this;
    }

    @Step
    public GroupApplicationForm enterEmail(String email) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld));
        e.clear();
        e.sendKeys(email);
        return this;
    }

    @Step
    public GroupApplicationForm setUserInfo(UserInfo userInfo) {
        return enterFirstName(userInfo.getFirstName()).
                enterLastName(userInfo.getLastName()).
                enterPhone(userInfo.getPhone()).
                enterEmail(userInfo.getEmail());
    }

    @Step
    public GroupApplicationForm selectGenderFld() {
        wait.until(ExpectedConditions.elementToBeClickable(genderFld)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectGenderMale() {
        wait.until(ExpectedConditions.elementToBeClickable(genderMale)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectGenderFemale() {
        wait.until(ExpectedConditions.elementToBeClickable(genderFemale)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectMale() {
        selectGenderFld().selectGenderMale();
        return this;
    }

    @Step
    public GroupApplicationForm selectFemale() {
        selectGenderFld().selectGenderFemale();
        return this;
    }

    @Step
    public GroupApplicationForm enterInstitutionName(String institution) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(institutionName));
        e.clear();
        e.sendKeys(institution);
        return this;
    }

    @Step
    public GroupApplicationForm setInstitution(UserInfo userInfo) {
        return enterInstitutionName(userInfo.getInstitution());
    }

    @Step
    public GroupApplicationForm selectCitizenshipFld() {
        wait.until(ExpectedConditions.elementToBeClickable(citizenship)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectCitizenshipSA() {
        wait.until(ExpectedConditions.elementToBeClickable(countrySA)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectCitizenshipAlgeria() {
        wait.until(ExpectedConditions.elementToBeClickable(countryAlgeria)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectSA() {
        selectCitizenshipFld().selectCitizenshipSA();
        return this;
    }

    @Step
    public GroupApplicationForm selectAlgeria() {
        selectCitizenshipFld().selectCitizenshipAlgeria();
        return this;
    }

    @Step
    public GroupApplicationForm selectDayFld() {
        driver.findElement(day).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectDay13() {
        driver.findElement(day13).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectMonthFld() {
        driver.findElement(month).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectMonthJune() {
        driver.findElement(monthJune).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectYearFld() {
        driver.findElement(year).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectYear94() {
        driver.findElement(year94).click();
        return this;
    }

    @Step
    public GroupApplicationForm enterDOB() {
        selectDayFld().selectDay13();
        selectMonthFld().selectMonthJune();
        selectYearFld().selectYear94();
        return this;
    }

    @Step
    public GroupApplicationForm selectDietaryReqYes() {
        driver.findElement(dietReqYes).click();
        return this;
    }

    @Step
    public GroupApplicationForm enterDietReq(String dietReq) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(dietReqCommentsFld));
        e.clear();
        e.sendKeys(dietReq);
        return this;
    }

    @Step
    public GroupApplicationForm setDiet(UserInfo userInfo) {
        return selectDietaryReqYes().enterDietReq(userInfo.getDietaryRequirementDetails());
    }

    @Step
    public GroupApplicationForm selectDietaryReqNo() {
        driver.findElement(dietReqNo).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectMedicalCondYes() {
        driver.findElement(medicalReqYes).click();
        return this;
    }

    @Step
    public GroupApplicationForm enterMedicalCond(String medicalConditions) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(medicalReqComments));
        e.clear();
        e.sendKeys(medicalConditions);
        return this;
    }

    @Step
    public GroupApplicationForm setMedicalConditions(UserInfo userInfo) {
        return selectMedicalCondYes().enterMedicalCond(userInfo.getMedicalConditionDetails());
    }

    @Step
    public GroupApplicationForm selectMedicalCondNo() {
        driver.findElement(medicalReqNo).click();
        return this;
    }

    @Step
    public GroupApplicationForm enterGuardianTitle(String guardianTitle) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(guardianTitleFld));
        e.clear();
        e.sendKeys(guardianTitle);
        return this;
    }

    @Step
    public GroupApplicationForm enterGuardianFirstName(String guardianFirstName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(guardianFirstNameFld));
        e.clear();
        e.sendKeys(guardianFirstName);
        return this;
    }

    @Step
    public GroupApplicationForm enterGuardianLastName(String guardianLastName) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(guardianLastNameFld));
        e.clear();
        e.sendKeys(guardianLastName);
        return this;
    }

    @Step
    public GroupApplicationForm setGuardianInfo(UserInfo userInfo) {
        return enterGuardianTitle(userInfo.getGuardianTitle()).
                enterGuardianFirstName(userInfo.getGuardianFirstName()).
                enterGuardianLastName(userInfo.getGuardianLastName());

    }

    @Step
    public GroupApplicationForm selectRelationshipFld() {
        wait.until(ExpectedConditions.elementToBeClickable(relationship)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectParent() {
        wait.until(ExpectedConditions.elementToBeClickable(parent)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectRelationship() {
        selectRelationshipFld().selectParent();
        return this;
    }

    @Step
    public GroupApplicationForm enterGuardianPhone(String guardianPhone) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(guardianPhoneFld));
        e.clear();
        e.sendKeys(guardianPhone);
        return this;
    }

    @Step
    public GroupApplicationForm enterGuardianEmail(String guardianEmail) {
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(guardianEmailFld));
        e.clear();
        e.sendKeys(guardianEmail);
        return this;
    }

    @Step
    public GroupApplicationForm setMoreGuardianInfo(UserInfo userInfo) {
        return enterGuardianPhone(userInfo.getGuardianPhone()).
                enterGuardianEmail(userInfo.getGuardianEmail());
    }

    @Step
    public GroupApplicationForm selectNewsletter() {
        driver.findElement(newsLetterChkBox).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectPrivatePolicyLink() {
        wait.until(ExpectedConditions.elementToBeClickable(privacyPolicyLink)).click();
        return this;
    }

    @Step
    public GroupApplicationForm selectTsAndCs() {
        driver.findElement(tsAndCsChkBox).click();
        return this;
    }

    @Step
    public GroupApplicationForm submitForm() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }

    @Step
    public String getGroupAppFormTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(groupAppFormTitle)).getText();
    }
}



