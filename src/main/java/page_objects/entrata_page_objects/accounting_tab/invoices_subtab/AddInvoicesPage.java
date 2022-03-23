package page_objects.entrata_page_objects.accounting_tab.invoices_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import static utils.RandomGenerator.randomNumber;

public class AddInvoicesPage extends BasePage {

    public AddInvoicesPage(WebDriver driver) {super(driver);}

    private final String PROPERTY_NAME = "The Good Child";
    private final String AP_PAYEE_NAME = "The New Name 3, sstandard release";
    private final String INVOICE_NUMBER = randomNumber();
    private final String INVOICE_TOTAL_VALUE = "20.00";
    private final String GL_ACCOUNT_SEARCH_FIELD_INPUT_VALUE = "8055 : Test_GL";

    private final By PROPERTY_SEARCH = By.id("property_header_dropdown");
    private final By PROPERTY_AUTO_COMPLETE_ITEM = By.cssSelector("a[id*='ui-id']");
    private final By AP_PAYEES_SEARCH_FIELD = By.id("ap_payees_dropdown");
    private final By AP_PAYEE_AUTO_COMPLETE_ITEM = By.cssSelector("td[title='00 -  The New Name 3, sstandard release ']");
    private final By INVOICE_AP_HEADER_ID_INPUT_FIELD = By.name("ap_header[header_number]");
    private final By INVOICE_TOTAL_INPUT_FIELD = By.name("masked-ap_header[transaction_amount]");
    private final By DATEPICKER = By.cssSelector("div[class='form-date datepicker invoice_date binded']+div"); //cssSelector did not work div[class="form-icon date ui-datepicker-trigger"]
    private final By DATEPICKER_TODAY_BUTTON =  By.cssSelector("button[data-handler='today']");
    private final By GL_ACCOUNT_FIELD = By.xpath("//*[@id='gl_account_dropdown_0']/i");
    private final By GL_ACCOUNT_INPUT_FIELD = By.cssSelector("input[placeholder='Search...']");
    private final By GL_ACCOUNT_AUTO_COMPLETE_RESULT_ITEM = By.cssSelector("li[value='325033']");
    private final By SAVE_INVOICE_BUTTON = By.id("add_invoice_submit");
    private final By DUPLICATE_INVOICE_ALERT = By.id("vendor_exists_error_popup");
    private final By DUPLICATE_INVOICE_CONFIRMATION_CONTINUE_BUTTON = By.id("continue");
    private final By DISTRIBUTE_ON_LINE_ITEMS_BUTTON = By.id("btnDistributeOnLineItems");
    private final By SUCCESS_MESSAGE_BANNER = By.cssSelector("p[class='alert success slim']");
    private final By ADD_INVOICE_FORM = By.id("modal_container0");
    private final By CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");

    public boolean ConfirmVisibilityOfInvoiceListingScreenAddInvoiceContainer() {return confirmElementIsVisible(ADD_INVOICE_FORM);}
    public boolean ClickInvoiceListingScreenAddInvoicePropertySearchDropdown(){return clickElement(PROPERTY_SEARCH);}
    public boolean SendKeysToInvoiceListingScreenAddInvoicePropertySearchField(){return sendKeysToElement(PROPERTY_SEARCH, PROPERTY_NAME);}
    public boolean MoveToInvoiceListingScreenAddInvoiceAutoCompletePropertyDropdown(){return moveToAnElementWithActions(PROPERTY_AUTO_COMPLETE_ITEM);}
    public boolean ClickOnInvoiceListingScreenAddInvoiceAutoCompletePropertyDropdown(){return clickElement(PROPERTY_AUTO_COMPLETE_ITEM);}
    public boolean SendKeysToInvoiceListingScreenAddInvoiceApPayeesSearchField(){return sendKeysToElement(AP_PAYEES_SEARCH_FIELD, AP_PAYEE_NAME);}
    public boolean MoveToInvoiceListingScreenAddInvoiceAutoCompleteApPayeesDropdown(){return moveToAnElementWithActions(AP_PAYEE_AUTO_COMPLETE_ITEM);}
    public boolean ClickOnInvoiceListingScreenAddInvoiceAutoCompleteApPayeesDropdown(){return clickElement(AP_PAYEE_AUTO_COMPLETE_ITEM);}
    public boolean SendKeysToInvoiceListingScreenAddInvoiceInvoiceNumberInputField() {return sendKeysToElement(INVOICE_AP_HEADER_ID_INPUT_FIELD, INVOICE_NUMBER);}
    public boolean ClickOnInvoiceListingScreenAddInvoiceDistributeLineItemButton() {
        return clickElement(DISTRIBUTE_ON_LINE_ITEMS_BUTTON);
    }
    public boolean SendKeysToInvoiceListingScreenAddInvoiceInvoiceTotalInputField() {return sendKeysToElement(INVOICE_TOTAL_INPUT_FIELD, INVOICE_TOTAL_VALUE);}
    public boolean ClickOnInvoiceListingScreenAddInvoiceDatePickerCalendarDays() {return clickElement(DATEPICKER);}
    public boolean ClickOnInvoiceListingScreenAddInvoiceDatePickerTodayButton() {return clickElement(DATEPICKER_TODAY_BUTTON);}
    public boolean ClickOnInvoiceListingScreenAddInvoiceGLAccountInputField() {return clickElement(GL_ACCOUNT_FIELD);}
    public boolean SendKeysToInvoiceListingScreenAddInvoiceGLAccountSearchFieldInput() {return sendKeysToElement(GL_ACCOUNT_INPUT_FIELD, GL_ACCOUNT_SEARCH_FIELD_INPUT_VALUE);}
    public boolean ClickOnInvoiceListingScreenAddInvoiceGLAccountAutoCompleteResult() {return clickElement(GL_ACCOUNT_AUTO_COMPLETE_RESULT_ITEM);}
    public boolean ClickOnInvoiceListingScreenAddInvoiceSaveInvoiceButton() {return clickElement(SAVE_INVOICE_BUTTON);}
    public boolean ConfirmVisibilityOfInvoiceListingScreenAddInvoiceSuccessMessageBanner() {return confirmElementIsVisible(SUCCESS_MESSAGE_BANNER);}
    public boolean ClickInvoiceListingScreenAddInvoiceInvoiceTotalInputField() {duplicateInvoiceAlert(); return clickElement(INVOICE_TOTAL_INPUT_FIELD);}
    public boolean ClickInvoiceListingScreenAddInvoiceCloseButton() {return clickElement(CLOSE_BUTTON);}
    private void duplicateInvoiceAlert() {
        try {
            if (confirmElementIsVisible(DUPLICATE_INVOICE_ALERT)) {
                clickElement(DUPLICATE_INVOICE_CONFIRMATION_CONTINUE_BUTTON);
                System.out.println("Confirmed duplicate invoice. Continue button was clicked.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
