package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.ReportsNav;

import static org.junit.Assert.assertTrue;

public class ShouldLoadMyReportingTabWhenClickedIT extends BaseBrowserTest {
    public ShouldLoadMyReportingTabWhenClickedIT() {
        super("avantic");
    }

    @Test
    public void verifyLibraryTab () {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);
        ReportsNav smokeTests = new ReportsNav(driver);

        assertTrue("Cant Find Reporting Tab.",navigateTo.moveToReportsTab());
        assertTrue("My Reports is missing from dropdown.", navigateTo.myReportsSelect());
        assertTrue("My Reports tab failed to Load.", smokeTests.confirmMyReportsLoads());
    }
}
