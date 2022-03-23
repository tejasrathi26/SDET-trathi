package smoke_and_sanity_tests.lead_manager;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leads_tab.LeadsMiscNav;

import static junit.framework.Assert.assertTrue;

public class ShouldVerifySeparateLeadsandApplicantsSettings_IT extends BaseBrowserTest {


    //Constructor//

    public ShouldVerifySeparateLeadsandApplicantsSettings_IT() { super("avantic"); }


    @Test
    public void shouldVerifySeparateLeadsandApplicantsSettings_IT() {
//2256553 - To verify "Separate Leads & Applicants:" setting

        LeadsMiscNav useLeadsMiscNav = new LeadsMiscNav(driver);
        EntrataNavBar useEntrata_NavBar = new EntrataNavBar(driver);
        assertTrue("Unable to navigate to the Company Level Settings!", useEntrata_NavBar.clickSetupButton());

        FirstLevelNavigation useFirstLevelNavigation = new FirstLevelNavigation(driver);
        assertTrue("Unable to navigate to the Setup->Company->\"Leads\" subtab!", useFirstLevelNavigation.clickLeadsTab());

        assertTrue("Unable to navigate to the Setup->Company->Leads subtab", useLeadsMiscNav.clickLeadsMiscSubtab());
        assertTrue("Unable to use the \"Edit Lead Settings\" button under Setup->Company->Leads->Misc!", useLeadsMiscNav.setup_Company_Leads_Edit_Misc_Settings());
        assertTrue("Unable to Select the \"Lead reaches the status of:\" radio button! ", useLeadsMiscNav.click_LeadReachestheStatusOfRadioButton());
        assertTrue("Unable to Select the \"Any payment is received:\" radio button! ", useLeadsMiscNav.click_LeadBecomesApplicantWhenPaymentReceievedRadioButton());


        assertTrue("Unable to Select the \"Lead reaches the status of:\" radio button! ", useLeadsMiscNav.click_LeadReachestheStatusOfRadioButton());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Guest Card Completed:\" dropdown option! ", useLeadsMiscNav.select_GuestCardCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Application Started\" dropdown option! ", useLeadsMiscNav.select_AppStartedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Application: Partially Completed\" dropdown option! ", useLeadsMiscNav.select_AppPartiallyCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Application Completed\" dropdown option! ", useLeadsMiscNav.select_AppCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Application Approved\" dropdown option! ", useLeadsMiscNav.select_AppApprovedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Lease Started\" dropdown option! ", useLeadsMiscNav.select_LeaseStartedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Lease Partially Completed\" dropdown option! ", useLeadsMiscNav.select_LeasePartiallyCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Lease Completed\" dropdown option! ", useLeadsMiscNav.select_LeaseCompletedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Lease Approved\" dropdown option! ", useLeadsMiscNav.select_LeaseApprovedOption());
        assertTrue("Unable to Select the \"Choose One:\" Dropdown button! ", useLeadsMiscNav.click_ChooseOneDropdownForLeadsBecomeApplicantsWhenSetting());

        assertTrue("Unable to Select the \"Application Started\" dropdown option! ", useLeadsMiscNav.select_AppStartedOption());
        assertTrue("Unable to Select the \"Save\" button for the Company>Misc Leads settings!", useLeadsMiscNav.select_MiscLeadsSettingsSaveButton());
    }
}
