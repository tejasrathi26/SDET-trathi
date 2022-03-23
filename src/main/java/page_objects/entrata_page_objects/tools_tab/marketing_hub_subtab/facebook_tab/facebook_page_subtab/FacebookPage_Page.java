package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FacebookPage_Page extends BasePage {

    public FacebookPage_Page (WebDriver driver) {
        super(driver);
    }

    //Facebook Page General Locators
    private final By FB_PAGE_SUB_TAB_LOCATOR = By.id("facebook_pagexxx");
    private final By FB_PAGE_OVERLAY_LOCATOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By FB_PAGE_LOGO_LOCATOR = By.cssSelector("img[width='200']");
    private final By FB_PAGE_PROPERTY_SEARCH_BOX_LOCATOR = By.id("search-property");

    //Facebook Page Filter Locators
    private final By FB_PAGE_ACTIVE_FILTER_LOCATOR = By.cssSelector("li[data-filter='subscribed']");
    private final By FB_PAGE_UNSUBSCRIBED_FILTER_LOCATOR = By.cssSelector("li[data-filter='unsubscribed']");
    private final By FB_PAGE_FEED_INTERRUPTED_FILTER_LOCATOR = By.cssSelector("li[data-filter='interrupted']");

    //Facebook Page Column Header Locators
    private final By FB_PAGE_PROPERTY_COLUMN_LOCATOR = By.xpath("//th[text()='Property']");
    private final By FB_PAGE_TOTAL_UNITS_COLUMN_LOCATOR = By.xpath("//th[text()='Total Units']");
    private final By FB_PAGE_LOCATION_COLUMN_LOCATOR = By.xpath("//th[text()='Location']");
    private final By FB_PAGE_STATUS_COLUMN_LOCATOR = By.xpath("//th[text()='Status']");
    private final By FB_PAGE_TRANSMISSION_LOG_COLUMN_LOCATOR = By.xpath("//th[contains(text(),'Transmission')]");
    private final By FB_PAGE_SUBSCRIPTION_LOG_COLUMN_LOCATOR = By.xpath("//th[contains(text(),'Subscription')]");

    //Facebook Page Table Locators
    private final By FB_PAGE_TRANSMISSION_VIEW_BUTTON_LOCATOR = By.cssSelector("span[title='Transmission Log']");
    private final By FB_PAGE_SUBSCRIPTION_VIEW_BUTTON_LOCATOR = By.cssSelector("span[class='link pointer'][onclick*='Subscription Event Log']");

    //Methods
    public boolean selectFBPageSubTab_FBPage() {
        return clickElement(FB_PAGE_SUB_TAB_LOCATOR);
    }

    public boolean findFacebookPageLogo_FBPage() {
        return confirmElementIsVisible(FB_PAGE_LOGO_LOCATOR);
    }

    public boolean findPropertySearchFilter_FBPage() {
        return confirmElementIsVisible(FB_PAGE_PROPERTY_SEARCH_BOX_LOCATOR);
    }

    //FB Page Filter Methods
    public boolean findActiveFilter_FBPage() {
        return confirmElementIsVisible(FB_PAGE_ACTIVE_FILTER_LOCATOR);
    }

    public boolean findUnsubscribedFilter_FBPage() {
        return confirmElementIsVisible(FB_PAGE_UNSUBSCRIBED_FILTER_LOCATOR);
    }

    public boolean findFeedInterruptedFilter_FBPage() {
        return confirmElementIsVisible(FB_PAGE_FEED_INTERRUPTED_FILTER_LOCATOR);
    }


    //FB Page Table Methods
    public boolean findPropertyColumnHeader_FBPage() {
        return confirmElementIsVisible(FB_PAGE_PROPERTY_COLUMN_LOCATOR);
    }

    public boolean findTotalUnitsColumnHeader_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TOTAL_UNITS_COLUMN_LOCATOR);
    }

    public boolean findLocationColumnHeader_FBPage() {
        return confirmElementIsVisible(FB_PAGE_LOCATION_COLUMN_LOCATOR);
    }

    public boolean findStatusColumnHeader_FBPage() {
        return confirmElementIsVisible(FB_PAGE_STATUS_COLUMN_LOCATOR);
    }

    public boolean findTransmissionLogColumnHeader_FBPage() {
        return confirmElementIsVisible(FB_PAGE_TRANSMISSION_LOG_COLUMN_LOCATOR);
    }

    public boolean findSubscriptionLogColumnHeader_FBPage() {
        return confirmElementIsVisible(FB_PAGE_SUBSCRIPTION_LOG_COLUMN_LOCATOR);
    }

    public boolean clickTransmissionViewButton_FBPage() {
        return clickElement(FB_PAGE_TRANSMISSION_VIEW_BUTTON_LOCATOR);
    }

    public boolean clickSubscriptionViewButton_FBPage() {
        waitForLoadOverlay_FBPage();
        return clickElement(FB_PAGE_SUBSCRIPTION_VIEW_BUTTON_LOCATOR);
    }

    //Overlay Methods
    private void waitForLoadOverlay_FBPage() {
        waitForOverlay(FB_PAGE_OVERLAY_LOCATOR);
    }

}
