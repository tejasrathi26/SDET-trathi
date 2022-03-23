package page_objects.entrata_page_objects.reports_tab.packets_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;
import utils.RandomGenerator;

public class PacketsPage extends ReportsBasePage {
    public PacketsPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_PACKETS_BUTTON_LOCATOR = By.cssSelector("a[class='button action js-add-edit-packet right']");
    private final By PERMISSIONS_RADIO_BUTTON_LOCATOR = By.cssSelector("input[value='3927']");
    private final By NAME_TEXT_FIELD_LOCATOR = By.name("report_packet[name]");
    private final By EVERY_BLANK_DAYS_TEXT_FIELD_LOCATOR = By.name("schedule_reports[num_days]");
    private final By MONTH_DATE_FIELD_LOCATOR = By.cssSelector("input[class='month']");
    private final By DAY_DATE_FIELD_LOCATOR = By.cssSelector("input[class='day']");
    private final By YEAR_DATE_FIELD_LOCATOR = By.cssSelector("input[class='year']");
    private final By COMPANY_USER_DROP_DOWN_HEADER_LOCATOR = By.xpath("//*[text()='Company User']");
    private final By COMPANY_USER_CHECKBOX_LOCATOR = By.xpath("//*[@id=\"recipients_list\"]/ul[1]/li[1]/label/input");
    private final By CANCEL_LINK_LOCATOR = By.cssSelector("a[class='js-form-dialog-cancel']");
    private final By REPORT_INSTANCE_DROP_DOWN_ARROW_LOCATOR = By.cssSelector("i[class='form-icon dropdown']");
    private final By REPORT_INSTANCE_NAME_LOCATOR = By.cssSelector("input[class='form-search-field ui-autocomplete-input']");
    private final By GREEN_SAVE_PACKET_BUTTON_LOCATOR = By.cssSelector("input[value='Save Packet']");
    private final By REPORT_PACKET_WAS_ADDED_SUCCESSFULLY_LOCATOR = By.cssSelector("p[class='alert success slim']");

    public boolean clickAddPacketsButton() {
        return clickElement(ADD_PACKETS_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickPermissionsRadioButton() {
        return clickElement(PERMISSIONS_RADIO_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean sendKeysForPacketName() {
        RandomGenerator rg = new RandomGenerator();
        return sendKeysToElement(NAME_TEXT_FIELD_LOCATOR, rg.randomName(), waitTimes.LONG_WAIT);
    }

    public boolean sendKeysForEveryBlankDaysField() {
        return sendKeysToElement(EVERY_BLANK_DAYS_TEXT_FIELD_LOCATOR, "2", waitTimes.LONG_WAIT);
    }

    public boolean sendKeysForMonthDateField() {
        return sendKeysToElement(MONTH_DATE_FIELD_LOCATOR,"01", waitTimes.LONG_WAIT);
    }

    public boolean sendKeysForDayDateField() {
        return sendKeysToElement(DAY_DATE_FIELD_LOCATOR,"01", waitTimes.LONG_WAIT);
    }

    public boolean sendKeysForYearDateField() {
        return sendKeysToElement(YEAR_DATE_FIELD_LOCATOR,"2060", waitTimes.LONG_WAIT);
    }

    public boolean clickCompanyUserDropDownHeader() {
        return clickElement(COMPANY_USER_DROP_DOWN_HEADER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickCheckBoxForACompanyUser() {
        return clickElement(COMPANY_USER_CHECKBOX_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean scrollToCancelLink() {
        return moveToAnElementWithActions(CANCEL_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickReportInstanceDropDownArrow() {
        return clickElement(REPORT_INSTANCE_DROP_DOWN_ARROW_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectReportInstanceFromMenu() {
        pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
        pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
        return pressDownArrow(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean enterSelectedReportInstanceNameInMenu() {
        return pressEnter(REPORT_INSTANCE_NAME_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickSavePacketButton() {
        return clickElement(GREEN_SAVE_PACKET_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean confirmReportPacketWasSavedSuccessfullyTextAppeared() {
        return clickElement(REPORT_PACKET_WAS_ADDED_SUCCESSFULLY_LOCATOR, waitTimes.LONG_WAIT);
    }
}
