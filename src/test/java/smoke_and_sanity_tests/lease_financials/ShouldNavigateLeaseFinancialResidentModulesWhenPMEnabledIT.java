package smoke_and_sanity_tests.lease_financials;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.ar_payments_subtab.ARPaymentsPage;
import page_objects.entrata_page_objects.residents_tab.ar_payments_subtab.BulkPaymentsPage;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.ChargesPage;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.PostRecurringChargesPage;

import static org.junit.Assert.*;

public class ShouldNavigateLeaseFinancialResidentModulesWhenPMEnabledIT extends BaseBrowserTest {
    public ShouldNavigateLeaseFinancialResidentModulesWhenPMEnabledIT(){
        super("campusapartments");}
    @Test
    public void shouldNavigateToARPaymentsAndChargesPages_whenPMEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        ARPaymentsPage arPaymentsPage = new ARPaymentsPage(driver);
        BulkPaymentsPage bulkPaymentsPage = new BulkPaymentsPage(driver);
        ChargesPage chargesPage = new ChargesPage(driver);
        PostRecurringChargesPage postRecurringChargesPage = new PostRecurringChargesPage(driver);
        assertTrue("unable to click Residents Tab",nav.clickResidentsTab());
        assertTrue("unable to click AR Payments Tab", nav.clickARPaymentsTab());
        assertTrue("unable to click add bulk payments",arPaymentsPage.clickAddBulkPayments());
        assertTrue("unable to find number of payments field",bulkPaymentsPage.verifyNumberOfPaymentField());
        assertTrue("cannot click cancel", bulkPaymentsPage.clickCancel());
        assertTrue("cannot click close", bulkPaymentsPage.clickClose());
        assertTrue("cannot click Charges Tab", nav.clickChargesTab());
        assertTrue("unable to find tools icon", chargesPage.moveToToolsIcon());
        assertTrue("unable to click post recurring charges", chargesPage.clickPostRecurringCharges());
        assertTrue("unable to find apply Button",postRecurringChargesPage.verifyApplyButtonPresent());


    }

}
