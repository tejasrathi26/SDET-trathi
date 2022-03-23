package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class MonthlyReconciliationReport extends ReportsBasePage {
    private final By OPEN_CHARGES_BY_LEASE_REPORT_LOCATOR = By.cssSelector("li[data-report-title ='Open Charges By Lease'] a");
    private final By MRR_REPORT_LINK_LOCATOR = By.cssSelector("li[data-report-title ='Monthly Reconciliation'] a");
    private final By ADD_SELECTED_PROPERTIES_BUTTON_LOCATOR = By.id("addbutton");
    private final By SPECIFIC_PROPERTY_LOCATOR = By.cssSelector("ul.open");
    private final By GENERATE_REPORT_BUTTON_LOCATOR = By.cssSelector("a[class='button action first green text-white bold font14 js-download-report js-save-filters ']");
    private final By WAS_THIS_REPORT_HELPFUL_TEXT_LOCATOR = By.xpath("//*[text()='Was this report helpful?']");
    private final By POTENTIAL_RENT_LINK_LOCATOR = By.cssSelector("td[title='Drill down for Gross Potential Rent (GPR)'] a");
    private final By MRR_FOOTER_LOCATOR = By.cssSelector("div[class='margin10-top pad10 highlight-gray text-gray timestamp']");
    private final By ENDING_DELINQUENCY_LINK_LOCATOR = By.cssSelector("#summary > table > tbody > tr:nth-child(2) > td.align-right.pointer > a");
    private final By ENDING_PREPAYMENTS_LINK_LOCATOR = By.cssSelector("#summary > table > tbody > tr:nth-child(3) > td.align-right.pointer > a");
    private final By IMPACT_ON_CASH_TEXT_LOCATOR = By.xpath("//*[text()='Impact On Cash']");
    private final By OTHER_CHARGES_LINK_LOCATOR = By.cssSelector("td[title='Drill down for Resident Charges'] a");

    public MonthlyReconciliationReport (WebDriver driver) {
        super(driver);
    }

    public boolean scrollPastMRR() {return moveToAnElementWithActions(OPEN_CHARGES_BY_LEASE_REPORT_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickingMrrReportLink() {
        return clickElement(MRR_REPORT_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickAddButtonInPropertyGroupsFilter() {
        return clickElement(ADD_SELECTED_PROPERTIES_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean addPropertyToPropertyGroupsFilter() {
        return clickElement(SPECIFIC_PROPERTY_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickGenerateButton() {
        return clickElement(GENERATE_REPORT_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean confirmWasThisReportHelpfulText() {
        return confirmElementIsVisible(WAS_THIS_REPORT_HELPFUL_TEXT_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getPotentialRentAmountFromMrrLink() {
        return getElementText(POTENTIAL_RENT_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickDrillDownLinkForGprReport() {
        return doubleClickElement(POTENTIAL_RENT_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean scrollToTimeStampAtBottomOfMrrReport() {
        return moveToAnElementWithActions(MRR_FOOTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getChangeInDelinquencyAmountFromMrrLink() {
        return getElementText(ENDING_DELINQUENCY_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickChangeInDelinquencyDrillDownLinkForRarReport() {
        return doubleClickElement(ENDING_DELINQUENCY_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getChangeInPrePaymentsAmountFromMrrLink() {
        return getElementText(ENDING_PREPAYMENTS_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickChangeInPrePaymentsDrillDownLinkForRarReport() {
        return doubleClickElement(ENDING_PREPAYMENTS_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean scrollToImpactOnCashTextInMrrReport() {
        return moveToAnElementWithActions(IMPACT_ON_CASH_TEXT_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getOtherChargesAmountFromMrrLink() {
        return getElementText(OTHER_CHARGES_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickOtherChargesDrillDownLinkForResidentChargesReport() {
        return doubleClickElement(OTHER_CHARGES_LINK_LOCATOR, waitTimes.LONG_WAIT);
    }
}