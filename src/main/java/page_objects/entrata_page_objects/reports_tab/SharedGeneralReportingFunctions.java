package page_objects.entrata_page_objects.reports_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SharedGeneralReportingFunctions extends ReportsBasePage{
    public SharedGeneralReportingFunctions (WebDriver driver) {
        super(driver);
    }

    private final By SUMMARIZE_BY_DROPDOWN = By.id("summarize_by");
    private final By SUMMARIZE_BY_PROPERTY = By.cssSelector("#summarize_by option[value='property']");
    private final By WAS_THIS_REPORT_HELPFUL_TEXT_LOCATOR = By.xpath("//*[text()='Was this report helpful?']");
    private final By ADD_PROPERTIES_BUTTON = By.xpath( "//*[@id=\"addbutton\"]/i");
    private final By SELECT_ONE_PROPERTY = By.cssSelector("ul.open");
    private final By OVERLAY = By.cssSelector(".filter-overlay");
    private final By GENERATE_REPORT_BUTTON = By.xpath("//a[contains(text(), 'Generate Report')]");
    private final By GREEN_DROP_DOWN_MENU_LOCATOR = By.cssSelector("#report_form > fieldset > div > div:nth-child(7) > ul > li:nth-child(2) > a");
    private final By XLS_DOWNLOAD_OPTION_LOCATOR = By.cssSelector("#report_form > fieldset > div > div:nth-child(7) > ul > li:nth-child(2) > a > ul > li:nth-child(4)");
    private final By DOWNLOAD_XLS_BUTTON_LOCATOR = By.xpath( "/html/body/div[12]/div[2]/div[2]/div/input");
    private final By PDF_DOWNLOAD_OPTION_LOCATOR = By.cssSelector("#report_form > fieldset > div > div:nth-child(7) > ul > li:nth-child(2) > a > ul > li:nth-child(3)");
    private final By DOWNLOAD_PDF_BUTTON_LOCATOR = By.xpath( "/html/body/div[12]/div[2]/div[2]/div/input[2]");
    private final By CREATE_INSTANCE_OPTION_LOCATOR = By.xpath("//li[text()='Create Instance']");

    //Verify generation
    public boolean verifyGenerationOfReport () {
        return confirmElementIsVisible(WAS_THIS_REPORT_HELPFUL_TEXT_LOCATOR, waitTimes.LUDICROUS_WAIT);
    }
    //General filter Methods
    public boolean pickFirstProperty (){
        return pickFirstItemInAList(SELECT_ONE_PROPERTY, waitTimes.LONG_WAIT);
    }
    public boolean clickAddPropertiesButton () {
        return clickElement(ADD_PROPERTIES_BUTTON);
    }
    public boolean summarizeByPropertySelection () {
        return moveToAndSelectItemInDropDown(SUMMARIZE_BY_DROPDOWN, SUMMARIZE_BY_PROPERTY);
    }
    //For bug task 3229391 will be removed once resolved
    public boolean doubleClickOverlay() {
        return doubleClickElement(OVERLAY);}
    public boolean waitForReportingOverlay() {
        waitForOverlay(OVERLAY);
        return true;
    }
    //Common generate button
    public boolean clickGenerateReportButton() {
        waitForReportingOverlay();
        return clickElement(GENERATE_REPORT_BUTTON);
    }
    //Dynamically move below report for selection
    public boolean moveTo5BelowReport (int numberFiveLowerThanReport) {
        By reportPlusFive = By.cssSelector("#report_groups_list > div:nth-child(35) > ul > li:nth-child("+numberFiveLowerThanReport+") > a");
        return moveToAnElementWithActions(reportPlusFive);
    }
    //Verify file downloads
    public boolean waitToConfirmADownloadIsPresent(String fileName) {
        String FILENAME = ""+fileName+"";
        return checkDownloadsFileName(FILENAME);
    }
    public boolean removeDownloadedFile(String fileName) {
        String FILENAME = ""+fileName+"";
        return deleteFileInDownloads(FILENAME);
    }
    //Access download options in filters
    public boolean clickDropDownArrowForDownloads() {
        return clickElement(GREEN_DROP_DOWN_MENU_LOCATOR, waitTimes.LONG_WAIT);
    }
    //XLS Functionality
    public boolean clickXLSDownloadOption() {
        return clickElement(XLS_DOWNLOAD_OPTION_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean confirmSecondGenerateXLSButtonExists() {
        return confirmElementIsVisible(DOWNLOAD_XLS_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickGenerateXLSDownloadButton() {
        return clickElement(DOWNLOAD_XLS_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }
    //PDF Functionality
    public boolean clickPdfDownloadOption() {
        return clickElement(PDF_DOWNLOAD_OPTION_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean confirmDownloadButtonExists() {
        return confirmElementIsVisible(DOWNLOAD_PDF_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }
    public boolean clickDownloadButton() {
        return clickElement(DOWNLOAD_PDF_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }
    //Create Instance Functionality
    public boolean clickCreateInstanceOption() {
        return clickElement(CREATE_INSTANCE_OPTION_LOCATOR, waitTimes.LONG_WAIT);
    }

}
