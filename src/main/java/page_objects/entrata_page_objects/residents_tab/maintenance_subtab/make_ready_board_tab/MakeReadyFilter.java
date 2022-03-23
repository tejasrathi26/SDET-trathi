package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MakeReadyFilter extends BasePage {

    private final By CREATE_MAKE_READY_BUTTON = By.cssSelector("a[onclick*='objMaintenanceRequest']");
    private final By FILTER_MAKE_READY = By.cssSelector("a[id='open-filter-by-default'][title='Make Readies']");
    private final By PROPERTY_GROUPS_FILTER_AREA = By.id("property_group_ids_filter");
    private final By DATA_FIELDS_TO_FILTER = By.cssSelector("div[class='view-data-fields left ']");
    private final By ALL_PROPERTIES_SELECTED_PROPERTIES = By.id("selected-report_filterproperty_group_ids-100004581");
    private final By ADD_BUTTON = By.id("addbutton");
    private final By ALL_PROPERTIES_DOWN_ARROW = By.cssSelector("#property_list > span.header.property-group-record.js-all-properties.binded.binded2");
    // this is a long selector but the only one that I found would work.
    private final By LOFTS_OF_LORIEN_PROPERTY = By.cssSelector("span[class='property-name margin0'");
    private final By RENBERG_TOWER_PROPERTY = By.cssSelector("li[data-listid='140521'");
    private final By FILTER_MAKE_READIES_BUTTON = By.cssSelector("ul[class='button-set gen-report']");

    public MakeReadyFilter(WebDriver driver){ super(driver); }

    public boolean clickCreateMakeReadyButton() { return clickElement(CREATE_MAKE_READY_BUTTON, waitTimes.LONG_WAIT); }

    public boolean clickFilterMakeReadyButton() { return clickElement(FILTER_MAKE_READY, waitTimes.LONG_WAIT); }

    public boolean confirmPropertyGroupsFilterArea() { return confirmElementIsVisible(PROPERTY_GROUPS_FILTER_AREA); }

    public boolean confirmDataFieldsToFilterAreVisible() { return confirmElementIsVisible(DATA_FIELDS_TO_FILTER); }

    public boolean clickAllProperties() { return clickElement(ALL_PROPERTIES_SELECTED_PROPERTIES); }

    public boolean clickAddButton() { return clickElement(ADD_BUTTON); }

    public boolean clickAllPropertiesDownArrowFromAfterTheAddPropertiesButton() { return clickElement(ALL_PROPERTIES_DOWN_ARROW); }

    public boolean clickRenbergTowerProperty() { return clickElement(RENBERG_TOWER_PROPERTY); }

    public boolean clickFilterMakeReadiesButton() { return clickElement(FILTER_MAKE_READIES_BUTTON); }

    public boolean clickLoftsOfLorienInAddProperties() { return clickElement(LOFTS_OF_LORIEN_PROPERTY); }

}
