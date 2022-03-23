package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Data_Entry extends BasePage {

    public Data_Entry(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By UTILITY_EXPENSE_MANAGEMENT = By.id("utility_expense_management");

    //Methods
    public boolean confirmUtilityExpenseManagementIsVisible() {
        return confirmElementIsVisible(UTILITY_EXPENSE_MANAGEMENT);
    }

}