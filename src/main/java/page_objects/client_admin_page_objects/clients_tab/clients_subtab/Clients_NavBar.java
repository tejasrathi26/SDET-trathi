package page_objects.client_admin_page_objects.clients_tab.clients_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Clients_NavBar extends BasePage {

    public Clients_NavBar(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By UTILITIES = By.id("utilities");

    //Methods
    public boolean openClientUtilitiesTab() {
        return clickElement(UTILITIES);
    }

}