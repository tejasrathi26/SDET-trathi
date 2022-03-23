package smoke_and_sanity_tests.resident_verify_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.FirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.CompanyDataManagementNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.integration_settings.IntegrationSettingsNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.integration_settings.TransmissionVendors;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab.ConditionTemplates;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab.CriteriaTemplates;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.CompanyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab.Packages;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab.ScreeningNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.PropertyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.data_management_tab.PropertyDataManagementNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.data_management_tab.leasing_tab.Screening;

import static org.junit.Assert.assertTrue;

public class VerifyScreeningBasicSetupInEntrataIT extends BaseBrowserTest {

    public VerifyScreeningBasicSetupInEntrataIT() {
        super("rvtest");
    }

    @Test
    public void verifyBasicRVSetup_InCompanySettings() {
        //testCase 3188542_A
        //Verify if Transmission Vendor, Packages, Conditions, and Criteria Templates are present.
        EntrataNavBar setup = new EntrataNavBar(driver);
        FirstLevelNavigation setupCompany = new FirstLevelNavigation(driver);
        CompanyDataManagementNav setupCompanyDataManagement = new CompanyDataManagementNav(driver);
        IntegrationSettingsNav setupCompanyDataManagementIntegrationSettings = new IntegrationSettingsNav(driver);
        TransmissionVendors transmissionVendors = new TransmissionVendors(driver);
        CompanyLeasingNav setupCompanyLeasing = new CompanyLeasingNav(driver);
        ScreeningNav setupCompanyLeasingScreening = new ScreeningNav(driver);
        Packages screeningPackages = new Packages(driver);
        ConditionTemplates screeningConditionTemplates = new ConditionTemplates(driver);
        CriteriaTemplates screeningCriteriaTemplates = new CriteriaTemplates(driver);

        //Navigate to transmission Vendors and confirm if Resident Verify is set as a vendor.
        assertTrue("Unable to open Setup.", setup.clickSetupButton());
        assertTrue("Unable to open Setup/Datamanagement.", setupCompany.clickDataManagementTab());
        assertTrue("Unable to open Setup/Datamanagement/IntegrationSettings.",setupCompanyDataManagement.clickIntegrationSettingsTab());
        assertTrue("Unable to open Setup/Datamangement/IntegrationSettings/Transmission Vendors.", setupCompanyDataManagementIntegrationSettings.clickTransmissionVendorsTab());
        assertTrue("Unable to find 'Resident Verify' as a Transmission Vendor.", transmissionVendors.verifyResidentVerifyIsVisible());

        //Navigate to the Screening Packages and confirm if they are visible.
        assertTrue("Unable to open Setup/Leasing.", setupCompany.clickLeasingTab());
        assertTrue("Unable to open Setup/Leasing/Screening.", setupCompanyLeasing.clickScreeningTab());
        assertTrue("Unable to open Setup/Leasing/Screening/Packages.", setupCompanyLeasingScreening.clickPackagesTab());
        assertTrue("Packages are not visible on the Packages Tab.", screeningPackages.verifyPackagesVisible());

        //Navigate to Conditions Templates and confirm if they are visible.
        assertTrue("Unable to open Setup/Leasing/Screening/Condition Templates.", setupCompanyLeasingScreening.clickConditionTemplatesTab());
        assertTrue("Condition Templates are not visible on the Condition Templates Tab.", screeningConditionTemplates.verifyConditiontemplatesVisible());

        //Navigate to Criteria Templates and confirm if they are visible.
        assertTrue("Unable to open Setup/Leasing/Screening/Criteria Templates.", setupCompanyLeasingScreening.clickCriteriaTemplatesTab());
        assertTrue("Criteria Templates are not visible on the Criteria Templates Tab.", screeningCriteriaTemplates.verifyCriteriaTempalateVisible());

    }

    @Test
    public void verifyIfPropertyIsSetForScreening_inPropertySettings() {
        //testCase 3188542_B
        //Verify if Property is set for Screening
        EntrataNavBar setup = new EntrataNavBar(driver);
        PropertyListPage propertysList = new PropertyListPage(driver);
        page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation setupProperty = new page_objects.entrata_page_objects.setup_tab.property_settings_subtab.FirstLevelNavigation(driver);
        PropertyDataManagementNav setupPropertyDataManagement = new PropertyDataManagementNav(driver);
        PropertyLeasingNav propertyLeasingTab = new PropertyLeasingNav(driver);
        Screening propertyDataManagementLeasingScreening = new Screening(driver);

        //Go to Setup/Properties
        assertTrue("Unable to open 'Setup'.", setup.clickSetupButton());
        assertTrue("Unable to open Setup/Properties.", setup.clickPropertiesButton());

        //Search Resident Verify property Name
        assertTrue("Unable to enter property name into search bar.", propertysList.searchResidentVerifyProperty());
        assertTrue("Unable to press enter in property search bar.", propertysList.pressEnterInPropertySearch());
        assertTrue("Unable to select Resident Verify Property from Result", propertysList.selectResidentVerifyProperty());

        //See if Resident Verify is set as screening Vendor.
        assertTrue("Unable to find Data Management Tab.", setupProperty.clickDataManagementTabAfterOverlay());
        assertTrue("Unable to find DataManagement/Leasing Tab.", setupPropertyDataManagement.clickLeasingTab());
        assertTrue("Unable to find DataManagement/Leasing/Screening Tab.", propertyLeasingTab.clickScreeningSubtab());
        assertTrue("Resident Verify is not selected as the property Screening Vendor.", propertyDataManagementLeasingScreening.findResidentVerifyText());
    }

}