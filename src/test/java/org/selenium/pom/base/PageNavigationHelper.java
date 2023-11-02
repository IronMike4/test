package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;
import org.selenium.pom.pages.menu.links.mainmenu.MainMenu;
import org.selenium.pom.pages.morepages.ChooseSite;

public class PageNavigationHelper {
    private final WebDriver driver;

    public PageNavigationHelper(WebDriver driver) {
        this.driver = driver;
        initialSetUp();
    }

    public void loadSite() {
        new ChooseSite(driver).load();
    }

    public void selectPlanet() {
        new ChooseSite(driver).selectPlanet();
    }

    public void navigateToProgramsAbroadMenu() {
        new MainMenu(driver).navigateToProgramsAbroadSubMenu();
    }

    public void navigateToVirtualAndOnlineMenu() {
        new MainMenu(driver).navigateToOverVirtualAndOnlineSubMenu();
    }

    public void navigateToLocationsMenu() {
        new MainMenu(driver).navigateToLocationsSubMenu();
    }

    public void navigateToWhyGVIMenu() {
        new MainMenu(driver).navigateToWhyGVISubMenu();
    }

    public void initialSetUp() {
        loadSite();
        selectPlanet();
    }
}

