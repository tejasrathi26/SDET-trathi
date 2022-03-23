package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Client_Utility_Settings_Bill_Audits extends BasePage {

    public Client_Utility_Settings_Bill_Audits(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By AUDIT_EMAIL_QUEUE = By.id("view-audit-email-queue");

    //Methods
    public boolean confirmAuditEmailQueueIsVisible() {
        return confirmElementIsVisible(AUDIT_EMAIL_QUEUE);
        }

}