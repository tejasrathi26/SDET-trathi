package smoke_and_sanity_tests.marketing_hub_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.dashboard_tab.MarketingHubDashboardTab;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MarketingHubDashboardGeneralInterfaceVerificationIT extends BaseBrowserTest {

    public MarketingHubDashboardGeneralInterfaceVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 2639594

    @Test
    public void shouldDisplayMarketingHubDashboardUIAndFilters_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        MarketingHubDashboardTab mshDash = new MarketingHubDashboardTab(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Dashboard' tab in Marketing Strategy Hub.",
                mshTab.clickMarketingHubDashboardTab());
        //Verification of MSH Dashboard Filters
        assertTrue("Failed to locate Property Filter in MSH Dashboard.",
                mshDash.findPropertyFilter_MSHDash());
        assertTrue("Failed to locate first Range filter in MSH Dashboard.",
                mshDash.findRangeFilter1_MSHDash());
        assertTrue("Failed to locate second Range filter in MSH Dashboard.",
                mshDash.findRangeFilter2_MSHDash());
        assertTrue("Failed to locate 'Lead Completion' percentage in MSH Dashboard",
                mshDash.findLeadCompletionPercentage_MSHDash());
        assertTrue("Failed to confirm that 'Lead Completion' is a percentage Value in MSH Dashboard.",
                mshDash.verifyLeadCompletionIsPercentageValue_MSHDash());
        assertTrue("Failed to locate Lead Source filter in MSH Dashboard.",
                mshDash.findLeadSourceFilterInMarketingHubDashboard());
        assertEquals("Failed to confirm 'All Options Selected' is selected by default in MSH Dashboard.",
                "All Options Selected", mshDash.confirmAllLeadSourcesSelectedByDefaultInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversion and Revenue Goal' filter in MSH Dashboard.",
                mshDash.findConversionAndRevenueFilter_MSHDash());
        assertTrue("Failed to locate 'Potential Leads' toggle in MSH Dashboard.",
                mshDash.findPotentialLeadsToggle_MSHDash());
        assertTrue("Failed to locate and click 'Filter' button in MSH Dashboard.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
    }

    @Test
    public void shouldDisplayMarketingHubDashboardLeadsAcquiredCard_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        MarketingHubDashboardTab mshDash = new MarketingHubDashboardTab(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Dashboard' tab in Marketing Strategy Hub.",
                mshTab.clickMarketingHubDashboardTab());
        //Verification of MSH Dashboard "Leads Acquired" card
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub.",
                mshDash.findLeadsAcquiredCard_MSHDash());
        assertTrue("Failed to locate 'Leads Acquired' graph in Marketing Strategy Hub.",
                mshDash.findLeadsAcquiredGraph_MSHDash());
        assertTrue("Failed to locate 'Leads Acquired' X-Axis Title in Marketing Strategy Hub.",
                mshDash.findLeadsAcquiredXAxisTitle_MSHDash());
        assertTrue("Failed to locate 'Leads Acquired' Y-Axis Title in Marketing Strategy Hub.",
                mshDash.findLeadsAcquiredYAxisTitle_MSHDash());
        assertTrue("Failed to locate 'Total Leads Acquired' count in Marketing Strategy Hub.",
                mshDash.findTotalLeadsAcquiredLeadsCount_MSHDash());
        assertTrue("Failed to locate 'Definitions & Information' dropdown in 'Leads Acquired' card in Marketing Strategy Hub.",
                mshDash.findLeadsAcquiredDefAndInfoDropDown_MSHDash());
    }

    @Test
    public void shouldDisplayMarketingHubDashboardLeadsFunnelCard_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        MarketingHubDashboardTab mshDash = new MarketingHubDashboardTab(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Dashboard' tab in Marketing Strategy Hub.",
                mshTab.clickMarketingHubDashboardTab());
        //Verification of MSH Dashboard "Leads Acquired" card
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub.",
                mshDash.findLeadsFunnelCard_MSHDash());
        assertTrue("Failed to locate 'Leads Funnel' graph in Marketing Strategy Hub.",
                mshDash.findLeadsFunnelGraph_MSHDash());
        assertTrue("Failed to locate 'Leads Funnel' line chart in Marketing Strategy Hub.",
                mshDash.findLeadsFunnelLineChart_MSHDash());
        assertTrue("Failed to locate 'Total Leads in Funnel' count in Marketing Strategy Hub.",
                mshDash.findTotalLeadsInFunnelCount_MSHDash());
        assertTrue("Failed to locate 'Definitions & Information' dropdown in Leads Funnel Card in Marketing Strategy Hub.",
                mshDash.findLeadsFunnelDefAndInfoDropdown_MSHDash());
    }

    @Test
    public void shouldDisplayMarketingHubDashboardConversionAndRevenueCard_whenContractEnabled() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        MarketingHubNav mshTab = new MarketingHubNav(driver);
        MarketingHubDashboardTab mshDash = new MarketingHubDashboardTab(driver);
        //Navigate to MSH Dashboard Tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());
        assertTrue("Failed to Navigate to 'Dashboard' tab in Marketing Strategy Hub.",
                mshTab.clickMarketingHubDashboardTab());
        //Verification of MSH Dashboard "Leads Acquired" card
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub.",
                mshDash.findConversionAndEstimatedRevenueCard_MSHDash());
        assertTrue("Failed to locate 'Conversion Rate' sub-header in 'Conversions & Estimated Revenue' card in Marketing Strategy Hub.",
                mshDash.findConversionRateSubHeader_MSHDash());
        assertTrue("Failed to locate 'Avg. Time to Conversion' sub-header in 'Conversions & Estimated Revenue' card in Marketing Strategy Hub.",
                mshDash.findAvgTimeToConversionSubHeader_MSHDash());
        assertTrue("Failed to locate 'Estimated Revenue' sub-header in 'Conversions & Estimated Revenue' card in Marketing Strategy Hub.",
                mshDash.findEstimatedRevenueSubHeader_MSHDash());
        assertTrue("Failed to locate 'Leads Completed' sub-header in 'Conversions & Estimated Revenue' card in Marketing Strategy Hub.",
                mshDash.findLeadsCompletedSubHeader_MSHDash());
        assertTrue("Failed to locate 'Definitions & Information' dropdown in 'Conversions & Estimated Revenue' card in Marketing Strategy Hub.",
                mshDash.findConversionAndRevenueDefinitionsInformationDropDown_MSHDash());
    }

}
