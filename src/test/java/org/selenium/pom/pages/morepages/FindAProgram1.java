package org.selenium.pom.pages.morepages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FindAProgram1 extends BasePage {
    private final By volElephantsThaiVisitBtn = By.xpath("(//p[@class='text-base leading-genericCta font-bold pr-2'][normalize-space()='Visit the program'])[2]");
    private final By findAProgramTitle = By.xpath("(//h4[normalize-space()='Find a program'])[1]");

    public FindAProgram1(WebDriver driver) {
        super(driver);
    }

    @Step
    public FindAProgram1 load() {
        loadPage("/find-a-program");
        return this;
    }

    @Step
    public FindAProgram1 navigateToVolWithElephantsThaiPage() {
        wait.until(ExpectedConditions.elementToBeClickable(volElephantsThaiVisitBtn)).click();
        return this;
    }

    @Step
    public String getPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(findAProgramTitle)).getText();
    }
}
