package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_Utility_Logs extends BasePage {

    public Client_Utility_Settings_Utility_Logs(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By PROPERTY_UTILITY_LOGS_TABLE = By.id("pagination_container");

    //Methods
    public boolean confirmPropertyUtilityLogsTableIsVisible() {
        return confirmElementIsVisible(PROPERTY_UTILITY_LOGS_TABLE);
    }

}