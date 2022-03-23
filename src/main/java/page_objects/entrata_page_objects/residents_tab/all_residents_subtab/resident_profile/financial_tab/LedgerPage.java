package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LedgerPage extends BasePage {
    public LedgerPage(WebDriver driver){
        super(driver);}
    private final By ADD_DROPDOWN = By.xpath("//*[@id=\"view_ledger_wrapper\"]/div/div[1]/button");
    private final By ADD_CHARGE = By.linkText("Add Charge");
    private final By ADD_CREDIT = By.linkText("Add Credit");
    private final By ADD_PAYMENT = By.linkText("Add Payment");

    // add charge/payment/credit popup (ids are the same on all 3)
    private final By AMOUNT_FIELD = By.id("transaction_amount");
    private final By CANCEL_BUTTON = By.linkText("Cancel");

    public boolean clickAddDropdown(){return clickElement(ADD_DROPDOWN);}
    public boolean clickAddCharge(){return clickElement(ADD_CHARGE);}
    public boolean clickAddPayment(){return clickElement(ADD_PAYMENT);}
    public boolean clickAddCredit(){return clickElement(ADD_CREDIT);}
    public boolean confirmAmountFieldPresence(){return confirmElementIsVisible(AMOUNT_FIELD);}
    public boolean clickCancel(){return clickElement(CANCEL_BUTTON);}
}
