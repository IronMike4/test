package org.selenium.pom.pages.footer.downloads;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class ParentInfoPack extends BasePage {
    private final By pageTitle = By.xpath("(//div[normalize-space()='GVI Planet and People'])[1]");
    public ParentInfoPack(WebDriver driver) {
        super(driver);
    }

    @Step
    public ParentInfoPack load() {
        loadPage("https://beta-planet.gvi.co.uk/wp-content/uploads/2023/04/522392359-2023-apr-11-14-40-53-000000-Parent-Pack_publish.pdf");
        return this;
    }

    @Step
    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle)).getText();
    }
}
