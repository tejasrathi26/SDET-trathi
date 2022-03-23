package page_objects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalLoginPage extends BasePage {
    public ResidentPortalLoginPage(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By ADVANCED_BUTTON = By.id("details-button");
    private final By PROCEED_LINK = By.id("proceed-link");
    private final By USERNAME = By.id("username");
    private final By PASSWORD = By.name("password");
    private final By LOGIN_BUTTON = By.cssSelector(".ehlti5m0");
    private final By NEED_TO_SIGN_UP_LINK = By.cssSelector("footer[href='/auth/signup']");
    private final By FORGOT_PASSWORD = By.cssSelector("footer[href='/auth/reset-password']");

    //Bulk Payment Login
    private final By MAKE_A_BULK_PAYMENT_BUTTON = By.xpath("//*[contains(text(), 'Make a Bulk Payment')]");


    //Methods
    public boolean clickAdvancedButton() {
        return clickElement(ADVANCED_BUTTON);
    }

    public boolean clickProceedLink() {
        return clickElement(PROCEED_LINK);
    }

    public boolean needToSignUpLinkIsVisible() {
        return confirmElementIsInvisible(NEED_TO_SIGN_UP_LINK);
    }

    public boolean forgotPasswordLinkIsVisible() {
        return confirmElementIsInvisible(FORGOT_PASSWORD);
    }

    //Login Methods
    public boolean enterEmailToResidentLogin(String username) {
        return sendKeysToElement(USERNAME, username);
    }

    public boolean enterPasswordToResidentLogin(String password) {
        return sendKeysToElement(PASSWORD, password);
    }

    public boolean clickLogInButton() {
        return clickElement(LOGIN_BUTTON);
    }

    public boolean clickMakeABulkPaymentButton() {
        return clickElement(MAKE_A_BULK_PAYMENT_BUTTON, waitTimes.DEFAULT_WAIT);
    }


}
