package page_objects.login;

import navigation.Navigator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientAdminLoginPage extends BasePage {

    private final String CLIENTADMIN_TRUNK_URL = "https://clientadmin.trunk.entratadev.com/";
    private final By USERNAME_INPUT = By.name("ctl00$ContentPlaceHolder1$UsernameTextBox");
    private final By PASSWORD_INPUT = By.name("ctl00$ContentPlaceHolder1$PasswordTextBox");
    private final String LEASING_CENTER_USERNAME = "sshah";
    private final By ADMIN_LOGIN_OPTION = By.className("admin_saml_login");
    private final By ADVANCE_BUTTON_LOCATOR = By.id("details-button");
    private final By PROCEED_LINK_LOCATOR = By.id("proceed-link");

    public ClientAdminLoginPage (WebDriver driver){
        super(driver);
    }

    public Navigator navigateToClientAdmin;

    public void navigateToClientAdminTrunk(){
        navigateToClientAdmin = new Navigator((driver));
        navigateToClientAdmin.navigateToGivenUrl(CLIENTADMIN_TRUNK_URL);
    }

    public boolean enterUsername(String username){
        return sendKeysToElement(USERNAME_INPUT, username);
    }

    public boolean enterPassword(String password){
        return sendKeysToElement(PASSWORD_INPUT, password);
    }

    public boolean pressEnterOnPassword(){
        return pressEnter(PASSWORD_INPUT);
    }

    public boolean enterScreeningUsername(String username){
        if(System.getProperty("certificatesExpiredBanner").equalsIgnoreCase("true")){
            clickElement(ADVANCE_BUTTON_LOCATOR, waitTimes.SHORT_WAIT);
            clickElement(PROCEED_LINK_LOCATOR, waitTimes.SHORT_WAIT);
        }
        return sendKeysToElement(USERNAME_INPUT,username);
    }

    public boolean enterScreeningPassword(String password){
        return  sendKeysToElement(PASSWORD_INPUT,password);
    }

    public boolean enterLeasingCenterUsername() { return sendKeysToElement(USERNAME_INPUT,LEASING_CENTER_USERNAME); }
}
