package smoke_and_sanity_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.application_tab.RoommateInterestsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.CompanyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseNav;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.residents_tab.ChecklistsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.CompanySpaceOptionsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseTermStructuresPage;

import static org.junit.Assert.*;

public class ShouldVerifyCompanyStudentModulesWhenClientHasActiveStudentPropertiesIT extends BaseBrowserTest {
    public ShouldVerifyCompanyStudentModulesWhenClientHasActiveStudentPropertiesIT() {
        super("dallasentratatest9");}

    @Test
    public void verifiesStudentModulesArePresentInCompanySettings(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        FirstLevelNavigation comp = new FirstLevelNavigation(driver);
        CompanyLeasingNav lNav = new CompanyLeasingNav(driver);
        LeaseNav leaseNav = new LeaseNav(driver);
        LeaseTermStructuresPage term = new LeaseTermStructuresPage(driver);
        CompanySpaceOptionsPage spaceOption = new CompanySpaceOptionsPage(driver);
        RoommateInterestsPage roommateInterests = new RoommateInterestsPage(driver);
        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        assertTrue("unable to find setup tab", nav.clickSetupButton());
        assertTrue("unable to click company tab",nav.clickCompanyButton());
        assertTrue("unable to click on leasing tab", comp.clickLeasingTab());
        assertTrue("unable to click on lease tab", lNav.clickLeaseSubTab());
        assertTrue("unable to click Lease Term Structures Tab",leaseNav.clickLeaseStructuresTab());
        assertTrue("unable to click add term structure button",term.clickAddTermStructure());
        assertTrue("structure Name field is not visible", term.confirmStructureNameFieldVisible());
        assertTrue("unable to click cancel button", term.clickCancelButton());
        assertTrue("unable to click edit lease term structure",term.clickEditLeaseTermStructure());
        assertTrue("unable to click cancel button", term.clickCancelButton());
        assertTrue("unable to find Space Options Tab",leaseNav.clickSpaceOptionsTab());
        assertTrue("unable to click add space option",spaceOption.clickAddSpaceOption());
        assertTrue("unable to edit space option title field",spaceOption.enterSpaceOptionTitle());
        assertTrue("unable to cancel Space Option",term.clickCancelButton());
        assertTrue("unable to click application subtab",lNav.clickApplicationTab());
        assertTrue("unable to click add question", roommateInterests.clickAddQuestion());
        assertTrue("unable to find question type dropdown", roommateInterests.confirmVisibilityOfQuestionTypeDropdown());


    }

    @Test
    public void verifiesBasicNavigationOfStudentCompanyChecklistPage_WhenStudentPropertiesAreActive(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        FirstLevelNavigation comp = new FirstLevelNavigation(driver);
        ChecklistsPage checklist = new ChecklistsPage(driver);
        assertTrue("unable to find setup tab", nav.clickSetupButton());
        assertTrue("unable to click company tab",nav.clickCompanyButton());
        assertTrue("unable to click Resident Company Settings Tab",comp.clickResidentsTab());
        assertTrue("unable to click Checklists Tab",checklist.clickChecklistTab());
        assertTrue("unable to click add checklist",checklist.clickAddChecklist());
        assertTrue("unable to find checklist name field",checklist.verifyNameFieldIsVisible());



    }
}
