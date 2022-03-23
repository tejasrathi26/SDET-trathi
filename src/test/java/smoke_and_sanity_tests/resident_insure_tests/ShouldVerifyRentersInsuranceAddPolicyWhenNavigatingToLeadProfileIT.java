package smoke_and_sanity_tests.resident_insure_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.LeadsAllLeadsFilters;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;

import static org.junit.Assert.assertTrue;

public class ShouldVerifyRentersInsuranceAddPolicyWhenNavigatingToLeadProfileIT extends BaseBrowserTest {

    public ShouldVerifyRentersInsuranceAddPolicyWhenNavigatingToLeadProfileIT() {
        super("derapid");
    }

    @Test
    public void shouldVerifyRentersInsuranceAddPolicyWhenNavigatingToLeadProfileIT() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        LeadsAllLeadsFilters leadsFilters = new LeadsAllLeadsFilters(driver);
        AllLeadsPage leadsPage = new AllLeadsPage(driver);
        LeadSummary leadSummary = new LeadSummary(driver);
        assertTrue("Unable to click Leads tab", entrataNavigation.clickLeadsTab());
        assertTrue("Unable to click Filters button", leadsFilters.clickExpandFilterButton());
        assertTrue("Unable to type 'started' in status search bar", leadsFilters.searchApplicationStarted());
        assertTrue("Unable to click 'application started' check box", leadsFilters.clickApplicationStartedCheckBox());
        assertTrue("Unable to click Filter Leads button", leadsPage.clickFilterSearch());
        assertTrue("Unable to click first Lead name", leadsPage.clickFirstResultLeadFilter());
        assertTrue("Unable to click Add Policy button", leadSummary.clickAddPolicyButton());
        assertTrue("Unable to find Provider dropdown", leadSummary.findProviderDropdown());
        assertTrue("Unable to find Policy Number field", leadSummary.findPolicyNumberField());
        assertTrue("Unable to find insurance Start Date datepicker", leadSummary.findInsuranceStartDate());
        assertTrue("Unable to find insurance End Date datepicker", leadSummary.findInsuranceEndDate());
        assertTrue("Unable to find Liability field", leadSummary.findLiabilityField());
        assertTrue("Unable to find Personal Contents field", leadSummary.findPersonalContentsField());
        assertTrue("Unable to find Deductible field", leadSummary.findDeductibleField());
        assertTrue("Unable to find Proof of Coverage upload", leadSummary.findProofOfCoverageUpload());
        assertTrue("Unable to find insurance verified 'Yes' option", leadSummary.findInsuranceVerifiedYes());
        assertTrue("Unable to find insurance verified 'No' option", leadSummary.findInsuranceVerifiedNo());
        assertTrue("Unable to find insurance Save button", leadSummary.findInsuranceSaveButton());

    }

}
