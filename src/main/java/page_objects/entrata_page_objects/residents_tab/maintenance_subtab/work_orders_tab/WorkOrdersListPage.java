package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.util.logging.Filter;

public class WorkOrdersListPage extends BasePage {

    private final By FIRST_CLICKABLE_WORK_ORDER = By.xpath("//*[@id='property-1']/tr[2]");
    private final By UPDATE_STATUS = By.xpath("//*[@id='maintenance_status_types_actions']/div[2]/a");
    private final By COMPLETED_UPDATE_STATUS_OPTIONS = By.cssSelector("li[onclick*='javascript:updateStatus']:first-of-type");
    private final By WORK_ORDER_STATUS = By.xpath("//*[@id='maintenance_status_types_actions']/div[1]/h4");
    private final By FILTER_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    public WorkOrdersListPage(WebDriver driver) {
        super(driver);
    }

    public boolean clickFirstWorkOrder() {waitForWorkOrderLoadingOverlay();
        return clickElement(FIRST_CLICKABLE_WORK_ORDER, waitTimes.LONG_WAIT); }

    private void waitForWorkOrderLoadingOverlay() { waitForOverlay(FILTER_OVERLAY, waitTimes.UNREASONABLE_WAIT); }

    public boolean clickUpdateStatus() { return clickElement(UPDATE_STATUS, waitTimes.LONG_WAIT); }

    public boolean clickCompletedFromUpdatedStatusDropDown() { return clickElement(COMPLETED_UPDATE_STATUS_OPTIONS); }

    public boolean confirmWorkOrderStatusHasBeenUpdated() { return confirmElementContainsText(WORK_ORDER_STATUS, "Completed", waitTimes.LONG_WAIT); }

}
