package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class ResidentAgedReceivablesReport extends ReportsBasePage {
    private final By RAR_REPORT_NAME_TEXT_LOCATOR = By.xpath("//*[text()='Resident Aged Receivables']");
    private final By RAR_FOOTER_LOCATOR = By.cssSelector("div[class='margin10-top pad10 highlight-gray text-gray timestamp']");
    private final By UNALLOCATED_CHARGES_AND_CREDITS_TOTAL_LOCATOR = By.cssSelector("#resident_aged_receivables > table > tbody > tr.section-row > td:nth-child(8)");
    private final By PREPAYMENTS_TOTAL_LOCATOR = By.cssSelector("#resident_aged_receivables > table > tbody > tr.section-row > td:nth-child(13)");

    public ResidentAgedReceivablesReport (WebDriver driver) { super(driver); }

    public boolean confirmResidentAgedReceivablesNameText() {
        return confirmElementIsVisible(RAR_REPORT_NAME_TEXT_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean scrollToRarFooter() {
        return moveToAnElementWithActions(RAR_FOOTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getUnallocatedChargesAndCreditsTotalFromRarReport() {
        return getElementText(UNALLOCATED_CHARGES_AND_CREDITS_TOTAL_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getPrePaymentsTotalFromRarReport() {
        return getElementText(PREPAYMENTS_TOTAL_LOCATOR, waitTimes.LONG_WAIT);
    }

}