package page_objects.entrata_page_objects.accounting_tab.reconciliations_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ReconciliationsPage extends BasePage {

    public ReconciliationsPage(WebDriver driver) { super (driver);}

    private final By FILTER_CLOSE_BUTTON = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By ADD_REC = By.cssSelector("i[class='flat-add transition']");
    private final By RECONCILE_BANK_ACCOUNT = By.id("navigation_item_reconcile_bank_account");
    private final By RECONCILE_ACCOUNT_FORM = By.id("bank_reconciliation_form");
    private final By RECONCILE_BANK_ACCOUNT_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By RECONCILE_CREDIT_CARD_ACCOUNT = By.id("navigation_item_reconcile_credit_card_bank_account");
    private final By RECONCILE_CREDIT_CARD_ACCOUNT_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");
    private final By FIRST_REC = By.cssSelector("tr[class='aRow js-gl-reconciliation-report']");
    private final By REC_CONTAINER = By.id("gl_reconciliation_report");
    private final By FIRST_REC_CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");

    public boolean ClickReconciliationsListingScreenRecFilterCloseButton() {return clickElement(FILTER_CLOSE_BUTTON);}
    public boolean ClickReconciliationsListingScreenAddRec() {return clickElement(ADD_REC);}
    public boolean ClickReconciliationsListingScreenReconcileBankAccount() {return clickElement(RECONCILE_BANK_ACCOUNT, waitTimes.LONG_WAIT);}
    public boolean ClickReconciliationsListingScreenReconcileAccountForm() {return clickElement(RECONCILE_ACCOUNT_FORM);}
    public boolean ClickReconciliationsListingScreenReconcileBankAccountCloseButton() {return clickElement(RECONCILE_BANK_ACCOUNT_CLOSE_BUTTON);}
    public boolean ClickReconciliationsListingScreenReconcileCreditCardAccount() {return clickElement(RECONCILE_CREDIT_CARD_ACCOUNT);}
    public boolean ClickReconciliationsListingScreenReconcileCreditCardAccountCloseButton() {return clickElement(RECONCILE_CREDIT_CARD_ACCOUNT_CLOSE_BUTTON);}
    public boolean ClickReconciliationsListingScreenFirstRec() {return clickElement(FIRST_REC);}
    public boolean ClickReconciliationsListingScreenRecContainer() {return clickElement(REC_CONTAINER);}
    public boolean ClickReconciliationsListingScreenFirstRecCloseButton() {return clickElement(FIRST_REC_CLOSE_BUTTON);}
}
