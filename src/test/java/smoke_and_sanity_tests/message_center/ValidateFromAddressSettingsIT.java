package smoke_and_sanity_tests.message_center;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab.from_addresses.FromAddresses;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general.PropertySetup;

import static junit.framework.Assert.assertTrue;

public class ValidateFromAddressSettingsIT extends BaseBrowserTest {
//Constructor
    public ValidateFromAddressSettingsIT(){ super("dittmarcompany"); }

    @Test
    public void Should_Validate_The_From_Addresses_Tab_Under_Property_Communication_IT() {
// Validate the From Address Tab under communication tab - 2231513 / 2228142 Sanity test
        EntrataNavBar useEntrataNavBar = new EntrataNavBar(driver);
assertTrue("Unable to navigate to the Company Level Settings!", useEntrataNavBar.clickSetupButton());
        PropertySetup navigating_To_Property_Settings = new PropertySetup(driver);
assertTrue("Unable to navigate to the \"Properties\" settings page under Setup!", navigating_To_Property_Settings.navigateToPropertySettings());
        PropertySetup use_Property_Settings = new PropertySetup(driver);
assertTrue("Unable to select the \"Cavalier Court\" Property!", use_Property_Settings.selectCavalierCourtProperty());
        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);

assertTrue("Unable to navigate to the Property -> \"Communication\" Settings!", firstLevelNavigation.clickCommunicationTab());
        FromAddresses fromAddressesSubTab = new FromAddresses(driver);
assertTrue("Unable to navigate to the Property \"From Addresses\" Settings!", fromAddressesSubTab.selectFromAddressesSubTab());

assertTrue("Unable to locate the Property \"From Addresses\" \"Leasing\" Header!", fromAddressesSubTab.locate_Leasing_From_Email_Addresses_Section_Header());
assertTrue("Unable to locate the Property \"From Addresses\" \"Residents\" Header!", fromAddressesSubTab.locate_Residents_From_Email_Addresses_Section_Header());
assertTrue("Unable to locate the Property \"From Addresses\" \"Other\" Header!", fromAddressesSubTab.locate_Other_From_Email_Addresses_Section_Header());
assertTrue("Unable to locate the Property \"From Addresses\" \"EmailRelay\" Header!", fromAddressesSubTab.locate_EmailRelay_From_Email_Addresses_Section_Header());

assertTrue("Unable to open the edit via \"Edit Addresses\" for the \"From Addresses\" page!", fromAddressesSubTab.editFromAddressAddresses());

assertTrue("Unable to locate and click the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.click_MCEmailsBeingSentFrom());
assertTrue("Unable to locate the option for \"EmailRelay\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locate_MCEmailsBeingSentFrom_SelectEmailRelayOption());
assertTrue("Unable to locate the option for \"Message Center Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locate_MCEmailsBeingSentFrom_SelectMessageCenter_From_Address_Option());
assertTrue("Unable to select the option for \"EmailRelay\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.mcEmailsBeingSentFrom_SelectEmailRelayOption());
assertTrue("Unable to verify the selected option of \"EmailRelay\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locate_MCEmailsBeingSentFrom_SelectEmailRelayOption());
assertTrue("Unable to re-locate and re-click the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.click_MCEmailsBeingSentFrom());
assertTrue("Unable to select the option for \"Message Center Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.mcEmailsBeingSentFrom_SelectMessageCenter_From_Address_Option());
assertTrue("Unable to verify the selected option of \"Message Center Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locate_MCEmailsBeingSentFrom_SelectEmailRelayOption());

assertTrue("Unable to locate and click the \"Contact Points emails as being sent from\" setting!", fromAddressesSubTab.click_CPEmailsBeingSentFrom());
assertTrue("Unable to locate the option for \"Contact Points Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locate_CPEmailsBeingSentFrom_From_Address_Option());
assertTrue("Unable to locate the option for \"EmailRelay\" under the \"Contact Points Emails being sent from\" setting!", fromAddressesSubTab.locate_CPEmailsBeingSentFrom_Email_Relay_Option());
assertTrue("Unable to select the option for \"EmailRelay\" under the \"Contact Points Emails being sent from\" setting!", fromAddressesSubTab.cpEmailsBeingSentFrom_Email_Relay_Option());
assertTrue("Unable to verify the selected option of \"EmailRelay\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locate_CPEmailsBeingSentFrom_Email_Relay_Option());

assertTrue("Unable to re-locate and re-click the \"Contact Points emails as being sent from\" setting!", fromAddressesSubTab.click_CPEmailsBeingSentFrom());
assertTrue("Unable to select the option for \"Contact Points Email \"From\" Address\" under the \"Contact Points Emails being sent from\" setting!", fromAddressesSubTab.cpEmailsBeingSentFrom_From_Address_Option());
assertTrue("Unable to verify the selected option of \"Contact Points Email \"From\" Address\" under the \"Message Center Emails being sent from\" setting!", fromAddressesSubTab.locate_MCEmailsBeingSentFrom_SelectEmailRelayOption());

assertTrue("Unable to locate and click the \"Default EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.clickDefaultEmailRelayReplyForwardingAddress());
assertTrue("Unable to locate the option for \"Email Creator (Default)\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateEmailRelayReplyForwardingAddress_Email_Creator_Default());
assertTrue("Unable to locate the option for \"Property Email\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateEmailRelayReplyForwardingAddress_Property_Email());
assertTrue("Unable to locate the option for \"Entrata User Email\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateEmailRelayReplyForwardingAddress_Entrata_User_Email());
assertTrue("Unable to locate the option for \"Custom\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locateEmailRelayReplyForwardingAddress_Custom());

assertTrue("Unable to select the option for \"Email Creator (Default)\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.defaultEmailRelayReplyForwardingAddress_Select_Email_Creator_Default());
assertTrue("Unable to verify the selected option of \"Email Creator (Default)\" under the \"EmailRelay Reply Forwarding Address\" setting!", fromAddressesSubTab.locate_MCEmailsBeingSentFrom_SelectEmailRelayOption());

assertTrue("Unable to select into and verify the text field for \"Message Center:\" under the \"Other\" section of From Addresses!", fromAddressesSubTab.click_Message_Center_Email_Field());
assertTrue("Unable to select into and verify the text field for \"Property Staff:\" under the \"Other\" section of From Addresses!", fromAddressesSubTab.click_Property_Staff_Email_Field());
assertTrue("Unable to select into and verify the text field for \"Contact Points:\" under the \"Other\" section of From Addresses!", fromAddressesSubTab.click_Contact_Points_Email_Field());
    }
}
