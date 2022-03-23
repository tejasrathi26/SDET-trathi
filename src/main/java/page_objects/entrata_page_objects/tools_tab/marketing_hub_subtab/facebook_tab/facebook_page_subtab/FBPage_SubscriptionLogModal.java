package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FBPage_SubscriptionLogModal extends BasePage {

    public FBPage_SubscriptionLogModal(WebDriver driver) {
        super(driver); }

    //Transmission Log element Locators
    private final By FB_PAGE_SUBSCRIPTION_LOG_WINDOW_LOCATOR = By.id("mod");
    private final By FB_PAGE_SUBS_LOG_DATE_SECTION_LOCATOR = By.xpath("//th[text()='Date']");
    private final By FB_PAGE_SUBS_LOG_ACTION_SECTION_LOCATOR = By.xpath("//th[text()='Action']");
    private final By FB_PAGE_SUBS_LOG_USER_SECTION_LOCATOR = By.xpath("//th[text()='Name']");

    //Methods
    public boolean confirmSubscriptionLogOpened_FBPage() {
        return confirmElementIsVisible(FB_PAGE_SUBSCRIPTION_LOG_WINDOW_LOCATOR);
    }

    public boolean confirmDateVisible_SubscriptionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_SUBS_LOG_DATE_SECTION_LOCATOR);
    }

    public boolean confirmActionVisible_SubscriptionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_SUBS_LOG_ACTION_SECTION_LOCATOR);
    }

    public boolean confirmUserNameVisible_SubscriptionLog_FBPage() {
        return confirmElementIsVisible(FB_PAGE_SUBS_LOG_USER_SECTION_LOCATOR);
    }

}
