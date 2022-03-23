package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_Energy_Star extends BasePage {

    public Client_Utility_Settings_Energy_Star(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By IMPORT_TO_ENERGY_STAR_CONTAINER = By.id("sub_container");

    //Methods
    public boolean confirmImportToEnergyStarContainerIsVisible() {
        return confirmElementIsVisible(IMPORT_TO_ENERGY_STAR_CONTAINER);
    }

}