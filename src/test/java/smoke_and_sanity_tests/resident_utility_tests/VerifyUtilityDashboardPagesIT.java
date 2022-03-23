package smoke_and_sanity_tests.resident_utility_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;
import page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.*;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class VerifyUtilityDashboardPagesIT extends BaseBrowserTest {

    public VerifyUtilityDashboardPagesIT() {
        super("clientadmin", CLIENTADMIN, "dkamle", "Xento123");
    }

    @Test
    public void verifyUtilityDashboardPagesLoad_whenDashboardClicked() {
        MyDashboardNav mydashboardNav = new MyDashboardNav(driver);

        //Confirm Utilities Implementation Tab loaded.
        Utilities_Implementation utilities_implementation = new Utilities_Implementation(driver);
        assertTrue("Unable to open Utilities Implementation Tab", mydashboardNav.openUtilitiesImplementationTab());
        assertTrue("Implementation Consultants Multi-Select is not visible.", utilities_implementation.confirmImplementationConsultantsMultiSelectIsVisible());

        //Confirm Data Entry Tab Loaded.
        Data_Entry data_entry = new Data_Entry(driver);
        assertTrue("Unable to open Data Entry Tab", mydashboardNav.openDataEntryTab());
        assertTrue("The Data Entry screen did not load properly.", data_entry.confirmUtilityExpenseManagementIsVisible());

        //Confirm Utility Billing Dashboard Tab loads properly.
        Utility_Billing_Dashboard utility_billing_dashboard = new Utility_Billing_Dashboard(driver);
        assertTrue("Unable to open Utility Billing Dashboard Tab", mydashboardNav.openUtilityBillingDashboardTab());
        assertTrue("The Utility Billing Dashboard Screen did not load properly.", utility_billing_dashboard.confirmUtilityBillingDashboardIsVisible());

        //Confirm UEM Dashboard loaded properly.
        UEM_Dashboard uem_dashboard = new UEM_Dashboard(driver);
        assertTrue("Unable to open UEM Dashboard Tab", mydashboardNav.openUemDashboardTab());
        assertTrue("The UEM Dashboard Tab did not load properly.", uem_dashboard.confirmUtilityManagementSpecialistMultiselectIsVisible());

        //Confirm IP Dashboard loaded properly.
        IP_Dashboard ip_dashboard = new IP_Dashboard(driver);
        assertTrue("Unable to open IP Dashboard Tab", mydashboardNav.openIpDashboardTab());
        assertTrue("IP Dashboard Tab did not load properly.", ip_dashboard.confirmIpPerformanceReportIsVisible());

        //Confirm COA Dashboard loaded properly.
        COA_Dashboard coa_dashboard = new COA_Dashboard(driver);
        assertTrue("Unable to open COA Dashboard Tab", mydashboardNav.openCoaDashboardTab());
        assertTrue("COA Dashboard Tab did not load properly.", coa_dashboard.confirmClientMultiselectIsVisible());

    }

}