package smoke_and_sanity_tests.lease_financials;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.FinancialMoveOutPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab.LedgerPage;

import static org.junit.Assert.*;

public class ShouldCheckResProfileWhenPmEnabledIT extends BaseBrowserTest {
    public ShouldCheckResProfileWhenPmEnabledIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldCheckAddPaymentAddCreditAddChargePopups_whenCurrentResidentSelected() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AllResidentsPage allResidentsPage = new AllResidentsPage(driver);
        AllResidentFilterPage allResidentFilterPage = new AllResidentFilterPage(driver);
        LedgerPage ledgerPage = new LedgerPage(driver);
        assertTrue("unable to click residents tab", navBar.clickResidentsTab());
        assertTrue("unable to click filter icon",allResidentsPage.clickResidentFilter());
        assertTrue("unable to click clear all",allResidentFilterPage.clickClearAll());
        assertTrue("unable to click add property button", allResidentFilterPage.clickAddPropertyButton());
        assertTrue("unable to add specified property",allResidentFilterPage.clickOnSpecificFilteredProperty("Brandon"));
        assertTrue("unable to enter status search entry",allResidentFilterPage.filterByCurrentStatus());
        assertTrue("unable to click current status",allResidentFilterPage.clickCurrentStatus());
        assertTrue("unable to click filter residents button",allResidentFilterPage.clickFilterResidents());
        assertTrue("unable to select first resident", allResidentsPage.clickFirstResidentOnList());
        assertTrue("unable to click add button",ledgerPage.clickAddDropdown());
        assertTrue("unable to click add charge", ledgerPage.clickAddCharge());
        assertTrue("unable to find amount field",ledgerPage.confirmAmountFieldPresence());
        assertTrue("unable to click cancel",ledgerPage.clickCancel());
        assertTrue("unable to click add button",ledgerPage.clickAddDropdown());
        assertTrue("unable to click add payment",ledgerPage.clickAddPayment());
        assertTrue("unable to find amount field",ledgerPage.confirmAmountFieldPresence());
        assertTrue("unable to click cancel",ledgerPage.clickCancel());
        assertTrue("unable to click add button",ledgerPage.clickAddDropdown());
        assertTrue("unable to click add credit",ledgerPage.clickAddCredit());
        assertTrue("unable to find amount field",ledgerPage.confirmAmountFieldPresence());
    }

    @Test
    public void shouldNavigateToFinancialMoveOutPage_whenPastResidentSelected(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AllResidentsPage allResidentsPage = new AllResidentsPage(driver);
        AllResidentFilterPage allResidentFilterPage = new AllResidentFilterPage(driver);
        ResidentProfileCurtainPage residentProfileCurtainPage = new ResidentProfileCurtainPage(driver);
        FinancialMoveOutPage financialMoveOutPage = new FinancialMoveOutPage(driver);
        assertTrue("unable to click residents tab", navBar.clickResidentsTab());
        assertTrue("unable to click filter icon",allResidentsPage.clickResidentFilter());
        assertTrue("unable to click clear all",allResidentFilterPage.clickClearAll());
        assertTrue("unable to click add property button", allResidentFilterPage.clickAddPropertyButton());
        assertTrue("unable to add specified property",allResidentFilterPage.clickOnSpecificFilteredProperty("Brandon"));
        assertTrue("unable to filter by past status",allResidentFilterPage.filterByPastStatus());
        assertTrue("unable to click past status",allResidentFilterPage.clickPastStatus());
        assertTrue("unable to click filter residents button",allResidentFilterPage.clickFilterResidents());
        assertTrue("unable to select first resident", allResidentsPage.clickFirstResidentOnList());
        if(residentProfileCurtainPage.confirmPerformFMOVisible()){
            assertTrue("unable to click financial move-out button",residentProfileCurtainPage.clickPerformFinancialMoveOut());
        assertTrue("unable to find move-out reason dropdown", financialMoveOutPage.confirmMoveOutReasonDropdown());}
        else{ assertTrue("unable to click more actions",residentProfileCurtainPage.clickOnMoreActionsDropdown());
            assertTrue("unable to perform finanical move-out",residentProfileCurtainPage.reverseFinancialMoveOut());
            assertTrue("unable to click financial move-out button",residentProfileCurtainPage.clickPerformFinancialMoveOut());
            assertTrue("unable to find move-out reason dropdown", financialMoveOutPage.confirmMoveOutReasonDropdown());}
    }
}
