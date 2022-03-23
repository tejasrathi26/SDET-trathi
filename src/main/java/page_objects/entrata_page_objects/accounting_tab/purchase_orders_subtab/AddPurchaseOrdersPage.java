package page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddPurchaseOrdersPage extends BasePage {

    public AddPurchaseOrdersPage(WebDriver driver) { super (driver);}

    private final String PROPERTY_NAME = "The Good Child";
    private final String VENDOR_ACCOUNT_NAME =  "21OctR, Corporate";
    private final String GL_ACCOUNT_SEARCH_FIELD_INPUT_VALUE = "1810 : Land";
    private final String LINE_ITEM_RATE_INPUT_FIELD_VALUE = "20.00";
    private final String LINE_ITEM_DESCRIPTION_INPUT_FIELD_VALUE = "AUSTIN IS A BOSS";

    private final By ACCOUNTING_FILTERS_CLOSE_BUTTON = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By PURCHASE_ORDERS_LISTING_SCREEN_ADD_PURCHASE_ORDERS_BUTTON = By.cssSelector("i[class='flat-add transition']");
    private final By ORDERS_PROPERTY_SEARCH = By.id("property_header_dropdown");
    private final By VENDOR_ACCOUNT_SEARCH_FIELD = By.cssSelector("input[class='search-input create-po']");
    private final By VENDOR_ACCOUNT_DROPDOWN_RESULT = By.xpath("//*[text()='testacc']");
    private final By DATEPICKER = By.cssSelector("div[class='form-date datepicker binded']+div");
    private final By VENDOR_ACCOUNT_DROPDOWN = By.cssSelector("div[class='form-select-table-dropdown js-table wide6 ']");
    private final By DATEPICKER_TODAY_BUTTON =  By.cssSelector("button[data-handler='today']");
    private final By GL_ACCOUNT_DROPDOWN = By.id("gl_account_dropdown_0");
    private final By PROPERTY_DROPDOWN_RESULT = By.xpath("//a[contains(text(),' The Good Child')]");
    private final By GL_ACCOUNT_INPUT_SEARCH_FIELD = By.cssSelector("input[class='search-input']");
    private final By GL_ACCOUNT_INPUT_SEARCH_FIELD_RESULT = By.xpath("//*/li[text()='1810 : Land']");
    private final By LINE_ITEM_RATE_INPUT_FIELD = By.id("ap_detail_rate_0");
    private final By LINE_ITEM_DESCRIPTION_INPUT_FIELD = By.id("ap_detail_description_0");
    private final By CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By SUBMIT_BUTTON = By.id("add_purchase_order_submit");
    private final By ADD_PURCHASE_ORDER_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    public boolean ConfirmVisibilityOfAddPurchaseOrdersPropertyDropdown() {return confirmElementIsVisible(ORDERS_PROPERTY_SEARCH);}
    public boolean ClickAddPurchaseOrdersCloseButton() {return clickElement(CLOSE_BUTTON);}
    public boolean ClickCloseVendorFilterButton(){return clickElement(ACCOUNTING_FILTERS_CLOSE_BUTTON);}
    public boolean ClickClosePurchaseOrdersFilterButton() {return clickElement(ACCOUNTING_FILTERS_CLOSE_BUTTON);}
    public boolean ClickAddPurchaseOrdersButton() {return clickElement(PURCHASE_ORDERS_LISTING_SCREEN_ADD_PURCHASE_ORDERS_BUTTON);}
    public boolean ClickAddPurchaseOrdersPropertySearchDropdown(){return clickElement(ORDERS_PROPERTY_SEARCH);}
    public boolean SendKeysToAddPurchaseOrdersPropertySearchField(){return sendKeysToElement(ORDERS_PROPERTY_SEARCH, PROPERTY_NAME);}
    public boolean ClickAddPurchaseOrdersPropertySearchDropdownResult() {return clickElement(PROPERTY_DROPDOWN_RESULT);}
    public boolean SendKeysToAddPurchaseOrdersVendorAccountSearchField() {return sendKeysToElement(VENDOR_ACCOUNT_SEARCH_FIELD, VENDOR_ACCOUNT_NAME);}
    public boolean ClickAddPurchaseOrdersVendorAccountSearchResult() {return clickElement(VENDOR_ACCOUNT_DROPDOWN_RESULT);}
    public boolean ClickAddPurchaseOrdersDatePickerButton() {return clickElement(DATEPICKER);}
    public boolean ClickAddPurchaseOrdersDatePickerTodayButton() {return clickElement(DATEPICKER_TODAY_BUTTON);}
    public boolean ClickAddPurchaseOrdersGLAccountDropdownButton() {return clickElement(GL_ACCOUNT_DROPDOWN);}
    public boolean SendKeysToAddPurchaseOrdersGLAccountInputSearchField() {return sendKeysToElement(GL_ACCOUNT_INPUT_SEARCH_FIELD, GL_ACCOUNT_SEARCH_FIELD_INPUT_VALUE);}
    public boolean ClickAddPurchaseOrdersVendorAccountDropdown() {
        waitForOverlay(ADD_PURCHASE_ORDER_OVERLAY);
        return clickElement(VENDOR_ACCOUNT_DROPDOWN);}
    public boolean ClickAddPurchaseOrdersGLAccountInputSearchFieldResult() {return clickElement(GL_ACCOUNT_INPUT_SEARCH_FIELD_RESULT);}
    public boolean ClickAddPurchaseOrdersLineItemRateInputField() {return clickElement(LINE_ITEM_RATE_INPUT_FIELD);}
    public boolean SendKeysAddPurchaseOrdersLineItemRateInputField() {return sendKeysToElement(LINE_ITEM_RATE_INPUT_FIELD, LINE_ITEM_RATE_INPUT_FIELD_VALUE);}
    public boolean SendKeysToADDPURCHASEORDERSLINEITEMDESCRIPTIONINPUTFIELD() {return sendKeysToElement(LINE_ITEM_DESCRIPTION_INPUT_FIELD, LINE_ITEM_DESCRIPTION_INPUT_FIELD_VALUE);}
    public boolean ClickAddPurchaseOrdersSubmitButton() {return clickElement(SUBMIT_BUTTON);}
}
