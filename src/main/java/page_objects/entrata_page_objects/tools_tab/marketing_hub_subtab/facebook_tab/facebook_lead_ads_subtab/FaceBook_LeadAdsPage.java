package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_lead_ads_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FaceBook_LeadAdsPage extends BasePage {

    //Constructor
    public FaceBook_LeadAdsPage(WebDriver driver) {
        super(driver);
    }

    //Facebook Lead Ads General Locators
    private final By LEAD_ADS_SUB_TAB_LOCATOR = By.id("facebook_lead_adsxxx");
    private final By LEAD_ADS_OVERLAY_LOCATOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By LEAD_ADS_LOGO_LOCATOR = By.cssSelector("img[src='/images/_common/fb_leadads_logo.png']");
    private final By LEAD_ADS_PROPERTY_SEARCH_BOX_LOCATOR = By.id("fla-search-property");

    //Facebook Lead Ads Filter Locators
    private final By LEAD_ADS_ACTIVE_FILTER_LOCATOR = By.cssSelector("li[data-filter='active']");
    private final By LEAD_ADS_ALL_FILTER_LOCATOR = By.cssSelector("li[data-filter='all']");
    private final By LEAD_ADS_DISABLED_FILTER_LOCATOR = By.cssSelector("li[data-filter='disabled']");
    private final By LEAD_ADS_ALL_DEFAULT_SELECTED_LOCATOR = By.xpath("//li[contains(text(),'All') and @class='js-filter-status js-filter-ils selected binded']");

    //Facebook Lead Ads Column Header Locators
    private final By LEAD_ADS_PROPERTY_COLUMN_LOCATOR = By.xpath("//th[text()='Property']");
    private final By LEAD_ADS_LOCATION_COLUMN_LOCATOR = By.xpath("//th[text()='Location']");
    private final By LEAD_ADS_STATUS_COLUMN_LOCATOR = By.xpath("//th[text()='Status']");
    private final By LEAD_ADS_ACTIVATION_LOGS_COLUMN_LOCATOR = By.xpath("//th[text()='Activation Logs']");


    //Methods
    public boolean selectLeadAdsSubTab_FBLeadAds() {
        return clickElement(LEAD_ADS_SUB_TAB_LOCATOR);
    }

    public boolean findLeadAdsLogo_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_LOGO_LOCATOR);
    }

    public boolean findPropertySearchFilter_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_PROPERTY_SEARCH_BOX_LOCATOR);
    }

    //FBLA Filter Methods
    public boolean findActiveFilter_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_ACTIVE_FILTER_LOCATOR);
    }

    public boolean findAllFilter_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_ALL_FILTER_LOCATOR);
    }

    public boolean findDisabledFilter_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_DISABLED_FILTER_LOCATOR);
    }

    public String getTextOfDefaultFilterSelected_FBLeadAds() {
        waitForOverlay_FBLeadAds();
        return getElementText(LEAD_ADS_ALL_DEFAULT_SELECTED_LOCATOR, waitTimes.LONG_WAIT);
    }

    //FBLA Table Methods
    public boolean findPropertyColumnHeader_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_PROPERTY_COLUMN_LOCATOR);
    }

    public boolean findLocationColumnHeader_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_LOCATION_COLUMN_LOCATOR);
    }

    public boolean findStatusColumnHeader_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_STATUS_COLUMN_LOCATOR);
    }

    public boolean findActivationLogsColumnHeader_FBLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_ACTIVATION_LOGS_COLUMN_LOCATOR);
    }

    //Overlay Methods
    private void waitForOverlay_FBLeadAds() {
        waitForOverlay(LEAD_ADS_OVERLAY_LOCATOR);
    }

}
