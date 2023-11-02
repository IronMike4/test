package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.pages.forms.*;
import org.testng.Assert;

public class PageMessageAssertionsHelper {

    private final WebDriver driver;

    public PageMessageAssertionsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public PageMessageAssertionsHelper assertJustAMoment(){
        JustAMoment justAMoment = new JustAMoment(driver);
        Assert.assertEquals(justAMoment.getJustAMomentMessage(), "Just a moment...");
        return this;
    }

    public PageMessageAssertionsHelper assertThankYou(){
        ThankYou thanks = new ThankYou(driver);
        Assert.assertEquals(thanks.getThankYouMessage(), "Thank you!");
        return this;
    }

    public PageMessageAssertionsHelper assertHangTight(){
        HangTight hangTight = new HangTight(driver);
        Assert.assertEquals(hangTight.getHangTightMessage(), "Hang tight!");
        return this;
    }

    public PageMessageAssertionsHelper assertBooked(){
        Booked booked = new Booked(driver);
        Assert.assertEquals(booked.getBookedMessage(), "You're booked!");
        return this;
    }

    public PageMessageAssertionsHelper assertAmazing(){
        Amazing amazing = new Amazing(driver);
        Assert.assertEquals(amazing.getAmazingMessage(),"Amazing!");
        return this;
    }

    public PageMessageAssertionsHelper assertSuccess(){
        Success success = new Success(driver);
        Assert.assertEquals(success.getSuccessMessage(),"Success!");
        return this;
    }

    public PageMessageAssertionsHelper assertFoundThem(){
        FoundThem foundThem = new FoundThem(driver);
        Assert.assertEquals(foundThem.getFoundThemMessage(), "We found them!");
        return this;
    }
}
