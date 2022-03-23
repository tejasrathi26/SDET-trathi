package smoke_and_sanity_tests.renewals_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.create_renewal_offer_renew_resident.CreateRenewalOfferPage;

import static junit.framework.Assert.assertTrue;

public class VerifyCreateRenewalPageFromResidentMoreActionsRenewResidentIT extends BaseBrowserTest {

    public VerifyCreateRenewalPageFromResidentMoreActionsRenewResidentIT() {
        super("village");
    }

    @Test
    public void shouldVerifyCreateRenewalScreen_whenSelectingRenewResidentFromResidentMoreActionsDropdown() {
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
        assertTrue("Could not click more actions 'renew resident'.", resProfile.moreActionsDropdownClickRenewResident());
        CreateRenewalOfferPage renewalCreationPage = new CreateRenewalOfferPage(driver);
        assertTrue("Unable to see CUSTOM tab", renewalCreationPage.customIntervalTabText());
        assertTrue("Unable to see lease end date", renewalCreationPage.leaseEndDate());
        assertTrue("Unable to see lease expiration date", renewalCreationPage.leaseExpirationDate());
        //lease terms and rent
        assertTrue("Unable to see Lease Terms Column", renewalCreationPage.leaseTermColumn());
        //renewalSpecials
        assertTrue("Unable to see renewal specials header", renewalCreationPage.renewalSpecialsHeading());
        //Add-ons
        assertTrue("Unable to see Add-ons header", renewalCreationPage.addOnsHeading());
        //Amenities
        assertTrue("Unable to see Amenities header", renewalCreationPage.amenitiesHeading());
        //Pets
        assertTrue("Unable to see Pets header", renewalCreationPage.petsHeading());
        //Other Charges
        assertTrue("Unable to see Other Charges header", renewalCreationPage.otherChargesHeading());
        //Concessions
        assertTrue("Unable to see concessions header", renewalCreationPage.concessionsHeading());
        //Lease Utilities
        assertTrue("Unable to see Lease utilities header", renewalCreationPage.leaseUtilitiesHeading());
        assertTrue("Unable to see generate lease button for renew Resident page", renewalCreationPage.renewResidentGenerateLeaseButtonVisible());
    }
}
