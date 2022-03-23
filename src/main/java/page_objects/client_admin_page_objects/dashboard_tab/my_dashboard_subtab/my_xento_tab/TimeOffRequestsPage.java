package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab.my_xento_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TimeOffRequestsPage extends BasePage {
    public TimeOffRequestsPage(WebDriver driver){
        super(driver);}

    private final By ADD_REQUEST = By.linkText("Add Request");
    private final By CANCEL_BUTTON = By.id("cancel");

    public boolean clickAddRequest(){return clickElement(ADD_REQUEST);}
    public boolean clickCancelButton(){return clickElement(CANCEL_BUTTON);}
}