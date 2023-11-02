package org.selenium.pom.pages.footer.links;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class Toggle extends BasePage {
    private final By people = By.xpath("(//span[@class='px-4 text-xs font-semibold text-white uppercase menu-link tracking-[0.19em]'])[1]");


    public Toggle(WebDriver driver) {
        super(driver);
    }

    @Step
    public Toggle load() {
        loadPage("/");
        return this;
    }

    @Step
    public Toggle navigateToPeople(){
        wait.until(ExpectedConditions.elementToBeClickable(people)).click();
        return  this;
    }
}
