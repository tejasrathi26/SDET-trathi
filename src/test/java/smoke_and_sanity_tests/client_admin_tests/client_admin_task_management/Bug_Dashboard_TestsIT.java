package smoke_and_sanity_tests.client_admin_tests.client_admin_task_management;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.tasks_tab.bug_dashboard.*;

import static org.junit.Assert.assertTrue;

public class Bug_Dashboard_TestsIT extends BaseBrowserTest {
    public Bug_Dashboard_TestsIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"bliddell","Xento123");
    }

    @Test
    public void shouldNavigateTabsOfBugDashboard_whenUserLoggedIn(){
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        BugDashboardNav bugDashboardNav = new BugDashboardNav(driver);
        BugsByEmployeePage bugsByEmployeePage = new BugsByEmployeePage(driver);
        BugsByPriorityPage bugsByPriorityPage = new BugsByPriorityPage(driver);
        BugsByProductPage bugsByProductPage = new BugsByProductPage(driver);
        BugsBySDMPage bugsBySDMPage = new BugsBySDMPage(driver);
        BugsByStatusPage bugsByStatusPage = new BugsByStatusPage(driver);
        BugsPerReleasePage bugsPerReleasePage = new BugsPerReleasePage(driver);
        FiresPerReleasePage firesPerReleasePage = new FiresPerReleasePage(driver);
        OpenBugCountByMonthPage openBugCountByMonthPage = new OpenBugCountByMonthPage(driver);
        PriorityPerReleasePage priorityPerReleasePage = new PriorityPerReleasePage(driver);
        ProductBugsVsFeatures productBugsVsFeatures = new ProductBugsVsFeatures(driver);
        SummarizedBugsReportPage summarizedBugsReportPage = new SummarizedBugsReportPage(driver);
        TasksByProductAndStatus tasksByProductAndStatus = new TasksByProductAndStatus(driver);
        assertTrue("unable to find tasks tab",nav.moveToTasksTab());
        assertTrue("unable to click bug dashboard",nav.clickBugDashboard());
        assertTrue("unable to click bugs per release", bugDashboardNav.clickBugsPerRelease());
        assertTrue("unable to find bugs per release chart",bugsPerReleasePage.findBugsPerReleaseCHart());
        assertTrue("unable to click fires per release",bugDashboardNav.clickFiresPerRelease());
        assertTrue("unable to find product selector", firesPerReleasePage.findProductSelector());
        assertTrue("unable to click bugs by product", bugDashboardNav.clickBugsByProduct());
        assertTrue("unable to find search button",bugsByProductPage.findSearchButton());
        assertTrue("unable to click bugs by employee page",bugDashboardNav.clickBugsByEmployee());
        assertTrue("unable to find search button",bugsByEmployeePage.findSearchButton());
        assertTrue("unable to click bugs by SDM",bugDashboardNav.clickBugsBySDM());
        assertTrue("unable to find bugs by sdm chart",bugsBySDMPage.findOpenBugExcludesDropdown());
        assertTrue("unable to click bugs by priority",bugDashboardNav.clickBugsByPriority());
        assertTrue("unable to find product selector", bugsByPriorityPage.findProductSelector());
        assertTrue("unable to click bugs by status",bugDashboardNav.clickBugsByStatus());
        assertTrue("unable to find product selector", bugsByStatusPage.findProductSelector());
        assertTrue("unable to click priority per release",bugDashboardNav.clickPriorityPerRelease());
        assertTrue("unable to find priority bug per release chart",priorityPerReleasePage.findPriorityBugsPerReleaseChart());
        assertTrue("unable to click product bugs vs features",bugDashboardNav.clickProductBugs());
        assertTrue("unable to find bugs vs features chart",productBugsVsFeatures.findBugsVsFeaturesChart());
        assertTrue("unable to click summarized bugs report",bugDashboardNav.clickSummarizedBugsReport());
        assertTrue("unable to find month selector",summarizedBugsReportPage.findMonthSelector());
        assertTrue("unable to click tasks by product & status",bugDashboardNav.clickTasksByProductStatus());
        assertTrue("unable to find task type selector", tasksByProductAndStatus.findTaskTypeSelector());
        assertTrue("unable to click open bug count",bugDashboardNav.clickOpenBugCountByMonth());
        assertTrue("unable to find month selector", openBugCountByMonthPage.findMonthSelector());








    }
}
