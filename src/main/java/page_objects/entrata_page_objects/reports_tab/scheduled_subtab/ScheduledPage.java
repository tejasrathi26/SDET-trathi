package page_objects.entrata_page_objects.reports_tab.scheduled_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class ScheduledPage extends ReportsBasePage {
    public ScheduledPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_SCHEDULE_BUTTON_LOCATOR = By.cssSelector("a[class='js-create-schedule-btn button action right']");
    private final By REPORT_INSTANCE_DROP_DOWN_ARROW_LOCATOR = By.xpath("//*[@id=\"create_edit_report_schedule\"]/fieldset/div[1]/div/i");
    private final By REPORT_INSTANCE_NAME_LOCATOR = By.cssSelector("input[class='form-search-field searchBox ui-autocomplete-input']");
    private final By EVERY_BLANK_DAYS_TEXT_FIELD_LOCATOR = By.name("schedule_reports[num_days]");
    private final By MONTH_DATE_FIELD_LOCATOR = By.cssSelector("input[class='month']");
    private final By DAY_DATE_FIELD_LOCATOR = By.cssSelector("input[class='day']");
    private final By YEAR_DATE_FIELD_LOCATOR = By.cssSelector("input[class='year']");
    private final By COMPANY_USER_DROP_DOWN_HEADER_LOCATOR = By.xpath("//*[text()='Company User']");
    private final By COMPANY_USER_CHECKBOX_LOCATOR = By.xpath("//*[@id=\"recipients_list\"]/ul[1]/li[1]/label");
    private final By GREEN_SAVE_REPORT_SCHEDULE_BUTTON_LOCATOR = By.cssSelector("input[value='Save']");
    private final By SCHEDULED_REPORT_RED_X_LOCATOR = By.cssSelector("i[class='delete add-tip tip-left js-delete-schedule-btn binded']");
    private final By DELETE_BUTTON_LOCATOR = By.xpath("//a[text()='Delete']");
    private final By CREATE_FIRST_REPORT_SCHEDULE_MESSAGE_LOCATOR = By.xpath("//p[contains(text(),'Create your first Report Schedule by clicking the ')]");

    public boolean clickAddScheduleButton() {
        return clickElement(ADD_SCHEDULE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
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

    public boolean clickSaveReportScheduleButton() {
        return clickElement(GREEN_SAVE_REPORT_SCHEDULE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickRedXForNewlyAddedReportSchedule() {
        return clickElement(SCHEDULED_REPORT_RED_X_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickDeleteScheduledReportButton() {
        return clickElement(DELETE_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean confirmCreateYourFirstReportScheduleTextAppears() {
        return confirmElementIsVisible(CREATE_FIRST_REPORT_SCHEDULE_MESSAGE_LOCATOR, waitTimes.LONG_WAIT);
    }
}