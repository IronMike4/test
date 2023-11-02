package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FindAProgram extends BasePage {
    private final By findAProgram = By.xpath("(//span[@class='pl-2 font-semibold text-base text-black-lighter dark:text-white tracking-[0.02em]'][normalize-space()='Find a program'])[1]");

    public FindAProgram(WebDriver driver) {
        super(driver);
    }

    @Step
    public FindAProgram load() {
        loadPage("/");
        return this;
    }

    @Step
    public FindAProgram navigateToFindAProgramPage(){
        wait.until(ExpectedConditions.elementToBeClickable(findAProgram)).click();
        return  this;
    }
}