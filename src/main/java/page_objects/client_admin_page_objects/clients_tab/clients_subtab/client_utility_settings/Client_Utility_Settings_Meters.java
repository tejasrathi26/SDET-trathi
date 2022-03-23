package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_Meters extends BasePage {

    public Client_Utility_Settings_Meters(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By PROPERTY_METERS_TABLE = By.id("property_meter_devices_container");

    //Methods
    public boolean confirmPropertyMetersTableIsVisible() {
        return confirmElementIsVisible(PROPERTY_METERS_TABLE);
    }

}