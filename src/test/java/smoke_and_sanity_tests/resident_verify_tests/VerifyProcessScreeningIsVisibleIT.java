package smoke_and_sanity_tests.resident_verify_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.leads_tab.all_leads_subtab.AllLeadsPage;
import page_objects.entrata_page_objects.leads_tab.lead_profile.LeadSummary;

import static org.junit.Assert.assertTrue;

public class VerifyProcessScreeningIsVisibleIT extends BaseBrowserTest {

    public VerifyProcessScreeningIsVisibleIT() {
        super("rvtest");
    }

    @Test
    public void verify_Applicant_Has_Process_Screening() {
        //testCase 3188542_C
        //Checks for a specific applicant if the process screening is visible.
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        AllLeadsPage leadsPage = new AllLeadsPage(driver);
        LeadSummary leadSummary = new LeadSummary(driver);

        //Navigate to leads page and open screening applicant.
        assertTrue("Unable to open Leads tab.", entrataNavBar.clickLeadsTab());
        assertTrue("Unable to click filter option.", leadsPage.clickFilterOption());
        assertTrue("Unable to enter screening smoke ID into filter option.", leadsPage.searchScreeningLeadID());
        assertTrue("Unable to click filter option.", leadsPage.clickFilterSearch());
        assertTrue("Unable to click screening smoke applicant.", leadsPage.clickScreeningSmokeLeadID());

        //Confirm process screening window opens.
        assertTrue("Unable to click process screening option.",leadSummary.clickProcessScreening());
        assertTrue("Process Screening Window did not open.", leadSummary.processScreeningWindowProcessScreeningButtonIsVisible());

    }

}
