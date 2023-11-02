package org.selenium.pom.pages.menu.links.virtualandonline;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FindAProgram extends BasePage {

    private final By findAProgram = By.xpath("(//button[@class='flex px-8 py-2 bg-white dark:bg-gray-standard justify-center mb-6 items-center w-52 rounded-full dark:rounded-[3px]'])[1]");

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
