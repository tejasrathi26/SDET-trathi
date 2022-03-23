package page_objects.entrata_page_objects.accounting_tab.vendors_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_objects.BasePage;

public class VendorsLocation extends BasePage {

    public VendorsLocation(WebDriver driver) {
        super(driver);
    }

    //Add Vendor Location

    private final By VENDOR_CODE = By.name("ap_payee_location[vendor_code]");
    private final By COUNTRY = By.name("location_address[postal_addresses][default][country]");
    private final By ADDRESS_LINE_ONE = By.name("location_address[postal_addresses][default][addressLine1]");
    private final By ADDRESS_LINE_TWO = By.name("location_address[postal_addresses][default][addressLine2]");
    private final By ADDRESS_LINE_THREE = By.name("location_address[postal_addresses][default][addressLine3]");
    private final By CITY = By.name("location_address[postal_addresses][default][locality]");
    private final By STATE = By.name("location_address[postal_addresses][default][administrativeArea]");
    private final By ZIP = By.name("location_address[postal_addresses][default][postalCode]");
    private final By DUNS_NUMBER = By.name("ap_payee_location[duns_number]");
    private final By VENDOR_APPROVED_ALL_VENDORS = By.id("toggle_all_properties");
    private final By NOTES = By.name("ap_payee_location[notes]");
    private final By LOCATIONS_TAB = By.id("ap_payee_location_tab");
    private final By LOCATIONS_INFORMATION = By.id("ap_payee_system_container_div");
    private final By ADD_LOCATION = By.cssSelector("a[onclick*='create_location']");
    private final By ADD_LOCATION_FORM = By.id("form_add_location");
    private final By LOCATION_NAME = By.name("ap_payee_location[location_name]");
    private final By LEGAL_ENTITY = By.xpath("//*[@name=\"ap_payee_location[ap_legal_entity_id]\"]/option[2]");
    private final By LOCATION_REMITTANCE_TYPE = By.id("vendor_remittance_type_id");
    private final By LOCATION_REMITTANCE_NAME = By.name("ap_remittance_location[name]");
    private final By ADD_PROPERTIES_DIV_CLICK = By.id("property_groupid");
    private final By SUBMIT_LOCATION = By.id("submit_add_location");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");


    //Add Vendor Remittance

    private final By FIRST_LISTED_LOCATION = By.cssSelector("a[onclick*='ap_payee_location[id]']");
    private final By VENDOR_LOCATION_INFO = By.id("location_info-view");
    private final By REMITTANCE_OPTIONS = By.id("1099-view");
    private final By CONTACTS = By.id("view_ap_payee_contacts");
    private final By ACCOUNTS = By.xpath("//*[@id=\"view_location_info\"]/b[3]");
    private final By ADVANCED_SETTINGS = By.id("prequal-advanced");
    private final By EDIT_REMITTANCE = By.cssSelector("i[id*='edit_ap_remittance']");
    private final By VIEW_REMITTANCE = By.cssSelector("a[class*='view_remittance_details']");
    private final By ADD_REMITTANCE_OPTION = By.cssSelector("a[onclick*='Add Remittance Option']");
    private final By ADD_REMITTANCE_TYPE = By.id("remittance_type_id");
    private final By ADD_REMITTANCE_NAME = By.id("remittance_name");
    private final By ADDRESS = By.name("remittance_address[postal_addresses][default][country]");
    private final By ADD_REMITTANCE_ADDRESS_ONE = By.name("remittance_address[postal_addresses][default][addressLine1]");
    private final By ADD_REMITTANCE_ADDRESS_TWO = By.name("remittance_address[postal_addresses][default][addressLine2]");
    private final By ADD_REMITTANCE_ADDRESS_THREE = By.name("remittance_address[postal_addresses][default][addressLine3]");
    private final By ADD_REMITTANCE_CITY = By.name("remittance_address[postal_addresses][default][locality]");
    private final By ADD_REMITTANCE_STATE = By.name("remittance_address[postal_addresses][default][administrativeArea]");
    private final By ADD_REMITTANCE_ZIP = By.name("remittance_address[postal_addresses][default][postalCode]");
    private final By MAKE_DEFAULT_TOGGLE = By.id("toggle-button");
    private final By ADD_REMITTANCE_SUBMIT = By.id("submit_remittance");
    private final By CANCEL_REMITTANCE_HYPERLINK = By.cssSelector("a[class='cancel'][href*='javascript:void(0)']");
    private final By CLOSE_REMITTANCE_BOX = By.cssSelector("button[title='Close']");
    private final By VENDOR_LOCATIONS_PAGE = By.id("vendorBusinessInfoView");


    //Add Vendor Remittance

    public boolean firstListedLocationClick() {
        return clickElement(FIRST_LISTED_LOCATION);
    }

    public boolean addRemittanceOptionClick() {
        return clickElement(ADD_REMITTANCE_OPTION);
    }

