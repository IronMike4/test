package org.selenium.pom.pages.morepages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class
ChooseSite extends BasePage {
    private final By planetBtn = By.xpath("(//div[@class='absolute z-10 top-0 left-0 right-0 bottom-0 cursor-pointer'])[1]");

    public ChooseSite(WebDriver driver) {
        super(driver);
    }

    @Step
    public ChooseSite selectPlanet() {
        wait.until(ExpectedConditions.elementToBeClickable(planetBtn)).click();
        return this;
    }

    @Step
    public ChooseSite load() {
        loadPage("/");
        return this;
    }

    @Step
    public ChooseSite loadAndSelectPlanet() {
        load().selectPlanet();
        return this;
    }
}
