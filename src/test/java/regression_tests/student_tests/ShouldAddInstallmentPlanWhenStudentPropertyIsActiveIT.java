package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab.InstallmentPlansPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab.PaymentsNav;

import static org.junit.Assert.*;

public class ShouldAddInstallmentPlanWhenStudentPropertyIsActiveIT extends BaseBrowserTest {

    public ShouldAddInstallmentPlanWhenStudentPropertyIsActiveIT(){
        super("campusapartments");}

    @Test
        public void shouldAddInstallmentPlan_whenStudentPropertyIsActive() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        FirstLevelNavigation firstLevelNavigation = new FirstLevelNavigation(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        PaymentsNav paymentsNav = new PaymentsNav(driver);
        InstallmentPlansPage installmentPlansPage = new InstallmentPlansPage(driver);
        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click company subtab", nav.clickPropertiesButton());
        assertTrue("unable to click 114 Earle",propertyListPage.clickEarleProperty());
        assertTrue("unable to click financial tab",firstLevelNavigation.clickFinancialTab());
        assertTrue("unable to click payments subtab",financialNav.clickPaymentsTab());
        assertTrue("unable to click installment plans tab",paymentsNav.clickInstallmentPlans());
        assertTrue("unable to click add student plan", installmentPlansPage.clickAddStudentPlan());
        assertTrue("unable to add installment title", installmentPlansPage.enterInstallmentPlanTitle());
        assertTrue("unable to add installment description", installmentPlansPage.enterInstallmentPlanDescription());
        assertTrue("unable to click payment charge code dropdown",installmentPlansPage.clickPaymentChargeCodeDropdown());
        assertTrue("unable to choose payment charge code",installmentPlansPage.clickPaymentChargeCode());
        assertTrue("unable to click Save and Continue",installmentPlansPage.clickSaveContinue());
        assertTrue("unable to enter percentage of lease charges",installmentPlansPage.enterPercentageOfLeaseCharges());
        assertTrue("unable to enter installment plan date",installmentPlansPage.enterInstallmentDate());
        assertTrue("unable to click save button", installmentPlansPage.clickSaveButton());
        assertEquals("success message text does not match","Installment inserted/updated successfully. ",installmentPlansPage.checkSuccessMessage());
        assertTrue("unable to find added plan",installmentPlansPage.checkAddedPlan());
        assertTrue("unable to click last edit icon",installmentPlansPage.clickLastEditIcon());
        assertTrue("unable to click apply discount switch",installmentPlansPage.clickApplyDiscountSwitch());
        assertTrue("unable to add installment description", installmentPlansPage.enterInstallmentPlanDescription());
        assertTrue("unable to click Save and Continue",installmentPlansPage.clickSaveContinue());
        assertTrue("unable to click save button", installmentPlansPage.clickSaveButton());
        assertTrue("unable to click last pricing icon", installmentPlansPage.clickLastMoneyIcon());
        assertTrue("unable to enter discount amount", installmentPlansPage.enterDiscountAmount());
        assertTrue("unable to click save button",installmentPlansPage.clickSaveDiscount());
        assertTrue("discount amount does not match",installmentPlansPage.checkDiscount());
    }
}
