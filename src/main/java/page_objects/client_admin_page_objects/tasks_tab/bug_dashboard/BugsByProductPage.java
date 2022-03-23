package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BugsByProductPage extends BasePage {
    public BugsByProductPage(WebDriver driver){
        super(driver);
    }

    private final By SEARCH_BUTTON = By.id("btnSearch");

    public boolean findSearchButton(){return clickElement(SEARCH_BUTTON);}
}
