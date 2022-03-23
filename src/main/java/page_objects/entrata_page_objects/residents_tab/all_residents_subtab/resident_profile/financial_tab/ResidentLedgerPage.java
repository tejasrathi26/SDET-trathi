package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentLedgerPage extends BasePage {
    public ResidentLedgerPage(WebDriver driver) {
        super(driver);
    }
    //Variables

    private final By ADD_DROPDOWN_BUTTON = By.className("dropdown-toggle");
    private final By ADD_PAYMENT_LIST_OPTION = By.xpath("//*[contains(text(), 'Add Payment')]");
    private final By PAYMENT_TYPE = By.id("payment_type");
    private final By PAYMENT_CODE = By.xpath("//*[contains(text(), 'Payment Code')]");
    private final By AMOUNT = By.id("transaction_amount");
    private final By CHECK_NUMBER = By.id("ar_payment_check_number");
    private final By DATE_RECEIVED = By.className("req");
    private final By NOTES = By.name("ar_payment[payment_memo]");
    private final By ALLOCATION_FOR_CHARGES = By.xpath("//*[contains(text(), 'Apply this payment to the following charges:')]");
    private final By QUICK_VIEW_EDIT_BUTTON = By.cssSelector("div[class='button']");
    private final By QUICK_VIEW_PASSWORD_FIELD = By.id("qc_password");
    private final By QUICK_VIEW_SAVE_BUTTON = By.xpath("//*[@id=\"edit_quick_view\"]/dl[5]/div/div/input");
    private final By RECURRING_PAYMENT_LINK = By.id("scheduled_payments");
    private final By ADD_RECURRING_PAYMENT = By.cssSelector("a[class='button action right']");



    //Page Methods

    public boolean clickOnAddButtonDropDown() {
        return clickElement(ADD_DROPDOWN_BUTTON, waitTimes.DEFAULT_WAIT);
    }

    public boolean clickOnAddPayment() {
        return clickElement(ADD_PAYMENT_LIST_OPTION, waitTimes.DEFAULT_WAIT);
    }

    public boolean paymentTypeIsVisible() {
        return confirmElementIsVisible(PAYMENT_TYPE, waitTimes.DEFAULT_WAIT);
    }

    public boolean paymentCodeIsVisible() {
        return confirmElementIsVisible(PAYMENT_CODE, waitTimes.DEFAULT_WAIT);
    }

    public boolean amountIsVisible() {
        return confirmElementIsVisible(AMOUNT, waitTimes.DEFAULT_WAIT);
    }

    public boolean addAmount() {
        return sendKeysToElement(AMOUNT, "1.00", waitTimes.DEFAULT_WAIT);
    }

    public boolean checkNumberIsVisible() {
        return confirmElementIsVisible(CHECK_NUMBER, waitTimes.DEFAULT_WAIT);
    }

    public boolean dateReceivedIsVisible() {
        return confirmElementIsVisible(DATE_RECEIVED, waitTimes.DEFAULT_WAIT);
    }

    public boolean notesIsVisible() {
        return confirmElementIsVisible(NOTES, waitTimes.DEFAULT_WAIT);
    }

    public boolean allocationForCharges() { return confirmElementIsVisible(ALLOCATION_FOR_CHARGES, waitTimes.DEFAULT_WAIT); }

    public boolean clickQuickViewEditButton() {
        return clickElement(QUICK_VIEW_EDIT_BUTTON, waitTimes.DEFAULT_WAIT);
    }

    public boolean addPasswordToQuickView() { return sendKeysToElement(QUICK_VIEW_PASSWORD_FIELD, "Password1", waitTimes.DEFAULT_WAIT); }

    public boolean clickQuickViewSaveButton() {
        return clickElement(QUICK_VIEW_SAVE_BUTTON, waitTimes.DEFAULT_WAIT);
    }

    public boolean clearPasswordField() { return elementClearTextField(QUICK_VIEW_PASSWORD_FIELD, waitTimes.DEFAULT_WAIT); }

    public boolean clickRecurringPaymentLink() { return clickElement(RECURRING_PAYMENT_LINK, waitTimes.DEFAULT_WAIT);}

    public boolean clickAddPaymentForRecurring() { return clickElement(ADD_RECURRING_PAYMENT, waitTimes.DEFAULT_WAIT);}


}
