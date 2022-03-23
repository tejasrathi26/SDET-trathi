package regression_tests.student_tests;


import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseNav;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.CompanySpaceOptionsPage;

import static org.junit.Assert.*;

public class ShouldCheckAddAndDeleteCompanySpaceOptionsWhenStudentOccupancyIsEnabledIT extends BaseBrowserTest {
    public ShouldCheckAddAndDeleteCompanySpaceOptionsWhenStudentOccupancyIsEnabledIT() {
        super("campusapartments");
    }

    @Test
    public void shouldChecksDefaultSpaceOptionsAndFunctionalityToAddAndRemoveCompanySpaceOptions_whenStudentOccupancyEnabled() {
        // Test Case 2226204 - validate default space option on company level
        CompanySpaceOptionsPage spaceOptionPage = new CompanySpaceOptionsPage(driver);
        EntrataNavBar nav = new EntrataNavBar(driver);
        FirstLevelNavigation settings = new FirstLevelNavigation(driver);
        LeaseNav leaseNav = new LeaseNav(driver);
        assertTrue("Setup Tab not found", nav.clickSetupButton());
        assertTrue("Leasing Tab not found", settings.clickLeasingTab());
        assertTrue("Space Options Tab not found", leaseNav.clickSpaceOptionsTab());
        assertEquals("Private Space Option not found", "Private", spaceOptionPage.checkForPrivateSpaceOption());
        assertEquals("Shared space option not found", "Shared", spaceOptionPage.checkForSharedSpaceOption());
        assertEquals("Property count does not match", spaceOptionPage.checkPrivatePropertyCount(), spaceOptionPage.checkSharedPropertyCounty());
        assertTrue("Edit Icon is present for Private Space Option", spaceOptionPage.checkForPrivateEditIcon());
        assertTrue("Edit Icon is present for Shared Space Option", spaceOptionPage.checkForSharedEditIcon());
        assertTrue("cannot add space option", spaceOptionPage.clickAddSpaceOption());
        assertTrue("unable to select space count", spaceOptionPage.selectSpaceCount());
        assertTrue("unable to enter space option title", spaceOptionPage.enterSpaceOptionTitle());
        assertTrue("unable to select student occupancy", spaceOptionPage.selectStudentOccupancy());
        assertTrue("unable to find add property button", spaceOptionPage.clickAddProperty());
        assertTrue("unable to find property", spaceOptionPage.clickProperty());
        assertTrue("unable to find save button", spaceOptionPage.clickSaveButton());
        assertEquals("Success message not displaying correctly", "Space option updated successfully ", spaceOptionPage.checkSuccessMessage());
        assertTrue("cannot find added space option", spaceOptionPage.confirmAddedSpaceOption());
        assertTrue("cannot find edit icon", spaceOptionPage.clickEditSpaceOption());
        assertTrue("Cannot delete property", spaceOptionPage.clickDeletePropertyFromSpaceOption());
        assertTrue("unable to find save button", spaceOptionPage.clickSaveButton());
        assertTrue("unable to confirm changes", spaceOptionPage.clickConfirmButton());
        assertTrue("cannot find edit icon", spaceOptionPage.clickEditSpaceOption());
        assertTrue("cannot delete space option", spaceOptionPage.clickDeleteSpaceOption());
        assertTrue("cannot accept alert", spaceOptionPage.confirmDelete());
        assertFalse("cannot find added space option", spaceOptionPage.confirmAddedSpaceOption());


    }
}
