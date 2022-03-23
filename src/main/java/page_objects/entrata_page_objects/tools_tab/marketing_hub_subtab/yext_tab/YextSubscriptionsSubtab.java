package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.yext_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class YextSubscriptionsSubtab extends BasePage {

    //Constructor
    public YextSubscriptionsSubtab(WebDriver driver) {
        super(driver);
    }

    //Overlay Locator
    private final By YEXT_SUBSCRIPTIONS_SUB_TAB_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Yext "Subscriptions" Sub-tab General Locators
    private final By YEXT_SUBSCRIPTIONS_SUB_TAB_LOCATOR = By.id("yext_property_subscriptionsxxx");
    private final By YEXT_LOGO_LOCATOR = By.cssSelector("img[src='/images/_common/yext_logo.png\']");
    //Yext "Publisher Management" tab Filter Locators
    private final By YEXT_SUBSCRIPTIONS_PROPERTY_SEARCH_BOX_LOCATOR = By.id("search-property");
    private final By YEXT_SUBSCRIPTIONS_ACTIVE_FILTER_LOCATOR = By.cssSelector("li[data-filter='active']");
    private final By YEXT_SUBSCRIPTIONS_PENDING_FILTER_LOCATOR = By.cssSelector("li[data-filter='pending']");
    private final By YEXT_SUBSCRIPTIONS_FAILED_FILTER_LOCATOR = By.cssSelector("li[data-filter='failed']");
    private final By YEXT_SUBSCRIPTIONS_CANCELLED_FILTER_LOCATOR = By.cssSelector("li[data-filter='cancelled']");
    private final By YEXT_SUBSCRIPTIONS_INACTIVE_FILTER_LOCATOR = By.cssSelector("li[data-filter='inactive']");

    //Yext "Subscriptions" tab Column Header Locators
    private final By YEXT_SUBSCRIPTIONS_PROPERTY_COLUMN_HEADER = By.xpath("//th[text()='Property']");
    private final By YEXT_SUBSCRIPTIONS_TOTAL_UNITS_COLUMN_HEADER = By.xpath("//th[text()='Total Units']");
    private final By YEXT_SUBSCRIPTIONS_LOCATION_COLUMN_HEADER = By.xpath("//th[text()='Location']");
    private final By YEXT_SUBSCRIPTIONS_STATUS_COLUMN_HEADER = By.xpath("//th[text()='Status']");
    private final By YEXT_SUBSCRIPTIONS_TRANSMISSION_LOG_COLUMN_HEADER = By.xpath("//th[text()='Transmission Log']");
    private final By YEXT_SUBSCRIPTIONS_SUBSCRIPTION_LOG_COLUMN_HEADER = By.xpath("//th[text()='Subscription Log']");

    //Methods
    public boolean selectSubscriptionsSubTab_YextSubscriptions() {
        return clickElement(YEXT_SUBSCRIPTIONS_SUB_TAB_LOCATOR);
    }

    public boolean findYextLogo_YextSubscription() {
        return confirmElementIsVisible(YEXT_LOGO_LOCATOR);
    }

    //Yext 'Subscriptions' tab Filter Methods
    public boolean findPropertySearchBox_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_PROPERTY_SEARCH_BOX_LOCATOR);
    }

    public boolean findActiveFilter_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_ACTIVE_FILTER_LOCATOR);
    }

    public boolean findPendingFilter_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_PENDING_FILTER_LOCATOR);
    }

    public boolean findFailedFilter_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_FAILED_FILTER_LOCATOR);
    }

    public boolean findCancelledFilter_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_CANCELLED_FILTER_LOCATOR);
    }

    public boolean findInactiveFilter_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_INACTIVE_FILTER_LOCATOR);
    }

    //Yext "Subscriptions" tab Table Header Locators
    public boolean findPropertyColumn_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_PROPERTY_COLUMN_HEADER);
    }

    public boolean findTotalUnitsColumn_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_TOTAL_UNITS_COLUMN_HEADER);
    }

    public boolean findLocationColumn_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_LOCATION_COLUMN_HEADER);
    }

    public boolean findStatusColumn_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_STATUS_COLUMN_HEADER);
    }

    public boolean findTransmissionLogColumn_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_TRANSMISSION_LOG_COLUMN_HEADER);
    }

    public boolean findSubscriptionLogColumn_YextSubscriptions() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_SUBSCRIPTION_LOG_COLUMN_HEADER);
    }

}
