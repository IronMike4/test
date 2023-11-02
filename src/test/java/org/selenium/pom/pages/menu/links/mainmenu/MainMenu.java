package org.selenium.pom.pages.menu.links.mainmenu;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class MainMenu extends BasePage {
    private final By applyMenuLink = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[1]/section/nav/div/div[2]/a[2]/div");
    private final By findAProgramMenuLink = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[1]/section/nav/div/ul/li[4]/a");
    private final By enquireMenuLink = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[1]/section/nav/div/div[2]/a[1]/div");
    private final By programsAbroad = By.xpath("//a[normalize-space()='Programs abroad']");
    private final By virtualAndOnline = By.xpath("//a[normalize-space()='Virtual & Online']");
    private final By locations = By.xpath("(//a[normalize-space()='Locations'])[1]");
    private final By whyGVI = By.xpath("(//a[@class='nav-item_link gvi-gray-menu-link text-sm font-normal menu-link inline-block relative pb-5 pt-4 px-4 mr-2 rounded-t-[5px]'][normalize-space()='Why GVI'])[1]");
    public MainMenu(WebDriver driver) {
        super(driver);
    }

    @Step
    public MainMenu load() {
        loadPage("/");
        return this;
    }

    @Step
    public MainMenu navigateToFindAProgramUsingApplyMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(applyMenuLink)).click();
        return  this;
    }

    @Step
    public MainMenu navigateToFindAProgramUsingFindProgMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(findAProgramMenuLink)).click();
        return this;
    }

    @Step
    public MainMenu navigateToEnquiryFormViaEnquireMenu(){
        wait.until(ExpectedConditions.elementToBeClickable(enquireMenuLink)).click();
        return  this;
    }
    @Step
    public MainMenu navigateToProgramsAbroadSubMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(programsAbroad)))
                .perform();
        return this;
    }

    @Step
    public MainMenu navigateToOverVirtualAndOnlineSubMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(virtualAndOnline)))
                .perform();
        return this;
    }

    @Step
    public MainMenu navigateToLocationsSubMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(locations)))
                .perform();
        return this;
    }

    @Step
    public MainMenu navigateToWhyGVISubMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(whyGVI)))
                .perform();
        return this;
    }




}
