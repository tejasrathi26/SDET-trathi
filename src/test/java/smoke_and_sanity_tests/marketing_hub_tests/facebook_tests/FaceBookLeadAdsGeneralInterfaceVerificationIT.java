package smoke_and_sanity_tests.marketing_hub_tests.facebook_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_lead_ads_subtab.FaceBook_LeadAdsPage;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FaceBookLeadAdsGeneralInterfaceVerificationIT extends BaseBrowserTest {

    //Constructor
    public FaceBookLeadAdsGeneralInterfaceVerificationIT() {
        super("demoold");
    }

    //Manual Test ID 2807219

    @Test
    public void shouldDisplayFaceBookLeadAdsUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        FaceBook_LeadAdsPage fbLeadAds = new FaceBook_LeadAdsPage(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Facebook' tab in Marketing Strategy Hub.",
                mshTab.clickFacebookTab());
        assertTrue("Failed to Navigate to 'Lead Ads' sub-tab in Facebook tab.",
                fbLeadAds.selectLeadAdsSubTab_FBLeadAds());
        //Verification of Facebook Lead Ads elements and Filters
        assertTrue("Failed to locate 'Lead Ads' logo in Facebook Lead Ads tab.",
                fbLeadAds.findLeadAdsLogo_FBLeadAds());
        assertTrue("Failed to locate 'Property Search' in Facebook Lead Ads tab.",
                fbLeadAds.findPropertySearchFilter_FBLeadAds());
        assertTrue("Failed to locate 'Active' filter in Facebook Lead Ads tab.",
                fbLeadAds.findActiveFilter_FBLeadAds());
        assertTrue("Failed to locate 'All' filter in Facebook Lead Ads tab.",
                fbLeadAds.findAllFilter_FBLeadAds());
        assertTrue("Failed to locate 'Disabled' filter in Facebook Lead Ads tab.",
                fbLeadAds.findDisabledFilter_FBLeadAds());
        assertEquals("Failed to confirm 'All' filter is selected by default in Facebook Lead Ads tab.",
                "All", fbLeadAds.getTextOfDefaultFilterSelected_FBLeadAds());
        //Verification of Facebook Lead Ads Table Column headers
        assertTrue("Failed to find 'Property' column header in Facebook Lead Ads tab.",
                fbLeadAds.findPropertyColumnHeader_FBLeadAds());
        assertTrue("Failed to find 'Location' column header in Facebook Lead Ads tab.",
                fbLeadAds.findLocationColumnHeader_FBLeadAds());
        assertTrue("Failed to find 'Status' column header in Facebook Lead Ads tab.",
                fbLeadAds.findStatusColumnHeader_FBLeadAds());
        assertTrue("Failed to find 'Activation Logs' column header in Facebook Lead Ads tab.",
                fbLeadAds.findActivationLogsColumnHeader_FBLeadAds());
    }


}
