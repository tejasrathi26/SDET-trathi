package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GoogleMyBusinessSubtab extends BasePage {

    //Constructor
    public GoogleMyBusinessSubtab(WebDriver driver) {
        super(driver);
    }

    //Google My Business Tab
    private final By GOOGLE_MY_BUSINESS_SUB_TAB_LOCATOR = By.id("google_my_businessxxx");

    //Google My Business General Locators
    private final By GOOGLE_MY_BUSINESS_LOGO_LOCATOR = By.cssSelector("img[width='185']");
    private final By GOOGLE_MY_BUSINESS_PROPERTY_SEARCH_FILTER_LOCATOR = By.id("search-property");
    private final By GOOGLE_MY_BUSINESS_FREE_SERVICE_TITLE_LOCATOR = By.cssSelector("h4[class='margin5-bottom']");

    //Google My Business Filter Options
    private final By GOOGLE_MY_BUSINESS_ACTIVE_FILTER_LOCATOR = By.cssSelector("li[data-filter='subscribed']");
    private final By GOOGLE_MY_BUSINESS_UNSUBSCRIBED_FILTER_LOCATOR = By.cssSelector("li[data-filter='unsubscribed']");
    private final By GOOGLE_MY_BUSINESS_FEED_INTERRUPTION_FILTER_LOCATOR = By.cssSelector("li[data-filter='interrupted']");

    //Google My Business Table Locators
    private final By GOOGLE_MY_BUSINESS_PROPERTY_COLUMN_HEADER = By.xpath("//th[text()='Property']");
    private final By GOOGLE_MY_BUSINESS_TOTAL_UNITS_COLUMN_HEADER = By.xpath("//th[text()='Total Units']");
    private final By GOOGLE_MY_BUSINESS_LOCATION_COLUMN_HEADER = By.xpath("//th[text()='Location']");
    private final By GOOGLE_MY_BUSINESS_STATUS_COLUMN_HEADER = By.xpath("//th[text()='Status']");
    private final By GOOGLE_MY_BUSINESS_TRANSMISSION_LOG_COLUMN_HEADER = By.xpath("//th[contains(text(),'Transmission')]");
    private final By GOOGLE_MY_BUSINESS_SUBSCRIPTION_LOG_COLUMN_HEADER = By.xpath("//th[contains(text(),'Subscription')]");
    private final By GOOGLE_MY_BUSINESS_UPDATE_IMAGES_COLUMN_HEADER = By.xpath("//th[contains(text(),'Update Images')]");

    //Methods
    public boolean selectGoogleMyBusinessSubTab_GoogleMB() {
        return clickElement(GOOGLE_MY_BUSINESS_SUB_TAB_LOCATOR);
    }

    public boolean findMyBusinessPageLogo_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_LOGO_LOCATOR);
    }

    public boolean findPropertySearchFilter_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_PROPERTY_SEARCH_FILTER_LOCATOR);
    }

    public boolean findFreeServiceTitle_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_FREE_SERVICE_TITLE_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findActiveFilter_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_ACTIVE_FILTER_LOCATOR);
    }

    public boolean findUnsubscribedFilter_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_UNSUBSCRIBED_FILTER_LOCATOR);
    }

    public boolean findFeedInterruptedFilter_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_FEED_INTERRUPTION_FILTER_LOCATOR);
    }

    //Google My Business Table List Methods
    public boolean findPropertyColumnHeader_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_PROPERTY_COLUMN_HEADER);
    }

    public boolean findTotalUnitsColumnHeader_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_TOTAL_UNITS_COLUMN_HEADER);
    }

    public boolean findLocationColumnHeader_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_LOCATION_COLUMN_HEADER);
    }

    public boolean findStatusColumnHeader_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_STATUS_COLUMN_HEADER);
    }

    public boolean findTransmissionLogColumnHeader_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_TRANSMISSION_LOG_COLUMN_HEADER);
    }

    public boolean findSubscriptionLogColumnHeader_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_SUBSCRIPTION_LOG_COLUMN_HEADER);
    }

    public boolean findUpdateImagesColumnHeader_GoogleMB() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_UPDATE_IMAGES_COLUMN_HEADER);
    }

}
