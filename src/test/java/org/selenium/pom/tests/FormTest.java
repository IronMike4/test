package org.selenium.pom.tests;

import io.qameta.allure.Description;
import org.selenium.pom.base.PageMessageAssertionsHelper;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.objects.UserInfo;
import org.selenium.pom.pages.forms.*;
import org.selenium.pom.pages.morepages.ChooseSite;
import org.selenium.pom.pages.morepages.HomePage;
import org.selenium.pom.utils.JacksonUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class FormTest extends BaseTest {

    @Description("This is the application form submission for the Sea Turtle Conservation and Adventure Teen Volunteering in Thailand program")
    @Test(description = "Application form submission for the Sea Turtle Conservation and Adventure program")
    public void SeaTurtleThaiApplicationFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new ApplicationForm(getDriver()).
                loadSeaTurtle().
                setUserInfo(userInfo).
                selectNewsletter().
                selectTsAndCs().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment();
    }

    @Description("This is the Complete Your Application form submission for the Sea Turtle Conservation and Adventure Teen Volunteering in Thailand program")
    @Test(description = "Complete Your Application form submission for the Sea Turtle Conservation and Adventure program")
//    @Test(enabled = false)
    public void SeaTurtleThaiCompleteApplicationFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        CompleteYourApplication complete = new CompleteYourApplication(getDriver()).loadSeaTurtle().
                setAge(userInfo).
                selectStartDateFld().
                selectStartDateOption().
                selectDurationFld().
                selectDurationOption().
                selectConfirmationFld().
                selectConfirmOption().
                selectTimeToCallFld().
                selectTimeToCallOption().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }

    @Description("This is the Speak to Alumni form submission for the Volunteer With Elephants in Thailand program")
    @Test(description = "Speak To Alumni form submission for the Volunteer With Elephants program")
    public void SpeakToAlumniFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new SpeakToAlumniForm(getDriver()).
                loadVolEle().navigateToSpeakToAlumniForm().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertHangTight().
                assertFoundThem();

    }

    @Description("This is the Get more info form submission for the Volunteer With Elephants in Thailand program")
    @Test(description = "Get more info form submission for the Volunteer With Elephants program")
//    @Test(enabled = false)
    public void GetMoreInfoFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new GetMoreInfoForm(getDriver()).
                loadVolEle().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }

    @Description("This is the Blog signup form enquiry for the Discovering Orchids program")
    @Test(description = "Blog signup form enquiry for the Discovering Orchids program")
//    @Test(enabled = false)
    public void BlogSignUpFormEnquiry() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new BlogSignUpForm(getDriver()).
                load().
                setUserInfo(userInfo).
                selectNewsletter().
                submitEnquiry();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }

    @Description("This is the Blog signup form callback request for the Discovering Orchids program")
    @Test(description = "Blog signup form callback request for the Discovering Orchids program")
//    @Test(enabled = false)
    public void BlogSignUpFormCallbackRequest() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new BlogSignUpForm(getDriver()).
                load().
                setUserInfo(userInfo).
                selectNewsletter().
                submitACallbackRequest();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }

    @Description("This is the Online course Get More Info form submission for the Impact Measurement program")
    @Test(description = "Online course Get More Info form submission for the Impact Measurement program")
//    @Test(enabled = false)
    public void OnlineCourseGetMoreInfoFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new OnlineCourseGetMoreInfoForm(getDriver()).
                load().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }

    @Description("This is the Enquiry form submission")
    @Test(description = "Enquiry form submission")
    public void EnquiryFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new EnquiryForm(getDriver()).
                load().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }

    @Description("This is the Specific Callback Request form submission")
    @Test(description = "Specific Callback Request form submission")
    public void SpecificCallBackRequestFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new CallBackRequestSpecific(getDriver()).
                load().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }

    @Description("This is the Generic Callback Request form submission")
    @Test(description = "Generic Callback Request form submission")
    public void CallBackRequestFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new CallBackRequestGenericForm(getDriver()).
                load().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }

    @Description("This is the Virtual Open Day form submission")
//    @Test(description = "Open Day form submission")
    @Test(enabled = false)
    public void OpenDayFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new VirtualOpenDayForm(getDriver()).load().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertHangTight().
                assertBooked();
    }

    @Description("This is the Itinerary Download form submission")
    @Test(description = "Itinerary Download form submission")
    public void ItineraryDownloadFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        ItineraryDownloadForm download = new ItineraryDownloadForm(getDriver()).
                load().navigateToForm().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertHangTight();
        download.navigateToDownloadDoc();
    }

    @Description("This is the Brochure Download form submission")
    @Test(description = "Brochure Download form submission")
    public void BrochureDownloadFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new ChooseSite(getDriver()).loadAndSelectPlanet();
        BrochureDownloadForm download = new BrochureDownloadForm(getDriver()).
                load().navigateToForm().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertHangTight();
        download.navigateToDownloadDoc();
    }

    @Description("This is the Newsletter Subscription")
    @Test(description = "Newsletter Subscription")
    public void NewsletterSubscription() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new ChooseSite(getDriver()).loadAndSelectPlanet();
        new HomePage(getDriver()).
                setUserEmail(userInfo).
                subscribe();
        new PageMessageAssertionsHelper(getDriver()).
                assertHangTight().
                assertAmazing();
    }

    @Description("This is the Free Parent Consultation submission")
    @Test(description = "Free Parent Consultation form submission")
    public void ParentConsultationFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new ParentConsultationForm(getDriver()).
                load().
                navigateToParentConsultationForm().
                setUserInfo(userInfo).
                selectNewsletter().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertHangTight().
                assertSuccess();
    }

    @Description("This is the Group application form submission for the Greece Coastal Conservation Global Citizens program")
    @Test(description = "Group application form submission for the Greece Coastal Conservation program")
    public void GroupApplicationFormSubmission() throws IOException {
        UserInfo userInfo = JacksonUtils.deserializeJson("userInfo.json", UserInfo.class);
        new GroupApplicationForm(getDriver()).
                load().
                setUserInfo(userInfo).
                selectMale().
                setInstitution(userInfo).
                selectSA().
                enterDOB().
                setDiet(userInfo).
                setMedicalConditions(userInfo).
                setGuardianInfo(userInfo).
                selectRelationship().
                setMoreGuardianInfo(userInfo).
                selectNewsletter().
                selectTsAndCs().
                submitForm();
        new PageMessageAssertionsHelper(getDriver()).
                assertJustAMoment().
                assertThankYou();
    }
}
