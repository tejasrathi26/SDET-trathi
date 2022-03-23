package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import static base_tests.SitesEnum.CLIENTADMIN;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis.*;

import static org.junit.Assert.assertTrue;


public class ShouldCheckRootCauseAnalysisSectionWhenPermissionedUserLoggedInIT extends BaseBrowserTest {
    public ShouldCheckRootCauseAnalysisSectionWhenPermissionedUserLoggedInIT(){
        super("clientadmin",CLIENTADMIN,"bbreivik","Xento123");}

    @Test
    public void shouldValidateRootCauseAnalysis_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        RootCauseAnalysisNav rootCauseAnalysisNav = new RootCauseAnalysisNav(driver);
        UrgentVsImmediatePage urgentVsImmediatePage = new UrgentVsImmediatePage(driver);
        KeyClientTaskPage keyClientTaskPage = new KeyClientTaskPage(driver);
        QAVsNonQAPage qaVsNonQAPage = new QAVsNonQAPage(driver);
        PriorityBugsPage priorityBugsPage = new PriorityBugsPage(driver);
        ResolutionTimelinePage resolutionTimelinePage = new ResolutionTimelinePage(driver);
        RootCauseCountPage rootCauseCountPage = new RootCauseCountPage(driver);
        OutageReportPage outageReportPage = new OutageReportPage(driver);
        FollowUpStatusPage followUpStatusPage = new FollowUpStatusPage(driver);
        SystemUpTimePage systemUpTimePage = new SystemUpTimePage(driver);
        assertTrue("unable to find tasks tab",nav.moveToTasksTab());
        assertTrue("unable to click Root Cause Analysis",nav.clickRootCauseAnalysis());
        assertTrue("unable to click urgent vs immediate tab", rootCauseAnalysisNav.clickUrgentImmediateTab());
        assertTrue("unable to find urgent vs immediate task report",urgentVsImmediatePage.findUrgentImmediateTaskChart());
        assertTrue("unable to find SDM dropdown", urgentVsImmediatePage.findSDMDropdown());
        assertTrue("unable to click Key Client task tab", rootCauseAnalysisNav.clickKeyClientTab());
        assertTrue("unable to find Key Client task chart", keyClientTaskPage.findKeyClientTaskChart());
        assertTrue("unable to find Key Client dropdown", keyClientTaskPage.findKeyClientDropdown());
        assertTrue("unable to find QA vs non QA tab", rootCauseAnalysisNav.clickQATAB());
        assertTrue("unable fo find QA vs Non-QA approved task chart",qaVsNonQAPage.findQAChart());
        assertTrue("unable to find task priority dropdown",qaVsNonQAPage.findTaskPriorityDropdown());
        assertTrue("unable to click priority bugs tab", rootCauseAnalysisNav.clickPriorityBugsTab());
        assertTrue("unable to find priority bugs chart", priorityBugsPage.findBugsChart());
        assertTrue("unable to find SDM dropdown", priorityBugsPage.findSDMDropdown());
        assertTrue("unable to click resolution timeline tab", rootCauseAnalysisNav.clickResolutionTimelineTab());
        assertTrue("unable to find Resolution Timelines report", resolutionTimelinePage.findResolutionTimelineReport());
        assertTrue("unable to find PDM dropdown", resolutionTimelinePage.findPDMDropdown());
        assertTrue("unable to click Root Cause Count",rootCauseAnalysisNav.clickRootCauseCountTab());
        assertTrue("unable to find Root Cause Count Report",rootCauseCountPage.findRCACountReport());
        assertTrue("unable to find multiple users dropdown",rootCauseCountPage.findMultipleUsersDropdown());
        assertTrue("unable to click outage report tab",rootCauseAnalysisNav.clickOutageReportTab());
        assertTrue("unable to find Generate report tab", outageReportPage.findGenerateReport());
        assertTrue("unable to click follow up status tab",rootCauseAnalysisNav.clickFollowUpStatusTab());
        assertTrue("unable to find view follow up report link",followUpStatusPage.findViewFollowUpReport());
        assertTrue("unable to click system up time",rootCauseAnalysisNav.clickSystemUpTimeTab());
        assertTrue("unable to find system up time chart",systemUpTimePage.findSystemUpTimeReport());
        assertTrue("unable to find years dropdown",systemUpTimePage.findYearsDropdown());



    }

}
