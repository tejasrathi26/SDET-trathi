package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FBPage_TransmissionLogCurtain extends BasePage {

    //Constructor
    public FBPage_TransmissionLogCurtain(WebDriver driver) {
        super(driver);
    }

    //Transmission Log element Locators
    private final By FB_PAGE_TRANSMISSION_LOG_WINDOW_LOCATOR = By.id("trans-log");
    private final By FB_PAGE_TRANS_LOG_PROPERTY_NODE_LOCATOR = By.xpath("//span[text()='Property']");
    private final By FB_PAGE_TRANS_LOG_LOCATION_NODE_LOCATOR = By.xpath("//span[text()='Location']");
    private final By FB_PAGE_TRANS_LOG_DETAILS_NODE_LOCATOR = By.xpath("//span[text()='Details']");
    private final By FB_PAGE_TRANS_LOG_HOURS_NODE_LOCATOR = By.xpath("//span[text()='Hours']");
    private final By FB_PAGE_TRANS_LOG_CURRENT_DATA_TOGGLE_LOCATOR = By.cssSelector("div[data-pattern='switchbutton']");

    //Property Node Details
    private final By FB_PAGE_TRANS_LOG_PROPERTY_NAME_LOCATOR = By.cssSelector("h3[class='margin15-bottom']");

    //Methods
    public boolean confirmTransmissionLogOpened_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TRANSMISSION_LOG_WINDOW_LOCATOR);
    }

    public boolean confirmPropertyNodeVisible_TransmissionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TRANS_LOG_PROPERTY_NODE_LOCATOR);
    }

    public boolean confirmLocationNodeVisible_TransmissionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TRANS_LOG_LOCATION_NODE_LOCATOR);
    }

    public boolean confirmDetailsNodeVisible_TransmissionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TRANS_LOG_DETAILS_NODE_LOCATOR);
    }

    public boolean confirmHoursNodeVisible_TransmissionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TRANS_LOG_HOURS_NODE_LOCATOR);
    }

    public boolean confirmShowCurrentDataToggleVisible_TransmissionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TRANS_LOG_CURRENT_DATA_TOGGLE_LOCATOR);
    }

    public boolean confirmPropertyNameVisibleInPropertyNode_TransmissionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TRANS_LOG_PROPERTY_NAME_LOCATOR);
    }

}
