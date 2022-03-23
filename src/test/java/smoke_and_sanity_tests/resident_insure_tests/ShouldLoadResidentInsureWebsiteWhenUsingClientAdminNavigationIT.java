package smoke_and_sanity_tests.resident_insure_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.insurance_subtab.InsurancePropertiesPage;
import page_objects.resident_insure_website.ResidentInsureWebsitePage;

import static org.junit.Assert.assertTrue;

public class ShouldLoadResidentInsureWebsiteWhenUsingClientAdminNavigationIT extends BaseBrowserTest {

    public ShouldLoadResidentInsureWebsiteWhenUsingClientAdminNavigationIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void ShouldLoadResidentInsureWebsiteWhenUsingClientAdminNavigationIT() {

        ClientAdminNavBar caNavigation = new ClientAdminNavBar(driver);
        InsurancePropertiesPage insurancePropertiesPage = new InsurancePropertiesPage(driver);
        ResidentInsureWebsitePage residentInsureWebsitePage = new ResidentInsureWebsitePage(driver);
        assertTrue("Unable to click Support menu", caNavigation.clickSupportMenu());
        assertTrue("Unable to click Insurance tab", caNavigation.clickSupportInsurance());
        assertTrue("Unable to find Add Bulk Properties button", insurancePropertiesPage.findAddBulkProperties());
        assertTrue("Unable to find Select Company Name dropdown", insurancePropertiesPage.findSelectCompanyName());
        assertTrue("Unable to find Select Property Name dropdown", insurancePropertiesPage.findSelectPropertyName());
        assertTrue("Unable to find Select State Name dropdown", insurancePropertiesPage.findSelectStatName());
        assertTrue("Unable to find Zip Code field", insurancePropertiesPage.findZipCodeField());
        assertTrue("Unable to find Search button", insurancePropertiesPage.findSearchButton());
        assertTrue("Unable to click New Policy button", insurancePropertiesPage.clickNewPolicyButton());
        assertTrue("Unable to switch to RI website", residentInsureWebsitePage.switchToResidentInsureWebsite());
        assertTrue("Unable to find RI website Zip Code field", residentInsureWebsitePage.findWebsiteZipCodeField());
        assertTrue("Unable to find RI website Get Quote button", residentInsureWebsitePage.findWebsiteGetQuoteButton());

    }

}
