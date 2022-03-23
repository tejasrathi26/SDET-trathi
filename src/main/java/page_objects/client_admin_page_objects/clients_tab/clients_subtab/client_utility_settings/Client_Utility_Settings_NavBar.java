package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_NavBar extends BasePage {

    public Client_Utility_Settings_NavBar(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By DASHBOARD = By.id("property_dashboard");
    private final By RESIDENTS = By.id("residents");
    private final By BILL_ACCOUNTS = By.id("bill_accounts");
    private final By BILLS = By.id("property_utility_bills");
    private final By BILL_AUDITS = By.id("property_utility_bill_audits");
    private final By BATCHES = By.id("property_utility_batches");
    private final By METERS = By.id("property_meter_devices");
    private final By TRANSMISSIONS = By.id("property_utility_transmissions");
    private final By PROPERTY_UNITS = By.id("property_utility_property_units");
    private final By UTILITY_LOGS = By.id("view_utility_table_logs");
    private final By SETTINGS = By.id("property_utility_settings_system");
    private final By ENERGY_STAR = By.id("property_utility_energy_star");

    //Methods
    public boolean openDashboard() {
        return clickElement(DASHBOARD);
    }

    public boolean openResidents() {
        return clickElement(RESIDENTS);
    }

    public boolean openBillAccounts() {
        return clickElement(BILL_ACCOUNTS);
    }

    public boolean openBills() {
        return clickElement(BILLS);
    }

    public boolean openBillAudits() {
        return clickElement(BILL_AUDITS);
    }

    public boolean openBatches() {
        return clickElement(BATCHES);
    }

    public boolean openMeters() {
        return clickElement(METERS);
    }

    public boolean openTransmissions() {
        return clickElement(TRANSMISSIONS);
    }

    public boolean openPropertyUnits() {
        return clickElement(PROPERTY_UNITS);
    }

    public boolean openUtilityLogs() {
        return clickElement(UTILITY_LOGS);
    }

    public boolean openSettings() {
        return clickElement(SETTINGS);
    }

    public boolean openEnergyStar() {
        return clickElement(ENERGY_STAR);
    }

}