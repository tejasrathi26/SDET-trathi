package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.ReportsNav;

import static org.junit.Assert.assertTrue;

public class ShouldLoadScheduledReportsTabWhenClickedIT extends BaseBrowserTest {
    public ShouldLoadScheduledReportsTabWhenClickedIT() {
        super("avantic");
    }
    private EntrataNavBar navigateTo;
    private ReportsNav smokeTests;

    @Test
    public void verifyLibraryTab () {
        navigateTo = new EntrataNavBar(driver);
        smokeTests = new ReportsNav(driver);

        assertTrue("Cant Find Reporting Tab.",navigateTo.moveToReportsTab());
        assertTrue("Scheduled Reports is missing from dropdown.", navigateTo.scheduledReports());
        assertTrue("Scheduled Reports tab failed to Load.", smokeTests.confirmScheduledReportsLoads());
    }
}