package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_Bill_Accounts extends BasePage {

    public Client_Utility_Settings_Bill_Accounts(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By ACCOUNTSEARCH = By.id("searchCombobox");

    //Methods
    public boolean confirmAccountSearchIsVisible() {
        return confirmElementIsVisible(ACCOUNTSEARCH);
    }

}