package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.ReportsNav;

import static org.junit.Assert.assertTrue;

public class ShouldLoadReportingHistoryTabWhenClickedIT extends BaseBrowserTest {
    public ShouldLoadReportingHistoryTabWhenClickedIT() {
        super("avantic");
    }
    private EntrataNavBar navigateTo;
    private ReportsNav smokeTests;

    @Test
    public void verifyLibraryTab () {
        navigateTo = new EntrataNavBar(driver);
        smokeTests = new ReportsNav(driver);

        assertTrue("Cant Find Reporting Tab.",navigateTo.moveToReportsTab());
        assertTrue("Reporting History is missing from dropdown.", navigateTo.reportHistory());
        assertTrue("Reporting History tab failed to Load.", smokeTests.confirmHistoryTabLoads());
    }
}