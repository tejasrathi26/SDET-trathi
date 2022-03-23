package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TasksByProductAndStatus extends BasePage {
    public TasksByProductAndStatus(WebDriver driver){
        super(driver);
    }
    private final By TASK_TYPE_SELECTOR = By.id("task_type");

    public boolean findTaskTypeSelector(){return confirmElementIsVisible(TASK_TYPE_SELECTOR);}
}
