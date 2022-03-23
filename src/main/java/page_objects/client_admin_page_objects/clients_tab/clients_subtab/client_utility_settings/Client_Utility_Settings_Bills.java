package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_Bills extends BasePage {

    public Client_Utility_Settings_Bills(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By BILL_SEARCH = By.id("quickSearchUtilityBills");

    //Methods
    public boolean confirmAccountSearchIsVisible() {
        return confirmElementIsVisible(BILL_SEARCH);
    }

}