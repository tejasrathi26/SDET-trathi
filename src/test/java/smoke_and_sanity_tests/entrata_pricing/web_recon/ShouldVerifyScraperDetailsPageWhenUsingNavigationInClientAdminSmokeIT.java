package smoke_and_sanity_tests.entrata_pricing.web_recon;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.competitors_subtab.CompetitorsPage;

import static org.junit.Assert.assertTrue;

public class ShouldVerifyScraperDetailsPageWhenUsingNavigationInClientAdminSmokeIT extends BaseBrowserTest {

    public ShouldVerifyScraperDetailsPageWhenUsingNavigationInClientAdminSmokeIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void ShouldVerifyScraperDetailsPageWhenUsingNavigationInClientAdminSmokeIT() {

        ClientAdminNavBar caNav = new ClientAdminNavBar(driver);
        CompetitorsPage competitorsCA = new CompetitorsPage(driver);

        assertTrue("Unable to click Support menu", caNav.clickSupportMenu());
        assertTrue("Unable to click Competitors tab", caNav.clickSupportCompetitors());
        assertTrue("Unable to click Scraper Details tab", competitorsCA.clickScraperDetailsTab());
        assertTrue("Unable to find 'Choose Filter Options' dropdown", competitorsCA.findFilterOptionsDropdown());
        assertTrue("Unable to find 'Select a Competitor Property' dropdown", competitorsCA.findSelectCompetitorDropdown());
        assertTrue("Unable to find 'Select an Associated Property' dropdown", competitorsCA.findSelectAssociatedPropertyDropdown());
        assertTrue("Unable to find 'Select an Associated Company' dropdown", competitorsCA.findSelectAssociatedCompanyDropdown());
        assertTrue("Unable to find Submit button", competitorsCA.findSubmitFilterButton());
        assertTrue("Unable to find 'Updated On' column", competitorsCA.findUpdatedOn());
        assertTrue("Unable to find 'Scraper URL' column", competitorsCA.findScraperURL());
        assertTrue("Unable to find 'Status' column", competitorsCA.findStatus());
        assertTrue("Unable to find 'Scraper Data Type' column", competitorsCA.findScraperDataType());
        assertTrue("Unable to find 'Competitor Property' column", competitorsCA.findCompetitorProperty());
        assertTrue("Unable to find 'Associated Property' column", competitorsCA.findAssociatedProperty());
        assertTrue("Unable to find 'Associated Company' column", competitorsCA.findAssociatedCompany());
        assertTrue("Unable to find 'URL ID' column", competitorsCA.findUrlId());
        assertTrue("Unable to find 'Action' column", competitorsCA.findAction());

    }

}
