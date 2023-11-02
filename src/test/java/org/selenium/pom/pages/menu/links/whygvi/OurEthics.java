package org.selenium.pom.pages.menu.links.whygvi;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class OurEthics extends BasePage {
    private final By badgeOfEthics = By.xpath("//a[contains(text(),'GVI’s badge of ethics')]");
    private final By tenEthicalCommitments = By.xpath("//a[normalize-space()='Our ten ethical commitments']");
    private final By humanEmpowermentPrinciples = By.xpath("//a[normalize-space()='Five empowerment principles']");
    private final By ourActionsAgainstOppression = By.xpath("//a[normalize-space()='Our actions against oppression']");
    private final By childProtection = By.xpath("//a[normalize-space()='Child protection']");
    private final By ethicsAToZ = By.xpath("//a[contains(text(),'Ethics A – Z')]");
    public OurEthics(WebDriver driver) {
        super(driver);
    }

    @Step
    public OurEthics load() {
        loadPage("/");
        return this;
    }

    @Step
    public OurEthics navigateToBadgeOfEthicsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(badgeOfEthics)).click();
        return  this;
    }

    @Step
    public OurEthics navigateToTenEthicalCommitmentsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(tenEthicalCommitments)).click();
        return this;
    }

    @Step
    public OurEthics navigateToHumanEmpowermentPrinciplesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(humanEmpowermentPrinciples)).click();
        return  this;
    }

    @Step
    public OurEthics navigateToOurActionsAgainstOppressionPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ourActionsAgainstOppression)).click();
        return  this;
    }

    @Step
    public OurEthics navigateToChildProtectionPage(){
        wait.until(ExpectedConditions.elementToBeClickable(childProtection)).click();
        return  this;
    }

    @Step
    public OurEthics navigateToEthicsAToZPage(){
        wait.until(ExpectedConditions.elementToBeClickable(ethicsAToZ)).click();
        return  this;
    }
}
