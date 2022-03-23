package regression_tests.reports_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.packets_subtab.PacketsPage;

import static org.junit.Assert.assertTrue;

public class ShouldCreateReportPacketWhenAddPacketStepsAreTakenIT extends BaseBrowserTest {
    public ShouldCreateReportPacketWhenAddPacketStepsAreTakenIT() { super("avantic");}

    @Test
    public void shouldCreateReportPacketWhenInfoIsAddedAfterAddPacketsButtonIsClicked() {
        EntrataNavBar reportsTabs = new EntrataNavBar(driver);
        assertTrue("Cant Find Reporting Tab", reportsTabs.moveToReportsTab());
        assertTrue("Could not click on Packets subtab.", reportsTabs.packetsSelect());
        PacketsPage reportPackets = new PacketsPage(driver);
        assertTrue("Could not click on add packet button", reportPackets.clickAddPacketsButton());
        assertTrue("Permissions filter is not clickable.", reportPackets.clickPermissionsRadioButton());
        assertTrue("Could not add report packet name.", reportPackets.sendKeysForPacketName());
        assertTrue("Could not add in a number for Every _ days field.", reportPackets.sendKeysForEveryBlankDaysField());
        assertTrue("Could not add in Month for Start On field.", reportPackets.sendKeysForMonthDateField());
        assertTrue("Could not add in Day for Start On field.", reportPackets.sendKeysForDayDateField());
        assertTrue("Could not add in Year for Start On field.", reportPackets.sendKeysForYearDateField());
        assertTrue("Could not click Company User drop down header.", reportPackets.clickCompanyUserDropDownHeader());
        assertTrue("Could not click check box for a company user.", reportPackets.clickCheckBoxForACompanyUser());
        assertTrue("Could not scroll to cancel link.", reportPackets.scrollToCancelLink());
        assertTrue("Could not click on Report Instance Drop Down arrow.", reportPackets.clickReportInstanceDropDownArrow());
        assertTrue("Could not select a report instance in the menu.", reportPackets.selectReportInstanceFromMenu());
        assertTrue("Could not enter a report instance name in the menu.", reportPackets.enterSelectedReportInstanceNameInMenu());
        assertTrue("Could not click on the green Save Packet button.", reportPackets.clickSavePacketButton());
        assertTrue("Could not confirm that Report Packet was added successfully.", reportPackets.confirmReportPacketWasSavedSuccessfullyTextAppeared());
    }
}
