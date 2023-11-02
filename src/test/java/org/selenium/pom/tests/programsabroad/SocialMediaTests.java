package org.selenium.pom.tests.programsabroad;

import io.qameta.allure.Description;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.base.PageNavigationHelper;
import org.selenium.pom.pages.footer.links.SocialMedia;
import org.selenium.pom.pages.footer.socials.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SocialMediaTests extends BaseTest {
    private SocialMedia socials;
    private final String facebookPageTitle = "GVI - Volunteer Abroad";
    private final String instagramPageTitle = "gvitravel";
    private final String youTubePageTitle = "GVI";
    private final String twitterPageTitle = "GVI";
    private final String tikTokPageTitle = "gvitravel";
    private final String linkedInPageTitle = "GVI";

    @BeforeMethod
    public void setUp() {
        new PageNavigationHelper(getDriver());
        socials = new SocialMedia(getDriver());
    }

    @Description("Navigating to GVI's Facebook page and verifying the title")
    @Test(description = "Navigate to GVI's Facebook page and verify the title")
    public void testNavigateToGVIsFacebookPage() {
        socials.navigateToFacebookPage();
        switchToNewTab();
        FacebookPage facebook = new FacebookPage(getDriver());
        Assert.assertEquals(facebook.getPageTitle(), facebookPageTitle);
        closeTabAndSwitchBackToOriginal();
    }

    @Description("Navigating to GVI's Instagram page and verifying the title")
//    @Test(description = "Navigate to GVI's Instagram page and verify the title")
    @Test(enabled = false)
    public void testNavigateToGVIsInstagramPage() {
        socials.navigateToInstagramPage();
        switchToNewTab();
        InstagramPage instagram = new InstagramPage(getDriver());
        Assert.assertEquals(instagram.getPageTitle(), instagramPageTitle);
        closeTabAndSwitchBackToOriginal();
    }

    @Description("Navigating to GVI's Youtube page and verifying the title")
    @Test(description = "Navigate to GVI's Youtube page and verify the title")
    public void testNavigateToGVIsYouTubePage() {
        socials.navigateToYouTubePage();
        switchToNewTab();
        YouTubePage youTube = new YouTubePage(getDriver());
        Assert.assertEquals(youTube.getPageTitle(), youTubePageTitle);
        closeTabAndSwitchBackToOriginal();
    }

    @Description("Navigating to GVI's Twitter page and verifying the title")
//    @Test(description = "Navigate to GVI's Twitter page and verify the title")
    @Test(enabled = false)
    public void testNavigateToGVIsTwitterPage() {
        socials.navigateToTwitterPage();
        switchToNewTab();
        TwitterPage twitter = new TwitterPage(getDriver());
        Assert.assertEquals(twitter.getPageTitle(), twitterPageTitle);
        closeTabAndSwitchBackToOriginal();
    }

    @Description("Navigating to GVI's TikTok page and verifying the title")
    @Test(description = "Navigate to GVI's TikTok page and verify the title")
    public void testNavigateToGVIsTikTokPage() {
        socials.navigateToTikTokPage();
        switchToNewTab();
        TikTokPage tikTok = new TikTokPage(getDriver());
        Assert.assertEquals(tikTok.getPageTitle(), tikTokPageTitle);
        closeTabAndSwitchBackToOriginal();
    }

    @Description("Navigating to GVI's LinkedIn page and verifying the title")
//    @Test(description = "Navigate to GVI's LinkedIn page and verify the title")
    @Test(enabled = false)
    public void testNavigateToLinkedInPage() {
        socials.navigateToLinkedInPage();
        switchToNewTab();
        LinkedInPage linkedIn = new LinkedInPage(getDriver());
        Assert.assertEquals(linkedIn.getPageTitle(), linkedInPageTitle);
        closeTabAndSwitchBackToOriginal();
    }
}
