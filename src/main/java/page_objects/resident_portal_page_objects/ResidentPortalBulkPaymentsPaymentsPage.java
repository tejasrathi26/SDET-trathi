package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalBulkPaymentsPaymentsPage extends BasePage {
    public ResidentPortalBulkPaymentsPaymentsPage(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By MAKE_A_PAYMENT_BUTTON = By.cssSelector("a[href='/app/payments/bulk-payment/make-a-payment']");


    //Methods
    public boolean clickMakeAPaymentButtonForABulkPayment() {
        return clickElement(MAKE_A_PAYMENT_BUTTON, waitTimes.DEFAULT_WAIT);
    }
}
