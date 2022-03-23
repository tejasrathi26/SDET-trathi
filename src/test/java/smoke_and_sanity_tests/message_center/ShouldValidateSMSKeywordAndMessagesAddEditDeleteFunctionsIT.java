package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.CommunicationNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.general.TextMessagingSubTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general.PropertySetup;

import static junit.framework.Assert.assertTrue;

public class ShouldValidateSMSKeywordAndMessagesAddEditDeleteFunctionsIT extends BaseBrowserTest {
//Constructor
    public ShouldValidateSMSKeywordAndMessagesAddEditDeleteFunctionsIT() { super("dittmarcompany"); }

    @Test
    public void shouldValidateSMSKeywordsAndMessages_whenUsingAddEditAndDeleteFunctions() {
        //Validate SMS Keywords - MC Test 2223791
        //To validate Property SMS Messages - MC Test 2223792

        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
        assertTrue("Couldn't navigate to the \"Setup\" -> \"Company\" section of the Navigation Bar!", useEntrataNavBar.clickSetupButton());
        PropertySetup usePropertySettings = new PropertySetup(driver);
        assertTrue("Unable to navigate to the property settings page!", usePropertySettings.navigateToPropertySettings());
        assertTrue("Unable to select the \"Cavalier Court\" Property!", usePropertySettings.selectCavalierCourtProperty());
        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);
        assertTrue("Unable to navigate to the Property Communication Settings!", firstLevelNavigation.clickCommunicationTab());

        TextMessagingSubTab useTextMessagingPropertySubTab = new TextMessagingSubTab(driver);
        assertTrue("Unable to navigate to the \"Text Messaging\" sub-tab in Property Settings!", useTextMessagingPropertySubTab.clickTextMessagingSubTab());
        assertTrue("Unable to locate the \"Text Keywords\" Header in Property Settings>Communication>Text Messaging!", useTextMessagingPropertySubTab.findTextKeywordsHeader());

        assertTrue("Unable to use the \"Edit Keywords\" button in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useEditKeywordsPropertySettingsButton());
        assertTrue("Unable to use the \"Add a New Keyword\" button in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useAddAKeywordPropertySettingsButton());
        assertTrue("Unable to send the Keyword data to the \"Add a New Keyword\" Keyword text box in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.addOrEditKeywordTextFieldBoxAndSendKeys());
        assertTrue("Unable to send the text data to the \"Add a New Keyword\" -> \"Matched Response\" text box in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.clickAndSendKeysToMatchedResponseMessageTextBox());
        assertTrue("Unable to send the text data to the \"Add a New Keyword\" -> \"Unmatched Response\" text box in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.clickAndSendKeysToUnmatchedResponseMessageTextBox());
        assertTrue("Unable to click the save button in the \"Add a New Keyword\" -> pop-up in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.clickSaveButtonFromAddOrEditAKeywordScreen());
        assertTrue("Unable to use the \"Edit Keywords\" button in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useEditKeywordsPropertySettingsButtonWithWaitForOverlayMethod());
        assertTrue("Unable to use the Edit for the existing keyword under \"Edit Keywords\" in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useEditExistingKeyword());
        assertTrue("Unable to send the Keyword data to the \"Add a New Keyword\" in an EXISTING Keyword's text box in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.addOrEditKeywordTextFieldBoxAndSendKeysFollowUp());
        assertTrue("Unable to re-click the save button in the \"Add a New Keyword\" -> pop-up for an existing Keyword in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.clickSaveButtonFromAddOrEditAKeywordScreen());
        assertTrue("Unable to re-use the \"Edit Keywords\" button in Property Settings>Communication>Text Messaging after a Keyword has been created!"
                , useTextMessagingPropertySubTab.useEditKeywordsPropertySettingsButtonWithWaitForOverlayMethod());
        assertTrue("Unable to delete an existing Keyword in the \"Add a New Keyword\" -> section in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useDeleteExistingKeyword());
        assertTrue("Unable to re-save (use Save button) on an existing Keyword in the \"Add a New Keyword\" -> section in Property Settings>Communication>Text Messaging!"
                , useTextMessagingPropertySubTab.useSaveButtonTextKeywordsPropertySettings());

    }
}
