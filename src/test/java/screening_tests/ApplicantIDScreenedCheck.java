package screening_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.screening_subtab.Screening_Records;

import static org.junit.Assert.assertTrue;

public class ApplicantIDScreenedCheck extends BaseBrowserTest {

    public ApplicantIDScreenedCheck(){
        super("clientadmin", SitesEnum.CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void validate_Search_For_Specific_Application_ID() {
        //testCase ID 2226099
        //Login to Client Admin (this is needed for now until we refactor an improved way to login.)
        ClientAdminNavBar caNav = new ClientAdminNavBar(driver);

        //Navigate to the Screening Dashboard
        ClientAdminNavBar getToSupportScreening = new ClientAdminNavBar(driver);
        assertTrue("Unable to move to 'Support' Tab.", caNav.moveToSupportMenu());
        assertTrue("Unable to click 'Support/Screening' tab.", getToSupportScreening.openSupportScreening());

        //Verify applicant id on Screening Dashboard
        Screening_Records screeningRecords = new Screening_Records(driver);
        assertTrue("Unable to enter applicant ID into search field", screeningRecords.searchForApplicantId_TestCase2260999());
        assertTrue("Unable to click search option on Screening Dashboard", screeningRecords.clickScreeningSearchButton());
        assertTrue("Unable to find applicant name in results on Screening Dashboard", screeningRecords.findSpecificText_ApplicantName_TestCase2260999());

    }
}
