package smoke_and_sanity_tests.doc_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.CommunicationNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.documents_tab.DocumentsNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.communication_tab.documents_tab.packets_tab.PacketsPage;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertTrue;

public class ShouldCreateNewPacketWhenUsingAddPacketIT extends BaseBrowserTest {

    public ShouldCreateNewPacketWhenUsingAddPacketIT() { super("derapid");}

    @Test
    public void ShouldCreateNewPacketWhenUsingAddPacketIT() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        FirstLevelNavigation companySettings = new FirstLevelNavigation(driver);
        CommunicationNav communicationNavigation = new CommunicationNav(driver);
        DocumentsNav documentNavigation = new DocumentsNav(driver);
        PacketsPage addPacket = new PacketsPage(driver);

        assertTrue("Unable to click Setup button",entrataNavigation.clickSetupButton());
        assertTrue("Unable to click Company button", entrataNavigation.clickCompanyButton());
        assertTrue("Unable to click Communication button", companySettings.clickCommunicationTab());
        assertTrue("Unable to click Documents button", communicationNavigation.clickDocumentsButton());
        assertTrue("Unable to click Packets button", documentNavigation.clickPacketsButton());
        assertTrue("Unable to click Add Packet button", addPacket.clickAddPacketButton());
        assertTrue("Unable to add Packet name", addPacket.addPacketName());
        assertTrue("Unable to click Packet Type dropdown", addPacket.clickPacketTypeDropdown());
        assertTrue("Unable to click Lease option in the Packet Type dropdown", addPacket.clickLeaseInPacketDropdown());
        assertTrue("Unable to click Transfer checkbox", addPacket.clickTransferCheckbox());
        assertTrue("Unable to click New Lease checkbox", addPacket.clickNewLeaseCheckbox());
        assertTrue("Unable to click Renewal checkbox", addPacket.clickRenewalCheckbox());
        assertTrue("Unable to find Active slider", addPacket.findActiveSliderYes());
        assertTrue("Unable to click Always Active", addPacket.clickAlwaysActive());
        assertTrue("Unable to click Add Properties", addPacket.clickAddProperties());
        assertTrue("Unable to click All Properties", addPacket.clickAddAllProperties());
        assertTrue("Unable to click Packet Save button", addPacket.clickPacketSaveButton());
        assertTrue("Unable to find Packet Save message", addPacket.findPacketSavedMessage());
    }
}
