package org.selenium.pom.pages.menu.stayuptodate;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Blogs extends BasePage {
    private final By pageTitle = By.xpath("(//*[@id=\"gatsby-focus-wrapper\"]/div[1]/section/nav/div/ul/li[5]/section/div/div[3]");
    public Blogs(WebDriver driver) {
        super(driver);
    }

    @Step
    public Blogs load() {
        loadPage("/blog");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
