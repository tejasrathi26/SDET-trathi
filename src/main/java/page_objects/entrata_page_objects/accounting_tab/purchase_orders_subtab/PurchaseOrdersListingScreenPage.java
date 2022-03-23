package page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PurchaseOrdersListingScreenPage extends BasePage {

    public PurchaseOrdersListingScreenPage(WebDriver driver) { super (driver);}

    //Purchase Orders Listing Page Tools
    private final By TOOL_MENU_BUTTON = By.cssSelector("a[data-toolbar-id='view-data-tools-menu']");
    private final By TOOL_PURCHASE_ORDER_TEMPLATES = By.xpath("//*[text()='Purchase Order Templates']");
    private final By TOOL_APPROVE_PURCHASE_ORDERS = By.xpath("//*[text()='Approve Purchase Orders']");
    private final By TOOL_PURCHASING = By.xpath("//*[text()='Purchasing']");
    private final By TOOL_RECEIVE_ITEMS = By.xpath("//*[text()='Receive Items']");
    private final By TOOL_IMPORT_PURCHASE_ORDERS = By.xpath("//*[text()='Import Purchase Orders']");
    private final By TOOL_IMPORT_PURCHASE_ORDERS_CONTAINER = By.id("import_purchase_orders_div");
    private final By TOOL_RECEIVE_ITEMS_CONTAINER = By.id("receive_items_container");
    private final By TOOL_PURCHASING_CONTAINER = By.id("frm_maintenance_request_materials");
    private final By TOOL_APPROVE_PURCHASE_ORDERS_LIST_CONTAINER = By.id("approved_purchase_orders_list_container");
    private final By TOOL_PURCHASE_ORDER_TEMPLATES_LIST_CONTAINER = By.id("main_purchase_order_template_container");
    private final By TOOL_PURCHASE_ORDER_TEMPLATES_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_APPROVE_PURCHASE_ORDERS_CLOSE_BUTTON = By.xpath("//*[text()='Close']");
    private final By TOOL_PURCHASING_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_RECEIVE_ITEMS_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By TOOL_IMPORT_PURCHASE_ORDERS_CLOSE_BUTTON = By.xpath("//*[text()='Close']");
    private final By FIRST_PURCHASE_ORDER = By.cssSelector("tr[class='aRow js-load-po-details']");
    private final By FIRST_PURCHASE_ORDER_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By PURCHASE_ORDER_SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");

    public boolean ClickPurchaseOrdersListingScreenToolMenu() {return clickElement(TOOL_MENU_BUTTON);}
    public boolean ClickPurchaseOrdersListingScreenToolPurchaseOrderTemplates() {return clickElement(TOOL_PURCHASE_ORDER_TEMPLATES);}
    public boolean ClickPurchaseOrdersListingScreenToolPurchaseOrderTemplatesCloseButton() {return clickElement(TOOL_PURCHASE_ORDER_TEMPLATES_CLOSE_BUTTON);}
    public boolean ClickPurchaseOrdersListingScreenToolApprovePurchaseOrders() {return clickElement(TOOL_APPROVE_PURCHASE_ORDERS);}
    public boolean ConfirmVisibilityOfPurchaseOrdersListingsScreenToolApprovePurchaseOrdersListContainer() {return confirmElementIsVisible(TOOL_APPROVE_PURCHASE_ORDERS_LIST_CONTAINER);}
    public boolean ClickPurchaseOrdersListingScreenToolApprovePurchaseOrdersCloseButton() {return clickElement(TOOL_APPROVE_PURCHASE_ORDERS_CLOSE_BUTTON);}
    public boolean ConfirmVisibilityOfPurchaseOrdersListingsScreenToolPurchaseOrdersTemplateListContainer() {return confirmElementIsVisible(TOOL_PURCHASE_ORDER_TEMPLATES_LIST_CONTAINER);}
    public boolean ClickPurchaseOrdersListingScreenToolPurchasing() {return clickElement(TOOL_PURCHASING, waitTimes.LONG_WAIT);}
    public boolean ConfirmVisibilityOfPurchaseOrdersListingScreenToolPurchasingContainer() {return confirmElementIsVisible(TOOL_PURCHASING_CONTAINER);}
    public boolean ClickPurchaseOrdersListingScreenToolPurchasingCloseButton() {return clickElement(TOOL_PURCHASING_CLOSE_BUTTON);}
    public boolean ClickPurchaseOrdersListingScreenToolReceiveItems() {return clickElement(TOOL_RECEIVE_ITEMS);}
    public boolean ConfirmVisibilityOfPurchaseOrdersListingScreenToolReceiveItemsContainer() {return confirmElementIsVisible(TOOL_RECEIVE_ITEMS_CONTAINER);}
    public boolean ClickPurchaseOrdersListingScreenToolReceiveItemsCloseButton() {return clickElement(TOOL_RECEIVE_ITEMS_CLOSE_BUTTON);}
    public boolean ClickPurchaseOrdersListingScreenToolImportPurchaseOrders() {return clickElement(TOOL_IMPORT_PURCHASE_ORDERS);}
    public boolean ClickPurchaseOrdersListingScreenToolImportPurchaseOrdersCloseButton() {return clickElement(TOOL_IMPORT_PURCHASE_ORDERS_CLOSE_BUTTON);}
    public boolean ConfirmVisibilityOfPurchaseOrdersListingScreenToolImportPurchaseOrdersContainer() {return confirmElementIsVisible(TOOL_IMPORT_PURCHASE_ORDERS_CONTAINER);}
    public boolean ClickPurchaseOrderListingScreenRandomPurchaseOrder() {return clickElement(FIRST_PURCHASE_ORDER);}
    public boolean ClickPurchaseOrderListingScreenRandomPurchaseOrderCloseButton() {return clickElement(FIRST_PURCHASE_ORDER_CLOSE_BUTTON);}
    public boolean ConfirmVisibilityOfPurchaseOrdersListingScreenAddPurchaseOrderSuccessMessage() {return confirmElementIsVisible(PURCHASE_ORDER_SUCCESS_MESSAGE);}
}
