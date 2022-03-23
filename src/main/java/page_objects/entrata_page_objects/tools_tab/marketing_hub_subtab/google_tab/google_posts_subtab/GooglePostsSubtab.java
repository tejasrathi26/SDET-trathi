package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.google_posts_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GooglePostsSubtab extends BasePage {

    //Constructor
    public GooglePostsSubtab(WebDriver driver) {
        super(driver);
    }

    //Google Posts Tab
    private final By GOOGLE_POSTS_SUB_TAB_LOCATOR = By.id("mhub_google_postsxxx");
    private final By GOOGLE_POSTS_SCREEN = By.id("accounts-main");
    private final By GOOGLE_POSTS_TABLE = By.id("post-table-container");
    private final By FIRST_GOOGLE_POST_IN_LIST_EDIT_BUTTON = By.cssSelector("a[class='action margin5-right margin5-top js-edit-google-post']:first-of-type");
    private final By SAVE_POST_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By POST_DELETED_SUCCESSFULLY_MESSAGE = By.cssSelector("p[class='alert success slim']");

    //Google Posts Property Filter Locators
    private final By GOOGLE_POSTS_PROPERTY_FILTER_LOCATOR = By.cssSelector("div[class='selector social-media js-property-select']");
    private final By GOOGLE_POSTS_PROPERTY_FILTER_FIRST_PROPERTY_LOCATOR = By.cssSelector("li[class='sl-item js-property']:first-of-type");

    //Google Posts General Locators
    private final By GOOGLE_POSTS_LOGO_LOCATOR = By.cssSelector("span[class='social-icon middle-align']");
    private final By GOOGLE_POSTS_NAME_LOCATOR = By.xpath("//h2[contains(text(),'Google')]");
    private final By GOOGLE_POSTS_BUSINESS_ACCOUNT_NAME_LOCATOR = By.cssSelector("a[class='margin5-right inlineblock']");
    private final By GOOGLE_POSTS_BUSINESS_ACCOUNT_IMAGE_LOCATOR = By.className("account-image");

    //Google Posts Card Locators
    private final By GOOGLE_POSTS_CARD_NAME_LOCATOR = By.cssSelector("h2[class='title']");
    private final By GOOGLE_POSTS_CARD_CREATE_POST_BUTTON_LOCATOR = By.cssSelector("a[class='primary-btn js-post-create']");

    //Google Posts Card Column Header Locators
    private final By GOOGLE_POSTS_IMAGE_COLUMN = By.cssSelector("th[style='width:5%;']");
    private final By GOOGLE_POSTS_POST_TEXT_COLUMN_HEADER = By.xpath("//th[text()='Post Text']");
    private final By GOOGLE_POSTS_POST_DATE_COLUMN_HEADER = By.xpath("//th[text()='Post Date']");
    private final By GOOGLE_POSTS_END_DATE_COLUMN_HEADER = By.xpath("//th[text()='End Date']");
    private final By GOOGLE_POSTS_CREATED_BY_COLUMN_HEADER = By.xpath("//th[text()='Created By']");
    private final By GOOGLE_POSTS_VIEWS_COLUMN_HEADER = By.xpath("//th[text()='Views']");
    private final By GOOGLE_POSTS_EDIT_COLUMN = By.cssSelector("th[style='width:3%;']");

    //Google Posts Activity Graph
    private final By GOOGLE_POSTS_ACTIVITY_GRAPH_CARD = By.className("content-card");
    private final By GOOGLE_POSTS_ACTIVITY_GRAPH_LOCATOR = By.id("google_post_activity_graph");
    private final By GOOGLE_POSTS_ACTIVITY_GRAPH_CARD_VIEWS_LOCATOR = By.cssSelector("span[class='margin30-right']");
    private final By GOOGLE_POSTS_ACTIVITY_GRAPH_DATE_FILTER_LOCATOR = By.name("activity_range");

    //Google Posts Activity Graph Date Filter Options
    private final String GOOGLE_POSTS_OPTION1_SEVEN_DAYS_LOCATOR = "7day";
    private final String GOOGLE_POSTS_OPTION2_THIRTY_DAYS_LOCATOR = "30day";
    private final String GOOGLE_POSTS_OPTION3_THREE_MONTHS_LOCATOR = "3months";
    private final String GOOGLE_POSTS_OPTION4_SIX_MONTHS_LOCATOR = "6months";
    private final String GOOGLE_POSTS_OPTION5_ONE_YEAR_LOCATOR = "1year";

    //Test Specific Variables
    private final String AUTOMATION_TEST_TITLE_TEXT = "Automation Test post to be deleted.";

    //Methods
    public boolean clickGooglePostsSubTab_GooglePosts() {
        return clickElement(GOOGLE_POSTS_SUB_TAB_LOCATOR);
    }

    public boolean selectGooglePostScreen() {
        return clickElement(GOOGLE_POSTS_SCREEN);
    }

    public boolean findPropertySearchFilter_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_PROPERTY_FILTER_LOCATOR);
    }

    public String getTextOfSelectedPropertyInFilter_GooglePosts() {
        return getElementText(GOOGLE_POSTS_PROPERTY_FILTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getTextOfFirstPropertyInPropertyFilter_GooglePosts() {
        clickElement(GOOGLE_POSTS_PROPERTY_FILTER_LOCATOR);
        return getElementText(GOOGLE_POSTS_PROPERTY_FILTER_FIRST_PROPERTY_LOCATOR);
    }

    public boolean findMyBusinessPageLogo_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_LOGO_LOCATOR);
    }

    public boolean findGooglePostsNameInGooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_NAME_LOCATOR);
    }

    public boolean findGoogleAccountName_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_BUSINESS_ACCOUNT_NAME_LOCATOR);
    }

    public boolean findGoogleAccountImage_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_BUSINESS_ACCOUNT_IMAGE_LOCATOR);
    }

    public boolean clickBusinessAccountHyperLink_GooglePosts() {
        return clickElement(GOOGLE_POSTS_BUSINESS_ACCOUNT_NAME_LOCATOR);
    }

    public boolean confirmNewTabOpensForGoogleAccount_GooglePosts() {
        return switchToRecentlyOpenedTab();
    }

    public boolean returnToOriginalGooglePostsTab_GooglePosts() {
        return closeSecondTabAndReturnToPrimaryTab();
    }

    public String getTextOfGooglePostsCardTitle_GooglePosts() {
        return getElementText(GOOGLE_POSTS_CARD_NAME_LOCATOR);
    }

    public boolean findCreatePostsButton_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_CARD_CREATE_POST_BUTTON_LOCATOR);
    }

    public boolean clickCreatePost() {
        return clickElement(GOOGLE_POSTS_CARD_CREATE_POST_BUTTON_LOCATOR);
    }

    public boolean confirmAutomationTestSavedCorrectly() {
        return confirmElementContainsText(GOOGLE_POSTS_TABLE, AUTOMATION_TEST_TITLE_TEXT);
    }

    public boolean confirmPostDeletedSuccessfullyMessageIsDisplayed() {
        return confirmElementIsVisible(POST_DELETED_SUCCESSFULLY_MESSAGE);
    }

    public void waitForSavePostOverlay() {
        waitForOverlay(SAVE_POST_OVERLAY, waitTimes.LONG_WAIT);
    }

    public boolean clickFirstGooglePostEditButton() {
        waitForSavePostOverlay();
        return clickElement(FIRST_GOOGLE_POST_IN_LIST_EDIT_BUTTON);
    }
    //Google Posts Card Header Locators
    public boolean findImageColumn_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_IMAGE_COLUMN);
    }

    public boolean findPostTextColumnHeader_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_POST_TEXT_COLUMN_HEADER);
    }

    public boolean findPostDateColumnHeader_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_POST_DATE_COLUMN_HEADER);
    }

    public boolean findEndDateColumnHeader_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_END_DATE_COLUMN_HEADER);
    }

    public boolean findCreatedByColumnHeader_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_CREATED_BY_COLUMN_HEADER);
    }

    public boolean findViewsColumnHeader_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_VIEWS_COLUMN_HEADER);
    }

    public boolean findEditIconColumn_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_EDIT_COLUMN);
    }

    //Google Posts Activity Graph Card Methods
    public boolean findPostActivityGraphCardInGooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_ACTIVITY_GRAPH_CARD, waitTimes.LONG_WAIT);
    }

    public boolean findPostActivityGraph_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_ACTIVITY_GRAPH_LOCATOR);
    }

    public boolean findPostActivityGraphCardViews_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_ACTIVITY_GRAPH_CARD_VIEWS_LOCATOR);
    }

    public boolean findPostActivityGraphCardDateFilter_GooglePosts() {
        return confirmElementIsVisible(GOOGLE_POSTS_ACTIVITY_GRAPH_DATE_FILTER_LOCATOR);
    }

    public boolean selectSortByFilterOption1_SevenDays_GooglePosts() {
        return selectElementByValue(GOOGLE_POSTS_ACTIVITY_GRAPH_DATE_FILTER_LOCATOR,
                GOOGLE_POSTS_OPTION1_SEVEN_DAYS_LOCATOR);
    }

    public boolean selectSortByFilterOption2_ThirtyDays_GooglePosts() {
        return selectElementByValue(GOOGLE_POSTS_ACTIVITY_GRAPH_DATE_FILTER_LOCATOR,
                GOOGLE_POSTS_OPTION2_THIRTY_DAYS_LOCATOR);
    }

    public boolean selectSortByFilterOption3_ThreeMonths_GooglePosts() {
        return selectElementByValue(GOOGLE_POSTS_ACTIVITY_GRAPH_DATE_FILTER_LOCATOR,
                GOOGLE_POSTS_OPTION3_THREE_MONTHS_LOCATOR);
    }

    public boolean selectSortByFilterOption4_SixMonths_GooglePosts() {
        return selectElementByValue(GOOGLE_POSTS_ACTIVITY_GRAPH_DATE_FILTER_LOCATOR,
                GOOGLE_POSTS_OPTION4_SIX_MONTHS_LOCATOR);
    }

    public boolean selectSortByFilterOption5_OneYear_GooglePosts() {
        return selectElementByValue(GOOGLE_POSTS_ACTIVITY_GRAPH_DATE_FILTER_LOCATOR,
                GOOGLE_POSTS_OPTION5_ONE_YEAR_LOCATOR);
    }

}
