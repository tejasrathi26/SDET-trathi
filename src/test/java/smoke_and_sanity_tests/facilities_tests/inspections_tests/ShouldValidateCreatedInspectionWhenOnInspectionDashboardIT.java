package smoke_and_sanity_tests.facilities_tests.inspections_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.AddInspectionCurtain;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.InspectionsListPage;
import page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.new_inspection.NewInspection;
import page_objects.entrata_page_objects.EntrataNavBar;

import static org.junit.Assert.assertTrue;

public class ShouldValidateCreatedInspectionWhenOnInspectionDashboardIT extends BaseBrowserTest {

    public ShouldValidateCreatedInspectionWhenOnInspectionDashboardIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldValidateCreatedInspection_whenOnInspectionDashboard() {
        EntrataNavBar objNavBar = new EntrataNavBar(driver);
        AddInspectionCurtain objAddInspectionCurtain = new AddInspectionCurtain(driver);
        InspectionsListPage objInspectionsListPage = new InspectionsListPage(driver);
        NewInspection objNewInspection = new NewInspection(driver);

        assertTrue("Unable to click the residents header.", objNavBar.clickResidentsTab());
        assertTrue("Unable to click the maintenance header.", objNavBar.clickMaintenanceSubTab());
        assertTrue("Unable to click the Inspections tab.", objInspectionsListPage.clickInspectionsTab());
        assertTrue("Inspections tab has been clicked but the overlay has not disappeared resulting in an error.", objInspectionsListPage.waitForInspectionsOverlay());
        assertTrue("Unable to click the filter button on the Inspections side panel", objAddInspectionCurtain.clickFilterBtnOnInspectionsSidePanel());
        assertTrue("Unable to confirm that the Inspections Filter has appeared.", objAddInspectionCurtain.verifyInspectionsFilterAppears());
        assertTrue("unable to click the Status drop down in the Inspection Filter.", objAddInspectionCurtain.clickStatusDropDown());
        assertTrue("Unable to click All Statuses filter option under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click All Statuses a second time to remove filter options under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to select Not Started and in Progress filter option.", objAddInspectionCurtain.clickNotStartedAndInProgress());
        assertTrue("Unable to click Filter Inspections.", objAddInspectionCurtain.clickFilterInspections());
        assertTrue("Unable to click the first inspection listed.", objInspectionsListPage.clickFirstInspection());
        assertTrue("Unable to verify that the new inspection has a status of 'Not Started.'", objNewInspection.verifyInspectionHasNotStartedStatus());
        assertTrue("Unable to close out of the inspection being viewed.", objNewInspection.clickCloseInspectionButton());
        assertTrue("Unable to click the filter button on the Inspections side panel", objAddInspectionCurtain.clickFilterBtnOnInspectionsSidePanel());
        assertTrue("Unable to confirm that the Inspections Filter has appeared.", objAddInspectionCurtain.verifyInspectionsFilterAppears());
        assertTrue("unable to click the Status drop down in the Inspection Filter.", objAddInspectionCurtain.clickStatusDropDown());
        assertTrue("Unable to click All Statuses filter option under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click All Statuses a second time to remove filter options under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click 'Under Review' status in the inspections filter.", objAddInspectionCurtain.clickUnderReviewStatusFilter());
        assertTrue("Unable to click Filter Inspections.", objAddInspectionCurtain.clickFilterInspections());
        assertTrue("Unable to click the first inspection listed.", objInspectionsListPage.clickFirstInspection());
        assertTrue("Unable to close out of the inspection being viewed.", objNewInspection.clickCloseInspectionButton());
        assertTrue("Inspections tab has been clicked but the overlay has not disappeared resulting in an error.", objInspectionsListPage.waitForInspectionsOverlay());
        assertTrue("Unable to click the filter button on the Inspections side panel", objAddInspectionCurtain.clickFilterBtnOnInspectionsSidePanel());
        assertTrue("Unable to confirm that the Inspections Filter has appeared.", objAddInspectionCurtain.verifyInspectionsFilterAppears());
        assertTrue("unable to click the Status drop down in the Inspection Filter.", objAddInspectionCurtain.clickStatusDropDown());
        assertTrue("Unable to click All Statuses filter option under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click All Statuses a second time to remove filter options under Statuses.", objAddInspectionCurtain.clickAllStatuses());
        assertTrue("Unable to click 'Under Review' status in the inspections filter.", objAddInspectionCurtain.clickApprovedStatusFilter());
        assertTrue("Unable to click Filter Inspections.", objAddInspectionCurtain.clickFilterInspections());
        assertTrue("Unable to click the first inspection listed.", objInspectionsListPage.clickFirstInspection());
        assertTrue("Unable to close out of the inspection being viewed.", objNewInspection.clickCloseInspectionButton());
    }
}