    public boolean selectRemittanceType() {
        return selectElementByValue(ADD_REMITTANCE_TYPE, "3");
    }

    public boolean addNewRemittanceOptionClick() {
        return clickElement(ADD_REMITTANCE_SUBMIT);
    }


    //Visibility - Add Vendor Remittance

    public boolean vendorLocationInfoVisible() {
        return confirmElementIsVisible(VENDOR_LOCATION_INFO);
    }

    public boolean remittanceOptionsVisible() {
        return confirmElementIsVisible(REMITTANCE_OPTIONS);
    }

    public boolean contactsVisible() {
        return confirmElementIsVisible(CONTACTS);
    }

    public boolean accountsVisible() {
        return confirmElementIsVisible(ACCOUNTS);
    }

    public boolean advancedSettingsVisible() {
        return confirmElementIsVisible(ADVANCED_SETTINGS);
    }

    public boolean editRemittanceVisible() {
        return confirmElementIsVisible(EDIT_REMITTANCE);
    }

    public boolean viewRemittanceVisible() {
        return confirmElementIsVisible(VIEW_REMITTANCE);
    }

    public boolean addRemittanceTypeVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_TYPE);
    }

    public boolean addRemittanceNameVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_NAME);
    }

    public boolean addressVisible() {
        return confirmElementIsVisible(ADDRESS);
    }

    public boolean addRemittanceAddressOneVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_ADDRESS_ONE);
    }

    public boolean addRemittanceAddressTwoVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_ADDRESS_TWO);
    }

    public boolean addRemittanceAddressThreeVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_ADDRESS_THREE);
    }

    public boolean addRemittanceCityVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_CITY);
    }

    public boolean addRemittanceStateVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_STATE);
    }

    public boolean addRemittanceZipVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_ZIP);
    }

    public boolean makeDefaultToggleVisible() {
        return confirmElementIsVisible(MAKE_DEFAULT_TOGGLE);
    }

    public boolean addRemittanceButtonVisible() {
        return confirmElementIsVisible(ADD_REMITTANCE_SUBMIT);
    }

    public boolean cancelRemittanceVisible() {
        return confirmElementIsVisible(CANCEL_REMITTANCE_HYPERLINK);
    }

    public boolean closeRemittanceBoxVisible() {
        return confirmElementIsVisible(CLOSE_REMITTANCE_BOX);
    }

    public boolean vendorLocationPageVisible() {
        return confirmElementIsVisible(VENDOR_LOCATIONS_PAGE);
    }

    //Add Vendor Location

    public boolean locationsTabClick() {
        return clickElement(LOCATIONS_TAB);
    }

    public boolean addLocationClick() {
        return clickElement(ADD_LOCATION);
    }

    public boolean locationName(String name) {
        return sendKeysToElement(LOCATION_NAME, name);
    }

    public boolean legalEntitySelect() {
        return clickElement(LEGAL_ENTITY);
    }

    public boolean remittanceTypeSelect() {
        return selectElementByValue(LOCATION_REMITTANCE_TYPE, "3");
    }

    public boolean addPropertiesDivClick() {
        return clickElement(ADD_PROPERTIES_DIV_CLICK);
    }

    public boolean submitLocation() {
        return clickElement(SUBMIT_LOCATION);
    }

    public boolean successBannerCheck() {
        return confirmElementIsVisible(SUCCESS_BANNER);
    }

    public boolean vendorApprovedAllVendorsToggleVisible() {
        return confirmElementIsVisible(VENDOR_APPROVED_ALL_VENDORS);
    }

    public String getRemittanceName() {
        WebElement element = driver.findElement(LOCATION_REMITTANCE_NAME);
        return element.getAttribute("value");
    }


    //Visibility - Add Vendor Location

    public boolean locationsInformationVisible() {
        return confirmElementIsVisible(LOCATIONS_INFORMATION);
    }

    public boolean addLocationFormVisible() {
        return confirmElementIsVisible(ADD_LOCATION_FORM);
    }

    public boolean notesVisible() {
        return confirmElementIsVisible(NOTES);
    }

    public boolean dunsNumberVisible() {
        return confirmElementIsVisible(DUNS_NUMBER);
    }

    public boolean vendorCodeVisible() {
        return confirmElementIsVisible(VENDOR_CODE);
    }

    public boolean countryVisible() {
        return confirmElementIsVisible(COUNTRY);
    }

    public boolean addressOneVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_ONE);
    }

    public boolean addressTwoVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_TWO);
    }

    public boolean addressThreeVisible() {
        return confirmElementIsVisible(ADDRESS_LINE_THREE);
    }

    public boolean cityVisible() {
        return confirmElementIsVisible(CITY);
    }

    public boolean stateVisible() {
        return confirmElementIsVisible(STATE);
    }

    public boolean zipVisible() {
        return confirmElementIsVisible(ZIP);
    }
}
