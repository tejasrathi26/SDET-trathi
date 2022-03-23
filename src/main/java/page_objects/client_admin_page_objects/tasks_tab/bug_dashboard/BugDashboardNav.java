package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class BugDashboardNav extends BasePage {
    public BugDashboardNav(WebDriver driver){
        super(driver);}

    private final By BUGS_PER_RELEASE = By.id("bugs_per_release");
    private final By FIRES_PER_RELEASE = By.id("fires_per_release");
    private final By BUGS_BY_PRODUCT = By.id("bugs_by_product");
    private final By BUGS_BY_EMPLOYEE = By.id("bugs_by_employee");
    private final By BUGS_BY_SDM = By.id("bugs_by_pdm");
    private final By BUGS_BY_PRIORITY = By.id("bugs_by_priority");
    private final By BUGS_BY_STATUS = By.id("bugs_by_status");
    private final By PRIORITY_PER_RELEASE = By.id("priority_per_release");
    private final By PRODUCT_BUGS_VS_FEATURES = By.id("bugs_vs_features_product_per_release");
    private final By SUMMARIZED_BUGS_REPORT = By.id("summarize_bugs_report");
    private final By TASKS_BY_PRODUCT_STATUS = By.id("bugs_by_product_&_status");
    private final By OPEN_BUG_COUNT_BY_MONTH = By.id("open_bug_count");

    public boolean clickBugsPerRelease(){return clickElement(BUGS_PER_RELEASE);}
    public boolean clickFiresPerRelease(){return clickElement(FIRES_PER_RELEASE);}
    public boolean clickBugsByProduct(){return clickElement(BUGS_BY_PRODUCT);}
    public boolean clickBugsByEmployee(){return clickElement(BUGS_BY_EMPLOYEE);}
    public boolean clickBugsBySDM(){return clickElement(BUGS_BY_SDM);}
    public boolean clickBugsByPriority(){return clickElement(BUGS_BY_PRIORITY);}
    public boolean clickPriorityPerRelease(){return clickElement(PRIORITY_PER_RELEASE);}
    public boolean clickBugsByStatus(){return clickElement(BUGS_BY_STATUS);}
    public boolean clickProductBugs(){return clickElement(PRODUCT_BUGS_VS_FEATURES);}
    public boolean clickSummarizedBugsReport(){return clickElement(SUMMARIZED_BUGS_REPORT);}
    public boolean clickTasksByProductStatus(){return clickElement(TASKS_BY_PRODUCT_STATUS);}
    public boolean clickOpenBugCountByMonth(){ maximizeWindow();
            return clickElement(OPEN_BUG_COUNT_BY_MONTH);}

}
