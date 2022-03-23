package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class IP_Dashboard extends BasePage {

    public IP_Dashboard(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By IP_PERFORMANCE_REPORT_TAB = By.id("ip_performance_report");

    //Methods
    public boolean confirmIpPerformanceReportIsVisible() {
        return confirmElementIsVisible(IP_PERFORMANCE_REPORT_TAB);
    }

}