package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.constants.DriverType;
import org.selenium.pom.factory.DriverManager;
import org.selenium.pom.factory.DriverManagerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BaseTest {
    private final ThreadLocal<DriverManager> driverManager = new ThreadLocal<>();
    private final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private void setDriverManager(DriverManager driverManager) {
        this.driverManager.set(driverManager);
    }

    protected DriverManager getDriverManager() {
        return this.driverManager.get();
    }

    private void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    protected WebDriver getDriver() {
        return this.driver.get();
    }

    @Parameters("browser")
    @BeforeMethod
    public synchronized void startDriver(@Optional String browser) throws IOException {
//        browser = System.getProperty("browser", browser);
        if (browser == null) browser = "CHROME";
//        setDriver(new DriverManagerOriginal().initializeDriver(browser));
//        setDriver(DriverManagerFactory.getManager(DriverType.valueOf(browser)).createDriver());
        setDriverManager(DriverManagerFactory.
                getManager(DriverType.valueOf(browser)));
        setDriver(getDriverManager().getDriver());
        System.out.println("CURRENT THREAD: " + Thread.currentThread().getId() + ", " +
                "DRIVER = " + getDriver());
    }

    @Parameters("browser")
    @AfterMethod
    public synchronized void quitDriver(@Optional String browser, ITestResult result) throws InterruptedException, IOException {
        Thread.sleep(300);
        System.out.println("CURRENT THREAD: " + Thread.currentThread().getId() + ", " +
                "DRIVER = " + getDriver());
//        getDriver().quit();
        if (result.getStatus() == ITestResult.FAILURE) {
            File destFile = new File("scr" + File.separator + browser + File.separator +
                    result.getTestClass().getRealClass().getSimpleName() + "_" +
                    result.getMethod().getMethodName() + ".png");
            ScreenshotHelper.takeScreenshot(getDriver(), destFile);
//            ScreenshotHelper.takeScreenshotUsingAShot(destFile);
        }
        getDriverManager().getDriver().quit();
    }


//    protected void loadSite() {
//        new ChooseSite(getDriver()).load();
//    }
//
//    protected void selectPlanet() {
//        new ChooseSite(getDriver()).selectPlanet();
//    }
//
//    protected void navigateToProgramsAbroadMenu() {
//        new MainMenu(getDriver()).navigateToProgramsAbroadSubMenu();
//    }
//
//    protected void navigateToVirtualAndOnlineMenu() {
//        new MainMenu(getDriver()).navigateToOverVirtualAndOnlineSubMenu();
//    }
//
//    protected void navigateToLocationsMenu() {
//        new MainMenu(getDriver()).navigateToLocationsSubMenu();
//    }
//
//    protected void navigateToWhyGVIMenu() {
//        new MainMenu(getDriver()).navigateToWhyGVISubMenu();
//    }


    public void switchToNewTab() {
        // Get the handle of the current tab
        String parentHandle = getDriver().getWindowHandle();

        // Get all window handles
        Set<String> handles = getDriver().getWindowHandles();

        // Switch to the newly opened tab
        for (String handle : handles) {
            if (!handle.equals(parentHandle)) {
                getDriver().switchTo().window(handle);
                break;
            }
        }
    }

    public void closeTabAndSwitchBackToOriginal() {
        getDriver().close();
        getDriver().switchTo().window(getDriver().getWindowHandles().iterator().next());
    }
}
