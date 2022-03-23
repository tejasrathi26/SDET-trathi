package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalLandingPage extends BasePage {
    public ResidentPortalLandingPage(WebDriver driver) {super(driver);}

    //Variables
    private final By MAKE_PAYMENT_BUTTON = By.cssSelector(".css-wzuq0b");
    private final By PAYMENT_ICON = By.cssSelector("a[href='/app/payments']");
    private final By RESIDENT_INITIALS_BUTTON = By.cssSelector(".css-nbduhy");
    private final By HAMBURGER_MENU = By.cssSelector("button[title='More']");
    private final By PAYMENTS_FROM_MAIN_MENU = By.cssSelector("a[href='/app/payments']");



    //Methods
    public boolean clickMakePaymentButton() { return clickElement(MAKE_PAYMENT_BUTTON, waitTimes.LONG_WAIT);}

    public boolean clickPaymentIcon() { return clickElement(PAYMENT_ICON, waitTimes.DEFAULT_WAIT);}

    public boolean residentInitialsAreVisibleAtTopRightCorner() {return confirmElementIsVisible(RESIDENT_INITIALS_BUTTON, waitTimes.DEFAULT_WAIT);}

    public boolean clickHamburgerMenu() { return clickElement(HAMBURGER_MENU, waitTimes.DEFAULT_WAIT);}

    public boolean clickPaymentsFromMainMenu() { return clickElement(PAYMENTS_FROM_MAIN_MENU);}
}
