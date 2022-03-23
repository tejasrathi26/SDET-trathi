package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.dashboard_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MarketingHubDashboardTab extends BasePage {

    //Constructor
    public MarketingHubDashboardTab(WebDriver driver) {
        super(driver); }

    //Overlay
    private final By MSH_LOADING_OVERLAY_LOCATOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //MSH Dashboard Filters Locators
    private final By MSH_DASHBOARD_PROPERTY_FILTER_LOCATOR = By.cssSelector("div[class='pad10-top selector js-property-select']");
    //First Range Filter and Options
    private final By MSH_DASHBOARD_RANGE_FILTER1_LOCATOR = By.id("range");
    private final String RANGE_FILTER_OPTION1_PREVIOUS_WEEK = "1";
    private final String RANGE_FILTER_OPTION2_PREVIOUS_MONTH = "2";
    private final String RANGE_FILTER_OPTION3_PREVIOUS_QUARTER = "3";
    private final String RANGE_FILTER_OPTION4_PREVIOUS_YEAR = "4";
    private final String RANGE_FILTER_OPTION5_CUSTOM_DATE = "5";
    //Second Range Filter and Options
    private final By MSH_DASHBOARD_RANGE_FILTER2_LOCATOR = By.id("select-quarter");
    //Custom Date Range Locators
    private final By DASHBOARD_FROM_DATE_CALENDAR_BUTTON = By.cssSelector("div[class='form-icon date ui-datepicker-trigger']");
    private final By DASHBOARD_T0_DATE_CALENDAR_BUTTON = By.cssSelector("span[class='custom-range'] > div:nth-child(4)");
    private final By DASHBOARD_T0_DATE_CALENDAR_PREVIOUS_MONTH_SELECTOR = By.cssSelector("a[class='ui-state-default ui-priority-secondary']");
    private final By DASHBOARD_T0_DATE_CALENDAR_TODAY_BUTTON = By.cssSelector("button[data-handler='today']");
    //Other Filters
    private final By MSH_DASHBOARD_LEAD_COMPLETION_LOCATOR = By.cssSelector("p[class='font16 lineheight-24 margin20-right']");
    private final By MSH_DASHBOARD_LEAD_COMPLETION_PERCENTAGE_LOCATOR = By.xpath("//strong[contains(text(),'%')]");
    //Lead Source Filter and Options
    private final By MSH_DASHBOARD_LEAD_SOURCE_FILTER_SELECTION = By.className("val");
    private final By MSH_DASHBOARD_LEAD_SOURCE_FILTER = By.id("lead-sources");
    private final By LEAD_SOURCE_FILTER_OPTION1_All_OPTIONS = By.id("select-all");
    private final By LEAD_SOURCE_FILTER_OPTION2 = By.cssSelector("li[class='binded-label']:nth-of-type(4) > input");
    //Conversion & Revenue Goal Filter and Options
    private final By MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR = By.name("marketing_hub_filters[goal]");
    private final String CONVERSION_FILTER_OPTION1_APPLICATION_STARTED = "Application Started";
    private final String CONVERSION_FILTER_OPTION2_APPLICATION_COMPLETED = "Application Completed";
    private final String CONVERSION_FILTER_OPTION3_APPLICATION_APPROVED = "Application Approved";
    private final String CONVERSION_FILTER_OPTION4_LEASE_STARTED = "Lease Started";
    private final String CONVERSION_FILTER_OPTION5_LEASE_COMPLETED = "Lease Completed";
    private final String CONVERSION_FILTER_OPTION6_LEASE_APPROVED = "Lease Approved";
    private final String CONVERSION_FILTER_OPTION7_MOVED_IN = "Moved In";
    //Toggle
    private final By MSH_DASH_POTENTIAL_LEADS_TOGGLE_LOCATOR = By.id("potential_lead_option");
    private final By MSH_DASH_FILTER_BUTTON_LOCATOR = By.id("btnFilter");

    //Leads Acquired Graph Locators
    private final By MSH_DASH_LEADS_ACQUIRED_CARD_LOCATOR = By.id("leads_acquired_card");
    private final By MSH_DASH_LEADS_ACQUIRED_GRAPH_LOCATOR = By.id("chart-container");
    private final By MSH_DASH_LEADS_ACQUIRED_X_AXIS_TITLE_LOCATOR = By.className("fusioncharts-xaxis-0-title");
    private final By MSH_DASH_LEADS_ACQUIRED_Y_AXIS_TITLE_LOCATOR = By.className("fusioncharts-yaxis-0-title");
    private final By MSH_DASH_TOTAL_LEADS_ACQUIRED_COUNT_LOCATOR = By.cssSelector("p[class='margin30-bottom font16']");
    private final By MSH_DASH_LEADS_ACQUIRED_DEFINITIONS_INFO_DROPDOWN_LOCATOR = By.id("leads-show-info-arrow");

    //Lead Funnel Graph Locators
    private final By MSH_DASH_LEADS_FUNNEL_CARD_LOCATOR = By.id("lead_funnel_card");
    private final By MSH_DASH_LEADS_FUNNEL_GRAPH_LOCATOR = By.id("funnel-container");
    private final By MSH_DASH_LEADS_FUNNEL_LINE_CHART_LOCATOR = By.id("drop-off-line-bold");
    private final By MSH_DASH_TOTAL_LEADS_IN_FUNNEL_COUNT_LOCATOR = By.cssSelector("p[class='margin10-bottom font16']");
    private final By MSH_DASH_LEADS_FUNNEL_DEFINITIONS_INFO_DROPDOWN_LOCATOR = By.id("funnel-show-info-arrow");

    //Lead Conversion & Estimated Revenue Card Locators
    private final By MSH_DASH_CONVERSION_ESTIMATED_REVENUE_CARD_LOCATOR = By.id("conversions-revenue");
    private final By MSH_DASH_CONVERSION_RATE_SUBHEADER_LOCATOR = By.xpath("//p[text()='Conversion Rate']");
    private final By MSH_DASH_AVG_TIME_CONVERSION_SUBHEADER_LOCATOR = By.xpath("//p[text()='Avg. Time to Conversion']");
    private final By MSH_DASH_ESTIMATED_REVENUE_SUBHEADER_LOCATOR = By.xpath("//p[text()='Estimated Revenue']");
    private final By MSH_DASH_LEADS_COMPLETED_SUBHEADER_LOCATOR = By.xpath("//p[text()='Leads Completed']");
    private final By MSH_DASH_CONVERSION_REVENUE_DEFINITIONS_INFO_DROPDOWN_LOCATOR = By.id("show-info-arrow");

    //METHODS
    //Filter Methods
    public boolean findPropertyFilter_MSHDash() {
        return confirmElementIsVisible(MSH_DASHBOARD_PROPERTY_FILTER_LOCATOR);
    }

    //First Range Filter Methods
    public boolean findRangeFilter1_MSHDash() {
        return confirmElementIsVisible(MSH_DASHBOARD_RANGE_FILTER1_LOCATOR);
    }

    public boolean selectRangeFilterOption1PreviousWeek() {
        return selectElementByValue(MSH_DASHBOARD_RANGE_FILTER1_LOCATOR,
                RANGE_FILTER_OPTION1_PREVIOUS_WEEK);
    }

    public boolean selectRangeFilterOption2PreviousMonth() {
        return selectElementByValue(MSH_DASHBOARD_RANGE_FILTER1_LOCATOR,
                RANGE_FILTER_OPTION2_PREVIOUS_MONTH);
    }

    public boolean selectRangeFilterOption3PreviousQuarter() {
        return selectElementByValue(MSH_DASHBOARD_RANGE_FILTER1_LOCATOR,
                RANGE_FILTER_OPTION3_PREVIOUS_QUARTER);
    }

    public boolean selectRangeFilterOption4PreviousYear() {
        return selectElementByValue(MSH_DASHBOARD_RANGE_FILTER1_LOCATOR,
                RANGE_FILTER_OPTION4_PREVIOUS_YEAR);
    }

    public boolean selectRangeFilterOption5CustomDate() {
        return selectElementByValue(MSH_DASHBOARD_RANGE_FILTER1_LOCATOR,
                RANGE_FILTER_OPTION5_CUSTOM_DATE);
    }

    //Date Range Selectors
    public boolean selectFromDateCalendarFilter() {
        return clickElement(DASHBOARD_FROM_DATE_CALENDAR_BUTTON);
    }

    public boolean selectToDateCalendarFilter() {
        return clickElement(DASHBOARD_T0_DATE_CALENDAR_BUTTON);
    }

    public boolean selectPreviousMonthDate() {
        return clickElement(DASHBOARD_T0_DATE_CALENDAR_PREVIOUS_MONTH_SELECTOR);
    }

    public boolean selectTodayButtonInCalendarFilter() {
        return clickElement(DASHBOARD_T0_DATE_CALENDAR_TODAY_BUTTON);
    }

    //Second Range Filter Methods
    public boolean findRangeFilter2_MSHDash() {
        return confirmElementIsVisible(MSH_DASHBOARD_RANGE_FILTER2_LOCATOR);
    }

    public boolean findLeadCompletionPercentage_MSHDash() {
        return confirmElementIsVisible(MSH_DASHBOARD_LEAD_COMPLETION_LOCATOR);
    }

    public boolean verifyLeadCompletionIsPercentageValue_MSHDash() {
        return confirmElementIsVisible(MSH_DASHBOARD_LEAD_COMPLETION_PERCENTAGE_LOCATOR);
    }

    //Lead Source Filter Methods
    public boolean findLeadSourceFilterInMarketingHubDashboard() {
        return confirmElementIsVisible(MSH_DASHBOARD_LEAD_SOURCE_FILTER);
    }

    public boolean clickLeadSourceFilterInMarketingHubDashboard() {
        waitForMSHDashboardLoadingOverlay();
        return clickElement(MSH_DASHBOARD_LEAD_SOURCE_FILTER);
    }

    public String confirmAllLeadSourcesSelectedByDefaultInMarketingHubDashboard() {
        return getElementText(MSH_DASHBOARD_LEAD_SOURCE_FILTER_SELECTION);
    }

    public boolean selectLeadSourceFilterOption1AllOptions() {
        return clickElement(LEAD_SOURCE_FILTER_OPTION1_All_OPTIONS);
    }

    public boolean selectLeadSourceFilterOption2() {
        return clickElement(LEAD_SOURCE_FILTER_OPTION2);
    }

    //Conversion and Revenue Filter Methods
    public boolean findConversionAndRevenueFilter_MSHDash() {
        return confirmElementIsVisible(MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR);
    }

    public boolean selectConversionRevenueFilterOption1ApplicationStarted() {
        return selectElementByText(MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR,
                CONVERSION_FILTER_OPTION1_APPLICATION_STARTED);
    }

    public boolean selectConversionRevenueFilterOption2ApplicationCompleted() {
        return selectElementByText(MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR,
                CONVERSION_FILTER_OPTION2_APPLICATION_COMPLETED);
    }

    public boolean selectConversionRevenueFilterOption3ApplicationApproved() {
        return selectElementByText(MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR,
                CONVERSION_FILTER_OPTION3_APPLICATION_APPROVED);
    }

    public boolean selectConversionRevenueFilterOption4LeaseStarted() {
        return selectElementByText(MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR,
                CONVERSION_FILTER_OPTION4_LEASE_STARTED);
    }

    public boolean selectConversionRevenueFilterOption5LeaseCompleted() {
        return selectElementByText(MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR,
                CONVERSION_FILTER_OPTION5_LEASE_COMPLETED);
    }

    public boolean selectConversionRevenueFilterOption6LeaseApproved() {
        return selectElementByText(MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR,
                CONVERSION_FILTER_OPTION6_LEASE_APPROVED);
    }

    public boolean selectConversionRevenueFilterOption7MovedIn() {
        return selectElementByText(MSH_DASHBOARD_CONVERSION_REVENUE_FILTER_LOCATOR,
                CONVERSION_FILTER_OPTION7_MOVED_IN);
    }

    //Other filter Methods
    public boolean findPotentialLeadsToggle_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_POTENTIAL_LEADS_TOGGLE_LOCATOR);
    }

    public boolean clickFilterButtonInMarketingHubDashboard() {
        waitForMSHDashboardLoadingOverlay();
        return clickElement(MSH_DASH_FILTER_BUTTON_LOCATOR);
    }

    //Leads Acquired Card Methods
    public boolean findLeadsAcquiredCard_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_ACQUIRED_CARD_LOCATOR);
    }

    public boolean findLeadsAcquiredGraph_MSHDash() {
        waitForMSHDashboardLoadingOverlay();
        return confirmElementIsVisible(MSH_DASH_LEADS_ACQUIRED_GRAPH_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findLeadsAcquiredXAxisTitle_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_ACQUIRED_X_AXIS_TITLE_LOCATOR);
    }

    public boolean findLeadsAcquiredYAxisTitle_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_ACQUIRED_Y_AXIS_TITLE_LOCATOR);
    }

    public boolean findTotalLeadsAcquiredLeadsCount_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_TOTAL_LEADS_ACQUIRED_COUNT_LOCATOR);
    }

    public boolean findLeadsAcquiredDefAndInfoDropDown_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_ACQUIRED_DEFINITIONS_INFO_DROPDOWN_LOCATOR);
    }

    //Leads Funnel Card Methods
    public boolean findLeadsFunnelCard_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_FUNNEL_CARD_LOCATOR);
    }

    public boolean findLeadsFunnelGraph_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_FUNNEL_GRAPH_LOCATOR);
    }

    public boolean findLeadsFunnelLineChart_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_FUNNEL_LINE_CHART_LOCATOR);
    }

    public boolean findTotalLeadsInFunnelCount_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_TOTAL_LEADS_IN_FUNNEL_COUNT_LOCATOR);
    }

    public boolean findLeadsFunnelDefAndInfoDropdown_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_FUNNEL_DEFINITIONS_INFO_DROPDOWN_LOCATOR);
    }

    //Lead Conversion & Estimated Revenue Card Methods
    public boolean findConversionAndEstimatedRevenueCard_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_CONVERSION_ESTIMATED_REVENUE_CARD_LOCATOR);
    }

    public boolean findConversionRateSubHeader_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_CONVERSION_RATE_SUBHEADER_LOCATOR);
    }

    public boolean findAvgTimeToConversionSubHeader_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_AVG_TIME_CONVERSION_SUBHEADER_LOCATOR);
    }

    public boolean findEstimatedRevenueSubHeader_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_ESTIMATED_REVENUE_SUBHEADER_LOCATOR);
    }

    public boolean findLeadsCompletedSubHeader_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_LEADS_COMPLETED_SUBHEADER_LOCATOR);
    }

    public boolean findConversionAndRevenueDefinitionsInformationDropDown_MSHDash() {
        return confirmElementIsVisible(MSH_DASH_CONVERSION_REVENUE_DEFINITIONS_INFO_DROPDOWN_LOCATOR);
    }

    //Overlay Methods
    private void waitForMSHDashboardLoadingOverlay() {
        waitForOverlay(MSH_LOADING_OVERLAY_LOCATOR);
    }

}
