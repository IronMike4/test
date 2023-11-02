package org.selenium.pom.pages.menu.links.programsabroad;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MenuToggle extends BasePage {
    private final By peopleLink = By.xpath("(//span[@class='text-black-lighter dark:text-white px-4 uppercase font-semibold text-xs menu-link tracking-tabheadingactive'])[1]");

    public MenuToggle(WebDriver driver) {
        super(driver);
    }

    @Step
    public MenuToggle load() {
        loadPage("/");
        return this;
    }

    @Step
    public MenuToggle switchToPlanet(){
        wait.until(ExpectedConditions.elementToBeClickable(peopleLink)).click();
        return  this;
    }
}
