package smoke_and_sanity_tests.marketing_hub_tests.google_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.GoogleMyBusinessSubtab;

import static org.junit.Assert.assertTrue;

public class GoogleMyBusinessGeneralInterfaceVerificationIT extends BaseBrowserTest {

    //Constructor
    public GoogleMyBusinessGeneralInterfaceVerificationIT() {
        super("demoold");
    }

    //Manual Test ID 3008116

    @Test
    public void shouldDisplayGoogleMyBusinessTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        GoogleMyBusinessSubtab googleMB = new GoogleMyBusinessSubtab(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Google' tab in Marketing Strategy Hub.",
                mshTab.clickGoogleTab());
        assertTrue("Failed to Navigate to 'My Business' sub-tab in Google tab.",
                googleMB.selectGoogleMyBusinessSubTab_GoogleMB());
        //Verification of Google My Business tab elements and Filters
        assertTrue("Failed to locate 'Google My Business' logo in Google My Business tab.",
                googleMB.findMyBusinessPageLogo_GoogleMB());
        assertTrue("Failed to locate 'Property Search' filter in Google My Business tab.",
                googleMB.findPropertySearchFilter_GoogleMB());
        assertTrue("Failed to locate 'Free Service' title in Google My Business tab.",
                googleMB.findFreeServiceTitle_GoogleMB());
        assertTrue("Failed to locate 'Active' filter button in Google My Business tab.",
                googleMB.findActiveFilter_GoogleMB());
        assertTrue("Failed to locate 'Unsubscribed' filter button in Google My Business tab.",
                googleMB.findUnsubscribedFilter_GoogleMB());
        assertTrue("Failed to locate 'Feed Interrupted' filter button in Google My Business tab.",
                googleMB.findFeedInterruptedFilter_GoogleMB());
        //Verification of Google My Business Table Column headers
        assertTrue("Failed to find 'Property' column header in Google My Business tab.",
                googleMB.findPropertyColumnHeader_GoogleMB());
        assertTrue("Failed to find 'Total Units' column header in Google My Business tab.",
                googleMB.findTotalUnitsColumnHeader_GoogleMB());
        assertTrue("Failed to find 'Location' column header in Google My Business tab.",
                googleMB.findLocationColumnHeader_GoogleMB());
        assertTrue("Failed to find 'Status' column header in Google My Business tab.",
                googleMB.findStatusColumnHeader_GoogleMB());
        assertTrue("Failed to find 'Transmission' column header in Google My Business tab.",
                googleMB.findTransmissionLogColumnHeader_GoogleMB());
        assertTrue("Failed to find 'Subscription' column header in Google My Business tab.",
                googleMB.findSubscriptionLogColumnHeader_GoogleMB());
        assertTrue("Failed to find 'Update Images' column header in Google My Business tab.",
                googleMB.findUpdateImagesColumnHeader_GoogleMB());
    }

}
