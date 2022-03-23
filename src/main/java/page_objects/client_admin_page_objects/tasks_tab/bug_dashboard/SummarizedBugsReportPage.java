package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SummarizedBugsReportPage extends BasePage {
    public SummarizedBugsReportPage(WebDriver driver){
        super(driver);
    }

    private final By MONTH_SELECTOR =By.id("select_month");

    public boolean findMonthSelector(){return confirmElementIsVisible(MONTH_SELECTOR);}
}
