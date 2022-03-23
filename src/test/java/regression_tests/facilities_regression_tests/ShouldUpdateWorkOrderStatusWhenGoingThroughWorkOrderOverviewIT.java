package regression_tests.facilities_regression_tests;

import base_tests.BaseBrowserTest;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.WorkOrderFilter;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.WorkOrdersListPage;

public class ShouldUpdateWorkOrderStatusWhenGoingThroughWorkOrderOverviewIT extends BaseBrowserTest {

    public ShouldUpdateWorkOrderStatusWhenGoingThroughWorkOrderOverviewIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldUpdateWorkOrderStatus_whenGoingThroughWorkOrderOverview(){
        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        WorkOrdersListPage objWorkOrdersListPage = new WorkOrdersListPage(driver);
        WorkOrderFilter objWorkOrderFilter = new WorkOrderFilter(driver);

        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        assertTrue("Unable to verify that the work orders tab has opened.", objWorkOrderFilter.confirmWorkOrdersTabIsSelected());
        assertTrue("Unable to click the filter button on the Work Orders side panel.", objWorkOrderFilter.clickWorkOrderFilterBtn());
        assertTrue("Unable to click the Work Order Type drop down.", objWorkOrderFilter.clickMaintenanceRequestTypesList());
        assertTrue("Unable to deselect the recurring option in the Work Order Type drop down.", objWorkOrderFilter.clickRecurringWorkOrderType());
        assertTrue("Unable to click Filter Maintenance button.", objWorkOrderFilter.clickFilterMaintenance());
        assertTrue("Unable to click the first work order in the table.", objWorkOrdersListPage.clickFirstWorkOrder());
        assertTrue("Unable to click the update status button.", objWorkOrdersListPage.clickUpdateStatus());
        assertTrue("Unable to click the first status from the update status button.", objWorkOrdersListPage.clickCompletedFromUpdatedStatusDropDown());
        assertTrue("Unable to verify that the status has been updated on the work order.", objWorkOrdersListPage.confirmWorkOrderStatusHasBeenUpdated());

    }
}
