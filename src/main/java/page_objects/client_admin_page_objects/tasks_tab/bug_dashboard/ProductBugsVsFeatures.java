package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ProductBugsVsFeatures extends BasePage {
    public ProductBugsVsFeatures(WebDriver driver){
        super(driver);
    }
    private final By BUGS_VS_FEATURES_CHART = By.id("ViewBugVsFeatureTasksProductPerRelease");

    public boolean findBugsVsFeaturesChart(){return confirmElementIsVisible(BUGS_VS_FEATURES_CHART);}
}
