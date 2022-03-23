package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Utilities_Implementation extends BasePage {

    public Utilities_Implementation(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By IMPLEMENTATION_CONSULTANTS_MULTISELECT = By.id("implementation_consultants_multiselect");

    //Methods
    public boolean confirmImplementationConsultantsMultiSelectIsVisible() {
        return confirmElementIsVisible(IMPLEMENTATION_CONSULTANTS_MULTISELECT, waitTimes.LONG_WAIT);
    }

}