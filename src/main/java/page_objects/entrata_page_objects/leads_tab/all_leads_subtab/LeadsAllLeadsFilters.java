package page_objects.entrata_page_objects.leads_tab.all_leads_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeadsAllLeadsFilters extends BasePage {
    //Select Filter Selector
    private final By EXPAND_FILTER_BUTTON = By.id("open-filter-by-default");
    private final By LEADS_FILTER_BLACKBOX = By.xpath("//div[text()='Leads Filter']");

    //Remove Properties Options Selectors
    private final By CLEAR_ALL_PROPERTY_FILTER_BUTTON = By.id("js-clear-all-properties");


    //Filter General Navigation Selectors
    private final By ADD_PROPERTY_BUTTON = By.id("addbutton");
    private final By NAME_EMAIL_ID_SEARCH_FIELD = By.id("resident_name");


    //Property Groups Selectors
    private final By PROPERTY_NAME_SEARCH_FIELD = By.id("test");
    private final By LOCATE_CAVALIER_COURT_SEARCH_RESULT = By.xpath("//span[text()='Cavalier Court']");
    //Status Selectors//
    //Status Dropdown Selector
    private final By STATUS_SEARCH_BAR = By.cssSelector(".form-search-field.binded.binded-toggle");
    private final By APPLICATION_STARTED_CHECK_BOX = By.cssSelector("input[value='9']");
    //Search / Cancel Selectors
    private final By FILTER_LEADS_SEARCH_BUTTON = By.cssSelector("#frm-view-data-filters2 > fieldset:nth-child(5) > div.align-right > ul > li:nth-child(1) > a");
    private final By CLICK_CLOSE_LEAD_FILTERS = By.cssSelector("i[class='view-data-close js-view-data-close']");
    private final By CLICK_RESET_FILTERS_BUTTON = By.cssSelector("a[class='reset-filter']");
// Overlay Selector
private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Constructor
    public LeadsAllLeadsFilters(WebDriver driver) { super(driver); }

    //Select Filter Selector
    public boolean clickExpandFilterButton() {
        return clickElement(EXPAND_FILTER_BUTTON);
    }
    public boolean clickLeadsFilterBlackTextArea() {return clickElement(LEADS_FILTER_BLACKBOX);}
    //Remove Properties Options Methods
    public boolean clickClearALlPropertiesButtonInFilters() { return clickElement(CLEAR_ALL_PROPERTY_FILTER_BUTTON);}

    //Filter General Navigation Methods
    public boolean clickAddPropertyFilterButton() {return clickElement(ADD_PROPERTY_BUTTON);}
    public boolean clickAddNameEmailorIDFilterSearchField() {waitForPotentialOverlay(); return clickElement(NAME_EMAIL_ID_SEARCH_FIELD);}
    public boolean clickAndSendKeysToAddNameEmailOrIDFilterSearchFieldSanaliPayne() {return sendKeysToElement(NAME_EMAIL_ID_SEARCH_FIELD, "Sanali Payne");}



    //Status Methods//
    //Status Dropdown Method
    public boolean searchApplicationStarted() { return sendKeysToElement(STATUS_SEARCH_BAR, "started"); }

    public boolean clickApplicationStartedCheckBox() { return clickElement(APPLICATION_STARTED_CHECK_BOX); }
    //Property Groups Methods
    public boolean clickAndSendKeysToPropertyNameSearchFieldCavalierCourt() {return sendKeysToElement(PROPERTY_NAME_SEARCH_FIELD, "Cavalier Court");}
    public boolean clickCavalierCourtSearchedFilterResult() {return clickElement(LOCATE_CAVALIER_COURT_SEARCH_RESULT);}



    //Search / Cancel Methods
    public boolean clickFilterSearch() {waitForPotentialOverlay(); return clickElement(FILTER_LEADS_SEARCH_BUTTON); }

    //Overlay Method
    private void waitForPotentialOverlay() { waitForOverlay(LOADING_OVERLAY);}
}
