package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.approvals_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ApprovalsPage extends BasePage {

    public ApprovalsPage(WebDriver driver) {super(driver);}

    private final By APPROVALS_CONTAINER = By.id("routes_container");

    public boolean confirmVisibilityApprovalsContainer() {return confirmElementIsVisible(APPROVALS_CONTAINER);}
}
