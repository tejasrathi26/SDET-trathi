package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.ChatAndEmailServices;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.CompanyCommunicationNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.CompanyQuickResponses;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.MessageCenterCompanySettings;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.PropertyQuickResponses;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.from_addresses.FromAddresses;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general.PropertySetup;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MessageCenterNav;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.MyLists;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_product_navigation.UploadedListEmails;
import page_objects.entrata_page_objects.tools_tab.message_center_subtab.message_center_lists.UploadedLists;

import static junit.framework.Assert.assertTrue;

public class ShouldVerifyAllTheTabsForMessageCenterIT extends BaseBrowserTest {

//Constructor//
    public ShouldVerifyAllTheTabsForMessageCenterIT() { super("dittmarcompany"); }

    @Test
    public void shouldVerifyAllTheTabsForTheMessageCenterAreas_whenNavigatingSmokeScenarios() {
        // Message Center Test Case - 2255510
        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the Tools tab in Dashboard -> Tools!", useEntrataNavBar.clickToolsTab());

        MessageCenterNav messageCenterSmokeNavigation = new MessageCenterNav(driver);
        assertTrue("Couldn't navigate to the \"Message Center\" area under Tools!", useEntrataNavBar.clickMessageCenterSubTab());
        assertTrue("Couldn't navigate to the Message Center->Email->\"Sent\" Tab  under Tools!", messageCenterSmokeNavigation.messageCenterEmailSentTab());
        assertTrue("Couldn't navigate to the Message Center->Email->\"Drafts\" Tab  under Tools!", messageCenterSmokeNavigation.messageCenterEmailDraftsTab());

        UploadedListEmails useUploadedListEmails = new UploadedListEmails(driver);
        assertTrue("Couldn't navigate to the Message Center->\"Uploaded List Emails\" Tab  under Tools!", useUploadedListEmails.messageCenterUploadedListEmailsTab());
        assertTrue("Couldn't navigate to the Message Center->\"Uploaded List Emails\" -> \"Sent\" Tab  under Tools!", useUploadedListEmails.messageCenterUploadedListEmailsSentTab());
        assertTrue("Couldn't navigate to the Message Center->\"Uploaded List Emails\" -> \"Drafts\" Tab  under Tools!", useUploadedListEmails.messageCenterUploadedListEmailsDraftsTab());

        MyLists useMyLists = new MyLists(driver);
        assertTrue("Couldn't navigate to the Message Center->\"My Lists\" Tab  under Tools!", useMyLists.navigateToMyLists());
        assertTrue("Couldn't navigate to the Message Center->\"My Lists\" -> \"Saved\" Tab  under Tools!", useMyLists.navigateToMessageCenterMyListsSavedTab());
        assertTrue("Couldn't navigate to the Message Center->\"My Lists\" -> \"Temporary\" Tab  under Tools!", useMyLists.navigateToMessageCenterMyListsTemporaryTab());

        UploadedLists useUploadedLists = new UploadedLists(driver);
        assertTrue("Couldn't navigate to the Message Center->\"Uploaded Lists\" Tab  under Tools!", useUploadedLists.clickUploadedLists());
        assertTrue("Couldn't navigate to the Message Center->\"Uploaded Lists\" -> \"Used List\" Tab  under Tools!", useUploadedLists.clickUploadedListsUsedListTab());
        assertTrue("Couldn't navigate to the Message Center->\"Uploaded Lists\" -> \"Saved\" Tab  under Tools!", useUploadedLists.clickUploadedListsSavedTab());

        assertTrue("Couldn't navigate to the \"Setup\" -> \"Company\" section of the Navigation Bar!", useEntrataNavBar.clickSetupButton());
        CompanyCommunicationNav useCommunicationNav = new CompanyCommunicationNav(driver);
        assertTrue("Couldn't navigate to \"Setup\" -> \"Company\" -> \"Communication\" section of the Company Navigation Bar!", useCommunicationNav.clickCommunicationsSubTab());
        CompanyQuickResponses useCompanyQuickResponses = new CompanyQuickResponses(driver);
        assertTrue("Couldn't navigate to \"Setup\" -> \"Company\" -> \"Communication\" -> \"Quick Responses\" section!", useCompanyQuickResponses.clickQuickResponsesSubTab());
        assertTrue("Couldn't locate the \"Create Quick Response\" button under the Setup->Company->Communication->Quick Responses page!", useCompanyQuickResponses.locateCreateQuickResponses());

        MessageCenterCompanySettings useMessageCenterCompanySettings = new MessageCenterCompanySettings(driver);
        assertTrue("Couldn't navigate to \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.clickMessageCenterCompanySettings());

        assertTrue("Couldn't locate the \"Ambiance\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateAmbianceMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Announcement\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateAnnouncementMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Basic\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateBasicMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Bulletin\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateBulletinMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Custom\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateCustomMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Details\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateDetailsMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Focus\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateFocusMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Highlights\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateHighlightsMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Informational\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locateInformationalMessageCenterLayoutCompanySettings());
        assertTrue("Couldn't locate the \"Poster\" layout under the \"Setup\" -> \"Company\" -> \"Communication\" -> \"Message Center\" section!"
                , useMessageCenterCompanySettings.locatePosterMessageCenterLayoutCompanySettings());

        ChatAndEmailServices useChatAndEmailServices = new ChatAndEmailServices(driver);
        assertTrue("Couldn't navigate to Setup -> Company -> Communication -> Chat & Email Services section!"
                , useChatAndEmailServices.clickChatAndEmailServicesTab());

        PropertySetup usePropertySettings = new PropertySetup(driver);
        assertTrue("Unable to navigate to the property settings page!", usePropertySettings.navigateToPropertySettings());
        assertTrue("Unable to select the \"Cavalier Court\" Property!", usePropertySettings.selectCavalierCourtProperty());
        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);
        assertTrue("Unable to navigate to the Property Communication Settings!", firstLevelNavigation.clickCommunicationTab());

        PropertyQuickResponses usePropertyQuickResponses = new PropertyQuickResponses(driver);
        assertTrue("Unable to navigate to the Property -> Communication -> \"Quick Responses\" Settings!"
                , usePropertyQuickResponses.clickQuickResponsesTab());

        assertTrue("Unable to locate the \"Quick Responses\" subtab page header in Property -> Communication -> \"Quick Responses!\""
                , usePropertyQuickResponses.locateQuickResponsesTabHeader());

        FromAddresses useFromAddresses = new FromAddresses(driver);
        assertTrue("Unable to navigate to the \"From Addresses\" subtab page!", useFromAddresses.selectFromAddressesSubTab());
        assertTrue("Unable to locate the \"From Addresses\" page header!", useFromAddresses.locate_From_Email_Addresses_Page_Header());

    }
}
