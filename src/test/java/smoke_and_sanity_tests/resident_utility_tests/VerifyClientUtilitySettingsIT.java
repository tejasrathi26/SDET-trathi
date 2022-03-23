package smoke_and_sanity_tests.resident_utility_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.Clients_NavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings.*;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class VerifyClientUtilitySettingsIT extends BaseBrowserTest {

    public VerifyClientUtilitySettingsIT() {
        super("clientadmin", CLIENTADMIN, "dkamle", "Xento123");
    }

    @Test

    public void verifyRUClientSettingsInClientAdmin_whenTabOpened() {
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);

        //Make chrome max size
        assertTrue("Unable to maximize chrome window.", clientAdminNavBar.maximizeWindow());

        //Navigate to Avantic Residential client profile.
        assertTrue("Unable to search for CID in QuickSearch within ClientAdmin.", clientAdminNavBar.searchForAvanticResidentialCID());
        assertTrue("Unable to press enter in QuickSearch within ClientAdmin.", clientAdminNavBar.pressEnterInQuickSearch());
        assertTrue("Unable to open QuickSearch result within ClientAdmin.", clientAdminNavBar.openQuickSearchResult());
        assertTrue("Unable to switch to new tab.", clientAdminNavBar.switchToRecentlyOpenedTab());

        //Open Client Utilities Tab
        Clients_NavBar clientsNavBar = new Clients_NavBar(driver);
        assertTrue("Unable to open Utilities on the Client Profile.", clientsNavBar.openClientUtilitiesTab());

        //Open each of the Utilities sub tab and verify that they loaded appropriately.
        Client_Utility_Settings_NavBar utility_settings_navBar = new Client_Utility_Settings_NavBar(driver);
        Client_Utility_Settings_Dashboard utility_settings_dashboard = new Client_Utility_Settings_Dashboard(driver);
        assertTrue("Unable to open Client Utility Settings Dashboard.", utility_settings_navBar.openDashboard());
        assertTrue("Client Utility Settings Dashboard did not open properly.", utility_settings_dashboard.confirmCommoditiesIsVisible());

        Client_Utility_Settings_Residents utility_settings_residents = new Client_Utility_Settings_Residents(driver);
        assertTrue("Unable to open Client Utility Settings Residents.", utility_settings_navBar.openResidents());
        assertTrue("Client Utility Settings Residents did not load properly.", utility_settings_residents.confirmNameSearchIsVisible());

        Client_Utility_Settings_Bill_Accounts utility_settings_bill_accounts = new Client_Utility_Settings_Bill_Accounts(driver);
        assertTrue("Unable to open Client Utility Settings Bill Accounts.", utility_settings_navBar.openBillAccounts());
        assertTrue("Client Utility Settings Bill Accounts did not load properly.", utility_settings_bill_accounts.confirmAccountSearchIsVisible());

        Client_Utility_Settings_Bills utility_settings_bills = new Client_Utility_Settings_Bills(driver);
        assertTrue("Unable to open Client Utility Settings Bills.", utility_settings_navBar.openBills());
        assertTrue("Client Utility Settings Bills did not load properly.", utility_settings_bills.confirmAccountSearchIsVisible());

        Client_Utility_Settings_Bill_Audits utility_settings_bill_audits = new Client_Utility_Settings_Bill_Audits(driver);
        assertTrue("Unable to open Client Utility Settings Bill Audits.", utility_settings_navBar.openBillAudits());
        assertTrue("Client Utility Settings Bill Audits did not load properly.", utility_settings_bill_audits.confirmAuditEmailQueueIsVisible());

        Client_Utility_Settings_Batches utility_settings_batches = new Client_Utility_Settings_Batches(driver);
        assertTrue("Unable to open Client Utility Settings Batches.", utility_settings_navBar.openBatches());
        assertTrue("Client Utility Settings Batches did not load properly.", utility_settings_batches.confirmPropertyBatchesTableIsVisible());

        Client_Utility_Settings_Meters utility_settings_meters = new Client_Utility_Settings_Meters(driver);
        assertTrue("Unable to open Client Utility Settings Meters.", utility_settings_navBar.openMeters());
        assertTrue("Client Utility Settings Meters did not load properly.", utility_settings_meters.confirmPropertyMetersTableIsVisible());

        Client_Utility_Settings_Transmissions utility_settings_transmissions = new Client_Utility_Settings_Transmissions(driver);
        assertTrue("Unable to open Client Utility Settings Transmissions.", utility_settings_navBar.openTransmissions());
        assertTrue("Client Utility Settings Transmissions did not load properly.", utility_settings_transmissions.confirmUtilityTransmissionsTableIsVisible());

        Client_Utility_Settings_Property_Units utility_settings_property_units = new Client_Utility_Settings_Property_Units(driver);
        assertTrue("Unable to open Client Utility Settings Property Units.", utility_settings_navBar.openPropertyUnits());
        assertTrue("Client Utility Settings Property Units did not load properly.", utility_settings_property_units.confirmPropertyUnitsTableIsVisible());

        Client_Utility_Settings_Utility_Logs utility_settings_utility_logs = new Client_Utility_Settings_Utility_Logs(driver);
        assertTrue("Unable to open Client Utility Settings Utility Logs", utility_settings_navBar.openUtilityLogs());
        assertTrue("Client Utility Settings Utility Logs did not load properly.", utility_settings_utility_logs.confirmPropertyUtilityLogsTableIsVisible());

        Client_Utility_Settings_Settings utility_settings_settings = new Client_Utility_Settings_Settings(driver);
        assertTrue("Unable to open Client Utility Settings Settings.", utility_settings_navBar.openSettings());
        assertTrue("Client Utility Settings Settings did not load properly.", utility_settings_settings.confirmPropertySettingsBillingIsVisible());

        Client_Utility_Settings_Energy_Star utility_settings_energy_star = new Client_Utility_Settings_Energy_Star(driver);
        assertTrue("Unable to open Client Utility Settings Energy Star.", utility_settings_navBar.openEnergyStar());
        assertTrue("Client Utility Settings Energy Star did not load properly.", utility_settings_energy_star.confirmImportToEnergyStarContainerIsVisible());

    }

}