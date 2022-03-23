package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OutageReportPage extends BasePage {
    public OutageReportPage(WebDriver driver){
        super(driver);}

    private final By GENERATE_REPORT = By.cssSelector("input[value = 'Generate Report']");

    public boolean findGenerateReport(){return confirmElementIsVisible(GENERATE_REPORT);}
}
