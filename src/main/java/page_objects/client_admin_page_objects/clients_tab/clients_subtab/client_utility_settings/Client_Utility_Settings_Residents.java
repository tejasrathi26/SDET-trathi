package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_Residents extends BasePage {

    public Client_Utility_Settings_Residents(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By NAME_SEARCH = By.id("search_name");

    //Methods
    public boolean confirmNameSearchIsVisible() {
        return confirmElementIsVisible(NAME_SEARCH);
    }

}