package smoke_and_sanity_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.tools.*;
import page_objects.entrata_page_objects.residents_tab.bulk_unit_assignment_subtab.BulkUnitAssignmentsPage;

import static org.junit.Assert.*;

public class ShouldCheckStudentModulesInResidentsTabWhenStudentPropertyIsActiveIT extends BaseBrowserTest {
    public ShouldCheckStudentModulesInResidentsTabWhenStudentPropertyIsActiveIT(){
        super( "dallasentratatest9"); }

@Test
    public void shouldCheckBasicVisibilityOfBUA_WhenClientHasActiveStudentProperty(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    BulkUnitAssignmentsPage bulkUnitAssignments = new BulkUnitAssignmentsPage(driver);
    assertTrue("unable to click Residents Tab",nav.clickResidentsTab());
    assertTrue("unable to click bulk unit assignment tab",bulkUnitAssignments.clickBulkUnitAssignment());
    assertTrue("unable to view unit mix element",bulkUnitAssignments.verifyVisibilityOfUnitMix());
    assertTrue("unable to click send messaging",bulkUnitAssignments.clickSendMessaging());
    assertTrue("unable to click send notifications", bulkUnitAssignments.clickSendNotifications());
    assertTrue("unable to see status notification", bulkUnitAssignments.confirmVisiblityOfStatusDropdown());
}

@Test
    public void shouldConfirmBulkPlaceOnNoticeOpens_WhenUserClicksOnLink(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage tools = new AllResidentsPage(driver);
    BulkPlaceOnNoticePage bulkPlaceOnNotice = new BulkPlaceOnNoticePage(driver);
    assertTrue("unable to click Residents Tab",nav.clickResidentsTab());
    assertTrue("unable to find tools icon",tools.moveToToolSIcon());
    assertTrue("unable to click Bulk Place On Notice", tools.clickOnBulkPlaceOnNotice());
    assertTrue("unable to find Search Button",bulkPlaceOnNotice.ConfirmVisibilityOfSearchButton());}

@Test
public void shouldConfirmBulkMoveInOpens_WhenUserClicksOnLink(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage tools = new AllResidentsPage(driver);
    BulkMoveInPage bulkMoveIn = new BulkMoveInPage(driver);
    assertTrue("unable to click Residents Tab",nav.clickResidentsTab());
    assertTrue("unable to find tools icon",tools.moveToToolSIcon());
    assertTrue("unable to click Bulk Move-in", tools.clickBulkMoveIN());
    assertTrue("unable to locate Search Button", bulkMoveIn.confirmVisibilityOfSearchButton());}

@Test
public void shouldConfirmBulkMoveOutOpens_WhenUserClicksOnLink(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage tools = new AllResidentsPage(driver);
    BulkMoveOutPage bulkMoveOut = new BulkMoveOutPage(driver);
    assertTrue("unable to click Residents Tab",nav.clickResidentsTab());
    assertTrue("unable to find tools icon",tools.moveToToolSIcon());
    assertTrue("unable to click Bulk Move-out", tools.clickBulkMoveOut());
    assertTrue("unable to locate Search Button", bulkMoveOut.confirmVisibilityOfSearchButton());}

@Test
    public void shouldConfirmMoveInBoardOpens_WhenUserClicksOnLink(){
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage icon = new AllResidentsPage(driver);
    MoveInBoardPage moveInBoardPage = new MoveInBoardPage(driver);
    assertTrue("unable to click Residents Tab",nav.clickResidentsTab());
    assertTrue("unable to find move in board icon",icon.moveToMoveInBoardIcon());
    assertTrue("unable to click move-in board link",icon.clickMoveInBoardLink());
    assertTrue("unable to find download csv link", moveInBoardPage.confirmVisibilityOfDownloadLink());

}
@Test
public void shouldConfirmMoveOutBoardOpens_WhenUserClicksOnLink() {
    EntrataNavBar nav = new EntrataNavBar(driver);
    AllResidentsPage icon = new AllResidentsPage(driver);
    MoveOutBoardPage moveOutBoardPage = new MoveOutBoardPage(driver);
    assertTrue("unable to click Residents Tab", nav.clickResidentsTab());
    assertTrue("unable to find move in board icon", icon.moveToMoveInBoardIcon());
    assertTrue("unable to click move-out board link", icon.clickMoveOutBoardLink());
    assertTrue("unable to find download csv link", moveOutBoardPage.confirmVisibilityOfDownloadLink());
}


}

