package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderFilter extends BasePage {

    private final By WORK_ORDERS_SIDE_PANEL_FILTER = By.id("open-filter-by-default");
    private final By CREATE_WORK_ORDER_FROM_FILTER = By.cssSelector("a[onclick*='createNewWorkOrder'");
    private final By SERVICE_REQUESTS_FILTER_TYPE = By.id("maintenance_request_types_2");
    private final By MAINTENANCE_REQUEST_TYPES_LIST = By.id("maintenance_request_types_list");
    private final By FILTER_MAINTENANCE = By.cssSelector("a[class*='button action first green text-white bold font14 generate-report submit-filter']");
    private final By RECURRING_WORK_ORDER_TYPE = By.id("maintenance_request_types_3");

    public WorkOrderFilter(WebDriver driver) { super(driver); }

    public boolean clickServiceRequestsFilterType() { return clickElement(SERVICE_REQUESTS_FILTER_TYPE); }

    public boolean clickWorkOrderFilterBtn() { return clickElement(WORK_ORDERS_SIDE_PANEL_FILTER); }

    public boolean confirmWorkOrdersTabIsSelected() { return confirmElementIsVisible(CREATE_WORK_ORDER_FROM_FILTER); }

    public boolean clickMaintenanceRequestTypesList() { return clickElement(MAINTENANCE_REQUEST_TYPES_LIST); }

    public boolean clickFilterMaintenance() { return clickElement(FILTER_MAINTENANCE); }

    public boolean clickRecurringWorkOrderType() { return clickElement(RECURRING_WORK_ORDER_TYPE); }

}
