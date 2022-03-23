package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class GrossPotentialRentReport extends ReportsBasePage {
    private final By NON_EXCLUDED_UNITS_TEXT_LOCATOR = By.xpath("//*[text()='Non-Excluded Units']");
    private final By GPR_FOOTER_LOCATOR = By.cssSelector("div[class='margin10-top pad10 highlight-gray text-gray timestamp']");
    private final By POTENTIAL_RENT_TOTAL_LOCATOR = By.cssSelector("#datset_gpr > table > tbody > tr.section-row > td:nth-child(4)");

    public GrossPotentialRentReport (WebDriver driver) { super(driver); }

    public boolean confirmNonExcludedUnitsText() {
        return confirmElementIsVisible(NON_EXCLUDED_UNITS_TEXT_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean scrollToGprFooter() {
        return moveToAnElementWithActions(GPR_FOOTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String getPotentialRentTotalFromGprReport() {
        return getElementText(POTENTIAL_RENT_TOTAL_LOCATOR, waitTimes.LONG_WAIT);
    }

}
