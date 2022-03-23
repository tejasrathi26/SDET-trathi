package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_Dashboard extends BasePage {

    public Client_Utility_Settings_Dashboard(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By COMMODITIES = By.id("commodities");

    //Methods
    public boolean confirmCommoditiesIsVisible() {
        return confirmElementIsVisible(COMMODITIES);
    }

}