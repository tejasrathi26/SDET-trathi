package regression_tests.accounting_suite_tests.add_purchase_order_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.AddPurchaseOrdersPage;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.PurchaseOrdersListingScreenPage;
import page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab.ViewPurchaseOrderPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAddPurchaseOrderIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAddPurchaseOrderIT() {
        super("karenbertelli");
    }

    @Test
    public void AddPurchaseOrderTest() {

        AddPurchaseOrdersPage testPurchaseOrders = new AddPurchaseOrdersPage(driver);
        PurchaseOrdersListingScreenPage testPurchaseOrdersListingScreen = new PurchaseOrdersListingScreenPage(driver);
        ViewPurchaseOrderPage testViewPurchaseOrder = new ViewPurchaseOrderPage(driver);
        EntrataNavBar navBar = new EntrataNavBar(driver);

        assertTrue("Failed to click Accounting tab", navBar.clickAccountingTab());
        assertTrue("Failed to click close button for Vendor Filter", testPurchaseOrders.ClickCloseVendorFilterButton());
        assertTrue("Failed to click Purchase Orders", navBar.clickPurchaseOrderListingScreen());
        assertTrue("Failed to click close button for Purchase Orders", testPurchaseOrders.ClickClosePurchaseOrdersFilterButton());
        assertTrue("Failed to click on Add Purchase Orders Button", testPurchaseOrders.ClickAddPurchaseOrdersButton());
        assertTrue("Failed to click on Add Purchase Orders Property Dropdown",testPurchaseOrders.ClickAddPurchaseOrdersPropertySearchDropdown());
        assertTrue("Failed to send keys to Add Purchase Orders Property Search Dropdown", testPurchaseOrders.SendKeysToAddPurchaseOrdersPropertySearchField());
        assertTrue("Failed to click on Add purchase orders property dropdown", testPurchaseOrders.ClickAddPurchaseOrdersPropertySearchDropdownResult());
        assertTrue("Failed to click on Add Purchase Orders Vendor/Account Dropdown", testPurchaseOrders.ClickAddPurchaseOrdersVendorAccountDropdown());
        assertTrue("Failed to send keys to Add Purchase Orders Vendor/Account Input Search Field", testPurchaseOrders.SendKeysToAddPurchaseOrdersVendorAccountSearchField());
        assertTrue("Failed to click on add Purchase Orders Vendor Account Search Results", testPurchaseOrders.ClickAddPurchaseOrdersVendorAccountSearchResult());
        assertTrue("Failed to click on Add Purchase Orders Date Picker", testPurchaseOrders.ClickAddPurchaseOrdersDatePickerButton());
        assertTrue("Failed to click the add purchase order date picker today button", testPurchaseOrders.ClickAddPurchaseOrdersDatePickerTodayButton());
        assertTrue("Failed to click the add purchase order GL Account drop down", testPurchaseOrders.ClickAddPurchaseOrdersGLAccountDropdownButton());
        assertTrue("Failed to send keys to add Purchase Orders GL Account Input field", testPurchaseOrders.SendKeysToAddPurchaseOrdersGLAccountInputSearchField());
        assertTrue("Failed to click on Add Purchase Orders GL Account Input Field Results", testPurchaseOrders.ClickAddPurchaseOrdersGLAccountInputSearchFieldResult());
        assertTrue("Failed to click add Purchase Orders Line item Rate Input Field", testPurchaseOrders.ClickAddPurchaseOrdersLineItemRateInputField());
        assertTrue("Failed to send keys to add Purchase Orders Line item Rate Input Field", testPurchaseOrders.SendKeysAddPurchaseOrdersLineItemRateInputField());
        assertTrue("Failed to click on Add Purchase Orders GL Account Description Input Field", testPurchaseOrders.SendKeysToADDPURCHASEORDERSLINEITEMDESCRIPTIONINPUTFIELD());
        assertTrue("Failed to click add purchase orders submit button", testPurchaseOrders.ClickAddPurchaseOrdersSubmitButton());
        assertTrue("Failed to Confirm Visibility of add purchase order success message", testPurchaseOrdersListingScreen.ConfirmVisibilityOfPurchaseOrdersListingScreenAddPurchaseOrderSuccessMessage());
        assertTrue("Failed to click the Purchase Order Listing Screen First Purchase Order", testPurchaseOrdersListingScreen.ClickPurchaseOrderListingScreenRandomPurchaseOrder());
        assertTrue("Failed to click the view purchase order approval button", testViewPurchaseOrder.ClickViewPurchaseOrderApprovalButton());
        assertTrue("Failed to Confirm Visibility of message, Purchase order approved successfully.", testPurchaseOrdersListingScreen.ConfirmVisibilityOfPurchaseOrdersListingScreenAddPurchaseOrderSuccessMessage());
    }
}
