package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class ResidentChargesReport extends ReportsBasePage {
    private final By RESIDENT_CHARGES_REPORT_NAME_TEXT_LOCATOR = By.xpath("//*[text()='Resident Charges']");
    private final By RESIDENT_CHARGES_FOOTER_LOCATOR = By.cssSelector("div[class='margin10-top pad10 highlight-gray text-gray timestamp']");
    private final By OTHER_CHARGES_TOTAL_LOCATOR = By.cssSelector("tr.section-row>td[class='bold align-right']");

    public ResidentChargesReport (WebDriver driver) { super(driver); }

    public boolean confirmResidentChargesNameText() {
        return confirmElementIsVisible(RESIDENT_CHARGES_REPORT_NAME_TEXT_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean scrollToResidentChargesFooter() {
        return moveToAnElementWithActions(RESIDENT_CHARGES_FOOTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getChargesOrCreditsTotalFromResidentChargesReport() {
        return getElementText(OTHER_CHARGES_TOTAL_LOCATOR, waitTimes.LONG_WAIT);
    }

}
