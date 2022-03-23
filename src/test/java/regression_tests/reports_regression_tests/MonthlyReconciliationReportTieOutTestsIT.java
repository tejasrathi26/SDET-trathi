package regression_tests.reports_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.MonthlyReconciliationReport;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.GrossPotentialRentReport;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.ResidentAgedReceivablesReport;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.ResidentChargesReport;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MonthlyReconciliationReportTieOutTestsIT extends BaseBrowserTest {
    public MonthlyReconciliationReportTieOutTestsIT() {
        super("avantic");
    }

    @Test
    public void shouldMatchPotentialRentBetweenMonthlyReconciliationAndGrossPotentialRentReports_whenRunWithDefaultFilters() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", entrataNavBar.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", entrataNavBar.moveToLibrary());
        assertTrue("Can't Click on library", entrataNavBar.librarySelect());
        MonthlyReconciliationReport monthlyReconciliationReport = new MonthlyReconciliationReport(driver);
        assertTrue("Could not scroll to Open Charges By Lease Report", monthlyReconciliationReport.scrollPastMRR());
        assertTrue("Monthly Reconciliation Report Link is not present", monthlyReconciliationReport.clickingMrrReportLink());
        assertTrue("Add Button is not present in Property Groups Filter", monthlyReconciliationReport.clickAddButtonInPropertyGroupsFilter());
        assertTrue("Property is not selectable in the Property Groups Filter", monthlyReconciliationReport.addPropertyToPropertyGroupsFilter());
        assertTrue("Generate report button cannot be clicked.", monthlyReconciliationReport.clickGenerateButton());
        assertTrue("Report did not generate.", monthlyReconciliationReport.confirmWasThisReportHelpfulText());
        assertTrue("Could not click on GPR drill down link", monthlyReconciliationReport.clickDrillDownLinkForGprReport());
        GrossPotentialRentReport grossPotentialRentReport = new GrossPotentialRentReport(driver);
        assertTrue("Could not confirm that GPR report generated", grossPotentialRentReport.confirmNonExcludedUnitsText());
        assertTrue("Could not scroll to timestamp at the bottom of the GPR report", grossPotentialRentReport.scrollToGprFooter());
        assertEquals("Potential Rent Does Not Match Between MRR and GPR Reports", monthlyReconciliationReport.getPotentialRentAmountFromMrrLink(), grossPotentialRentReport.getPotentialRentTotalFromGprReport());
    }

    @Test
    public void shouldMatchChangeInDelinquencyEndingBalanceBetweenMonthlyReconciliationAndResidentAgedReceivablesReports_whenRunWithDefaultFilters() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", entrataNavBar.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", entrataNavBar.moveToLibrary());
        assertTrue("Can't Click on library", entrataNavBar.librarySelect());
        MonthlyReconciliationReport monthlyReconciliationReport = new MonthlyReconciliationReport(driver);
        assertTrue("Could not scroll to Open Charges By Lease Report", monthlyReconciliationReport.scrollPastMRR());
        assertTrue("Monthly Reconciliation Report Link is not present", monthlyReconciliationReport.clickingMrrReportLink());
        assertTrue("Add Button is not present in Property Groups Filter", monthlyReconciliationReport.clickAddButtonInPropertyGroupsFilter());
        assertTrue("Property is not selectable in the Property Groups Filter", monthlyReconciliationReport.addPropertyToPropertyGroupsFilter());
        assertTrue("Generate report button cannot be clicked.", monthlyReconciliationReport.clickGenerateButton());
        assertTrue("Report did not generate.", monthlyReconciliationReport.confirmWasThisReportHelpfulText());
        assertTrue("Could not scroll to timestamp at the bottom of the MRR report", monthlyReconciliationReport.scrollToTimeStampAtBottomOfMrrReport());
        assertTrue("Could not click Change In Delinquency Ending Balance link to RAR report from MRR report", monthlyReconciliationReport.clickChangeInDelinquencyDrillDownLinkForRarReport());
        ResidentAgedReceivablesReport residentAgedReceivablesReport = new ResidentAgedReceivablesReport(driver);
        assertTrue("Could not confirm that RAR report generated", residentAgedReceivablesReport.confirmResidentAgedReceivablesNameText());
        assertTrue("Could not scroll to timestamp at the bottom of the RAR report", residentAgedReceivablesReport.scrollToRarFooter());
        assertEquals("Change In Delinquency Ending Balance Does Not Match Between MRR and RAR Reports", monthlyReconciliationReport.getChangeInDelinquencyAmountFromMrrLink(), residentAgedReceivablesReport.getUnallocatedChargesAndCreditsTotalFromRarReport());
    }

    @Test
    public void shouldMatchChangeInPrePaymentsEndingBalanceBetweenMonthlyReconciliationAndResidentAgedReceivablesReports_whenRunWithDefaultFilters() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", entrataNavBar.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", entrataNavBar.moveToLibrary());
        assertTrue("Can't Click on library", entrataNavBar.librarySelect());
        MonthlyReconciliationReport monthlyReconciliationReport = new MonthlyReconciliationReport(driver);
        assertTrue("Could not scroll to Open Charges By Lease Report", monthlyReconciliationReport.scrollPastMRR());
        assertTrue("Monthly Reconciliation Report Link is not present", monthlyReconciliationReport.clickingMrrReportLink());
        assertTrue("Add Button is not present in Property Groups Filter", monthlyReconciliationReport.clickAddButtonInPropertyGroupsFilter());
        assertTrue("Property is not selectable in the Property Groups Filter", monthlyReconciliationReport.addPropertyToPropertyGroupsFilter());
        assertTrue("Generate report button cannot be clicked.", monthlyReconciliationReport.clickGenerateButton());
        assertTrue("Report did not generate.", monthlyReconciliationReport.confirmWasThisReportHelpfulText());
        assertTrue("Could not scroll to timestamp at the bottom of the MRR report", monthlyReconciliationReport.scrollToTimeStampAtBottomOfMrrReport());
        assertTrue("Could not click Change In Pre-Payments Ending Balance link to RAR report from MRR report", monthlyReconciliationReport.clickChangeInPrePaymentsDrillDownLinkForRarReport());
        ResidentAgedReceivablesReport residentAgedReceivablesReport = new ResidentAgedReceivablesReport(driver);
        assertTrue("Could not confirm that RAR report generated", residentAgedReceivablesReport.confirmResidentAgedReceivablesNameText());
        assertTrue("Could not scroll to timestamp at the bottom of the RAR report", residentAgedReceivablesReport.scrollToRarFooter());
        assertEquals("Change In Pre-Payments Ending Balance Does Not Match Between MRR and RAR Reports", monthlyReconciliationReport.getChangeInPrePaymentsAmountFromMrrLink(), residentAgedReceivablesReport.getPrePaymentsTotalFromRarReport());
    }
    
    @Test
    public void shouldMatchOtherChargesBetweenMonthlyReconciliationAndResidentChargesReports_whenRunWithDefaultFilters() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", entrataNavBar.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", entrataNavBar.moveToLibrary());
        assertTrue("Can't Click on library", entrataNavBar.librarySelect());
        MonthlyReconciliationReport monthlyReconciliationReport = new MonthlyReconciliationReport(driver);
        assertTrue("Could not scroll to Open Charges By Lease Report", monthlyReconciliationReport.scrollPastMRR());
        assertTrue("Monthly Reconciliation Report Link is not present", monthlyReconciliationReport.clickingMrrReportLink());
        assertTrue("Add Button is not present in Property Groups Filter", monthlyReconciliationReport.clickAddButtonInPropertyGroupsFilter());
        assertTrue("Property is not selectable in the Property Groups Filter", monthlyReconciliationReport.addPropertyToPropertyGroupsFilter());
        assertTrue("Generate report button cannot be clicked.", monthlyReconciliationReport.clickGenerateButton());
        assertTrue("Report did not generate.", monthlyReconciliationReport.confirmWasThisReportHelpfulText());
        assertTrue("Could not scroll past Other Charges link in the MRR report", monthlyReconciliationReport.scrollToImpactOnCashTextInMrrReport());
        assertTrue("Could not click Other Charges link to Resident Charges report from MRR report", monthlyReconciliationReport.clickOtherChargesDrillDownLinkForResidentChargesReport());
        ResidentChargesReport residentChargesReport = new ResidentChargesReport(driver);
        assertTrue("Could not confirm that Resident Charges report generated", residentChargesReport.confirmResidentChargesNameText());
        assertTrue("Could not scroll to timestamp at the bottom of the Resident Charges report", residentChargesReport.scrollToResidentChargesFooter());
        assertEquals("Other Charges Does Not Match Between MRR and Resident Charges Reports", monthlyReconciliationReport.getOtherChargesAmountFromMrrLink(), residentChargesReport.getChargesOrCreditsTotalFromResidentChargesReport());
    }
}
