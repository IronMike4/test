package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Downloads extends BasePage {
    private final By downloadABrochure = By.xpath("(//a[@title='Download a brochure'])[1]");
    private final By downloadParentPack = By.xpath("(//a[normalize-space()='Download our parent pack'])[1]");
    private final By viewPublications = By.xpath("(//a[@class='flex flex-row items-center justify-center w-full py-2 mx-auto text-base font-bold text-white cursor-pointer'][normalize-space()='View our publications on'])[1]");

    public Downloads(WebDriver driver) {
        super(driver);
    }

    @Step
    public Downloads load() {
        loadPage("/");
        return this;
    }

    @Step
    public Downloads navigateToBrochureDownloadsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(downloadABrochure)).click();
        return  this;
    }

    @Step
    public Downloads navigateToTheParentPack(){
        wait.until(ExpectedConditions.elementToBeClickable(downloadParentPack)).click();
        return this;
    }

    @Step
    public Downloads navigateToGoogleScholar(){
        wait.until(ExpectedConditions.elementToBeClickable(viewPublications)).click();
        return  this;
    }
}
