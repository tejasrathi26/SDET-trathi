package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.residents_tab.ChecklistsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.residents_tab.ResidentsNav;

import static org.junit.Assert.*;

public class ShouldAddMoveInChecklistWhenStudentPropertiesAreActiveIT extends BaseBrowserTest {
    public ShouldAddMoveInChecklistWhenStudentPropertiesAreActiveIT(){
        super("campusapartments");}

    @Test
    public void shouldAddMoveInChecklist_whenStudentPropertyIsActive(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);
        ResidentsNav residentsNav = new ResidentsNav(driver);
        ChecklistsPage checklistsPage = new ChecklistsPage(driver);
        assertTrue("Unable to click setup tab",navBar.clickSetupButton());
        assertTrue("unable to click company subtab", navBar.clickCompanyButton());
        assertTrue("unable to click residents tab",firstLevelNavigation.clickResidentsTab());
        assertTrue("unable to click checklists tab", residentsNav.clickChecklistTab());
        assertTrue("unable to click add checklist",checklistsPage.clickAddChecklist());
        assertTrue("unable to enter checklist name",checklistsPage.enterChecklistName());
        assertTrue("unable to select move-in checklist type",checklistsPage.selectMoveInChecklistType());
        assertTrue("unable to enter checklist description",checklistsPage.enterChecklistDescription());
        assertTrue("unable to click student occupancy checkbox", checklistsPage.clickStudentOccupancy());
        assertTrue("unable to enter task title",checklistsPage.enterTaskTitle());
        assertTrue("unable to select written response action",checklistsPage.selectWrittenResponseAction());
        assertTrue("unable to click save button",checklistsPage.clickSaveButton());
        assertEquals("success message text does not match","Checklist added successfully. ", checklistsPage.checkSuccessMessage());
        assertTrue("unable to find added checklist",checklistsPage.confirmAddedChecklist());
    }
}
