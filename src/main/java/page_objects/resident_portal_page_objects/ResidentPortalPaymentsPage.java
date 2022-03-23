package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalPaymentsPage extends BasePage {
    public ResidentPortalPaymentsPage(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By WALLET_TAB = By.cssSelector("a[href='/app/payments/wallet']");
    private final By ADD_NEW_PAYMENT_METHOD = By.cssSelector("a[href=[/app/payments/add-payment-method']");
    private final By MAKE_PAYMENT_BUTTON = By.cssSelector("a[href='/app/payments/make-payment']");

    //Methods
    public boolean clickWalletTab() { return clickElement(WALLET_TAB, waitTimes.UNREASONABLE_WAIT);}

    public boolean clickAddNewPaymentMethod() { return clickElement(ADD_NEW_PAYMENT_METHOD, waitTimes.DEFAULT_WAIT);}

    public boolean clickMakePaymentButton() { return clickElement(MAKE_PAYMENT_BUTTON, waitTimes.DEFAULT_WAIT);}

}
