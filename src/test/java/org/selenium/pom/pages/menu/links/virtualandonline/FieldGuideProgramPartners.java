package org.selenium.pom.pages.menu.links.virtualandonline;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class FieldGuideProgramPartners extends BasePage {

    private final By  fGASAFieldGuiding = By.xpath("//a[normalize-space()='Bushwise: FGASA field guiding']");
    private final By africanNatureAndWildlife = By.xpath("//a[normalize-space()='Bushwise: African nature and wildlife']");

    public FieldGuideProgramPartners(WebDriver driver) {
        super(driver);
    }

    @Step
    public FieldGuideProgramPartners load() {
        loadPage("/");
        return this;
    }

    @Step
    public FieldGuideProgramPartners navigateToFGASAFieldGuidingOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(fGASAFieldGuiding)).click();
        return  this;
    }

    @Step
    public FieldGuideProgramPartners navigateToAfricanNatureAndWildlifeOnlineCourse(){
        wait.until(ExpectedConditions.elementToBeClickable(africanNatureAndWildlife)).click();
        return this;
    }
}
