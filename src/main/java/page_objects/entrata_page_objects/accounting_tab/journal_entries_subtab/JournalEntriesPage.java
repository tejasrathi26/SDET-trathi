package page_objects.entrata_page_objects.accounting_tab.journal_entries_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class JournalEntriesPage extends BasePage {

    private final By JOURNAL_ENTRIES_TABLE = By.id("table-header");
    private final By FILTERS_CLOSE_BUTTON = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By CREDIT_AMOUNT_FIELD = By.id("credit_amount_1");
    private final By CREDIT_DESCRIPTION_FIELD = By.id("gl_detail_memo_1");
    private final By ACCOUNT_1_DROPDOWN_SELECTION = By.id("268830_0");
    private final By ACCOUNT_1_DROPDOWN = By.id("selected_gl_account_0");
    private final By ACCOUNT_2_DROPDOWN_SELECTION = By.id("268841_1");
    private final By ACCOUNT_2_DROPDOWN = By.xpath("//*[@id=\"selected_gl_account_1\"]/i");
    private final By DEBIT_AMOUNT_FIELD = By.id("debit_amount_0");
    private final By DEBIT_DESCRIPTION_FIELD = By.id("gl_detail_memo_0");
    private final By PROPERTY_DROPDOWN_SELECTION = By.cssSelector("a[class='ui-corner-all']");
    private final By PROPERTY_DROPDOWN = By.xpath("//*[@id=\"fast_lookup_property_id\"]/div/i");
    private final By REFERENCE_TEXT_FIELD = By.id("reference");
    private final By ADD_JOURNAL_ENTRY_BUTTON = By.cssSelector("i[class='flat-add transition']");
    private final By POST_JOURNAL_ENTRY_BUTTON = By.id("btn_add_gl_entry_skip_print");
    private final By JOURNAL_ENTRY_ADDED_SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    private final By JOURNAL_ENTRY_LINE_ITEM = By.cssSelector("td[class='align-right']");
    private final By JOURNAL_ENTRY_REVERSE_BUTTON = By.id("reverse_gl_entry");
    private final By REVERSE_JOURNAL_ENTRY_MEMO_FIELD = By.id("gl_header_memo");
    private final By REVERSE_JOURNAL_ENTRY_POPUP_BUTTON = By.id("reverse_je_popup");
    private final By MORE_ACTIONS_BUTTON = By.id("js-more-actions");
    private final By EDIT_JOURNAL_ENTRY_LIST_ITEM = By.id("edit_je");
    private final By EDIT_JOURNAL_ENTRY_SAVE_BUTTON = By.id("btn_update_gl_entry");
    private final By CLOSE_ADD_JOURNAL_ENTRY_CURTAIN_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By SIDE_PANEL_TOOLS_ICON = By.cssSelector("a[data-toolbar-id='view-data-tools-menu']");
    private final By JOURNAL_ENTRIES_TEMPLATES_MENU_ITEM = By.cssSelector("a[onclick*='Journal Entry Templates']");
    private final By JOURNAL_ENTRY_TEMPLATE_TABLE = By.id("scheduled_je_templates");
    private final By ACCRUALS_TOOL_MENU_ITEM = By.cssSelector("a[onclick*='Accruals']");
    private final By ACCRUALS_POPUP_CONTINUE_BUTTON = By.id("filter_accruals");
    private final By PURCHASE_ORDER_RECORDS_TABLE = By.id("js-po-records");
    private final By FIRST_PURCHASE_ORDER_TABLE_ENTRY = By.cssSelector("a[class='po-link']");
    private final By PURCHASE_ORDER_INFORMATION_PANEL = By.id("viewPoContent");

    public JournalEntriesPage(WebDriver driver) {
        super (driver);
    }

    public boolean closeFiltersModal() {
        return clickElement(FILTERS_CLOSE_BUTTON);
    }

    public boolean enterCreditAmount() {
        return sendKeysToElement(CREDIT_AMOUNT_FIELD, "550");
    }

    public boolean enterCreditDescriptionText() {
        return sendKeysToElement(CREDIT_DESCRIPTION_FIELD, "automatedCredit");
    }

    public boolean clickAccount1DropdownSelection() {
        return clickElement(ACCOUNT_1_DROPDOWN_SELECTION);
    }

    public boolean clickAccount1Dropdown() {
        return clickElement(ACCOUNT_1_DROPDOWN);
    }

    public boolean clickAccount2DropdownSelection() {
        return clickElement(ACCOUNT_2_DROPDOWN_SELECTION);
    }

    public boolean clickAccount2Dropdown() {
        return clickElement(ACCOUNT_2_DROPDOWN);
    }

    public boolean enterDebitAmount() {
        return sendKeysToElement(DEBIT_AMOUNT_FIELD, "550");
    }

    public boolean enterDebitDescriptionText () {
        return sendKeysToElement(DEBIT_DESCRIPTION_FIELD, "automatedDebit");
    }

    public boolean clickPropertyDropdownSelection() {
        return clickElement(PROPERTY_DROPDOWN_SELECTION);
    }

    public boolean clickPropertyDropdown() {
        return clickElement(PROPERTY_DROPDOWN);
    }

    public boolean addReferenceText() {
        return sendKeysToElement(REFERENCE_TEXT_FIELD, "automationTest");
    }

    public boolean clickAddJEButton() {
        return clickElement(ADD_JOURNAL_ENTRY_BUTTON);
    }

    public boolean clickPostJE() {
        return clickElement(POST_JOURNAL_ENTRY_BUTTON);
    }

    public boolean checkForSuccessMessage() {
        return confirmElementIsVisible(JOURNAL_ENTRY_ADDED_SUCCESS_MESSAGE);
    }

    public boolean clickJELineItem() {
        return clickElement(JOURNAL_ENTRY_LINE_ITEM);
    }

    public boolean clickReverseJE() {
        return clickElement(JOURNAL_ENTRY_REVERSE_BUTTON);
    }

    public boolean enterReverseJEMemo() {
        return sendKeysToElement(REVERSE_JOURNAL_ENTRY_MEMO_FIELD, "Test Memo");
    }

    public boolean clickReverseJEPopupButton() {
        return clickElement(REVERSE_JOURNAL_ENTRY_POPUP_BUTTON);
    }

    public boolean clickMoreActionsButton() {
        return clickElement(MORE_ACTIONS_BUTTON);
    }

    public boolean clickEditJEListItem() {
        return clickElement(EDIT_JOURNAL_ENTRY_LIST_ITEM);
    }

    public boolean clickEditJESaveButton() {
        return clickElement(EDIT_JOURNAL_ENTRY_SAVE_BUTTON);
    }

    public boolean verifyAddJournalEntryCurtain() {
        return confirmElementIsVisible(REFERENCE_TEXT_FIELD);
    }

    public boolean closeAddJournalEntryCurtain() {
        return clickElement(CLOSE_ADD_JOURNAL_ENTRY_CURTAIN_BUTTON);
    }

    public boolean hoverToolsButton() {
        return moveToAnElementWithActions(SIDE_PANEL_TOOLS_ICON);
    }

    public boolean clickJournalEntriesTemplatesMenuItem() {
        return clickElement(JOURNAL_ENTRIES_TEMPLATES_MENU_ITEM);
    }

    public boolean verifyJournalEntryTemplatesCurtain() {
        return confirmElementIsVisible(JOURNAL_ENTRY_TEMPLATE_TABLE);
    }

    public boolean closeJournalEntryTemplatesCurtain() {
        return clickElement(CLOSE_ADD_JOURNAL_ENTRY_CURTAIN_BUTTON);
    }

    public boolean verifyJournalEntriesTable() {
        return confirmElementIsVisible(JOURNAL_ENTRIES_TABLE);
    }

    public boolean clickAccrualsMenuItem() {
        return clickElement(ACCRUALS_TOOL_MENU_ITEM);
    }

    public boolean clickAccrualsContinueButton() {
        return clickElement(ACCRUALS_POPUP_CONTINUE_BUTTON);
    }

    public boolean verifyPurchaseOrderRecordsTable() {
        return confirmElementIsVisible(PURCHASE_ORDER_RECORDS_TABLE);
    }

    public boolean clickFirstLineItemInPurchaseOrderRecordsTable() {
        return clickElement(FIRST_PURCHASE_ORDER_TABLE_ENTRY);
    }

    public boolean verifyPurchaseOrderInformationPanel() {
        return confirmElementIsVisible(PURCHASE_ORDER_INFORMATION_PANEL);
    }

}