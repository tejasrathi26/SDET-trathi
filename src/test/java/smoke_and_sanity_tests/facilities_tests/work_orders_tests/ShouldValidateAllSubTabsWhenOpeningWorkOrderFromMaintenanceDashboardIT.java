package smoke_and_sanity_tests.facilities_tests.work_orders_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.WorkOrderFilter;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.WorkOrdersListPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain.*;

import static org.junit.Assert.assertTrue;

public class ShouldValidateAllSubTabsWhenOpeningWorkOrderFromMaintenanceDashboardIT extends BaseBrowserTest {

    public ShouldValidateAllSubTabsWhenOpeningWorkOrderFromMaintenanceDashboardIT() {
        super("dallasentratatest9");
    }

    @Test
    public void ShouldValidateAllSubTabsWhenOpeningWorkOrderFromMaintenanceDashboard() {

        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        WorkOrdersListPage objWorkOrdersListPage = new WorkOrdersListPage(driver);
        WorkOrderFilter objWorkOrderFilter = new WorkOrderFilter(driver);
        WorkOrderProblemTab objWorkOrderProblemTab = new WorkOrderProblemTab(driver);
        WorkOrderHistoryTab objWorkOrderHistoryTab = new WorkOrderHistoryTab(driver);
        WorkOrderExpensesTab objWorkOrderExpensesTab = new WorkOrderExpensesTab(driver);
        WorkOrderChargesTab objWorkOrderChargesTab = new WorkOrderChargesTab(driver);
        WorkOrderAttachmentsTab objWorkOrderAttachmentsTab = new WorkOrderAttachmentsTab(driver);
        WorkOrderAssignmentTab objWorkOrderAssignmentTab = new WorkOrderAssignmentTab(driver);
        WorkOrderSubtasksTab objWorkOrderSubTasks = new WorkOrderSubtasksTab(driver);

        //navigate to work order dashboard and open a work order
        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        assertTrue("Unable to verify that the work orders tab has opened.", objWorkOrderFilter.confirmWorkOrdersTabIsSelected());
        assertTrue("Unable to click the filter button on the Work Orders side panel.", objWorkOrderFilter.clickWorkOrderFilterBtn());
        assertTrue("Unable to click the Work Order Type drop down.", objWorkOrderFilter.clickMaintenanceRequestTypesList());
        //deselect recurring to get purely service requests
        assertTrue("Unable to deselect the recurring option in the Work Order Type drop down.", objWorkOrderFilter.clickRecurringWorkOrderType());
        assertTrue("Unable to click Filter Maintenance button.", objWorkOrderFilter.clickFilterMaintenance());
        assertTrue("Unable to click the first work order in the table.", objWorkOrdersListPage.clickFirstWorkOrder());
        //verify all the subtabs on work orders are present
        assertTrue("Unable to verify the Problem Subtab exists.", objWorkOrderProblemTab.confirmProblemSubTabExists());
        assertTrue("Unable to verify the Assignment Subtab exists.", objWorkOrderAssignmentTab.confirmAssignmentSubTabExists());
        assertTrue("Unable to verify the Attachment Subtab exists.", objWorkOrderAttachmentsTab.confirmAttachmentSubTabExists());
        assertTrue("Unable to verify the Subtasks Subtab exists.", objWorkOrderSubTasks.confirmSubtasksTabExists());
        assertTrue("Unable to verify the Charges Subtab exists.", objWorkOrderChargesTab.confirmChargesSubTabExists());
        assertTrue("Unable to verify the Expenses Subtab exists.", objWorkOrderExpensesTab.confirmExpensesSubTabExists());
        assertTrue("Unable to verify the History Subtab exists.", objWorkOrderHistoryTab.confirmHistorySubTabExists());
        //click through each subtab and verify the overview of each one
        assertTrue("Unable to click the Problem Subtab.", objWorkOrderProblemTab.clickProblemSubTab());
        assertTrue("Unable to verify the Problem Details information has populated.", objWorkOrderProblemTab.confirmProblemDetailsBoxExists());
        assertTrue("Unable to click the Assignment Subtab.", objWorkOrderAssignmentTab.clickAssignmentSubTab());
        assertTrue("Unable to verify the Assignment Overview box has populated.", objWorkOrderAssignmentTab.confirmAssignmentOverviewBoxExists());
        assertTrue("Unable to click the Attachments Subtab.", objWorkOrderAttachmentsTab.clickAttachmentSubTab());
        assertTrue("Unable to verify the Add Attachments section has populated.", objWorkOrderAttachmentsTab.confirmAttachmentsOverviewBoxExists());
        assertTrue("Unable to click the Subtasks Subtab.", objWorkOrderSubTasks.clickSubtasksTab());
        assertTrue("Unable to verify that the Subtasks List has populated.", objWorkOrderSubTasks.confirmSubtasksOverviewExists());
        assertTrue("Unable to click the Charges Subtab.", objWorkOrderChargesTab.clickChargesSubTab());
        assertTrue("Unable to verify that the Charges overview has populated.", objWorkOrderChargesTab.confirmChargesOverviewExists());
        assertTrue("Unable to click the Expenses Subtab.", objWorkOrderExpensesTab.clickExpensesSubTab());
        //expenses subtab has additional subtabs to check for
        assertTrue("Unable to verify that the Labor Overview has populated.", objWorkOrderExpensesTab.confirmLaborOverviewExists());
        assertTrue("Unable to verify that the Labor Subtab exists.", objWorkOrderExpensesTab.confirmLaborSubTabExists());
        assertTrue("Unable to verify that the Materials Subtab exists.", objWorkOrderExpensesTab.confirmMaterialsSubTabExists());
        assertTrue("Unable to verify that the Mileage Subtab exists.", objWorkOrderExpensesTab.confirmMileageSubTabExists());
        assertTrue("Unable to click the History Subtab.", objWorkOrderHistoryTab.clickHistorySubTab());
        assertTrue("Unable to verify that the History Log has appeared.", objWorkOrderHistoryTab.confirmHistoryEntriesExist());

    }
}
