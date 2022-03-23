package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CorporateTemplatesSubtab extends BasePage {

    //Constructor
    public CorporateTemplatesSubtab(WebDriver driver) {
        super(driver);
    }

    //Craigslist Sub-Tab
    private final By CORPORATE_TEMPLATES_TAB_LOCATOR = By.xpath("//li[text()='Corporate Templates']");
    private final By CORPORATE_TAB_OVERLAY = By.id("loader-gif-container");

    //Craigslist "Corporate Templates" Module Action Buttons
    private final By CORPORATE_TEMPLATES_TITLE_LOCATOR = By.xpath("//span[text()='Corporate Templates']");
    private final By CORPORATE_LEVEL_NEW_TEMPLATE_BUTTON_LOCATOR = By.xpath("//a[@class='button small green corporate-template-btn js-create-template  show ']");
    private final By SORT_BY_ASSIGNED_FILTER_LOCATOR = By.xpath("//select[@class='form-select js-sort-boxes']");

    //"Corporate Templates" Ad Specific buttons
    private final By CRAIGSLIST_SINGLE_AD_LOCATOR = By.xpath("//div[@id='template-grid']/div[1]");
    private final By EDIT_BUTTON_LOCATOR = By.xpath("//a[@title='Edit template']");
    private final By DUPLICATE_BUTTON_LOCATOR = By.xpath("//a[@title='Duplicate template']");
    private final By DELETE_BUTTON_LOCATOR = By.xpath("//span[@button='Delete']");
    private final By LAST_CORPORATE_TEMPLATE = By.cssSelector("div[class='ad-template-box corporate']:last-of-type");
    private final By LAST_CORPORATE_TEMPLATE_EDIT_BUTTON = By.cssSelector("div[class='ad-template-box corporate']:last-of-type > div[class='control-bar'] > a[class='sub-button js-edit-template']");
    private final By LAST_DELETE_BUTTON = By.cssSelector("div[class='ad-template-box corporate']:last-of-type > span[button='Delete']");
    private final By CONFIRM_DELETE_BUTTON = By.cssSelector("a[class='button small actions-btn']");
    private final String CORPORATE_AUTOMATION_TEST_GENERIC_TITLE = "Corporate Ad Creation automation test name to be deleted";

    //Filter Options
    private final String OPTION1_PROPERTIES_MOST_LEAST_LOCATOR = "propertyCount:numeric-desc";
    private final String OPTION2_PROPERTIES_LEAST_MOST_LOCATOR = "propertyCount:numeric-asc";

    //Page Methods
    public boolean navigateToCorporateTemplatesTab() {
        return clickElement(CORPORATE_TEMPLATES_TAB_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean corporateTemplateTitleVisible() {
        waitForOverlay(CORPORATE_TAB_OVERLAY);
        return confirmElementIsVisible(CORPORATE_TEMPLATES_TITLE_LOCATOR);
    }

    public boolean findCorporateNewTemplateButton() {
        return confirmElementIsVisible(CORPORATE_LEVEL_NEW_TEMPLATE_BUTTON_LOCATOR);
    }

    public boolean clickCorporateNewTemplateButton() {
        return clickElement(CORPORATE_LEVEL_NEW_TEMPLATE_BUTTON_LOCATOR);
    }

    public boolean findCorporateTemplatesSortFilter() {
        return confirmElementIsVisible(SORT_BY_ASSIGNED_FILTER_LOCATOR);
    }

    public boolean findCorporateFilterOption1_MostLeast() {
        return selectElementByValue(SORT_BY_ASSIGNED_FILTER_LOCATOR,
                OPTION1_PROPERTIES_MOST_LEAST_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findCorporateFilterOption2_LeastMost() {
        return selectElementByValue(SORT_BY_ASSIGNED_FILTER_LOCATOR,
                OPTION2_PROPERTIES_LEAST_MOST_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectFirstCorporateTemplateInList() {
        return clickElement(CRAIGSLIST_SINGLE_AD_LOCATOR);
    }

    public boolean findEditButton_CorpTemplateAd() {
        return confirmElementIsVisible(EDIT_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findDuplicateButton_CorpTemplateAd() {
        return confirmElementIsVisible(DUPLICATE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findDeleteButton_CorpTemplateAd() {
        return confirmElementIsVisible(DELETE_BUTTON_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean confirmNewTemplateForVerifyCraigslistAdCreationAndDeletionWasCreated() {
        return confirmElementContainsText(LAST_CORPORATE_TEMPLATE,CORPORATE_AUTOMATION_TEST_GENERIC_TITLE);
    }

    public boolean clickEditOptionOfLastCorporateTemplate() {
        return clickElement(LAST_CORPORATE_TEMPLATE_EDIT_BUTTON);
    }

    public boolean moveToLastCorporateTemplate() {
        return moveToAnElementWithActions(LAST_CORPORATE_TEMPLATE);
    }

    public boolean clickLastDeleteButton() {
        return clickElement(LAST_DELETE_BUTTON);
    }

    public boolean clickConfirmDeleteButton() {
        return clickElement(CONFIRM_DELETE_BUTTON);
    }

}
