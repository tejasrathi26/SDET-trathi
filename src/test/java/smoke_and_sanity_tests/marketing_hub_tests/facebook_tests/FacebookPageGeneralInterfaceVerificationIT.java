package smoke_and_sanity_tests.marketing_hub_tests.facebook_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab.FBPage_SubscriptionLogModal;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab.FBPage_TransmissionLogCurtain;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab.FacebookPage_Page;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;

import static org.junit.Assert.assertTrue;

public class FacebookPageGeneralInterfaceVerificationIT extends BaseBrowserTest {

    //Constructor
    public FacebookPageGeneralInterfaceVerificationIT() {
        super("demoold");
    }

    //Manual Test ID 3175956

    @Test
    public void shouldDisplayFacebookPageTabUI_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        FacebookPage_Page fbPage = new FacebookPage_Page(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Facebook' tab in Marketing Strategy Hub.",
                mshTab.clickFacebookTab());
        assertTrue("Failed to Navigate to 'Facebook Page' sub-tab in Facebook tab.",
                fbPage.selectFBPageSubTab_FBPage());
        //Verification of Facebook Page elements and Filters
        assertTrue("Failed to locate 'Facebook Page' logo in Facebook Page tab.",
                fbPage.findFacebookPageLogo_FBPage());
        assertTrue("Failed to locate 'Property Search' in Facebook Page tab.",
                fbPage.findPropertySearchFilter_FBPage());
        assertTrue("Failed to locate 'Active' filter in Facebook Page tab.",
                fbPage.findActiveFilter_FBPage());
        assertTrue("Failed to locate 'Unsubscribed' filter in Facebook Page tab.",
                fbPage.findUnsubscribedFilter_FBPage());
        assertTrue("Failed to locate 'Feed Interrupted' filter in Facebook Page tab.",
                fbPage.findFeedInterruptedFilter_FBPage());
        //Verification of Facebook Page Table Column headers
        assertTrue("Failed to find 'Property' column header in Facebook Page tab.",
                fbPage.findPropertyColumnHeader_FBPage());
        assertTrue("Failed to find 'Total Units' column header in Facebook Page tab.",
                fbPage.findTotalUnitsColumnHeader_FBPage());
        assertTrue("Failed to find 'Location' column header in Facebook Page tab.",
                fbPage.findLocationColumnHeader_FBPage());
        assertTrue("Failed to find 'Status' column header in Facebook Page tab.",
                fbPage.findStatusColumnHeader_FBPage());
        assertTrue("Failed to find 'Transmission' column header in Facebook Page tab.",
                fbPage.findTransmissionLogColumnHeader_FBPage());
        assertTrue("Failed to find 'Subscription' column header in Facebook Page tab.",
                fbPage.findSubscriptionLogColumnHeader_FBPage());
    }

    @Test
    public void shouldConfirmFacebookPageTransmissionLogOpens_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        FacebookPage_Page fbPage = new FacebookPage_Page(driver);
        FBPage_TransmissionLogCurtain transLog = new FBPage_TransmissionLogCurtain(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Facebook' tab in Marketing Strategy Hub.",
                mshTab.clickFacebookTab());
        assertTrue("Failed to Navigate to 'Facebook Page' sub-tab in Facebook tab.",
                fbPage.selectFBPageSubTab_FBPage());
        //Verification of Facebook Page Transmission Log
        assertTrue("Failed to locate and click 'View' button for Transmission log in Facebook Page tab.",
                fbPage.clickTransmissionViewButton_FBPage());
        assertTrue("Failed to confirm 'Transmission Log' opened in Facebook Page tab.",
                transLog.confirmTransmissionLogOpened_FBPage());
        assertTrue("Failed to locate 'Property Node' in Transmission log in Facebook Page tab.",
                transLog.confirmPropertyNodeVisible_TransmissionLog_FBPage());
        assertTrue("Failed to locate 'Location Node' in Transmission log in Facebook Page tab.",
                transLog.confirmLocationNodeVisible_TransmissionLog_FBPage());
        assertTrue("Failed to locate 'Details Node' in Transmission log in Facebook Page tab.",
                transLog.confirmDetailsNodeVisible_TransmissionLog_FBPage());
        assertTrue("Failed to locate 'Hours Node' in Transmission log in Facebook Page tab.",
                transLog.confirmHoursNodeVisible_TransmissionLog_FBPage());
        assertTrue("Failed to locate Property name in Transmission log in Facebook Page tab.",
                transLog.confirmPropertyNameVisibleInPropertyNode_TransmissionLog_FBPage());
        assertTrue("Failed to locate 'Show Current Data' toggle in Facebook Page tab.",
                transLog.confirmShowCurrentDataToggleVisible_TransmissionLog_FBPage());
    }

    @Test
    public void shouldConfirmFacebookPageSubscriptionLogOpens_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        FacebookPage_Page fbPage = new FacebookPage_Page(driver);
        FBPage_SubscriptionLogModal subsLog = new FBPage_SubscriptionLogModal(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Facebook' tab in Marketing Strategy Hub.",
                mshTab.clickFacebookTab());
        assertTrue("Failed to Navigate to 'Facebook Page' sub-tab in Facebook tab.",
                fbPage.selectFBPageSubTab_FBPage());
        //Verification of Facebook Page Subscription Log
        assertTrue("Failed to locate and click 'View' button for Subscription log in Facebook Page tab.",
                fbPage.clickSubscriptionViewButton_FBPage());
        assertTrue("Failed to confirm 'Subscription Log' opened in Facebook Page tab.",
                subsLog.confirmSubscriptionLogOpened_FBPage());
        assertTrue("Failed to locate 'Date' section in Subscription log in Facebook Page tab.",
                subsLog.confirmDateVisible_SubscriptionLog_FBPage());
        assertTrue("Failed to locate 'Action' section in Subscription log in Facebook Page tab.",
                subsLog.confirmActionVisible_SubscriptionLog_FBPage());
        assertTrue("Failed to locate 'Name' section in Subscription log in Facebook Page tab.",
                subsLog.confirmUserNameVisible_SubscriptionLog_FBPage());
    }

}
