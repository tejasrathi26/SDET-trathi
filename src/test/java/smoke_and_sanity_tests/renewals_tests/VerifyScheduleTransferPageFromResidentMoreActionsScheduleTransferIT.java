package smoke_and_sanity_tests.renewals_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.schedule_transfer.ScheduleTransferPage;

import static junit.framework.Assert.assertTrue;

public class VerifyScheduleTransferPageFromResidentMoreActionsScheduleTransferIT extends BaseBrowserTest {

    public VerifyScheduleTransferPageFromResidentMoreActionsScheduleTransferIT() {
        super("village");
    }

    @Test
    public void shouldDisplayAndVerifyScheduleTransfersPage_whenClickingResidentMoreActionsScheduleTransfer() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Could not click on residents tab", nav.clickResidentsTab());
        AllResidentsPage allRes = new AllResidentsPage(driver);
        assertTrue("Could not click on all residents filter", allRes.clickResidentFilter());
        AllResidentFilterPage allResFilter = new AllResidentFilterPage(driver);
        assertTrue("Could not clear All Properties from filter", allResFilter.clickClearAll());
        assertTrue("Could not click on 'add' button to add property to filter", allResFilter.clickAddPropertyButton());
        assertTrue("Could not select property 'village bend east' from property dropdown", allResFilter.clickOnSpecificFilteredProperty("The Village Bend East"));
        assertTrue("Could not click on Filter button", allResFilter.clickFilterResidents());
        assertTrue("Could not click on first resident on all residents list", allRes.clickFirstResidentOnList());
        ResidentProfileCurtainPage resProfile = new ResidentProfileCurtainPage(driver);
        assertTrue("Could not click on household tab", resProfile.clickResidentProfileHouseholdTab());
        assertTrue("Could not click on More actions Dropdown", resProfile.clickOnMoreActionsDropdown());
        assertTrue("Could not click on More actions Dropdown, 'schedule transfer'.", resProfile.moreActionsDropdownScheduleTransferClick());
        ScheduleTransferPage transfer = new ScheduleTransferPage(driver);
        assertTrue("Transfer Information Header not visible", transfer.transferInfoHeaderTextVis());
        assertTrue("Transfer move out date section not visible", transfer.moveOutDateSectionVisible());
        assertTrue("Transfer move in date section not visible", transfer.moveInDateSectionVisible());
        assertTrue("Transfer lease start date section not visible", transfer.leaseStartDateSectionVisible());
        assertTrue("Transfer lease length text not visible", transfer.leaseLengthTextVisible());
        assertTrue("Transfer lease length dropdown not visible", transfer.leaseLengthDropdownVisible());
        assertTrue("reason for transfer text not visible", transfer.reasonForTransferTextVisible());
        assertTrue("reason for transfer dropdown not visible", transfer.reasonForTransferDropdownVisible());
        assertTrue("edit occupants section not visible", transfer.editOccupantsSectionVisible());
        assertTrue("search for unit button not visible", transfer.searchForUnitButtonVisible());
        assertTrue("preview transfer button not visible", transfer.previewTransferButtonVisible());
        assertTrue("create transfer button not visible", transfer.createTransferButtonVisible());
    }
}
