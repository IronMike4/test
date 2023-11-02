package org.selenium.pom.pages.menu.links.locations;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class LatinAmerica extends BasePage {

    private final By latinAmerica = By.xpath("//a[normalize-space()='Latin America']");
    private final By costaRica = By.xpath("//a[normalize-space()='Costa Rica']");
    private final By mexico = By.xpath("//a[normalize-space()='Mexico']");

    public LatinAmerica(WebDriver driver) {
        super(driver);
    }

    @Step
    public LatinAmerica load() {
        loadPage("/");
        return this;
    }

    @Step
    public LatinAmerica navigateToLatinAmericaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(latinAmerica)).click();
        return this;
    }

    @Step
    public LatinAmerica navigateToCostaRicaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(costaRica)).click();
        return  this;
    }

    @Step
    public LatinAmerica navigateToMexicoPage(){
        wait.until(ExpectedConditions.elementToBeClickable(mexico)).click();
        return  this;
    }
}
