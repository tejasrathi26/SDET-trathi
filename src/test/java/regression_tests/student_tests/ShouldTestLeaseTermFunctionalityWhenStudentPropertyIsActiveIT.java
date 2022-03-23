package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseTermStructuresPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShouldTestLeaseTermFunctionalityWhenStudentPropertyIsActiveIT extends BaseBrowserTest {
    public ShouldTestLeaseTermFunctionalityWhenStudentPropertyIsActiveIT() {
        super("campusapartments");
    }


    @Test
    public void shouldAddAndDeleteLeaseTermStructureTest_WhenStudentPropertyIsActive() {
        LeaseTermStructuresPage termPage = new LeaseTermStructuresPage(driver);
        EntrataNavBar nav = new EntrataNavBar(driver);
        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);
        LeaseNav leaseNav = new LeaseNav(driver);
        // navigates from home page to company>>lease> lease term structures
        assertTrue("Setup tab is not displaying", nav.clickSetupButton());
        assertTrue("Company tab is not displaying", nav.clickCompanyButton());
        assertTrue("Leasing tab is not present", firstLevelNavigation.clickLeasingTab());
        assertTrue("The lease term structure tab does not display", leaseNav.clickLeaseStructuresTab());
        //Adds lease term Structure
        assertTrue("Add lease term structure is not present", termPage.clickAddTermStructure());
        assertTrue("Unable to enter lease term structure name", termPage.enterLeaseTermStructureName());
        // adds property Campus Hill Lehigh 2 to lease term structure
        assertTrue("the add property button is not displaying", termPage.clickAddProperty());
        assertTrue("the property list is not displaying", termPage.addPropertyToLeaseTermStructure());
        // adds property to lease term structure and verifies it is now on the property list
        assertEquals("cannot find property", "Campus Hill - Lehigh 2", termPage.addProperty());
        assertTrue("The Save Button is not displaying", termPage.clickSaveLeaseTermButton());
        assertTrue("Success Message did not appear", termPage.waitForSuccessMessage());
        assertEquals("Lease term structure inserted/updated successfully, It will take some time to update the affected rates.", termPage.getSuccessMessageText());
        assertTrue("Unable to locate property", termPage.findAddedLeaseTerm());
        //Starts process to delete the lease term structure that was just created
        assertTrue("cannot find last edit icon", termPage.editLeaseStructure());
        assertTrue("Delete button is present", termPage.checkDeleteButton());
        assertTrue("unable to find property", termPage.deletePropertyFromStructure());
        assertTrue("The Save Button is not displaying", termPage.clickSaveLeaseTermButton());
        assertTrue("Unable to confirm change", termPage.confirmChange());
        assertTrue("cannot find last edit icon after deleting property", termPage.editLeaseStructure());
        assertTrue("cannot delete lease term structure", termPage.clickDeleteStructure());
        assertTrue("Success Message did not appear", termPage.waitForSuccessMessage());
        assertEquals("Lease term structure deleted successfully.", termPage.getSuccessMessageText());
        assertTrue("Deleted structure is still present", termPage.checkDeletedStructure());


    }

    @Test
    public void ShouldAddLeaseTermWindowForPortRepublicProperty_WhenPropertyIsActive(){
        LeaseTermStructuresPage termPage = new LeaseTermStructuresPage(driver);
        EntrataNavBar nav = new EntrataNavBar(driver);
        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);
        LeaseNav leaseNav = new LeaseNav(driver);
        assertTrue("Setup tab is not displaying", nav.clickSetupButton());
        assertTrue("Company tab is not displaying", nav.clickCompanyButton());
        assertTrue("Leasing tab is not present", firstLevelNavigation.clickLeasingTab());
        assertTrue("The lease term structure tab does not display", leaseNav.clickLeaseStructuresTab());
        //navigates to the add lease term button for the Port Republic student property
        assertTrue("cannot click expand button", termPage.clickPortRepublicLeaseTermExpand());
        assertTrue("cannot find add button",termPage.moveToAddPropertyButton());
        assertTrue("cannot click add lease term", termPage.clickPortRepublicAddLeaseTerm());
        //assertTrue("add lease term is not displaying", termPage.addLeaseTerm());
        assertTrue("occupancy dropdown is not displaying", termPage.clickOccupancyDropdown());
        assertTrue("cannot enter lease name", termPage.enterLeaseTermName());
        //enters dates for all datepicker fields for add lease term page
        assertTrue("cannot enter date range", termPage.enterDateRanges("10192021"));
        assertTrue("cannot enter renewal start date range", termPage.inputRenewalLeaseStart("10192021"));
        assertTrue("cannot enter prospect start date range", termPage.inputProspectLeaseStart("10192021"));
        assertTrue("cannot enter all lease end date range", termPage.inputAllLeaseEnd("05312022"));
        assertEquals("Dates do not match", termPage.checkAllLeaseEndDate(), termPage.checkAllBillDate());
        assertTrue("property link not clickable", termPage.selectPropertyForLeaseWindow());
        assertTrue("add property button not present", termPage.clickAddPropertyToLeaseWindow());
        assertTrue("property not found", termPage.clickAddRepublicProperty());
        assertTrue("update button not present ", termPage.clickUpdateButton());
        assertTrue("save button not present", termPage.clickSave());
        assertTrue("Success Message did not appear", termPage.waitForSuccessMessage());
        assertEquals("Lease terms inserted/updated successfully, It will take some time to update the affected rates.", termPage.getSuccessMessageText());

    }
}
