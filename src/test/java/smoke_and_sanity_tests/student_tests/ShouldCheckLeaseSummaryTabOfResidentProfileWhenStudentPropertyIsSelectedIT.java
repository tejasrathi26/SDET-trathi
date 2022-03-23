package smoke_and_sanity_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.lease_tab.SummaryPage;

import static org.junit.Assert.*;

public class ShouldCheckLeaseSummaryTabOfResidentProfileWhenStudentPropertyIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckLeaseSummaryTabOfResidentProfileWhenStudentPropertyIsSelectedIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldCheckThatEditSpaceOptionPageAndEditMoveInDatePageOpen_whenEditLinksAreClickedInLeaseSummary(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AllResidentsPage allResidentsPage = new AllResidentsPage(driver);
        AllResidentFilterPage allResidentFilterPage = new AllResidentFilterPage(driver);
        ResidentProfileCurtainPage residentProfileCurtainPage = new ResidentProfileCurtainPage(driver);
        SummaryPage summaryPage = new SummaryPage(driver);
        assertTrue("unable to click residents tab", navBar.clickResidentsTab());
        assertTrue("unable to click resident filter",allResidentsPage.clickResidentFilter());
        assertTrue("unable to delete all properties",allResidentFilterPage.clickClearAll());
        assertTrue("unable to click add property",allResidentFilterPage.clickAddPropertyButton());
        assertTrue("unable to enter property in search field",allResidentFilterPage.clickOnSpecificFilteredProperty("Lofts at Lorien"));
        assertTrue("unable to click advanced filters",allResidentFilterPage.clickAdvancedFilters());
        assertTrue("unable to enter text in status field", allResidentFilterPage.filterByCurrentStatus());
        assertTrue("unable to click Current Status",allResidentFilterPage.clickCurrentStatus());
        assertTrue("unable to click filter residents",allResidentFilterPage.clickFilterResidents());
        assertTrue("unable to click first resident",allResidentFilterPage.clickResidentSearchResult());
        assertTrue("unable to click lease tab",residentProfileCurtainPage.clickResidentProfileLeaseTab());
        assertTrue("unable to click edit lease info",summaryPage.clickEditLeaseInfo());
        assertTrue("unable to click edit move in button",summaryPage.clickEditMoveinDate());
        assertTrue("unable to find revise move in date field",summaryPage.confirmReviseMoveinDateOpens());
        assertTrue("unable to click close revise move in",summaryPage.clickCloseReviseMoveIN());
        assertTrue("unable to click edit space options",summaryPage.clickEditSpaceOption());
        assertTrue("unable to find space option dropdown",summaryPage.confirmUpdateSpaceOptionOpens());

    }
}
