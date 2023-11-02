package org.selenium.pom.pages.footer.participants;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class StudentsVolunteeringPage extends BasePage {
    private final By pageTitle = By.xpath("(//h1[normalize-space()='Student volunteering abroad'])[1]");
    public StudentsVolunteeringPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public StudentsVolunteeringPage load() {
        loadPage("/student-volunteering");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
